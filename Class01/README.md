# Contents: Types of variables and their sizes.

- Java is case-sensitive

- The `sizeOf` command is used to return the size of a type and/or variable

- The real type in Java is considered double and to be used, the value must be converted using the 'f' character. 
    
    Example: `real = 1.1f or real = (float)1.1`;

- The long type needs an "L" character (usually capitalized to clearly see that it is a character and not a number) to be able to take up a long number.


- Data types;
 
      Primitives: simpler data or scalars;
      References: arrays, classes and interfaces.

- Sizes of data types;
 
    For java the sizes are fixed
        1 integer = 32 bits = 4 bytes    
        
        byte integerSmall;//8 bits
        short integerShort;//16 bits
        integer int;//32 bits
        long integerLong;/64-bit
        
        real float;//32 bits
        double realDouble;/ /64-bit
        
        char character;//16 bits
        string string; // not a primitive type, but in Java it works like one 
    
        boolean boolean; // true or false, no size
        
        void; //used as a function return, in this case the return of a void pointer 
        
- Screen display;
            
    - In Java, the difference between print and println is that "println" will move the cursor to the next line.
        
          System.out.println(name of the variable or message);
          System.out.print(name of the variable or message);
    
    - Now printf has a different structure depending on format verbs and it is possible to merge strings.
        To construct a formatted string with printf it is necessary
        
        1º) declare the displayed data type with "%"
           
         Example data type format: `%d = int %f = float %c = character %s = string`
        
        2º) add the variable name.
      
          String string = "Learning";
          String string2 = "Java";
          System.out.printf("%s programming in %s", string, string2);  

- Arithmetic operators;
    
  - Binary: + - * / %
            
     | Operator | Operation       |
     | ---      | ---             |
     |    *     | Multiplication  |
     |    /     | Division        |
     |    +     | Addition        |
     |    -     | Subtraction     |
     |    =     | Assignment      |

  - Unary: ++ -- += -= *= /= %=

    | Operator | Operation |
    | --- | --- |
    |    ++    | Increment  |
    |    --    | Decrement  |
    |    +=    | Assignment |
    |    -=    | Assignment |
    |    /=    | Assignment |
    |    %=    | Assignment |
    |    \*=   | Assignment |


               
- The `\n` command is used for line breaks.
