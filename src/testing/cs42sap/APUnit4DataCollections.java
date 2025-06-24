/** Required package class namespace */
package testing.cs42sap;
 
/** Required API imports */
import utility.io.Simulator;
import utility.io.System;


/**
 * APUnit4DataCollections.java - This unit introduces the data structures 
 * array, ArrayList, and 2D array, which are used to represent collections of 
 * related data using a single variable rather than multiple variables. Arrays
 * have a static size, which causes limitations related to the number of 
 * elements stored, and it can be challenging to reorder elements stored in 
 * arrays. An ArrayList object has a dynamic size, and the class contains 
 * methods for insertion and deletion of elements, making reordering and 
 * shifting items easier. Deciding which data structure to select becomes 
 * increasingly important as the size of the data set grows, such as when 
 * using a large real-world data set. A 2D array is most suitable to represent 
 * a table. Unlike 1D arrays, 2D arrays require nested iterative statements to
 * traverse and access all elements. The easiest way to accomplish this is in
 * row-major order, but it is important to discuss additional traversal
 * patterns, such as column-major or back and forth. Just as there are useful
 * standard algorithms when dealing with primitive data, there are standard 
 * algorithms to use with data structures. Additional algorithms, such as two 
 * common searching and three common sorting algorithms, are also covered. 
 * Sometimes a problem can be solved by solving smaller or simpler versions of 
 * the same problem rather than attempting an iterative solution. This is 
 * called recursion, and it is a powerful math and computer science concept. 
 * In this unit, students will learn how to write simple recursive methods 
 * and determine the purpose or output of a recursive method by tracing. 
 * Students will revisit how control is passed when methods are called, which 
 * is necessary knowledge when working with recursion. Tracing skills are also 
 * helpful. Also in this unit, students will learn about privacy concerns 
 * related to storing large amounts of personal data and about what can happen
 * if such information is compromised. They will also examine the potential for
 * bias in collecting and using data.
 *
 * @author Mr. Wachs
 * @since June 2025
 */
public class APUnit4DataCollections 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit4DataCollections() {
        final int UNIT = 4;
        final String TITLE = "AP curriculum - Unit 4: Data Collections";
        if (Simulator.check(TITLE)) return; 
        
