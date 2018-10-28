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

<img title="Java Architecture" src="https://raw.githubusercontent.com/nazmulb/java/master/images/JavaArchitecture2.jpg" />

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

<img title="Java Architecture with JRE" src="https://raw.githubusercontent.com/nazmulb/java/master/images/JavaArchitecture3.jpg" />

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
$ javac MyFirstJavaProgram.java
$ java MyFirstJavaProgram 
Hello World
```

## Networking:

The term network programming refers to writing programs that execute across multiple devices (computers), in which the devices are all connected to each other using a network.

The `java.net` package of the J2SE APIs contains a collection of classes and interfaces that provide the low-level communication details, allowing you to write programs that focus on solving the problem at hand.

The `java.net` package provides support for the two common network protocols −

- **TCP** − TCP stands for Transmission Control Protocol, which allows for reliable communication between two applications. TCP is typically used over the Internet Protocol, which is referred to as TCP/IP.
- **UDP** − UDP stands for User Datagram Protocol, a connection-less protocol that allows for packets of data to be transmitted between applications.

### Socket Programming:

Sockets provide the communication mechanism between two computers using TCP. A client program creates a socket on its end of the communication and attempts to connect that socket to a server.

When the connection is made, the server creates a socket object on its end of the communication. The client and the server can now communicate by writing to and reading from the socket.

The `java.net.Socket` class represents a socket, and the `java.net.ServerSocket` class provides a mechanism for the server program to listen for clients and establish connections with them.

The following steps occur when establishing a TCP connection between two computers using sockets −
- The server instantiates a `ServerSocket` object, denoting which port number communication is to occur on.
- The server invokes the `accept()` method of the `ServerSocket` class. This method waits until a client connects to the server on the given port.
- After the server is waiting, a client instantiates a Socket object, specifying the server name and the port number to connect to.
- The constructor of the Socket class attempts to connect the client to the specified server and the port number. If communication is established, the client now has a Socket object capable of communicating with the server.
- On the server side, the `accept()` method returns a reference to a new socket on the server that is connected to the client's socket.

After the connections are established, communication can occur using I/O streams. Each socket has both an `OutputStream` and an `InputStream`. The client's `OutputStream` is connected to the server's `InputStream`, and the client's `InputStream` is connected to the server's `OutputStream`.

#### Socket Client Example:

```java
// File Name GreetingClient.java
import java.net.*;
import java.io.*;

public class GreetingClient {

    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            
            DataInputStream in = new DataInputStream(client.getInputStream());
            System.out.println("Server says " + in.readUTF());
            
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
```


#### Socket Server Example:

```java
// File Name GreetingServer.java
import java.net.*;
import java.io.*;

public class GreetingServer extends Thread {
   private ServerSocket serverSocket;
   
   public GreetingServer(int port) throws IOException {
      serverSocket = new ServerSocket(port);
      serverSocket.setSoTimeout(20000);
   }

   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());
            
            DataInputStream in = new DataInputStream(server.getInputStream());
            System.out.println(in.readUTF());
            
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
            
