PGR103 Cheat Sheet
==================

This is a cheat sheet for Java programming. It's in no particular order, but the simplest concepts are closer to the top.

This has been stared 2019 in the first PGR-103 course.

It's meant to be used as a quick "how did I do that again?" reference.

Index
-----

* [Data types](#data-types)
    * [int](#int)
    * [float](#float)
    * [boolean](#boolean)
    * [double](#double)
    * [void](#void)
    * [null](#null)
* [Casting](#casting)
* [Methods](#methods)
* [If statements](#if-statements)
* [Loops](#loops)
    * [for](#for-loops)
    * [while](#while-loops)
    * [do while](#do-while-loops)
* [Strings](#strings)
    * [equals](#equals)
    * [startsWith](#startsWIth)
    * [endsWith](#endsWith)
    * [substring](#substring)
    * [Adding to a string](#adding-to-a-string)
    * [toString](#tostring)
* [Logic](#logic)
    * [equal to](#equal-to)
    * [not equal to](#not-equal-to)
    * [less than](#less-than)
    * [greater than](#greater-than)
    * [and - checking multiple conditions](#and---checking-multiple-conditions)
    * [or - checking multiple conditions](#or---checking-multiple-conditions)
    * [grouping - checking multiple conditions](#grouping---checking-multiple-conditions)
    * [negating](#negating)
* [Writing text to the output log](#writing-text-to-the-output-log)
* [Reading user input](#reading-user-input)
* [Reading a file](#reading-a-file)
* [Simplest Java program](#simplest-java-program)
* [Recursion](#recursion)
* [Static](#static)
* [Constructor](#constructor)
* [this](#this)
* [super](#super)
    * [super constructor](#super-constructor)
    * [super methods](#super-methods)
* [Inheritance](#inheritance)
* [Aggregation](#aggregation)
* [Composition](#composition)
* [Interfaces](#interfaces)
* [Exceptions](#exceptions)

Data types
----------

### int

An `int` can hold *whole* numbers, including negative numbers. It cannot contain fractions.

```java
int myInt1 = 12345;
int myInt2 = 0;
int myInt3 = -42;
```

### float

`floats` are similar to `int`, but it can contain fractions.

You cannot use bitwise operations on floats. If you do, it will automatically be converted to `int` and lose the fractional.

```java
float myFloat1 = 12345.123;
float myFloat1 = -28.88;
```

### boolean

`boolean` can only contain `true` or `false`.

```java
boolean myBool1 = true;
boolean myBool2 = false;
```

### double

`double` is exactly like `float`, except it can hold bigger numbers.

```java
double myDouble = 9.9999999999999; // This would have too many digits after the decimal to be used in a float
```

### void

`void` means "nothing". You use it as the return data type in methods if you don't want to return anything at all.

Your `public static void main(String[] args)` method uses this, because main doesn't return any value.

### null

`null` also means "nothing", but where `void` is a *type*, `null` is actually a *value*. Any variable that has an object as type are by default `null` until you assign it something else.

Casting
-------
You can "force" an object or type into another object or type. For example, if you have a float and you want to force it into an int, you'd do `int myForcedInt = (int)myFloat;`. You can also do the same with objects. However, you must known what you're doing. Don't try to cast an object into a completely unrelated object!

Methods
-------

A method contains 5 parts:
* Optional visibility (can be `public` or `private`. If you leave it out, it'll default to `private`).
* Optional modifier (for example `static`)
* Return type (can be any of the data types).
* Method name
* Parameters (Comma separated list in parenthesis)
* Method body

It looks likes this:
```java
public static int myMethod(int argument)
{
	return 1;
}
```

Where
* `public` is the visibility
* `static` is the modifier
* `int` is the return type
* `myMethod` is the name
* `(int argument)` are the parameters
* `{ return 1; }` is the body.

All methods except those with `void` return type must `return something;`

If statements
-------------

To make your code do different things depending on the situation, you need `if` statements.

If statements run the body if the condition in parenthesis is true.

Example:
```java
int myInt = 11;
if(myInt > 10) // Condition: Is myInt is greater than (but not equal to) 10?
{
	System.out.println("The condition was true!");
}
```

If you want to do something if the condition is false, you need `else`, like so:
```java
int myInt = 5;
if(myInt > 10) // Condition: Is myInt is greater than (but not equal to) 10?
{
	System.out.println("The condition was true!");
}
else
{
	System.out.println("The condition was false!");
}
```

Loops
-----

There are 3 kinds of loops:
* `for` loop
* `while` loop
* `do while` loop

### `for` loops

The `for` loop is the most common type of loop.

`for` loops have 6 parts to them:
* The `for` keyword
* Initialisation - Single line of code to do before the loop starts
* Condition - `if` statement to do every time the loop loops
* Operation - Single line of code to do every time the loop loops
* The loop body - The code to run on every loop

The initialisation, condition and operation are separated by `;`

Like this:
```java
// Print all numbers from 1 to 10
for(int i = 1; i <= 10; i++)
{
	System.out.println(i);
}
```

Where:
* `int i = 1` is the initialisation
* `i <= 10` is the condition
* `i++` is the operation
* `{ System.out.println(i); }` is the body

### `while` loops

`while` loops are just like `for` loops, except it doesn't have the initialisation or operation.

Like this:
```java
// Print all numbers from 1 to 10
int i = 1; // Initialised OUTISDE the loop!
while(i <= 10)
{
	System.out.println(i);
	i++; // Incrementing i must be done manually
}
```

### `do while` loops

`do while` loops are exactly like `while` loops, except the `while` is placed at the end of the loop. This means a `do while` loop will always run *at least* one time.

`do while` loops are not used very often.

```java
// Print all numbers from 1 to 10
int i = 1;
do
{
	System.out.println(i);
	i++;
}
while(i <= 10); // Notice how the condition of the loop is only checked AFTER the loop body has been run
```

Strings
-------

The `String` object allows us to modify and manipulate text strings.

```java
String myString = "This is an example string";
```

Strings are `case-sensitive`. That means uppercase letters and lowercase letters are *not* equal.

The `String` object has a lot of useful methods we can use.

### equals

We cannot use `==` to compare strings. We must use `equals` instead:

```java
String myString = "my string";
if(myString.equals("my string"))
{
	System.out.println("The string is equals to \"my string\"!");
}
```

### startsWith

Check if a string starts with another string.

```java
String myString = "This is an example string";
if(myString.startsWith("This"))
{
	System.out.println("The string starts with \"This\"!");
}
```

### endsWith

Check if a string ends with another string.

```java
String myString = "This is an example string";
if(myString.endsWith("string"))
{
	System.out.println("The string ends with \"string.\"!");
}
```

### substring

To get a smaller part of a string, you use `substring(int start, int end)`.

The `substring` method takes two arguments:
* The first letter to start cutting at
* The letter to stop cutting at

```java
String myString = "This is an example string";
String mySubstring = myString.substring(0, 4);
System.out.println(mySubstring); // Will print "This"
```

Note that the letter to end at is *not* included in the result. For example:

```java
String myString = "This is an example string";
String mySubstring = myString.substring(0, 1);
System.out.println(mySubstring); // Will print "T"
```

Notice that the letter at index 1 is not included, only the letter at index 0 is included.

### Adding to a string

You can add strings and numbers to a string with the `+` operator.

```java
String firstString = "I have";
int amount = 99;
String result = firstString+" "+amount+" problems, but adding strings together isn't one of them.";
```

Result will be:
```
I have 99 problems, but adding strings together isn't one of them.
```

### toString

When making classes, you can turn them into string automatically by creating a `toString()` method in the class.

```java
class Student
{
	String firstName;
	String lastName;

	public Student(String first, String last)
	{
		firstName = first;
		lastName = last;
	}

	public String toString()
	{
		return firstName + " " + lastName;
	}
}
```

Using this class in code:
```java
Student myStudent = new Student("John", "Doe");

System.out.println("My student is: " + myStudent);
```

Java will automatically call the `toString` method when it needs to turn the `myStudent` object into a string for printing.

The console output will be:
```
My student is: John Doe
```

Logic
-----

Logic are operations that results in either `true` or `false`.

### equal to

To check if two numbers are equal, we use `==`.

Notice that we use *two* ='s. If you only use 1 equals sign, you'll actually be *assigning* instead of *comparing*.

```java
int a = 20;
int b = 20;

if(a == b)
{
	System.out.println("A and B are equal");
}
```

You can also use `==` on objects, to check if the variables contains *the same* object.

In other words, it doesn't check if the objects are equal, but if the objects are literally the same object.

```java
MyObject a = new MyObject();
MyObject b = a;
MyObject c = new MyObject();

if(a == b)
{
	System.out.println("A and B are the same object");
}
if(a == c)
{
	// This will not happen, because A and C are two DIFFERENT objects.
	// The content of the objects doens't matter. It also doesn't matter if they are the same type of object.
}
```

### not equal to

To check if two numbers are *not* equal, we use `!=`.

It works exactly the same as `==`, except flipped on its head.

```java
int a = 10;
int b = 20;

if(a != b)
{
	System.out.println("A and B are not equal");
}
```

### less than

If you want to check if one number is smaller than the others, you use `<`.

```java
int a = 10;
int b = 20;

if(a < b)
{
	System.out.println("A is less than B");
}
```

Notice that this won't return true if the two numbers are *equal*. If you want to check if one number is *less than or equal to* another number, use `<=`, like so:

```java
int a = 20;
int b = 20;

if(a <= b)
{
	System.out.println("A is less than or equal to B");
}
```

### greater than

If you want to check if one number is smaller than the others, you use `>`.

```java
int a = 20;
int b = 10;

if(a > b)
{
	System.out.println("A is greater than B");
}
```

Notice that this won't return true if the two numbers are *equal*. If you want to check if one number is *greater than or equal to* another number, use `>=`, like so:

```java
int a = 20;
int b = 20;

if(a >= b)
{
	System.out.println("A is greater than or equal to B");
}
```

### and - checking multiple conditions

If you want to check if multiple conditions are true, you use the logical and operator, `&&`.


```java
int a = 30;
int b = 20;
int c = 10;

// if a is greater than b AND b is not equal to c
if(a > b && b != c)
{
	System.out.println("A is greater than B, and B is not equal to C");
}
```

### or - checking multiple conditions

To check if at least one of two conditions are true, you use the logical or operator, `||`.

```java
int a = 30;
int b = 20;
int c = 10;

// if a is equal to b OR b is greater than c
if(a == b || b > c)
{
	System.out.println("Either: A is equal to B, or: B is greater than C");
}
```

### grouping - checking multiple conditions

If you have many conditions you want to check, but you need to check them in a spesific order, you can group them with parenthesis.

```java
int a = 30;
int b = 20;
int c = 10;

// if a is not equal to b, AND (a is less than b OR b is greater than c)
if(a != b && (a < b || b > c))
{
	System.out.println("A is not equal to B, AND (A is less than B OR B is greater than C)");
}
```

### negating

You can "flip" the result of a grouped condition by adding `!` in front of it. If the condition was true, the result will be turned into false and vice versa.

This operator is called *logical not*.

```java
int a = 30;
int b = 20;
int c = 10;

// if a is not equal to b, AND NOT(b is greater than a AND b is greater than c)
if(a != b || !(b < a && b < c))
{
	System.out.println("A is not equal to B, AND NOT(B is greater than A AND B is greater than C)");
}
```

Simplest Java program
---------------------

All Java programs must have a `public static void main` method (can be in any class).

```java
class MyClass
{
	public static void main(String[] args)
	{
		// Your code here
	}
}
```

Writing text to the output log
------------------------------

Use `System.out.println()` to print a whole line.
Use `System.out.print()` to print only parts of a line.

Example:

```java

class MyClass
{
	public static void main(String[] args)
	{
		System.out.println("My line!");

		System.out.print("Some text");
		System.out.println(", but notice how this all appeared on the same line!");

		// You can print empty lines:
		System.out.println();

		System.out.println("You can print numbers:");
		System.out.println(10);

		// Alternate way of printing an empty line:
		System.out.print("\n");

		String someString = "Hello!";
		System.out.println("You can also print variables:");
		System.out.println(someString);
	}
}
```

What you should see in the output:
```
My line!
Some text, but notice how this all appeared on the same line!

You can print numbers:
10

You can also print variables:
Hello!
```

Reading user input
------------------

```java

import java.util.Scanner; // Remember to add this line!

class MyClass
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner();

		// Reading a string:
		String strInput = scanner.nextLine();

		// Reading an int:
		int intInput1 = scanner.nextInt();
		int intInput2 = Integer.parseInt(scanner.nextLine()); // Alternative style

		// Reading a float:
		float floatInput1 = scanner.nextFloat();
		float floatInput2 = Float.parseFloat(scanner.nextLine()); // Alternative style
	}
}
```

Reading a file
--------------

To read a text file line by line, first import the nessecary classes:
```java
// Remember to put these on the top of your file!
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
```

Then loop until everything has been read:
```java
try
{
	// Open the file
	FileReader file = new FileReader("myfile.txt");

	// New reader
	BufferedReader reader = new BufferedReader(file);

	// Read the first file
	String line = reader.readLine();

	// While there are new lines read them
	while(line != null)
	{
		// Print the line
		System.out.println(line);

		// Read the next line
		line = reader.readLine();
	}
}
// We need this in case an error occurs
catch(IOException e)
{
	// Print debug info
	e.printStackTrace();
}
```

Recursion
---------

Recursion is when a method calls itself.

Example:
```java
public int countTo10(int currentValue)
{
	// Stop the recursion when we reach 10
	if(currentValue >= 10)
	{
		// Return WITHOUT calling ourselves to stop the recursion
		return currentValue;
	}

	// Recursion happens here: We call ourselves to get the next value
	return countTo10(currentValue + 1);
}
```

Most recursive method can be rewritten as loops. In the example above:

```java
int currentValue = 0;
while(currentValue >= 10)
{
	currentValue = currentValue + 1;
}
```

Static
------

You can declare methods or variables as static. When you make variables static, they will be the same throughout the entire program. If you declare a method static, you can call it without having to create a new object.

```java
class MyClass
{
	// This variable is static. So when one object changes it, it changes in all the other objects as well!
	public static int myClassObjectsCreated = 0;

	public MyClass()
	{
		// Increment the static variable by 1, to indicate that a new object has been created
		myClassObjectsCreated++;
	}

	public static void main(String[] argv)
	{
		// Create some objects
		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		MyClass myClass3 = new MyClass();

		// Ask ech class how many objects were created (They will all say 3!)
		System.out.println("myClass1 says "+myClass1.myClassObjectsCreated+" objects has been created.");
		System.out.println("myClass2 says "+myClass2.myClassObjectsCreated+" objects has been created.");
		System.out.println("myClass3 says "+myClass3.myClassObjectsCreated+" objects has been created.");
	}
}
```

Constructor
-----------

To initialize variables in an object as soon as the object is created, you need a constructor.

A constructor is just like any other method, but it must have *the same name as the class*, and it cannot have a return type.

Example:

```java
class MyClass
{
	int myInt;

	// Constructor
	public MyClass(int yourInt)
	{
		myInt = yourInt;
	}
}
```

this
----

The `this` keywork let's you clear ambiguity as to which data or method you're trying to access.

Example:
```java
class MyClass
{
	private int myInt;

	public MyClass(int myInt)
	{
		this.myInt = myInt; // If we don't use "this" here, the statement would be ambigious. Which "myInt" are we refering to? The one in the class, or the argument we were given? "this" lets us specify which one.
	}
}
```

super
-----

### super constructor

If you're inheriting a parent class and have overwritten its constructor, you can call the parents constructor in your consturctor. This way you can chain constructors and don't have to repeat code.

```java
class MyClass extends MyParent
{
	private int myInt;
	public MyClass()
	{
		// Call the parent constructor
		super();

		// Do some constructing of our own
		myInt = 100;
	}
}
```

### super methods

If you have overwritten a method in an inherited object, you can still call the parent's implementation of that method. Just use `super.myMethod()`

Example:

```java
public String toString()
{
	String parentString = super.toString(); // Call parent's toString()
	return parentString+" inherited";
}
```

Inheritance
-----------

Inheritance is when you use an existing class as a base for a new class. All the functionality of the base class will be inherited by the new class, this the name "inheritance".

To inherit a class, use the `extends` keyword.

```java
class MyParent
{
	public String FirstMethod()
	{
		return "Hello";
	}
	public String SecondMethod()
	{
		return "Hello";
	}
}

class MyClass extends MyParent
{
	// Declaring a method with the same signature as one found in the parent class will override the parent's method.
	public String SecondMethod()
	{
		return "World";
	}
}
```

You can inherit an inherited class, to create multi-level inheritance.

Aggregation
-----------

When your class consists of one of more objects with related information of their own, it's an aggregated class.
For example, if you have an `Employee` class which consists of employee information, and an `Address` object with in turn contains the employee's address, this would be an example of an aggregated class.

This is called a "HAS-A relationship."
"Employee HAS AN Address".

Composition
-----------

Composition is a special type of aggregation, where the contained object cannot exist in any meaningful manner without the container object.

Example: A class contains students. A student cannot exist without a
class. There exists composition between class and students.

Interfaces
----------

An interface is declared with the `interface` keyword, and is a class without any method bodies of it's own. When you `implements` an interface class, you are required to make a method for each of the methods declared by the interface.

```java
interface MyInterface
{
	public String FirstMethod();
}

class MyClass implements MyInterface
{
	// We are required to create a method for every method declared in the interface
	public String FirstMethod()
	{
		return "World";
	}

	// But we're free to add anything else we want
	public String SecondMethod()
	{
		return "Hello";
	}
}
```

Exceptions
----------

If an error occurs, an exception would be thrown. If you don't catch the exception, your program will crash. If you catch it, you can handle the error (or just ignore the error - Sometimes you just don't care!) and continue running your program as normal.
Example: Say you want to make a calculator. If you divide by 0, an exception would be thrown. You can catch this and prevent your calculator from crashing:
```java
public String divide(double a, double b)
{
	try
	{
		// Try to divide all numbers
		return (a / b).toString();
	}
	// Catch any and all exception, no matter the type
	catch(Exception e)
	{
		// If an exception happened, return something else instead of crashing
		return "Error!";
	}
}
```
