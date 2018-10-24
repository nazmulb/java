# Java

Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. Java programming language was originally developed by Sun Microsystems which was initiated by James Gosling and released in 1995 as core component of Sun Microsystems' Java platform (Java 1.0 [J2SE]). It promised **Write Once, Run Anywhere (WORA)**, providing no-cost run-times on popular platforms.

## Advantages of Java:

**Simple:** Java was designed to be easy to use, write, compile, debug, and learn than other programming languages. Java is much simpler than C++ because Java uses automatic memory allocation and garbage collection.

**Object-Oriented:** Allows you to create modular programs and reusable code.

**Platform-Independent:** Ability to move easily from one computer system to another.

**Distributed:** Designed to make distributed computing easy with the networking capability that is inherently integrated into it.

**Secure:** The Java language, compiler, interpreter, and runtime environment were each developed with security in mind.

**Allocation:** Java has the feature of Stack allocation system. It helps the data to be stored and can be restored easily.

**Multithreaded:** The capability for a program to perform several tasks simultaneously within a program.

## Disadvantages of Java:

**Performance:** SIgnificantly slower and more memory-consuming than natively compiled languages such as C or C++.

**Look and feel:** The default look and feel of GUI applications written in Java using the Swing toolkit is very different from native applications.

**Single-paradigm language:** The addition of static imports in Java 5.0 the procedural paradigm is better accommodated than in earlier versions of Java.

## Uses of Java:

When considering what you can do with Java, many developers think of building:

- Application servers
- Web applications
- Unit tests
- Mobile applications
- Desktop applications
- Enterprise applications

## Install Java:

Please <a href="https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html">download and install JDK</a> on your local machine.

## First Java Program:

Let us look at a simple code that will print the words Hello World.

Example

```java
public class MyFirstJavaProgram {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {
      System.out.println("Hello World"); // prints Hello World
   }
}
```

Let's look at how to save the file, compile, and run the program. Please follow the subsequent steps −

- Open notepad and add the code as above.
- Save the file as: `MyFirstJavaProgram.java`.
- Open a command prompt window and go to the directory where you saved the class.
- Type `javac MyFirstJavaProgram.java` and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line.
- Now, type `java MyFirstJavaProgram` to run your program.
- You will be able to see `Hello World` printed on the window.

Output

```
javac MyFirstJavaProgram.java
java MyFirstJavaProgram 
Hello World
```

Happy learning :)