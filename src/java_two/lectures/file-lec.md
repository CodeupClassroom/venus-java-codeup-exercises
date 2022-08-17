### File I/O
    I/O input/output

    file: a container for data: code, data data, documents, etc.
    
    path: the location of the file

    OS' have been using files for a long time. 
    fundamental piece of an OS is called the file system. file system provides users access to work with files

    file system organization: a hierarchy of folders/directories/files
    
    Windows Explorer and Finder are file system GUIs

    root directory: the top-level folder of the file system 

    current working directory (CWD): the directory you are currently in when using a shell like Terminal

    absolute path: the path from the root directory to a given file.
        an absolute path to a file is ALWAYS the same

    relative path: the path from the current working directory to a given file
        a relative path to a file changes based on the CWD

    path separator: strings are normally used to express paths, 
        but need a way to delimit the folders in a path. OS' use a path separator for the delimiter
        Unix/Mac uses /   PC uses \

        the difference has caused problems in the past and still needs to be thought about in real software

### Path object
    represents a file path
    
    hides the difference between Windows and Unix/Mac

    Required for using some of Java's file functions

### Paths class
    a utility class

    has static methods for getting path info about files as a Path object

### File object
    represents a file in the file system

### Files class
    a utility class

    has static methods for working with a file

### Demo time

#### Making folders and files

    Paths.get(String first, String... more)

    use Paths to get a Path object for a directory that exists

    use Paths to get a Path object for a file that exists

    use Paths to get a Path object for a file that DOES NOT exist

    use Files.exists an Files.notExists to see if a given Path object exists

    SHOW RELATIVE VS ABSOLUTE PATHS use in get()

    use Paths.get and Files.createFile and Files.createDirectories to create a new folder on my Desktop
        show crashing if it already exists
        then use notExists to not crash

    

if (Files.notExists(dataDirectory)) {
Files.createDirectories(dataDirectory);
}

if (! Files.exists(dataFile)) {
Files.createFile(dataFile);
}

#### Reading/writing files
    
    make an ArrayList of fruits

        show Arrays.asList("banana", ...)

    use Files.write with a path and an arraylist of fruits

    show the data

    NOTE: we may not have to use createFile to make the file
        
        show StandardOpenOption and play around with other options 

    show reading data with Files.readAllLines(path obj)

    and displaying the data 


#### GETTING READY FOR THE CONTACTS MGR

    do a bigger demo

    GroceryItem is just a class with a name string as a field for now

    GroceryApp is our main class

    make a GroceryList class because it will have a lot of nice helpful methods
        this will make the calling classes SMALLER, SIMPLER, and EASIER TO READ
        AND it will hide how we store the GroceryItems
            ENCAPSULATION!!!!

        has ArrayList of GroceryItems
            should also have a Path and/or File obj for the file behind the list
        has a static function for createFromFile(String filePath) and returns a GroceryList obj
            this should require a static GroceryItem builder function createFromString(String s) 

        has a function for saveToFile
        has a function for getting a GroceryItem
            by item name seems reasonable
        has a function for updating a GroceryItem
        has a function for adding a GroceryItem
        has a function for removing a GroceryItem
        has a function for printing the GroceryList         

        maybe helper functions for getGroceryItemQuantity(String itemName)
            and setGroceryItemQuantity(String itemName, int newQty)
