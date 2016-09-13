# Completion-Artifacts-SLE-16

[Eduardo Souza](https://github.com/udesou), Sebastian Erdweg, Guido Wachsmuth, Eelco Visser

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

Triggering code completion (Control+Space) on such program should show all proposals available for the program at the cursor position, according to what has been described in the paper. A quick overview of the syntactic completion features we implemented can be found [here](http://spoofax.readthedocs.io/en/latest/source/release/migrate/new_completions_framework.html). Please note that [completion for recursive structures](http://spoofax.readthedocs.io/en/latest/source/release/migrate/new_completions_framework.html#expanding-recursive-lists-and-nullable-structures) as described in the documentation is still under beta testing and was disabled in this artifact to keep it consistent with the paper.

### Implementation

The implementation of the completion framework is separated into two parts:

- [The Stratego part](https://github.com/metaborg/runtime-libraries/tree/d5634f57eaaa96528cc3648527073562019c7503/org.metaborg.meta.lib.analysis/trans/runtime/completion) - responsible for the transformations on the AST (such as expand a placeholder and pretty-print its expansions).

- The Java part:
	- [Integration with Eclipse](https://github.com/metaborg/spoofax/blob/adc3b16225aefa799c6a825154df354c34763109/org.metaborg.spoofax.core/src/main/java/org/metaborg/spoofax/core/completion/JSGLRCompletionService.java).
	- [JSGLR](https://github.com/metaborg/jsglr/tree/1d68859d4c37cd21f44cf18f780e1afc01cab289).

Note that these are the main files related with the implementation. There might be minor code fragments scattered in the implementation of Spoofax itself. 

The Spoofax implementation used in this artifact is on the `new-completions` [branch](https://github.com/metaborg/spoofax-releng/tree/new-completions) of the Spoofax source code. Each submodule has the tag `completions-sle-artifact` containing the exact commit that was used for building the Spoofax version in this artifact.
	

### Troubleshooting

- If you have any issues installing Spoofax, please check our documentation [here](https://spoofax.readthedocs.io/en/latest/source/langdev/start.html#installation).

- In Spoofax, sometimes the editor does not recognize the language of a file open right after opening Eclipse. This implies that code completion (and other editor services) might not work for that file. Closing and reopening the file should solve the issue.

- If you have problems building the projects, please try importing them into a new workspace.
