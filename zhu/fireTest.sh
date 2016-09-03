#!/bin/sh

pre="test"
post=".tig"
a=1

echo "\n\n================================"
read -p "complied biyacc executable name:" exeName
if [ -f "$exeName" ]
  then
    if [ ! -z "$exeName" -a "$exeName" != " " ];
      then
      echo "unpack zip..."
      tar -xf testcases.tar

      echo "\n\n================================"
      echo "Check GetPut"
      while [ $a -lt 52 ]
      do
        echo "get" $pre$a$post "$pre$a""AST.txt"
        # replace exeName with the executable biyacc file name
        ### check GetPut
        ./$exeName "get" $pre$a$post "$pre$a""AST.txt"
        echo "put" $pre$a$post "$pre$a""AST.txt"
        ./$exeName "put" $pre$a$post "$pre$a""AST.txt" "$pre$a""code.txt"
        ### run diff
        echo "diff" $pre$a$post "$pre$a""code.txt"
        diff $pre$a$post "$pre$a""code.txt"
        ###
        a=`expr $a + 1`
      done

      a=1
      echo "\n\n================================"
      echo "Check PutGet with non-modified AST"
      while [ $a -lt 52 ]
      do
        ### check trivial PutGet (Put with no modification)
        echo "put" $pre$a$post "$pre$a""AST.txt" "$pre$a""code.txt"
        ./$exeName "put" $pre$a$post "$pre$a""AST.txt" "$pre$a""code.txt"
        echo "get" "$pre$a""code.txt" "$pre$a""AST2.txt"
        ./$exeName "get" "$pre$a""code.txt" "$pre$a""AST2.txt"
        ### run diff
        echo "diff" "$pre$a""AST.txt" "$pre$a""AST2.txt"
        diff "$pre$a""AST.txt" "$pre$a""AST2.txt"
        ###
        a=`expr $a + 1`
      done


      a=1
      b=2
      echo "\n\n================================"
      echo "Check PutGet with modified AST"
      while [ $a -lt 51 ]
      do
        ### check PutGet
        echo "put" $pre$a$post "$pre$b""AST.txt" "$pre$a""code.txt"
        ./$exeName "put" $pre$a$post "$pre$b""AST.txt" "$pre$a""code.txt"
        echo "get" "$pre$a""code.txt" "$pre$a""AST.txt"
        ./$exeName "get" "$pre$a""code.txt" "$pre$a""AST.txt"
        ### run diff
        echo "diff" "$pre$a""AST.txt" "$pre$b""AST.txt"
        diff "$pre$a""AST.txt" "$pre$b""AST.txt"
        ###
        a=`expr $a + 1`
        b=`expr $b + 1`
      done
      #
      echo "put" "test51.tig" "test1AST.txt" "test51code.txt"
      ./$exeName "put" "test51.tig" "test1AST.txt" "test51code.txt"
      echo "get" "test51code.txt" "test51AST.txt"
      ./$exeName "get" "test51code.txt" "test51AST.txt"
      ### run diff
      echo "diff" "test51AST.txt" "test1AST.txt"
      diff "test51AST.txt" "test1AST.txt"

      echo "cleaning..."
      ./clean.sh
      a=1
      while [ $a -lt 52 ]
      do
        rm "test"$a".tig"
        a=`expr $a + 1`
      done

    else
      echo "name is not given."
    fi
  else
    echo "given file does not exist."
fi
