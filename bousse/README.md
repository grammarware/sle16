# Execution Framework of The GEMOC Studio

Erwan Bousse, Thomas Degueule, Didier Vojtisek, Tanja Mayerhofer, Julien DeAntoni, Benoit Combemale


## Description

Our artifact folder is divided in two folders:

- `framework-sources` is the main part of the artifact submission, and contains all the sources used to build a complete GEMOC studio, which includes the sources of the GEMOC execution framework. The README explains both which parts of the sources are related to which parts of the framework described in the paper, and how to compile a working studio using the sources.
- `examples` contains examples related to the paper that can be run with a compiled GEMOC Studio. You can build your own as explained above or use a frozen GEMOC Studio provided here: http://gemoc.org/pub/studio/sle16/. 

### Requirements

- Java 8 Oracle (Some tools requires JavaFx, we recommand to use Oracle JDK as JavaFx is bundled in it)

## Going further 

- Additional examples can be found directly in the studio (in eclipse menu: *File > New example > ...*) or installed from external update site (in eclipse menu: *Help > Install additional GEMOC components*) 
- Documentation about building new languages using some of the engines (sequential, concurrent, and coordination engines) is available online (http://gemoc.org *> Studio > Documentation*) and in the eclipse help system (in eclipse menu: *Help > Help content > GEMOC Studio documentation*).
- Technical documentation is under construction on the official github repositories: 
  - https://github.com/SiriusLab/ModelDebugging for the main framework and the sequential engine.
  - https://github.com/gemoc/ for the build of the studio, the concurrent engine, and the coordination engine.
  - https://github.com/moliz for the xmof engine.
