#Artifact evaluation guide

### Prerequisites
Linux-like system (ubuntu, osx, etc.): the shell script and some parts of the implementation calling the shell command is not compatible with windows.

Glasgow Haskell Compiler (version >= 7.10.x):
Our tools depend on some libraries which require that GHC >= 7.10.x

Skills necessary to operate it: none

### Files list
1. testcases.tar  
It contains 50 test cases.
2. BiYacc-0.1.0.tar.gz  
Source code of BiYacc.
3. fireTest.sh  
The shell for running the test on the testcases.tar.
4. clean.sh  
Called by fireTest.sh. It will do some cleaning work after tests.
5. tiger_unambiguous_grammar.by  
Grammar description of the Tiger language. You will use biyacc to compile this file later.
6. README.md  
This file.

### Remote demo site we may use
[http://www.prg.nii.ac.jp/project/biyacc.html](http://www.prg.nii.ac.jp/project/biyacc.html)

-----

### Installation
1. Install GHC (Glasgow Haskell Compiler) or Haskell Platform. (We believe GHC with version >= 7.10.x will work)
2. Install **Happy**: run `cabal install happy` in the command line (usually happy goes with ghc)
3. Install **BiGUL** package: run `cabal install BiGUL`.
(now BiGUL can be found on hackage: [http://hackage.haskell.org/package/BiGUL](http://hackage.haskell.org/package/BiGUL))
4. Install **BiYacc**: unzip `BiYacc-0.1.0.tar.gz`,
change your directory to the root of biyacc where you can see the file `biyacc.cabal`, and run `cabal configure && cabal install`.  
   Cabal will install BiYacc and generate the executable files somewhere in your computer.
   In mac, the location usually is:  
   `/Users/AccountName/Library/Haskell/bin/biyacc`
   In ubuntu, the location usually is:  
   `/home/AccountName/.cabal/bin/biyacc`  
   It depends on the system as well as the *version of the cabal and GHC*. You can find the location information in the document of Cabal. Make sure the generated executables can be accessed from your terminal.

----
###Usage###
(You can skip this and refer here later)

1. generate the executable file (parser and printer) from a BiYacc file: run  
"biyacc BiYaccFile OutputExecutableFile"  
2. run the file as a parser:    
"OutPutExecutableFile get InputFile(code) OutputFile(AST)"  
3. run the file as a printer:  
"OutPutExecutableFile put InputFile1(code) InputFile2(AST) OutputFile(updated code)"  

If the argument `"OutputFile(updated code)"` is ommitted when running it as a printer, the `"InputFile1"` file will be updated (overwritten).

----

##Try the examples on our paper##

###Arithmetic expressions
This is the test case mentioned in the **Introduction** and **first look of BiYacc* of* the paper

Go to
[http://www.prg.nii.ac.jp/project/biyacc.html](http://www.prg.nii.ac.jp/project/biyacc.html)
and try the examples online.  
(You can also host the demo website on your own computer.)

In the test cases, choose **arithmetic expressions**, compile and test it.
You can first parse the program text into an AST, and change the subtree `(Add (Num 2) (Num 3)` to `Num 5` for the purpose of constant folding. Print the modified AST back to see the result. The layouts and comments in the unmodified part should be kept.


### Tiger
This is the test case mentioned in the **Case study** (Section 5) of the paper.


In the test cases, select **The tiger language (unambiguous grammar)**. (Of course you can also try Tiger defined in ambiguous grammar + disambiguation rules, but the well-behavedness under certain situation is not guaranteed for certain cases.)

#### Section 5.1: Syntactic sugar
Input program text: `e1 | e2`, it will be parsed to  
`TIfExp (TVarExp (TSimpleVar "e1")) (TIntExp 1) (Just (TVarExp (TSimpleVar "e2")))`
change the `(TVarExp (TSimpleVar "e2"))` to `TIntExp 3` and print the AST back. You can see the syntactic (`|`) is kept.

#### Section 5.2: Resugaring
Tiger does not have the `not` operation, instead, we use negation operator (`-`) to show the example. Basically, they are both unary operator and their priorities are higher than those of binary operators.
Input program text: `-1 | - 0`,  
it is parsed to  
`TIfExp (TOpExp (TIntExp 0) TMinusOp (TIntExp 1)) (TIntExp 1) (Just (TOpExp (TIntExp 0) TMinusOp (TIntExp 0)))`
Then please follow the same instruction shown on the paper Section 5.2 (page  10).

###Section 5.3: Language evolution
The definition for `Guard` expression is located to the end of **Concrete syntax** window and **Updating strategies** windows. Please verify it. In this case, you immediately get the parser and the reflective printer for the evolved language. You can also try resugaring on this newly evolved language following the instructions written in this sub-section of the paper (page 11).


## Test the well-behavedness##
At the beginning of the Section **Case study** (Section 5) We said that we tested about 50 testcases provided at Appel's website: 
[https://www.cs.princeton.edu/~appel/modern/testcases/](https://www.cs.princeton.edu/~appel/modern/testcases/)

You can test them in the following way:

(Please firstly make sure you put these test files in a **new folder** not containing any other files, especially Haskell files, text files (*.txt). The files will be **removed** by the `clean.sh` shell after testing.)

1. Generate the executable file for the Tiger grammar.  
In the terminal input `biyacc BiYaccFileName OutputExecutableFile`  
eg: `biyacc tiger_unambiguous_grammar.by s1`  
Then you will have an executable file named "s1".  
The process may take half a minute. The most time consuming job is GHC's compiling the `parser.hs` generated by Happy.

2. Put the shell `fireTest.sh` and `testcases.tar` in the same directory.

3. Run the shell `fireTest.sh`, it will prompt you to input the name of the executable file generated just now (eg: `s1`)

4. The shell will unzip `testcases.tar`, run tests on the unzipped 50 files, and check the property **GetPut** and **PutGet** automatically.

Ideally, only the test on "test49.tig" will throw the error message "Parse error" since its syntax is **invalid** as indicated in the comment of the file.

---

##How we test the property
####GetPut
**GetPut** means that if **get s** evaluates to a value **Just v**, then **put s v** will yield the same value **s**:  
```get s = Just v => put s v = s```  
In our tests, each **test.tig** file will be first parsed to **testAST.txt**, and then be printed back to **testcode.txt**.
We use the built-in **diff** function providede by the unix-like system to test whether testCode.txt is equal to the original **test.tig** file.


####PutGet
The definition of **PutGet** is:  
```put s v = s' => get s' = v ```  
We test the **PutGet** property in a similiar way. However, we do not have the slightly modified AST, and the **PutGet** is tested twice in the following way.
#####PutGet1
We test **PutGet** with the AST parsed from the program text. We first print the AST back to the program text, and then parse the generated program text back to a new AST and compare the two ASTs. eg:  
`put test1.tig test1AST.txt test1code.txt`
`get test1code.txt test1AST2.txt`
`diff test1AST.txt test1AST2.txt`  
where the first line will generate `test1code.txt`

#####PutGet2
We use the AST parsed from some other file to test the **PutGet**. eg:
`put test1.tig test2AST.txt test1code.txt`
`get test1code.txt test1AST.txt`
`diff test1AST.txt test2AST.txt`  
That is, we use the AST generated from `test2.tig` to update `test1.tig`, and then parse the updated `test1.tig` to an AST and compare the two ASTs. Usually, ASTs parsed from different code snippet are very different, so we believe this could test the stability of the put (print) function.
We do such test for the 50 files in a circular way.

----
#### The original test files at Appel's site?
As mentioned in the paper, we modified the grammar of `if-then-else` sentence to solve the dangling-else problem and make Tiger an unambigous grammar. Many testcases contain `if-then-else` grammar and we make the same modification to these files. So if you run the test on the oringinal files provided at that website, many testcases will throw error.

