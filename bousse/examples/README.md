# Examples

## Prerequisite

Running the examples requires a working studio. You can either compile it yourself (see first part of the artifact submission), or use a frozen GEMOC Studio provided here: http://gemoc.org/pub/studio/sle16/

## Presentation

Each folder contains one example of xDSML and one example of model conforming to the xDSML.

## Common recipe

For each engine, you can process in the following way:

1. Start the GEMOC Studio in a fresh workspace.
1. Import the example xDSML by doing *File, *Import..*, *Existing Projects into Workspace*, and choose the folder `language-workbench` of the considered engine. Select all the projects and click on *Finish*.
2. Start a modeling workbench for the xDSML by creating a new eclipse run configuration:
	1. Click on *Run*, *Run Configurations...*.
	2. Right click on *Eclipse Application* and choose *New*.
	3. Click on *Run*.
3. Import the example model of the considered engine by using the same procedure as for importing the language, but by choosing the folder `modeling-workbench`.
4. Execute the model in debug mode by right clicking on the provided `.launch` file, and choosing *Debug as* and choosing the first choice there. You can then click on *Run* to execute the model.
