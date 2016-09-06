# Coupled Software Transformations-Revisited

Ralf Lämmel

# Artefacts availability

The artefacts are all maintained in the github repo softlang/yas.

https://github.com/softlang/yas/

A snapshot of the 4558ca27dc0a1658ae098a7b2b675541455a5892 version was added to this project:

https://github.com/grammarware/sle16/blob/master/laemmel/yas-master.zip

The artefacts are consistently linked from the paper; just click the links in paper.

For instance, the first artefact in the paper is "LAL megamodel language" in Section 3.1. If one hovers over "language", then this reveals the link https://github.com/softlang/yas/blob/master/languages/LAL/lib/language.lal which directly takes one to the github repo softlang/yas. If one wanted to explore the artefact in the zip-file instead, then one simply strips off the prefix "https://github.com/softlang/yas/blob/master/" and uses the rest as a filename within the zip-file.

# Prerequisites for running

The snapshotted version has been tested with the following prerequisites:

* Mac OS 10.11.6
* SWI-Prolog 7.2.3
* GNU Make 3.81

Other information:
* Many other versions of Mac OS, SWI-Prolog, make can be assumed to work.
* Linux (such as ubuntu) can be assumed to work.
* Windows is not guaranteed to work.

# Running the code

* Go to the yas directory.
* Enter "make"

The make process will run for several seconds and produce all kinds of console output.
The process should finish successfully and produce this final verdict:

<pre>
103 languages.
552 files.
552 membership tests.
117 functions.
387 function applications.
</pre>

This means that all files and relationships have been checked.
This includes checking the megamodels from the paper and their compilation.
