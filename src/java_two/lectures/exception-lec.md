### Exceptions

    exception: something abnormal happened

        Java exceptions are signals that cause the program flow of execution to change

    robust: can handle abnormal situations, or exceptions

    software SHOULD handle common exceptions
        many of these involve end-user behavior
        otherwise, the program will crash

        you DO NOT want your program to crash
            and common exceptions are very avoidable
            so much so that Java forces you to consider them

#### demo a program causing an exception
    array index out of bounds

    put code after that to show that the trailing code DOES NOT execute

#### demo `throw` 
    why intentionally throw an exception?
        1. when you want to signal to your program that an exception happened and the current function cannot continue
            e.g., validation error in a constructor  
        2. when you want to package up other exceptions into a different kind of exception
            Uncle Bob clean coding suggestion

### Handling exceptions
    exceptions not useful if we could not keep our program from crashing

    try/catch/finally
        seen part of this with JS fetch then/catch/finally

#### demo try/catch/finally
    use divide by zero error or index out of bounds
    be sure to explain parts and use logging to show when each part executes
    and show what is skipped where

    show e.printStackTrace and e.getMessage

#### show multiple catch blocks
    only one catch executes
    most specific wins

#### demo try/catch scope
    show using a variable and trying to access it outside of the catch

### Checked and Unchecked
    checked: MUST be handled. Java thinks these are too possible to ignore and it forces the dev to handle them
        e.g., FileNotFound
    unchecked: can ignore. Java thinks these can be avoided by decent programming and dev can ignore OR handle them
        e.g., IndexOutOfBounds

        imagine having to try/catch every time you used a loop????

#### demo checked exception
    create a function that throws an Exception 

    show Java error
    
    handle w try/catch

    handle w passing it to caller AND talk about this
        pass it all the way to the VM

### When to throw to caller and when to handle?
    In general:

    Handle it:
        1. in the function where the exception originated
            e.g., a save button click method after the user enters bad data
        2. in the function that has the dependencies for properly reporting the exception
            e.g., a calling function that has access to GUI or logging functionality
        3. when you want the function to recover/ignore the problem
            e.g., closing a db connection in a finally block from another exception

    All other situations:
        Throw it to the caller

    Also:
        1. In a situation where a variety of exceptions can happen, package any exceptions in an single unchecked exception and pass up to the caller

### Custom Exceptions
    great for communicating meaning in the name

    can be application specific
        e.g., GatewayException for wrapping up any DB-related exception
        e.g., InvalidMovementException (trying to move a game piece off the board)

#### demo an Unchecked exception for Person constructor validation
    make our own exception InvalidPersonException
        altho do show IllegalArgumentException

### Checked or Unchecked
    Uncle Bob suggests Unchecked to make dev job easier
        Checked exceptions suck!

