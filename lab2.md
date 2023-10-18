# LAB REPORT 2: Servers and SSH Keys (Week 3)

## Part 1
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/92229ed0-ec4f-4b96-9e22-c1e9805f4640) \
The image above is a screenshot of the code for StringServer.java.
In the handleRequest method, the URI variable was used to get the path of the url and compare it to expected inputs. The URI variable had methods such as .getPath() and .getQuery which allowed me to use if else statements to determine the flow of logic.
In the toString method, it allowed me to convert an ArrayList data structure into a single string variable that I can return. 
The relevent fields include the ArrayList<String> called list. This stored all the data from the /add-message query. This field changes as the user inputs different data strings. Another relevant field that changes is the URI variable called url. It changes as the url of the actual webpage is modified. This allows us to read the input of the user. \
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/3fb50d59-34f7-4af8-ad89-a3fcd2241f1b) \
The methods that were called when using "/add-message?s=Hello" was the handleRequest and the toString methods in the Handler class in StringServer.java.
The relevant arguments was line 12 to 18 and line 22 to 28. Line 12 to 18 is the URI vairable called url containing "/add-message". This prompts the url to get the query and split the query at the string "=" and puts the split strings into a String array. This allows us to check if the first parameter was the string "s", which it was in this case, and it adds the second paramter as a String to the ArrayList, in this case it is "Hello". It returns the toString method. Line 22 to 28 is the toString method and it converts the ArrayList into a String that can be used as the output. In this case the ArrayList only contains one element, so the toString method returns  "1.Hello\n".
The relevant variables are the ArrayList and the URI variables. the URI.getPath(), in this case, changes to "/add-messages" and the URI.getQuery(), in this case, changes to "s=Hello". The ArrayList, in this case, now contains one element, which is a String "Hello". \

![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/2338dbc9-571d-4214-82cd-86a29b9e6ee3) \
The methods that were called when using "/add-message?s=How are you" was the handleRequest and the toString methods in the Handler class in StringServer.java.
The relevant arguments was line 12 to 18 and line 22 to 28. Line 12 to 18 is the URI vairable called url containing "/add-message". This prompts the url to get the query and split the query at the string "=" and puts the split strings into a String array. This allows us to check if the first parameter was the string "s", which it was in this case, and it adds the second paramter as a String to the ArrayList, in this case it is "How are you". It returns the toString method. Line 22 to 28 is the toString method and it converts the ArrayList into a String that can be used as the output. In this case the ArrayList contains two elements, so the toString method returns  "1.Hello\n2.How are you\n".
The relevant variables are the ArrayList and the URI variables. the URI.getPath(), in this case, changes to "/add-messages" and the URI.getQuery(), in this case, changes to "s=How are you". The ArrayList, in this case, now contains two elements,{"Hello", "How are you"}. \

## Part 2 
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/ae0c4a90-bb76-4cf7-a4cc-27f215579daf) \
The path to the private key for my SSH key for logging into ieng6. \
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/eab45ac4-bce7-4eeb-abcd-d99cc8c51258) \
The path to the public key for your SSH key for logging into ieng6. \
![image](https://github.com/NairbNUCSD/cse15l-lab-reports/assets/146861770/2452f731-cccd-4173-934d-4a82910cd8fe) \
A terminal interaction where I log into ieng6 with my course-specific account without being asked for a password. 

## Part 3
In week 2 I learned how url's work and they are not as complicated as I thought. I learned how to use the URL as input for my Server programs. I learned the crucial parts of the URL such as the path and the query. I also leanred how to create a Server through java. I also learned how to use ssh to log into my school's ieng6 computer remotely. \
In week 3 I learned how to use the terminal in VSCode and making it so that I dont have to type my password everytime to log into my school ieng6 account. I also learned how to use mkdir (making a new directory/folder) and scp (copying files).
