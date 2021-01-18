# OnlineCollegeYearbook
ONLINE COLLEGE YEAR BOOK INSTRUCTION FILE

Software Used:
The following software are used in backend:
1.	Java Version 15
2.	Sprint Tool Suite
3.	Postman
4.	Apache Maven
5.	Database Used: PostgreSQL 


Steps to run Frontend:

1)Spring Tool Suite
	https://spring.io/tools#suite-three
above in the link to download Spring Tool Suite.
2)pgAdmin
	https://www.pgadmin.org/download/
3)For Spring Tool Suite we need java development kit.
	https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
4)Open your downloaded Java Development Kit (JDK) zip file and run as administrator.
5)Give all the access it requires
6)After installing Java Development Kit (JDK) install spring tool suite.
7)Download the source code from git-hub
8)Open STS.





9)From the File Option select import.

 









10) From General select Project from folder or archive
 

11)Select the Directory and click on finish.

Installing PostgreSQL
•	Double click on the installer file, an installation wizard will appear and guide you through multiple steps where you can choose different options that you would like to have in PostgreSQL.
•	Click on Next
•	 Specify installation folder, choose your own or keep the default folder suggested by PostgreSQL installer and click the Next button  

•	Click on the next button till it asks you for password

 


•	Make sure you remember the password.
•	Select the port number. Default is 5432
  

•	Go on clicking on next and end it with clicking finish.

Verify the installation
 

Enter the username and password
 

After you have finished installation and verification.

•	Create a database in PostgreSQL:
create database database_name;

•	For Example: mydatabase 
•	Now open Spring Tool Suite again.
•	Open src/main/resources
•	In that open application properties.
•	Give your port, username and password correctly
 
Your application is ready to work.
•	Run the application as follows 
 

•	Right click on your project name
•	Select Run As
•	Spring Boot App.

Tables will automatically get created in database after you run the spring boot app.

