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

**High Performance:** With the use of Just-In-Time compilers, Java enables high performance.

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

## Java Architecture:

First the Java code is compiled by the Java compiler and generates the bytecode.  This bytecode will be stored in class files. Java Virtual Machine (JVM) is unique for each platform.   Though JVM is unique for each platform, all interpret the same bytecode and convert it into machine code required for its own platform and this machine code will be directly executed by the machine in which java program runs.  This makes Java platform independent and portable.

<img />

### Java Virtual Machine (JVM):

A Java Virtual Machine (JVM) is a component which provides an environment for running Java programs. JVM interprets the bytecode into machine code which will be executed the machine in which the Java program runs.

JVM can also run programs written in other languages (e.g. Groovy, Scala, etc).

### Java Runtime Environment (JRE):

Java Runtime Environment contains JVM, class libraries and other supporting components.

As you know the Java source code is compiled into bytecode by Java compiler. This bytecode will be stored in class files. During runtime, this bytecode will be loaded, verified and JVM interprets the bytecode into machine code which will be executed in the machine in which the Java program runs.

A Java Runtime Environment performs the following main tasks respectively.

- Loads the class. This is done by the class loader.
- Verifies the bytecode to check any security problems. This is done by bytecode verifier.
- Interprets the bytecode. This is done by the JVM.

A detailed Java architecture can be drawn as given below:

<img />


### Just in Time (JIT) Compiler:

As we discussed earlier when the Java program is executed, the byte code is interpreted by JVM.  But this interpretation is a slower process. To overcome this difficulty, JRE include the component JIT compiler. JIT makes the execution faster.

Once the byte code is recompiled by JIT compiler, the execution time needed will be much lesser. This compilation happens when the byte code is about to be executed and hence the name "Just in Time".

Hence the main performance improvement by using JIT compiler can be seen when the same code is executed again and again because JIT make use of the machine code which is cached and stored.


### Java Development Kit (JDK):

The Java Development Kit (JDK) is an implementation of either one of the Java Platform, Standard Edition, Java Platform, Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle Corporation in the form of a binary product aimed at Java developers on Solaris, Linux, macOS or Windows.

The JDK includes a private JVM and a few other resources to finish the development of a Java Application. Since the introduction of the Java platform, it has been by far the most widely used Software Development Kit (SDK).

### What is the difference between JRE and JDK?

The JRE is a package of everything necessary to run a compiled Java program, including the Java Virtual Machine (JVM), the Java Class Library, the `java` command, and other infrastructure. However, it cannot be used to create new programs.

The JDK is a full-featured SDK for Java. It has everything the JRE has, but also the compiler (`javac`) and tools (like `javadoc` and `jdb`). It is capable of creating and compiling programs.

### Garbage Collection (GC):

Garbage collection is a process by which Java achieves better memory management. As you know, in object oriented programming objects communicate to each other by passing messages.

Whenever an object is created, there will be some memory allocated for this object. This memory will remain as allocated until there are some references to this object. When there is no reference to this object, Java will assume that this object is not used anymore.  When garbage collection process happens, these objects will be destroyed and memory will be reclaimed.

Garbage collection happens automatically. There is no way that you can force garbage collection to happen. There are two methods `System.gc()` and `Runtime.getRuntime().gc()` through which you can make request for garbage collation. But calling these methods also will not force garbage collection to happen and you cannot make sure when this garbage collection will happen.

### Ways to make an object eligible for GC?

There are generally three different ways to make an object eligible for garbage collection:

- By nulling a reference:

```java
Employee e = new Employee();
e = null;
```
- By assigning a reference to another:

```java
Employee e1 = new Employee();
Employee e2 = new Employee();
e1 = e2; //now the first object referred by e1 is available for garbage collection
```
- By anonymous object:

```java
new Employee();
```

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