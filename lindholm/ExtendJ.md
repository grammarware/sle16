## Instructions for trying out DrAST on the ExtendJ compiler ##

ExtendJ is an extensible Java compiler implemented using JastAdd. To try out DrAST on ExtendJ, you will need to download ExtendJ and prepare its main program by adding a static variable.

These instructions were carried out on version `ec7b7a0` of the ExtendJ source code, from `2016-JUL-30`.

### Downloading and preparing ExtendJ

First you should clone the git repository for ExtendJ. We assume that the DrAST artifact is located in a directory `artifact`, and that `extendj` is cloned into a sibling directory of `artifact`. Use the following clone command (this could take a few minutes):

    git clone https://bitbucket.org/extendj/extendj.git

Then go to the extendj directory and check that you can build the ExtendJ compiler:

    cd extendj
    ant java8
    ant jar

You can check that the extendj compiler works by compiling the `Hello.java` program in `artifact/ExtendJ-DrAST-files` and running it:

    cd artifact/ExtendJ-DrAST-files
    java -jar ../../extendj/extendj.jar Hello.java
    java Hello

You will now need to prepare the ExtendJ main program by adding a static variable `DrAST_root_node`. The code for the main program is in the file `extendj/java4/frontend/FrontendMain.jrag` (which is reused by all Java versions, both frontends and backends). We supply a prepared version of this file, but before replacing the standard version, check first that the only difference between the two files is the declaration and assignment of the `DrAST_root_node` variable:

    cd extendj
    cd ..
    diff artifact/ExtendJ-DrAST-files/FrontendMain.jrag extendj/java4/frontend/FrontendMain.jrag

If so, you can replace the file in extendj:

    mv extendj/java4/frontend/FrontendMain.jrag extendj/java4/frontend/FrontendMain.jrag.orig
    cp artifact/ExtendJ-DrAST-files/FrontendMain.jrag extendj/java4/frontend

Then build extendj again:

    cd extendj
    ant java8
    ant jar

### Start DrAST on ExtendJ ###

Now, go to the `ExtendJ-DrAST-files` directory again, but instead of compiling `Hello.java`, run DrAST on it:

    cd artifact/ExtendJ-DrAST-files
    java -jar ../DrAST.jar

DrAST starts and you get a dialog box where you fill in:

* Path to compiler jar: `../../extendj/extendj.jar`
* First compiler argument: `Hello.java`

Even when looking at a small program like `Hello.java`, the program will contain very many nodes since compiling the program leads to libraries being read in and represented in the AST. Initially, all nodes are clustered. You can bring all nodes into view by the following filter program:

    configs{
        use = all;
    }
    filter all{
        :ASTNode{}
    }

Try zooming and panning around. But with close to 10.000 nodes, the user experience will be a bit sluggish, and it is difficult to find interesting parts of the tree.

Instead, we will define a filter that shows only parts of the actual source program. Change the filter to the following one:

    configs{
        use = classes;
    }
    filter classes{
        :CompilationUnit{
            when{:fromSource;}
            subtree{:fromSource;}
        }
        :MethodDecl{show{:getID;}}
        :VarAccess{show{:getID;}}
        :TypeAccess{show{:getID;}}
        :MethodAccess{show{:getID;}}
        :Dot{}
        :StringLiteral{show{:getLITERAL;}}
    }

This filter will only show `CompilationUnit` nodes that are compiled from source (by using the `fromSource` attribute), and thus not those read in from libraries or class files. Furthermore, other node types will be shown only if they are in the `subtree` of such a `CompilationUnit`.

Now try some zooming and panning again, and you will note that the user interaction is again instantaneous.

This view is similar to Figure 3 in the paper. However, the draft paper figure shows many too few nodes in the top cluster. This is due to a previous bug in DrAST which has now been corrected. We will update the figure in the final version of the paper.
