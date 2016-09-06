# DrAST - An Inspection Tool for Attributed Syntax Trees
Joel Lindholm, Johan Thorsberg, Görel Hedin

This directory contains information for evaluating the artifact DrAST, as described in the paper

    Joel Lindholm, Johan Thorsberg, Görel Hedin
    Tool demo: DrAST
    An inspection tool for attributed syntax trees
    To appear at SLE 2016.

These instructions are consistent with the draft of the paper from 2016-06-30 and with DrAST version `34f32ed` (2016-09-01).

Note! These instructions will show how to reproduce the examples in the paper. There are known quirks and bugs in the tool, and both the build and the user instructions at https://bitbucket.org/jastadd/drast should be improved. These are things we are working on. For this particular walkthrough, note that text editing of the filter language sometimes autoindents in the wrong way. We therefore recommend to use copy-paste when you try out the examples.

## System requirements ##

To follow these instructions you need

* Linux or Mac OS X
* Preferably a scrolling mouse (an Apple trackpad also works).
* Java 8
* Ant

All other tools (like jflex, beaver, and jastadd) are included in our examples.

## Files included ##

* `README.md` These instructions
* `DrASTpaper-draft.pdf` The draft of the paper from 2016-06-30
* `DrAST.jar` The DrAST tool
* `CalcExample.zip` Source code for the Calc compiler
* `CalcExample-DrAST-files/` Extra files used in the Calc example
* `ExtendJ-DrAST-files/` Extra files used in the ExtendJ example
* `Calc.md` Instructions for trying out DrAST on the Calc compiler
* `ExtendJ.md` Instructions for trying out DrAST on the ExtendJ compiler
* `licences.txt` Licenses for the bundled tools used

## Instructions ##

Unzip `CalcExample.zip`.

Start with following the instructions in [`Calc.md`](Calc.md) to try out DrAST on a small compiler for the Calc language. Then follow the instructions in [`ExtendJ.md`](ExtendJ.md) to try out DrAST on ExtendJ, a full Java compiler (you will need to download ExtendJ separately).
