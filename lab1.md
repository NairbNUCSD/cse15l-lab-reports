# LAB REPORT 1: Remote Access and FileSystem (Week 1)

## Command: *cd*
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/438c82f8-bb7e-46a2-b32d-67222ccd8e7b) \
In the image above, the first line is using the **cd** command with *no arguments*, when the working directory is in the home directory.
This changes the working directory to the home directory. This is not an error.

In the second line, I used **cd** with *a directory* called 'lecture1' as the argument, when the working directory is in the home directory.
This changes the directory to the directory that was typed in the argument. This is not an error.

In the third line, I used **cd** with *a file* called 'Hello.java' as the argument, when the working directory is in the "lecture1" directory.
This produces an error which is seen in the forth line. This shows that **cd** should only be used for directories.

## Command: *ls*
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/bbf191de-b272-4c2a-a293-cb1ff904d223) \
In the image above, the first line is using the **ls** command with *no arguments*, when the working directory is in the "lecture1" directory.
This shows the contents of the current directory in a list, as seen in line 2. This is not an error.

In the third line, I used **ls** with *a directory* called 'messages' as the argument, when the working directory is in the "lecture1" directory.
This prints the contents of the directory in the argument, as seen in line 4. This is not an error.

In the fifth line, I used **ls** with *a file* called 'en-us.txt' as an argument, when the working directory is in the "lecture1" directory.
This produces an error as you cannot **ls** a file, as seen in line 6.

## Command: *cat*
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/2cdaeccb-6f35-4896-a67a-78d02cfe03fa) \
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/e88d6372-58a6-4516-a2c0-a28a44ccf85c) \
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/a16f9587-1b7d-49a2-97ed-1dd828d3bb3f) \
In the first line, I used **cat** with *no arguments*, when the working directory is in the "lecture1" directory.
This just does nothing and it seems like an error because I can not run any more commands after.

In line 3, I used **cat** with *a directory* named 'lecture1' as the argument, when the working directory is in the home directory.
This produced an error, as  the **cat** command can not be used for directories, as seen in line 4. 

In line 5, I used **cat** with *a file* named 'Hello.java' as the argument, when the working directory is in the "lecture1" directory.
This printed the contents of the file, as seen in lines 6-17. This is not an error.