            server.close();
         } catch (SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            break;
         } catch (IOException e) {
            e.printStackTrace();
            break;
         }
      }
   }
   
   public static void main(String[] args) {
      int port = Integer.parseInt(args[0]);
      try {
         Thread t = new GreetingServer(port);
         t.start();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }   
}
```

Compile the client and the server and then start the server as follows −

```
$ java GreetingServer 6066
Waiting for client on port 6066...
Check the client program as follows −
```

#### Output:
```
$ java GreetingClient localhost 6066
Connecting to localhost on port 6066
Just connected to localhost/127.0.0.1:6066
Server says Thank you for connecting to /127.0.0.1:6066
Goodbye!
```

## Multithreading:

Java is a multi-threaded programming language which means we can develop multi-threaded program using Java. A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources specially when your computer has multiple CPUs.

By definition, multitasking is when multiple processes share common processing resources such as a CPU. Multi-threading extends the idea of multitasking into applications where you can subdivide specific operations within a single application into individual threads. Each of the threads can run in parallel. The OS divides processing time not only among different applications, but also among each thread within an application.

Multi-threading enables you to write in a way where multiple activities can proceed concurrently in the same program.

### Life Cycle of a Thread:
A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then dies. The following diagram shows the complete life cycle of a thread.

<img title="Thread Life Cycle" src="https://raw.githubusercontent.com/nazmulb/java/master/images/Thread_Life_Cycle.jpg" width="425" />

Following are the stages of the life cycle −

- **New** − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.

- **Runnable** − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.

- **Waiting** − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.

- **Timed Waiting** − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.

- **Terminated (Dead*)* − A runnable thread enters the terminated state when it completes its task or otherwise terminates.

### Thread Priorities:
Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.

Java thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10). By default, every thread is given priority NORM_PRIORITY (a constant of 5).

Threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads. However, thread priorities cannot guarantee the order in which threads execute and are very much platform dependent.

### Create a Thread by Implementing a Runnable Interface:
If your class is intended to be executed as a thread then you can achieve this by implementing a **Runnable** interface. You will need to follow three basic steps −

#### Step 1:
As a first step, you need to implement a `run()` method provided by a Runnable interface. This method provides an entry point for the thread and you will put your complete business logic inside this method. Following is a simple syntax of the `run()` method −

```java
public void run()
```

#### Step 2:
As a second step, you will instantiate a Thread object using the following constructor −

```java
Thread(Runnable threadObj, String threadName);
```

Where, `threadObj` is an instance of a class that implements the `Runnable` interface and threadName is the name given to the new thread.

Step 3
Once a Thread object is created, you can start it by calling `start()` method, which executes a call to `run()` method. Following is a simple syntax of `start()` method −

```java
void start();
```

#### Example:
Here is an example that creates a new thread and starts running it −

```java
// File Name TestThread.java

class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class TestThread {
   public static void main(String args[]) {
      RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start();
   }   
}
```

This will produce the following result −

#### Output:

```
Creating Thread-1
Starting Thread-1
Creating Thread-2
Starting Thread-2
Running Thread-1
Thread: Thread-1, 4
Running Thread-2
Thread: Thread-2, 4
Thread: Thread-1, 3
Thread: Thread-2, 3
Thread: Thread-1, 2
Thread: Thread-2, 2
Thread: Thread-1, 1
Thread: Thread-2, 1
Thread Thread-1 exiting.
Thread Thread-2 exiting.
```

### Interthread Communication:

If you are aware of interprocess communication then it will be easy for you to understand interthread communication. Interthread communication is important when you develop an application where two or more threads exchange some information.

There are three simple methods and a little trick which makes thread communication possible. All the three methods are listed below −

- `wait()`: Causes the current thread to wait until another thread invokes the `notify()`.
- `notify()`: Wakes up a single thread that is waiting on this object's monitor.
- `notifyAll()`: Wakes up all the threads that called `wait()` on the same object.

All three methods can be called only from within a **synchronized** context.

#### Example:
This examples shows how two threads can communicate using `wait()` and `notify()` method. You can create a complex system using the same concept.

```java
// File name ThreadCommunication.java

class Chat {
   boolean flag = false;

