# JUnit

    unit testing framework for Java

## @Test annotation

    tells JUnit that the attached method can be executed as a unit test (code that executes OUTSIDE of a normal Java program)


## Assertions

    JUnits way of determining if the test passes or fails. If the assertion fails, then that test fails. Otherwise that test passes.

    Assertions can test all kinds of things: primitive equality, object equality, sameness, exception throwing

    all assertions require at least 2 things: the expected value and the actual value
        expected value is what the actual value SHOULD be.
        the actual value is the value that is produced by execution. it may not be the same as the expected value. In this case, the test would fail.

    assertEquals (and the Not version)
        for primitives. can be used for objects if .equals is overridden
        for custom objects, if not overriden this is memory address comparison

    assertSame (and the Not version)
        for memory address comparison

    assertArrayEquals
        try with regular array and assertEquals
            then assertArrayEquals

    assertTrue (and False)
        make a validator for GroceryItem regarding the name. must be non-blank

    assertNull (and Not)

    test an exception. for now just use @Test(Exception.class = "IllegalArgumentException")
        make a GroceryItem constructor validator that requires a non-blank grocery item name

    Test sequence determinism
        or lack of 

## Setup and Teardown

    @Before
        runs before every test

        make some grocery items and a grocery list

        
    @After 
        clean up after every test 
            like "finally" in try/catch, can be used for closing things like files and db resultsets, statements, and/or connections

    @BeforeClass and @AfterClass

## work thru TDD example 

    explain hashing and show example for protecting passwords
    
    figure out the code

## work thru Testing Legacy Code

    talk about how to test the Kitchen class
        what should we test???

    figure out the code

## exercise
    may not want to fork. may want to BEAR clone
