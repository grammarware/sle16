# Completion-Artifacts-SLE-16

Example projects for testing Syntactic Completions in Spoofax as described in the submission for SLE'16 [Principled Syntactic Code Completion using Placeholders](http://conf.researchr.org/event/sle-2016/sle-2016-papers-principled-syntactic-code-completion-using-placeholders).

To test syntactic code completion for each project:

- First download, extract and install the Eclipse IDE with pre-installed Spoofax according to your OS:
  - Windows 
     - [32 bits](https://www.dropbox.com/s/6qj6xtqosn8ytb9/spoofax-win32-x86.zip?dl=0)
     - [64 bits](https://www.dropbox.com/s/l9h7syi2azze2qf/spoofax-win32-x86_64.zip?dl=0)
  - Linux
     - [32 bits](https://www.dropbox.com/s/xpo164tkuthp8ys/spoofax-linux-x86.tar.gz?dl=0)
     - [64 bits](https://www.dropbox.com/s/3y19rnkro5ms8i6/spoofax-linux-x86_64.tar.gz?dl=0)
  - [Mac](https://www.dropbox.com/s/0ms7hldupbxc1rc/spoofax-macosx-x86_64.tar.gz?dl=0) 
 
- Import the projects into Eclipse (File -> Import... -> Existing Maven Projects), making sure build automatically is on (Project -> Build Automatically).

- Build the projects (Project -> Build Project or Build All) you want to try syntactic code completion on.

 
An example file (empty) can be found at the directory `examples` in each project. 

Triggering code completion (Control+Space) on such program should show all proposals available for the program at the cursor position, according to what has been described in the paper. A quick overview of the syntactic completion features we implemented can be found [here](http://spoofax.readthedocs.io/en/latest/source/release/migrate/new_completions_framework.html).


### Important
The syntax for MiniJava (at the MJCompletions project) is not exposed in the project, as we use the language in the Compiler Construction course at TU Delft. After each project build, it is necessary to copy the files `lib/sdf-completions.tbl` and `lib/sdf.tbl` replacing the ones in `target/metaborg`, and reload the language (right click in the project -> Spoofax (Meta) -> Load language) to properly edit MiniJava programs. 