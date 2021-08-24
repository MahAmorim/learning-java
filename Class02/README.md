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
