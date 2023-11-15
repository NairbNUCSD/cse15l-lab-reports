## Lab Report 4 - Vim (Week 7)
Steps (4-9):
1. Log into ieng6
2. Clone your fork of the repository from your Github account (using the SSH URL)
3. Run the tests, demonstrating that they fail
4. Edit the code file to fix the failing test
5. Run the tests, demonstrating that they now succeed
6.Commit and push the resulting change to your Github account (you can pick any commit message!)

Keys pressed: 
```
1. ssh cs15lfa23im@ieng6.ucsd.edu<enter>
2. git clone git@github.com:NairbNUCSD/lab7.git<enter> (the git repo was in my clipboard so i just used copy paste to insert it in the command)
3. cd l<tab><enter>, bash t<tab><enter>
4. vim L<tab>.j<tab><enter>,:44<enter>,e<right>i<backspace>2<escape>:wq!<enter>
5. bash t<tab><enter>
6. git add L<tab><enter>, git commit<enter>, iFixed bug in ListExamples.java<escape>:wq!<enter>, git push<enter>
```

Summary of commands and how the keypresses relate to them:
1. I used the ssh command to log into my ieng6 device. ```cs15lfa23im@ieng6.ucsd.edu``` is my ieng6 account and I just typed it out because I memorized it.![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/b1691375-045e-45dd-a9c1-5241e67fd564)

2. I used the git clone command to clone the repository to the ieng6 server. ```git@github.com:NairbNUCSD/lab7.git``` was the SSH clone link that I copied from github when I forked the repository for lab7.![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/041b7a18-224a-4121-bb5e-cf84e44b469c)

3. I used the cd command to change the working directory to lab7 becuase then I clone the repository, the directory is called lab7. I didnt type lab7, but I typed ```l<tab>``` becuase the ```<tab>``` autofills it to lab7. Then I used the bash command to run the test.sh script. I used the same idea where i typed ```t<tab>``` and the ```<tab>``` autofilled to test.sh. Running the script showed that there was an error.![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/045781f1-2227-45ce-a060-ea0aeb9e80f9)

4. I used the vim command to get into the text editor in bash and I ran it with ListExamples.java. I typed ```L<tab>.j<tab>``` where the first ```<tab>``` autofilled to ListExamples and the second ```<tab>``` autofilled to .java. This results in ListExamples.java. Once im in vim, I used the vim command ```:``` along with the line number 44 to move the cursor to the 44th line. Then I typed ```e``` which moved the cursor to the end of the first word. I had to move the cursor once to the right so i used the right arrow key, then I pressed ```i``` to switch vim from normal mode to insert mode. From there I typed backspace and 2 to make the nessecary corrections to the file. After that I pressed ```<escape>``` to switch vim back to normal mode and I used the ```:``` along with ```wq!``` so I can save and quit from the text editor.![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/ff3f8e1f-ecf7-4cfa-aef0-ba5e8db490c0)![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/be22c293-b7e8-4826-b9a8-775513628612)


5. I used the bash command to run test.sh script once again to show that the bug was fixed. I typed ```t<tab>``` and the ```<tab>``` autofilled to test.sh. \
 ![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/35626eca-b683-4474-9e6f-e37afb1e0e84)

7. I used the git add command to add ListExamples.java to the commits. I typed ```L<tab>``` and the ```<tab>``` autofilled to ListExamples.java. Then I used the git commit command to make a commit. This promted me to type a commit message so I first typed ```i``` to switch the vim from normal mode to insert mode. Then I wrote the message ```Fixed bug in ListExamples.java``` and I pressed ```<escape>``` to switch back to normal mode. I used the vim command ```:``` along with ```wq!``` to save and quit from the vim. Then I used the git push command to push the git to my github and since I had connected the repository through the SSH link, it didnt promt me to log in or anything.![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/3fe2ac46-cbe0-44f4-9eed-1ea8c1074ecc)![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/0c677d8c-e5e0-48b0-8560-f2d001c90b04)![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/37dbdb81-7940-4e50-bcdc-0e799ff64e59)