   public synchronized void FromNabil(String msg) {
      if (flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      
      System.out.println(msg);
      
      flag = true;
      notify();
   }

   public synchronized void FromNahiyan(String msg) {
      if (!flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

      System.out.println(msg);
      
      flag = false;
      notify();
   }
}

class T1 implements Runnable {
   Chat m;
   String[] s1 = { "Hi Nahiyan", "How are you?", "I am also doing fine!" };

   public T1(Chat m1) {
      this.m = m1;
      new Thread(this, "Question").start();
   }

   public void run() {
      for (int i = 0; i < s1.length; i++) {
         m.FromNabil(s1[i]);
      }
   }
}

class T2 implements Runnable {
   Chat m;
   String[] s2 = { "Hello Nabil", "I am good, what about you?", "Great!" };

   public T2(Chat m2) {
      this.m = m2;
      new Thread(this, "Answer").start();
   }

   public void run() {
      for (int i = 0; i < s2.length; i++) {
         m.FromNahiyan(s2[i]);
      }
   }
}

public class ThreadCommunication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }
}
```

When the above program is complied and executed, it produces the following result −

#### Output:
```
Hi Nahiyan
Hello Nabil
How are you?
I am good, what about you?
I am also doing fine!
Great!
```

# JSP:

JavaServer Pages (JSP) is a technology for developing Webpages that supports dynamic content. This helps developers insert java code in HTML pages by making use of special JSP tags, most of which start with `<%` and end with `%>`.

A JavaServer Pages component is a type of Java servlet that is designed to fulfill the role of a user interface for a Java web application. Web developers write JSPs as text files that combine HTML or XHTML code, XML elements, and embedded JSP actions and commands.

Using JSP, you can collect input from users through Webpage forms, present records from a database or another source, and create Webpages dynamically.

## Java Servlet:

A Java servlet is a Java software component that extends the capabilities of a server. A Java servlet processes or stores a Java class in Java EE that conforms to the Java Servlet API, a standard for implementing Java classes that respond to requests.

A software developer may use a servlet to add dynamic content to a web server using the Java platform. The generated content is commonly HTML, but may be other data such as XML and more commonly, JSON. Servlets can maintain state in session variables across many server transactions by using HTTP cookies, or URL mapping.

To deploy and run a servlet, a web container must be used. A web container (also known as a servlet container) is essentially the component of a web server that interacts with the servlets. The web container is responsible for managing the lifecycle of servlets, mapping a URL to a particular servlet and ensuring that the URL requester has the correct access rights.

Servlets can be generated automatically from JSP by the JSP compiler. The difference between servlets and JSP is that servlets typically embed HTML inside Java code, while JSPs embed Java code in HTML.


## JSP Architecture:

The following steps explain how the web server creates the Webpage using JSP −

- As with a normal page, your browser sends an HTTP request to the web server.

- The web server recognizes that the HTTP request is for a JSP page and forwards it to a JSP engine. This is done by using the URL or JSP page which ends with .jsp instead of .html.

- The JSP engine loads the JSP page from disk and converts it into a servlet content. This conversion is very simple in which all template text is converted to `println()` statements and all JSP elements are converted to Java code. This code implements the corresponding dynamic behavior of the page.

- The JSP engine compiles the servlet into an executable class and forwards the original request to a servlet engine.

- A part of the web server called the servlet engine loads the Servlet class and executes it. During execution, the servlet produces an output in HTML format. The output is furthur passed on to the web server by the servlet engine inside an HTTP response.

- The web server forwards the HTTP response to your browser in terms of static HTML content.

- Finally, the web browser handles the dynamically-generated HTML page inside the HTTP response exactly as if it were a static page.

<img title="Thread Life Cycle" src="https://raw.githubusercontent.com/nazmulb/java/master/images/JSPLife.png" width="550" />

### JSP Lifecycle:

A JSP life cycle is defined as the process from its creation till the destruction. This is similar to a servlet life cycle with an additional step which is required to compile a JSP into servlet.

The following are the paths followed by a JSP −

- Compilation
- Initialization
- Execution
- Cleanup

The four major phases of a JSP life cycle are very similar to the Servlet Life Cycle. The four phases have been described below −

<img title="Thread Life Cycle" src="https://raw.githubusercontent.com/nazmulb/java/master/images/jsp_life_cycle.png" width="460" />

#### JSP Compilation:
When a browser asks for a JSP, the JSP engine first checks to see whether it needs to compile the page. If the page has never been compiled, or if the JSP has been modified since it was last compiled, the JSP engine compiles the page.

The compilation process involves three steps −

- Parsing the JSP.
- Turning the JSP into a servlet.
- Compiling the servlet.

#### JSP Initialization:
When a container loads a JSP it invokes the `jspInit()` method before servicing any requests. If you need to perform JSP-specific initialization, override the `jspInit()` method −

```java
public void jspInit(){
   // Initialization code...
}
```

Typically, initialization is performed only once and as with the servlet init method, you generally initialize database connections, open files, and create lookup tables in the `jspInit` method.

#### JSP Execution:
This phase of the JSP life cycle represents all interactions with requests until the JSP is destroyed.

Whenever a browser requests a JSP and the page has been loaded and initialized, the JSP engine invokes the `_jspService()` method in the JSP.

The `_jspService()` method takes an `HttpServletRequest` and an `HttpServletResponse` as its parameters as follows −

```java
void _jspService(HttpServletRequest request, HttpServletResponse response) {
   // Service handling code...
}
```

The `_jspService()` method of a JSP is invoked on request basis. This is responsible for generating the response for that request and this method is also responsible for generating responses to all seven of the HTTP methods, i.e, GET, POST, DELETE, etc.

#### JSP Cleanup:
The destruction phase of the JSP life cycle represents when a JSP is being removed from use by a container.

The `jspDestroy()` method is the JSP equivalent of the destroy method for servlets. Override `jspDestroy` when you need to perform any cleanup, such as releasing database connections or closing open files.

The `jspDestroy()` method has the following form −

```java
public void jspDestroy() {
   // Your cleanup code goes here.
}
```

Happy learning :)