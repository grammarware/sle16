# sle2016

Description
============
  Proof-of-concept Java implementation of the DSL monitoring pattern.

  Important Note: A Smalltalk version of the monitoring pattern is
  also available. It is stored externally from github. You can check it
  out there:

  http://smalltalkhub.com/#!/~CipT/MonLambda

  (A strict copy of the Java program committed here can be found at
  https://github.com/monitorpattern/sle2016)

Recommended versions of software
=================================
   - Eclipse Version: Mars.2 Release (4.5.2)
   - Configured with JavaSE-1.8
   - Including DSProfile, Version 2.11 (available in the project's zip)

   
How to install the prototype
=============================
  
  The easiest way to "install" and test the paper's code is to do it
  within Eclipse.  However it is independent of any Eclipse underlying
  technology, so it can be as well run in command line with proper
  classpath configuration. We describe the eclipse way here.

   - Unarchive the monitorLambda.tgz somewhere
  
   - Run Eclipse

   - Import the directory 'monitorLambda' as a Java Project inside
     Eclipse (however it is independent of any Eclipse underlying API)

   - Configure the Java project properties (right-click on
     monitorLambda > Properties)
  
       * Set Java Compiler to JavaSE-1.8

       * Set Java Build path if necessary:

           * Add DSProfile (dsprofile_2.11-0.4.0.jar available in the
             project's directory 'libs')

           * Add Scala library (scala-library.jar available in the
             project's directory 'libs')

    - Build the project if necessary
      (Project > Build Project or Build Automatically)
  
Walkthrough: run the tests listed in the paper
===============================================

1. Monitors from scratch

  A main program is in MainTester in package 'examples.lambda.concrete':
  Right-click on MainTester.java > Run As > JavaApplication.
  It runs without any argument configuration:
  all available tests are executed sequentially:

    1. A basic profiler
    2. A basic collector
    3. A tracer (the one for which the listing was generated in the paper) 
    4. A simple composite monitor (collector + tracer)

2. Integration of DSProfile

  To test the integration of DSProfile, another main program can be found in the package
  'monitoring.concrete.dsprofiler' :
  Right-click on DSExample.java > Run as Java Application.


Documentation files
===================

  Two documentation files describe the structure/content of the
  program, in the monitorLambda/doc directory:

  - content.txt: describes the organization of all the Java packages

  - algo.txt: sketches the algorithm of the standard interpreter as
     implemented in the LambdaEvaluator class



Note about the dependencies:
---------------------------

  The jars of the dependencies are available in the libs directory at
  the root of the project You can also download the jar of dsprofile,
  version 2.11 Available at: https://bitbucket.org/inkytonik/dsprofile
  

  
