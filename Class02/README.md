# Content: message boxes and decision making.

### Message Box:

- The Java language offers different ways of interacting with the user, mostly in windows

- The `JOptionPane` class provides us with a series of static methods that when invoked create simple and straightforward dialog boxes.

- Predefined Java classes are grouped into packages (package), known as `Java class libraries` or Java application programming interface (Java API)

- Java package names start with `Java` (core language packages) or `Javax` (core extensions)

- The import statement is used to identify and load classes used in a Java program

- Import statements must always appear before the definition of classes

- JOptionPane is a class from the GUI library of javax.swing, so to use JOptionPane we always have to import the package `javax.swing.JOptionPane` first.

- Sample output can be by console:
  
      System.out.println(word);
    
- Sample output can be by message box:
    
      word = JOptionPane.showInputDialog("Enter a word");
      JOptionPane.showMessageDialog(null, word);

### Decision Making:

- With condition structures enable the program to make decisions and change the execution flow

- In the Java language we have three resources for creating decision structures: `if/else`, `ternary operator` and `switch/case`

- In this class we introduce the switch case

- Example switch case structure: 

      switch(teste){
                  case 1:
                      System.out.println("Hi");
                      break;
                  case 2:
                      System.out.println("Hello");
                      break;
                  case 3:
                      System.out.println("What's up");
                      break;
                  default:
                      System.out.println("Digite SOMENTE números entre 1 e 3");
                      break;
              }

- Switch case is the conditional switch tests the value contained in a variable and compares it with the values provided in each case, represented by the reserved word case
    
- The `break` command, when executed, ends the execution of the structure where it is located
    
- If all cases are tested and none match the value of the test variable, the code block associated with the `default` section of the conditional will be executed
    
    
