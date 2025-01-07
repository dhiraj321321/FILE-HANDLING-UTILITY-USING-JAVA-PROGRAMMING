package internshipcode;



 import java.io.*;
 import java.util.Scanner;
 
 public class oprationonfile {
 
     public static void main(String[] args) {
         String fileName = "C:\\java\\internshipcode\\sample (1).txt";
 
         // 1. Creating a file
         createFile(fileName);
 
         // 2. Writing to a file
         writeFile(fileName, "Hello, this is a demonstration of file operations in Java.");
 
         // 3. Reading from a file
         readFile(fileName);
 
         // 4. Deleting a file
         deleteFile(fileName);
     }
 
     /**
      * Method to create a new file.
      * @param fileName The name of the file to be created.
      */
     private static void createFile(String fileName) {
         try {
             File file = new File(fileName);
             if (file.createNewFile()) {
                 System.out.println("File created: " + file.getName());
             } else {
                 System.out.println("File already exists.");
             }
         } catch (IOException e) {
             System.out.println("An error occurred while creating the file.");
             e.printStackTrace();
         }
     }
 
     /**
      * Method to write data to a file.
      * @param fileName The name of the file to write to.
      * @param content The content to write into the file.
      */
     private static void writeFile(String fileName, String content) {
         try (FileWriter writer = new FileWriter(fileName)) {
             writer.write(content);
             System.out.println("Successfully wrote to the file.");
         } catch (IOException e) {
             System.out.println("An error occurred while writing to the file.");
             e.printStackTrace();
         }
     }
 
     /**
      * Method to read data from a file.
      * @param fileName The name of the file to read from.
      */
     private static void readFile(String fileName) {
         try (Scanner scanner = new Scanner(new File(fileName))) {
             System.out.println("Contents of the file:");
             while (scanner.hasNextLine()) {
                 System.out.println(scanner.nextLine());
             }
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred while reading the file.");
             e.printStackTrace();
         }
     }
 
     /**
      * Method to delete a file.
      * @param fileName The name of the file to delete.
      */
     private static void deleteFile(String fileName) {
         File file = new File(fileName);
         if (file.delete()) {
             System.out.println("File deleted: " + file.getName());
         } else {
             System.out.println("Failed to delete the file.");
         }
     }
 }
 
