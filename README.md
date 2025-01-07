# FILE-HANDLING-UTILITY-USING-JAVA-PROGRAMMING

**COMPANY**: CODTECH IT SOLUTIONS

**NAME**: DHIRAJ PARIDA

**INTERN ID**:CT08EMF

**DOMAIN**:JAVA DEVELOPMENT

**BATCH DURATION**: January 5th, 2025 to February 5th, 2025

**MENTOR NAME**: Neela Santhosh Kumar 

**DESCRIPTION OF TASK**:Objective
The aim of this assignment is to illustrate the basic file operations like opening, reading, and writing a text file using Java. The following Java program handles all of these in an efficient manner along with appropriate exception handling and clear documentation.

Code Explanation
The three major functions that comprise the Java program are create and write to a file, read from a file, and modify content to append in a file. The program demonstrates the capability to work with text files using classes such as BufferedReader and BufferedWriter.

Program Structure:

Method: createAndWriteFile

Purpose: This method will create a new file if it doesn't already exist and then write content into the file.
Implementation: It wraps a BufferedWriter around a FileWriter. The method used to write the content in the file is write(). In case the file does not exist, it is created. In case it does exist, its contents are over-written.
Handling Error: All types of IOException while trying to create and write a file are caught and printed. 
readFile Method:

Purpose: This method reads the content of the file line by line and displays it in the console.
Implementation: BufferedReader with FileReader is used to read the file. readLine() is called in a loop to read each line until the end of the file is reached.
Error Handling: The method takes care of possible IOException during the process of file reading, which can be caused if the file is not found or while reading it.

modifyFile Method:

It is used to add new content at the end of the existing file without deleting any current content.
Implementation: It uses a BufferedWriter with FileWriter in append mode (specified by passing true as the second argument to FileWriter). This ensures the new content is added to the end of the file.
Error Handling: It also includes exception handling for IOException during the file modification process.
Main Method:

It is the entry point of the program. It demonstrates all three file operations in sequence:
It first creates and writes initial content to a file named example.txt.
Then it reads and displays the content of the file.
Next, it appends new content to the file.
Finally, it reads and displays the modified file content.
Error Handling: The main method ensures that any exceptions related to file operations are properly handled.
Key Concepts and Techniques:
File Writing and Reading:
The program utilizes FileWriter to write to a file and FileReader to read from the file.
It uses BufferedWriter and BufferedReader for faster reading and writing, reducing system calls by input and output buffering.
Exception Handling:
The program has try-catch blocks, which catch the IOException, making sure that if there is any error in performing file operations, the program keeps running.
Writing to Files Appending
FileWriter is a mode where new content is appended to the end of the file without deleting its current content when it is already in existence.

**OUTPUT**:![OUTPUTTASK1](https://github.com/user-attachments/assets/633afb55-87d3-4133-81e6-8c87941246fb)
