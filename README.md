# robot
robot on a 5x5 grid.
Robot and grid are own objects with methods relating to their own constraints.

Grid can be expanded on to be allowed to have objects blocking paths
with the isValid() method to check if anything is blocking path.
Objects/blocking items, can be placed in the 2d array matrix. 

robot has all the movement capabilities. Confering with the grid object to see if movement is valid within the space.

runner is main runner, can be expanded to take in files, but for the current build is being run with CLI. There are two sample files in tests, which check the bounds (test1 and test3). Employing the toUpper functions for easier usage with user input.
The current implementation has it exiting once the user has inputed the report, can be changed later.

If unsure, run robot.jar with "java -jar robot.jar"
Was compiled with "jar cvfe robot.jar runner -C src ."
Is also possible to run with javac runner.java in src/ folder.

