# Lab 5:
## PART 1: Debugging Scenario
### Student Discussion Post:
When I tried to use my grader to grade this assignment: https://github.com/NairbNUCSD/list-examples-crashes-grader.git \
It results in an error that says: ![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/64d36d79-dcc1-4c46-91c3-a7f1cf42070e)

This repo is my grader. grade.sh is the script that does the grading: https://github.com/NairbNUCSD/grader-review-brian.git

This is what the important files structure from the repo looks like:
```
grader-review-brian
  |-grade.sh
  |-CalcPercent.java
  |-TestListExamples.java
  |-lib
    |-hamcrest-core-1.3.jar
    |-junit-4.13.2.jar
  
```
This grader is fine with all the other student assignments, and it even handles complie errors. \
My guess is that there is something wrong with my grade.sh script when i did the command:
```
java -cp $CPATH org.junit.runner.JUnitCore TestListExamples > junitResult.txt
```
Can you help me find what the issue is?

### TA reply:
Try just running that part of the code (```java -cp $CPATH org.junit.runner.JUnitCore TestListExamples > junitResult.txt ```) but without pointing the output to the txt file. Just let it print in the terminal and see what it says. Then try the same thing but with a student submission that doesn't produce a bug. Compare them. Using that you can understand why the code after that line breaks. 

### Student reply:
This is what I changed in vim: ![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/d7816bd8-883a-417e-a069-7bc71b1a952b)

When I tried to grade the buggy student submission this is what I got: ![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/7d69bad4-7690-4426-9c19-1ddb15987f6a)

When I tried to grade a non-buggy student submission this is what I got: ![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/45d157d7-cadd-4c9d-acf9-544fc18265d9)

Both of them produced an error at the end, which is expected since the code after the code I changed caused that error. However I did notice that the buggy program included strings in the output. \
Buggy program: 
```
JUnit version 4.13.2
.E.E.Tests run: results

Time: 0.015
There were 2 failures:
1) testMerge(TestListExamples)
java.lang.ArithmeticException: / by zero
        at ListExamples.merge(ListExamples.java:35)
        at TestListExamples.testMerge(TestListExamples.java:35)
2) testMergeRightEnd(TestListExamples)
java.lang.ArithmeticException: / by zero
        at ListExamples.merge(ListExamples.java:35)
        at TestListExamples.testMergeRightEnd(TestListExamples.java:19)

FAILURES!!!
Tests run: 3,  Failures: 2
```
Good program: 
```
JUnit version 4.13.2
...
Time: 0.014

OK (3 tests)
```
In the buggy program I noticed that there was 2 lines that included the pattern "Tests run:". This is a bug for the code after it because in the grade.sh script, I use that pattern to calculate the percentage. I used that pattern so I can parse the integers representing the numbers if tests ran and the number of tests failed. This is a bug because the patter found the first line which is ".E.E.Tests run: results" and it doesn't have an integer in there, thats why it resulted in a parsing error. One way I can fix this bug is if I filter for the final match of the pattern. This can be done by changing the grep statement in my script file. Heres what it looks like:![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/cc5f44db-e5e5-49f2-bbb9-4a3a77d21be9) \
Sure enough, the grader works. 
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/dd8b99c2-02ff-49a6-8452-cf12b9901b32)

## PART 2: Reflection

In the second half of the quarter the most exciting thing I learned was definatly bash scripting and jdb bugging. This in a combination of using bash terminal and vim, I realized how important these things are. The topic I loved the most has to be vim becuase file editing in the terminal without having a text editor is really cool. 
