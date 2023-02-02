# Exception
An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
CustomException
 customException means creating our own Exception to handle using try and catch.
 
 When an error occurs within a method, the method creates an object and hands it off to the runtime system. The object, called an exception object, contains information about the error, including its type and the state of the program when the error occurred. Creating an exception object and handing it to the runtime system is called throwing an exception.

After a method throws an exception, the runtime system attempts to find something to handle it. The set of possible "somethings" to handle the exception is the ordered list of methods that had been called to get to the method where the error occurred. The list of methods is known as the call stack!
[exceptions-callstack](https://user-images.githubusercontent.com/87619423/216243380-97a3cc0f-6e43-4ea2-8d70-3019b93cc7be.gif)

The runtime system searches the call stack for a method that contains a block of code that can handle the exception. This block of code is called an exception handler. The search begins with the method in which the error occurred and proceeds through the call stack in the reverse order in which the methods were called. When an appropriate handler is found, the runtime system passes the exception to the handler. An exception handler is considered appropriate if the type of the exception object thrown matches the type that can be handled by the handler.

The exception handler chosen is said to catch the exception. If the runtime system exhaustively searches all the methods on the call stack without finding an appropriate exception handler, as shown in the next figure, the runtime system (and, consequently, the program) terminates.
![exceptions-errorOccurs](https://user-images.githubusercontent.com/87619423/216243612-01f43e11-7422-415a-8d02-50cf9288466d.gif)

Constructor:
A onstructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword
Super() is used to call the parent class constructor.....
