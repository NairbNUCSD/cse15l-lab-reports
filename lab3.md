# LAB REPORT 3: Bugs and Commands (Week 5)

## Part 1
The code for the buggy program that has a buggy method called "reverseInPlace":
```
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```
### The symptom, as the output of running the tests:
This is what happened when I ran the JUnit tests:
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/efb1cf4e-9318-4477-b531-4e0eb59f6ab1)
### A failure-inducing input for the buggy program, as a JUnit test and any associated code:
The code for the JUnit test that is a failure-inducing input:
```
@Test
  public void testReverseInPlace2() {
    int[] input1 = { 0,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,0 }, input1);
	}
```

Explaination for why it gave an error: \
For the “ReverseInPlace” method, the expected output would be {1,0} given the input is {0,1}, however, the actual output comes out to be {1,1}.
In the reverseInPlace method, the bug involves declaring a value in the array with another value in the array, and reusing the same value. This ends up duplicating the value. \

### An input that doesn’t induce a failure, as a JUnit test and any associated code:
```
@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
```
Exaplaination for why it didn't induce a bug: \
As seen from the bash terminal image above, there were 4 tests that were ran and only one produced an error. One of the tests that didn't incuce an error used the same method that the other test used which did produce an error.
The reason for why it didn't produce an error with this test was because the test only included an array with one element. This meant the bug didnt effect the result. It didn't matter if the value was going to get over written becuase there is only one value anyways.

### The bug, as the before-and-after code change required to fix it:
The code before the fix:
```
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```

The code to fix the bug:
```
    static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
```
Explaination why this fix works: \
What needs to be done is using a temporary variable to store and replace the values. In this case, "temp" was a variable to store the previous value so that it doesn't get over written.

## Part 2 : grep
### What does grep do?
grep is a command that allows the user to search for a file that has a specific pattern of characters. 
```
grep [options] pattern [files]
```
### -w option for grep
By defult grep matches the given string even if the pattern is within a word in a file. The -w option makes it so that grep will only match it if it is the whole word. It prints the line that includes the word. \
For example consider a file that includes two lines: 
```
bread
read
```
and we run 2 commands, one without -w and one with -w.
```
grep "read" file.txt
```
without the -w results in:
```
bread
read
```
Now we try:
```
grep -w "read" file.txt
```
with the -w results in: 
```
read
```
Notice that the -w option only prints the line with the whole word "read" even though "bread" has the pattern "read" in it. \
For another example. consider these files:
```
|--file1.txt
|--file2.txt
```
file1.txt contains 2 lines:
```
bread
read
```
file2.txt contains 2 lines:
```
orange juice
blue bread
```
and we run 2 commands, one without -w and one with -w
```
grep "read" file1.txt file2.txt
```
without -w results in:
```
file1.txt:bread     
file2.txt:blue bread
```
Now we try:
```
grep -w "read" file1.txt file2.txt
```
with -w results in
```
file1.txt:read
```
When using grep with multiple files, it includes the file name along with the line that includes the pattern.

### -i option for grep
By defult grep is case sensitive. The -i option makes it so that the pattern is not case sensitive. \
For example consider a file that includes two lines: 
```
bread
bRead
```
and we run 2 commands, one without -i and one with -i.
```
grep "bRead" file.txt
```
without the -i results in:
```
bRead
```
Now we try:
```
grep -i "read" file.txt
```
with the -i results in: 
```
bread
bRead
```
Notice that the -i option prints the line that includes the characters b,r,e,a,d regardless of case, while without -i, it matters with case. \
For another example. consider these files:
```
|--file1.txt
|--file2.txt
```
file1.txt contains 2 lines:
```
bread
read
```
file2.txt contains 2 lines:
```
orange juice
blue bread
```
and we run 2 commands, one without -i and one with -i
```
grep "read" file1.txt file2.txt
```
without -i results in:
```
file1.txt:bread     
file2.txt:blue bread
```
Now we try:
```
grep -i "read" file1.txt file2.txt
```
with -i results in
```
file1.txt:bread     
file1.txt:read      
file2.txt:blue bread
```
When using grep with multiple files, it includes the file name along with the line that includes the pattern.

### -v option for grep
By defult grep prints all the lines that include the pattern. The -v option prints all the lines that do not have the pattern in it.\
For example consider a file that includes 3 lines: 
```
bed read
bread
bed
```
and we run 2 commands, one without -v and one with -v
```
grep "read" file.txt
```
without the -v results in:
```
bed read
bread
```
Now we try:
```
grep -v "read" file.txt
```
with the -v results in:
```
bed
```
Notice that the -v option prints the line that doesn't include the pattern "read". \
For another example. consider these files:
```
|--file1.txt
|--file2.txt
```
file1.txt contains 2 lines:
```
bread
read
```
file2.txt contains 2 lines:
```
orange juice
blue bread
```
and we run 2 commands, one without -v and one with -v
```
grep "read" file1.txt file2.txt
```
without -v results in:
```
file1.txt:bread     
file2.txt:blue bread
```
Now we try:
```
grep -v "read" file1.txt file2.txt
```
with -v results in
```
file2.txt:orange juice
```
When using grep with multiple files, it includes the file name along with the line that includes the pattern.

### -c option for grep
By defult grep prints all the lines that include the pattern. The -c option prints a number that represnts the number of lines that include the pattern. \
For example consider a file that includes 3 lines: 
```
bed read
bread
bed
```
and we run 2 commands, one without -c and one with -c
```
grep "read" file.txt
```
without the -c results in:
```
bed read
bread
```
Now we try:
```
grep -c "read" file.txt
```
with the -c results in:
```
2
```
Notice that the -c option prints the number of lines that include the pattern "read". \
For another example. consider these files:
```
|--file1.txt
|--file2.txt
```
file1.txt contains 2 lines:
```
bread
read
```
file2.txt contains 2 lines:
```
orange juice
blue bread
```
and we run 2 commands, one without -c and one with -c
```
grep "read" file1.txt file2.txt
```
without -c results in:
```
file1.txt:bread     
file2.txt:blue bread
```
Now we try:
```
grep -c "read" file1.txt file2.txt
```
with -c results in
```
file1.txt:2
file2.txt:1
```
When using grep with multiple files, it includes the file name along with the line that includes the pattern.