        ComputerScience42SAP.showUnit(UNIT);
        ////////////////////////////////////////////////////////////////////////
        // Unit 4 - Data Collections
        ////////////////////////////////////////////////////////////////////////
                
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,1);
        ////////////////////////////////////////////////////////////////////////
        // 4.1 - Ethical and Social Issues Around Data Collection
        //     4.1.1 - Explain the risks to privacy from collecting and 
        //             storing personal data on computer systems.
        //         4.1.1.1 - When using a computer, personal privacy is at 
        //                   risk. When developing new programs, programmers 
        //                   should attempt to safeguard the personal privacy 
        //                   of the user.
        //     4.1.2 - Explain the importance of recognizing data quality and 
        //             potential issues when using a data set.
        //         4.1.2.1 - Algorithmic bias describes systemic and repeated 
        //                   errors in a program that create unfair outcomes 
        //                   for a specific group of users.
        //         4.1.2.2 - Programmers should be aware of the data set 
        //                   collection method and the potential for bias when
        //                   using this method before using the data to 
        //                   extrapolate new information or drawing conclusions.
        //         4.1.2.3 - Some data sets are incomplete or contain 
        //                   inaccurate data. Using such data in the 
        //                   development or use of a program can cause the 
        //                   program to work incorrectly or inefficiently. 
        //     4.1.3 - Identify an appropriate data set to use in order to 
        //             solve a problem or answer a specific question.
        //         4.1.3.1 - Contents of a data set might be related to a 
        //                   specific question or topic and might not be 
        //                   appropriate to give correct answers or 
        //                   extrapolate information for a different question
        //                   or topic.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,2);
        ////////////////////////////////////////////////////////////////////////
        // 4.2 - Introduction to Using Data Sets
        //     4.2.1 - Represent patterns and algorithms that involve data 
        //             sets found in everyday life using written language or
        //             diagrams.
        //         4.2.1.1 - A data set is a collection of specific pieces of
        //                   information or data.
        //         4.2.1.2 - Data sets can be manipulated and analyzed to 
        //                   solve a problem or answer a question. When 
        //                   analyzing data sets, values within the set are
        //                   accessed and utilized one at a time and then 
        //                   processed according to the desired outcome.
        //         4.2.1.3 - Data can be represented in a diagram by using a 
        //                   chart or table. This visual can be used to plan 
        //                   the algorithm that will be used to manipulate 
        //                   the data
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,3);
        ////////////////////////////////////////////////////////////////////////
        // 4.3 - Array Creation and Access
        //     4.3.1 - Develop code used to represent collections of related 
        //             data using one dimensional (1D) array objects.
        //         4.3.1.1 - An array stores multiple values of the same 
        //                   type. The values can be either primitive values
        //                   or object references. 
        //         4.3.1.2 - The length of an array is established at the time
        //                   of creation and cannot be changed. The length of 
        //                   an array can be accessed through the length 
        //                   attribute.
        //         4.3.1.3 - When an array is created using the keyword new, 
        //                   all of its elements are initialized to the default
        //                   values for the element data type. The  default 
        //                   value for int is 0, for double is 0.0, for boolean
        //                   is false, and for a reference type is null. 
        //         4.3.1.4 - Initializer lists can be used to create and 
        //                   initialize arrays.
        //         4.3.1.5 - Square brackets [ ] are used to access and modify
        //                   an element in a 1D array using an index. 
        //         4.3.1.6 - The valid index values for an array are 0 through 
        //                   one less than the length of the array, inclusive.
        //                   Using an index value outside of this range will 
        //                   result in an ArrayIndexOutOfBoundsException.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,4);
        ////////////////////////////////////////////////////////////////////////
        // 4.4 - Array Traversals
        //     4.4.1 - Develop code used to traverse the elements in a 1D 
        //             array and determine the result of these traversals.
        //         4.4.1.1 - Traversing an array is when repetition statements
        //                   are used to access all or an ordered sequence of 
        //                   elements in an array. 
        //         4.4.1.2 - Traversing an array with an indexed for loop or 
        //                   while loop requires elements to be accessed using
        //                   their indices.
        //         4.4.1.3 - An enhanced for loop header includes a variable, 
        //                   referred to as the enhanced for loop variable. 
        //                   For each iteration of the enhanced for loop, 
        //                   the enhanced for loop variable is assigned a copy 
        //                   of an element without using its index. 
        //         4.4.1.4 - Assigning a new value to the enhanced for loop 
        //                   variable does not change the value stored in the 
        //                   array.
        //         4.4.1.5 - When an array stores object references, the 
        //                   attributes can be modified by calling methods 
        //                   on the enhanced for loop variable. This does not 
        //                   change the object references stored in the array.
        //         4.4.1.6 - Code written using an enhanced for loop to 
        //                   traverse elements in an array can be rewritten 
        //                   using an indexed for loop or a while loop.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,5);
        ////////////////////////////////////////////////////////////////////////
        // 4.5 - Implementing Array Algorithms
        //     4.5.1 - Develop code for standard and original algorithms for 
        //             a particular context or specification that involves 
        //             arrays and determine the result of these algorithms. 
        //         4.5.1.1 - There are standard algorithms that utilize array
        //                   traversals to: (a) determine a minimum or maximum
        //                   value, (b) compute a sum or average, (d) determine
        //                   if at least one element has a particular 
        //                   property, (e) determine if all elements have a 
        //                   particular property, (f) determine the number of
        //                   elements having a particular property, (g) 
        //                   access all consecutive pairs of elements, (h) 
        //                   determine the presence or absence of duplicate 
        //                   elements, (i) shift or rotate elements left or 
        //                   right, (j) reverse the order of the elements
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,6);
        ////////////////////////////////////////////////////////////////////////
        // 4.6 - Using Text Files
        //     4.6.1 - Develop code to read data from a text file.
        //         4.6.1.1 - A file is storage for data that persists when the
        //                   program is not running. The data in a file can be 
        //                   retrieved during program execution.
        //         4.6.1.2 - A file can be connected to the program using the
        //                   File and Scanner classes.
        //         4.6.1.3 - A file can be opened by creating a File object, 
        //                   using the name of the file as the argument of the 
        //                   constructor. File(String str) is the File
        //                   constructor that accepts a String file name to
        //                   open for reading, where str is the pathname for 
        //                   the file.
        //         4.6.1.4 - When using the File class, it is required to 
        //                   indicate what to do if the file with the provided
        //                   name cannot be opened. One way to accomplish 
        //                   this is to add throws IOException to the header
        //                   of the method that uses the file. If the file 
        //                   name is invalid, the program will terminate.
        //         4.6.1.5 - The File and IOException classes are part of 
        //                   the java.io package. An import statement must be
        //                   used to make these classes available for use in 
        //                   the program
        //         4.6.1.6 - Scanner methods are part of Java Quick 
        //                   Reference: (a) Scanner(File f) is the Scanner 
        //                   constructor that accepts a File for reading. 
        //                   (b)int nextInt() returns the next int read from
        //                   the file or input source if available. If the 
        //                   next int does not exist or is out of range, it 
        //                   will result in an InputMismatchException. (c)
        //                   double nextDouble() returns the next  double 
        //                   read from the file or input source. If the next
        //                   double does not exist, it will result in an 
        //                   InputMismatchException. (d) boolean nextBoolean()
        //                   returns the next boolean read from the file or 
        //                   input source. If the next boolean does not exist,
        //                   it will result in an InputMismatchException. (e) 
        //                   String nextLine() returns the next line of text 
        //                   as a String read from the file or input source; 
        //                   can return the empty string if called immediately
        //                   after another Scanner method that is reading from 
        //                   the file or input source. (f) String next() 
        //                   returns the next String read from the file or 
        //                   input source. (g)  boolean hasNext() returns 
        //                   true if ehere is a next item to read in the 
        //                   file or input source; returns false otherwise. 
        //                   (h) void close() closes this scanner. Note: 
        //                   accepting input from the keyboard is outside 
        //                   the scope of the AP Computer Science A course and
        //                   exam.
        //         4.6.1.7 - Using nextLine and the other Scanner methods 
        //                   together on the same input source sometimes 
        //                   requires code to adjust for the methods' 
        //                   different ways of handling whitespace. Note: 
        //                   Writing or analyzing code that uses both nextLine
        //                   and other Scanner methods on the same input source
        //                   is outside the scope of the AP Computer Science 
        //                   A course and exam.
        //         4.6.1.8 - The following additional String method - 
        //                   including what it does and when it is used - is 
        //                   part of the Java Quick Reference: (a) String[] 
        //                   split(String del returns a String array where
        //                   each element is a substring of this String, which
        //                   has been split around matches of the given 
        //                   expression del. Note: The parameter del uses a 
        //                   format called a regular expression. Writing or 
        //                   analyzing code that uses any of the special 
        //                   properties of regular expressions 
        //                   (e.g., \\*, \\.) is outside the scope of the 
        //                   AP Computer Science A course and exam. 
        //         4.6.1.9 - A while loop can be used to detect if the file 
        //                   still contains elements to read by using the 
        //                   hasNext method as the condition of the loop.
        //         4.6.1.10 - A file should be closed when the program is 
        //                   finished using it. The close method from Scanner
        //                   is called to close the file.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,7);
        ////////////////////////////////////////////////////////////////////////
        // 4.7 - Wrapper Classes
        //     4.7.1 - Develop code to use Integer and Double objects from 
        //             their primitive counterparts and determine the result 
        //             of using these objects.
        //         4.7.1.1 - The Integer class and Double class are part of 
        //                   the java.lang package. An Integer object is 
        //                   immutable, meaning once an Integer object is 
        //                   created, its attributes cannot be changed. A 
        //                   Double object is immutable, meaning once a Double 
        //                   object is created, its attributes cannot be 
        //                   changed. 
        //         4.7.1.2 - Autoboxing is the automatic conversion that the 
        //                   Java compiler makes between primitive types and 
        //                   their corresponding object wrapper classes. This 
        //                   includes converting an int to an Integer and a 
        //                   double to a Double. The Java compiler applies 
        //                   autoboxing when a primitive value is: (a) passed 
        //                   as a parameter to a method that expects an object 
        //                   of the corresponding wrapper class (b) assigned 
        //                   to a variable of the corresponding wrapper class 
        //         4.7.1.3 - Unboxing is the automatic conversion that the 
        //                   Java compiler makes from the wrapper class to 
        //                   the primitive type. This includes converting an 
        //                   Integer to an int and a Double to a double. The
        //                   Java compiler applies unboxing when a wrapper 
        //                   class object is: (a) passed as a parameter to a 
        //                   method that expects a value of the corresponding 
        //                   primitive type (b) assigned to a variable of the 
        //                   corresponding primitive type 
        //         4.7.1.4 - The following class Integer method - including 
        //                   what it does and when it is used - is part of the
        //                   Java Quick Reference: (a) static int 
        //                   parseInt(String s) returns the String argument 
        //                   as an int. 
        //         4.7.1.5 - The following class Double method - including 
        //                   what it does and when it is used - is part of 
        //                   the Java Quick Reference: (a) static double
        //                   parseDouble(String s) returns the String argument
        //                   as a double.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,8);
        ////////////////////////////////////////////////////////////////////////
        // 4.8 - ArrayList Methods
        //     4.8.1 - Develop code for collections of related objects using 
        //             ArrayList objects and determine the result of calling 
        //             methods on these objects. 
        //         4.8.1.1 - An ArrayList object is mutable in size and 
        //                   contains object references. 
        //         4.8.1.2 - The ArrayList constructor ArrayList() constructs
        //                   an empty list. 
        //         4.8.1.3 - Java allows the generic type ArrayList<E>, where 
        //                   the type parameter E specifies the type of the 
        //                   elements. When ArrayList<E> is specified, the 
        //                   types of the reference parameters and return
        //                   type when using the ArrayList methods are type 
        //                   E. ArrayList<E> is preferred over ArrayList. For 
        //                   example, ArrayList<String> names = new 
        //                   ArrayList<String>(); allows the compiler to find 
        //                   errors that would otherwise be found at run-time.
        //         4.8.1.4 - The ArrayList class is part of the java.util 
        //                   package. An import statement must be used to make this
        //                   class available for use in the program. 
        //         4.8.1.5 - The following ArrayList methods - including what 
        //                   they do and when they are used - are part of the
        //                   Java Quick Reference: (a) int size() returns the
        //                   number of elements in the list. (b) boolean 
        //                   add(E obj) appends obj to end of list; returns
        //                   true. (c) void add(int index, E obj) inserts obj 
        //                   at position index (0 <= index <= size), moving 
        //                   elements at position index and higher to the 
        //                   right (adds 1 to their indices) and adds 1 to 
        //                   size. (d) E get(int index) returns the element 
        //                   at position index in the list. (e) E 
        //                   set(int index, E obj) replaces the element at 
        //                   position index with obj; returns the element 
        //                   formerly at position index. (f) E 
        //                   remove(int index) removes element from position 
        //                   index, moving elements at position index + 1 and 
        //                   higher to the left (subtracts 1 from their 
        //                   indices) and subtracts 1 from size; returns the 
        //                   element formerly at position index.
        //         4.8.1.6 - The indices for an ArrayList start at 0 and end 
        //                   at the number of elements - 1
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,9);
        ////////////////////////////////////////////////////////////////////////
        // 4.9 - ArrayList Traversals
        //     4.9.1 - Develop code used to traverse the elements of an 
        //             ArrayList and determine the results of these traversals.
        //         4.9.1.1 - Traversing an ArrayList is when iteration or 
        //                   recursive statements are used to access all or an 
        //                   ordered sequence of the elements in an ArrayList.
        //         4.9.1.2 - Deleting elements during a traversal of an 
        //                   ArrayList requires the use of special techniques 
        //                   to avoid skipping elements. 
        //         4.9.1.3 - Attempting to access an index value outside of 
        //                   its range will result in an 
        //                   IndexOutOfBoundsException. 
        //         4.9.1.4 - Changing the size of an ArrayList while 
        //                   traversing it using an enhanced for loop can 
        //                   result in a ConcurrentModificationException. 
        //                   Therefore, when using an enhanced for loop to 
        //                   traverse an ArrayList, you should not add or 
        //                   remove elements.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,10);
        ////////////////////////////////////////////////////////////////////////
        // 4.10 - Implementing ArrayList Algorithms
        //     4.10.1 - Develop code for standard and original algorithms for 
        //              a particular context or specification that involve 
        //              ArrayList objects and determine the result of these 
        //              algorithms.
        //         4.10.1.1 - There are standard ArrayList algorithms that 
        //                    utilize traversals to: (a) determine a minimum 
        //                    or maximum value (b) compute a sum or average 
        //                    (c) determine if at least one element has a 
        //                    particular property (d) determine if all 
        //                    elements have a particular property (e) 
        //                    determine the number of elements having a 
        //                    particular property (f) access all consecutive 
        //                    pairs of elements (g) determine the presence or 
        //                    absence of duplicate elements (h) shift or 
        //                    rotate elements left or right (i) reverse the
        //                    order of the elements (j)  insert elements 
        //                    (k)  delete elements
        //         4.10.1.2 - Some algorithms require multiple String, array,
        //                    or ArrayList objects to be traversed 
        //                    simultaneously.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,11);
        ////////////////////////////////////////////////////////////////////////
        // 4.11 - 2D Array Creation and Access
        //     4.11.1 - Develop code used to represent collections of related 
        //              data using two dimensional (2D) array objects.
        //         4.11.1.1 - A 2D array is stored as an array of arrays.
        //                    Therefore, the way 2D arrays are created and 
        //                    indexed is similar to 1D array objects. The 
        //                    size of a 2D array is established at the time 
        //                    of creation and cannot be changed. 2D arrays 
        //                    can store either primitive data or object 
        //                    reference data. Note: Nonrectangular 2D array 
        //                    objects are outside the scope of the AP Computer 
        //                    Science A course and exam.
        //         4.11.1.2 - When a 2D array is created using the keyword 
        //                    new, all of its elements are initialized to the
        //                    default values for the element data type. The
        //                    default value for int is 0, for double is 0.0, 
        //                    for boolean is false, and for a reference type 
        //                    is null. 
        //         4.11.1.3 - The initializer list used to create and 
        //                    initialize a 2D array consists of initializer
        //                    lists that represent 1D arrays; for example, 
        //                    int[][] arr2D = { {1, 2, 3}, {4, 5, 6} };.
        //         4.11.1.4 - The square brackets [row][col] are used to 
        //                    access and modify an element in a 2D array. 
        //                    For the purposes of the exam, when accessing 
        //                    the element at arr[first][second], the first 
        //                    index is used for rows, the second index is used
        //                    for columns.
        //         4.11.1.5 - A single array that is a row of a 2D array can 
        //                    be accessed using the 2D array name and a single
        //                    set of square brackets containing the row index. 
        //         4.11.1.6 - The number of rows contained in a 2D array can 
        //                    be accessed through the length attribute. The 
        //                    valid row index values for a 2D array are 0 
        //                    through one less than the number of rows or the
        //                    length of the array, inclusive. The number of 
        //                    columns contained in a 2D array can be accessed
        //                    through the length attribute of one of the rows.
        //                    The valid column index values for a 2D array are
        //                    0 through one less than the number of columns or
        //                    the length of any given row of the array, 
        //                    inclusive. For example, given a 2D array named 
        //                    values, the number of rows is  values. length 
        //                    and the number of columns is values[0].length. 
        //                    Using an index value outside of these ranges 
        //                    will result in an ArrayIndexOutOfBoundsException.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,12);
        ////////////////////////////////////////////////////////////////////////
        // 4.12 - 2D Array Traversals
        //     4.12.1 - Develop code used to traverse the elements in a 2D 
        //              array and determine the result of these traversals.
        //         4.12.1.1 - Nested iteration statements are used to traverse
        //                    and access all or an ordered sequence of elements
        //                    in a 2D array. Since 2D arrays are stored as 
        //                    arrays of arrays, the way 2D arrays are traversed
        //                    using for loops and enhanced for loops is similar
        //                    to 1D array objects. Nested iteration statements
        //                    can be written to traverse the 2D array in 
        //                    row-major order, column-major order, or a 
        //                    uniquely defined order. Row-major order refers 
        //                    to an ordering of 2D array elements where 
        //                    traversal occurs across each row, whereas 
        //                    columnmajor order  traversal occurs down each 
        //                    column.
        //         4.12.1.2 - The outer loop of a nested enhanced for loop 
        //                    used to traverse a 2D array traverses the rows.
        //                    Therefore, the enhanced for loop variable must
        //                    be the type of each row, which is a 1D array. 
        //                    The inner loop traverses a single row. 
        //                    Therefore, the inner enhanced for loop variable
        //                    must be the same type as the elements stored in 
        //                    the 1D array. Assigning a new value to the 
        //                    enhanced for loop variable does not change the 
        //                    value stored in the array. 
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,13);
        ////////////////////////////////////////////////////////////////////////
        // 4.13 - Implementing 2D Array Algorithms
        //     4.13.1 - Develop code for standard and original algorithms for
        //              a particular context or specification that involves 2D
        //              arrays and determine the result of these algorithms.
        //         4.13.1.1 - There are standard algorithms that utilize 2D 
        //                    array traversals to: (a) determine a minimum or 
        //                    maximum value of all the elements or for a 
        //                    designated row, column, or other subsection 
        //                    (b) compute a sum or average of all the elements 
        //                    or for a designated row, column, or other 
        //                    subsection (c) determine if at least one element
        //                    has a particular property in the entire 2D array 
        //                    or for a designated row, column, or other
        //                    subsection (d) determine if all elements of the 
        //                    2D array or a designated row, column, or other 
        //                    subsection have a particular property (e) 
        //                    determine the number of elements in the 2D 
        //                    array or in a designated row, column, or other
        //                    subsection having a particular property (f) 
        //                    access all consecutive pairs of elements (g) 
        //                    determine the presence or absence of duplicate
        //                    elements in the 2D array or in a designated row,
        //                    column, or other subsection (h) shift or rotate 
        //                    elements in a row left or right or in a column 
        //                    up or down (i) reverse the order of the elements 
        //                    in a row or column
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,14);
        ////////////////////////////////////////////////////////////////////////
        // 4.14 - Searching Algorithms
        //     4.14.1 - Develop code used for linear search algorithms to 
        //              search for specific information in a collection and 
        //              determine the results of executing a search.
        //         4.14.1.1 - Linear search algorithms are standard algorithms
        //                    that check each element in order until the 
        //                    desired value is found or all elements in the 
        //                    array or ArrayList have been checked. Linear 
        //                    search algorithms can begin the search process 
        //                    from either end of the array or ArrayList.
        //         4.14.1.2 - When applying linear search algorithms to 2D 
        //                    arrays, each row must be accessed then linear 
        //                    search applied to each row of the 2D array.    
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,15);
        ////////////////////////////////////////////////////////////////////////
        // 4.15 - Sorting Algorithms
        //     4.15.1 - Determine the result of executing each step of 
        //              sorting algorithms to sort the elements of a 
        //              collection.
        //         4.15.1.1 - Selection sort and insertion sort are 
        //                    iterative sorting algorithms that can be used 
        //                    to sort elements in an array or ArrayList. 
        //         4.15.1.2 - Selection sort repeatedly selects the smallest 
        //                    (or largest) element from the unsorted portion 
        //                    of the list and swaps it into its correct (and 
        //                    final) position in the sorted portion of the list.
        //         4.15.1.3 - Insertion sort inserts an element from the 
        //                    unsorted portion of a list into its correct 
        //                    (but not necessarily final) position in the 
        //                    sorted portion of the list by shifting elements
        //                    of the sorted portion to make room for the new 
        //                    element.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,16);
        ////////////////////////////////////////////////////////////////////////
        // 4.16 - Recursion
        //     4.16.1 - Determine the result of calling recursive methods.
        //         4.16.1.1 - A recursive method is a method that calls 
        //                    itself. Recursive methods contain at least one 
        //                    base case, which halts the recursion, and at 
        //                    least one recursive call. Recursion is another 
        //                    form of repetition.
        //         4.16.1.2 - Each recursive call has its own set of local 
        //                    variables, including the parameters. Parameter 
        //                    values capture the progress of a recursive 
        //                    process, much like loop control variable values
        //                    capture the progress of a loop. 
        //         4.16.1.3 - Any recursive solution can be replicated 
        //                    through the use of an iterative approach and 
        //                    vice versa. Note: Writing recursive code is 
        //                    outside the scope of the  AP Computer Science 
        //                    A course and exam.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,17);
        ////////////////////////////////////////////////////////////////////////
        // 4.17 - Recursive Searching and Sorting
        //     4.17.1 - Determine the result of executing recursive 
        //              algorithms that use strings or collections.
        //         4.17.1.1 - Recursion can be used to traverse String 
        //                    objects, arrays, and ArrayList objects.
        //     4.17.2 - Determine the result of each iteration of a binary 
        //              search algorithm used to search for information in a 
        //              collection.
        //         4.17.2.1 - Data must be in sorted order to use the binary 
        //                    search algorithm. Binary search starts at the 
        //                    middle of a sorted array or ArrayList and 
        //                    eliminates half of the array or ArrayList in 
        //                    each recursive call until the desired value is
        //                    found or all elements have been eliminated. 
        //         4.17.2.2 - Binary search is typically more efficient than 
        //                    linear search. Note: Search algorithms other than
        //                    linear and binary search are outside the scope
        //                    of the AP Computer Science A course and exam.
        //         4.17.2.3 - The binary search algorithm can be written 
        //                    either iteratively or recursively.
        //     4.17.3 - Determine the result of each iteration of the merge 
        //              sort algorithm when used to sort a collection.
        //         4.17.3.1 - Merge sort is a recursive sorting algorithm that
        //                    can be used to sort elements in an array or 
        //                    ArrayList. Note: Sorting algorithms other than 
        //                    selection, insertion, and merge sort are outside
        //                    the scope of the AP Computer Science A course 
        //                    and exam. 
        //         4.17.3.2 - Merge sort repeatedly divides an array into 
        //                    smaller subarrays until each subarray is one 
        //                    element and then recursively merges the sorted 
        //                    subarrays back together in sorted order to form
        //                    the final sorted array.    
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
    }
    
}