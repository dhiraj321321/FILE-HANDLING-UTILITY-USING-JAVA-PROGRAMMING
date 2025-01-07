package internshipcode;

import java.io.*;
import java.nio.file.*;

public class filehandaling {

    // Method to create a new text file and write some content
    public static void createAndWriteFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read the content of a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    // Method to modify an existing file by appending new content
    public static void modifyFile(String fileName, String additionalContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine(); // To ensure the new content is written on a new line
            writer.write(additionalContent);
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.err.println("Error modifying the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // File name for demonstration
        String fileName = "C:\\java\\internshipcode\\sample (1).txt";
        
        // Step 1: Create and write to the file
        String initialContent = "Hello, this is a sample text file.In Java, with the help of File Class, we can work with files. This File Class is inside the java.io package. The File class can be used by creating an object of the class and then specifying the name of the file.\r\n" + //
                        "\r\n" + //
                        "Why File Handling is Required?\r\n" + //
                        "\r\n" + //
                        "File Handling is an integral part of any programming language as file handling enables us to store the output of any particular program in a file and allows us to perform certain operations on it.\r\n" + //
                        "In simple words, file handling means reading and writing data to a file.";
        createAndWriteFile(fileName, initialContent);

        // Step 2: Read the file content
        readFile(fileName);

        // Step 3: Modify the file by appending content
        String additionalContent = "This content has been added later.Streams in Java\r\n" + //
                        "In Java, a sequence of data is known as a stream.\r\n" + //
                        "This concept is used to perform I/O operations on a file.\r\n" + //
                        "There are two types of streams :\r\n" + //
                        "1. Input Stream:\r\n" + //
                        "The Java InputStream class is the superclass of all input streams. The input stream is used to read data from numerous input devices like the keyboard, network, etc. InputStream is an abstract class, and because of this, it is not useful by itself. However, its subclasses are used to read data.\r\n" + //
                        "\r\n" + //
                        "There are several subclasses of the InputStream class, which are as follows:\r\n" + //
                        "\r\n" + //
                        "AudioInputStream\r\n" + //
                        "ByteArrayInputStream\r\n" + //
                        "FileInputStream\r\n" + //
                        "FilterInputStream\r\n" + //
                        "StringBufferInputStream\r\n" + //
                        "ObjectInputStream";
        modifyFile(fileName, additionalContent);

        // Step 4: Read the modified file content
        readFile(fileName);
    }
}
