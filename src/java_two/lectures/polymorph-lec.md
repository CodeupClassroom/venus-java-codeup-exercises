### Inheritance 
    terms:
        super class or type
        sub class or type

    extends = inherits
    
    why inheritance?
        share code and/or fields (DRY: avoid duplicating things)
        the relationships between objects can be useful in your program
            REFLECTION: we can ask a class if it has a particular ancestor at runtime
            we can also restrict variables, arrays and array-like things to only work with a FAMILY of classes

    show example of class inheriting from another class
        maybe Bird and Duck 
            shared field flySpeed?
            shared method fly?
            shared method eat?
            1-arg constructor and getter/setter

    create a bird class first and demo it

    then create a duck subclass and demo it
        show NOT having a duck constructor
        duck constructor should call the bird constructor

    now add some new stuff for ducks
        swim speed field
        and swim method
        and a new 2-arg constructor and getter/setter
        and a quack method

    now make a rubber duck subclass
        override quack
        overrude eat
        and a no arg constructor that sets fly and swim speeds to 0

    show protected vs private visibility
        try to access fly or swim speed directly in rubber duck

    super
        prolly have shown the constructor example before now but point to it again
        maybe override the rubber duck fly method and call it via super
        and then ADD something to it like a console message to throw it instead

### Polymorphism
    can use superclass variables and parameters to store references to subclasses
    everyone gets treated as a superclass object UNLESS the subclass has overriden a superclass method

    make a Zoo class and create a few birds, ducks, rubber ducks
    
    put them in an array of Birds

    make a method called feedBirds that accepts the bird array
    and calls eat on each

### final... again
    make Duck final and watch what happens
    make quack() final and watch what happens
    make a parameter final (try a constructor)
        
        why make a class or method or parameter final?