### Why objects?

### Instantiation
    draw a neat diagram

### Getters and Setters
#### Why?
    answer: ENCAPSULATION
    will see a good encapsulation example soon

### Static things (methods and fields)
#### Why and when?
    answer: when it makes no sense to have an instance of an object for it.
        AND WHEN DATA DO NOT NEED TO PERSIST BETWEEN METHOD CALLS
        E.g., Math does not need to keep any data around after you call Math.abs()
    Static is a deliberate design choice.
    IDEALLY: It is not an excuse to make globally-accesible data and functions
        In reality, it can be ok to do so
    
#### Static field naming conventions
    not yet

#### When to make a function static
    1. Builder function (we will see these later)
    2. Utility functions that don't need to save state between function calls (like Math.abs)

#### The POTENTIAL problem with worldPopulation example
    making data static to share it among Person instances
    what if we needed to track moon pop. or mars pop.?
    isn't world population a characteristic of an instance of a world?
    BUT... when do you design too much?
        REQUIREMENTS and SPECIFICATIONS!

### Constructors
    Go back to the Person code and clean it up

#### Overloaded constructors

#### A default constructor using "this"

### Visibility
#### show accessing private fields 
#### default to private methods 
        caveat: some Spring stuff 
