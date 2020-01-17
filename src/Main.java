/* Class: CISC 3130
 * Section: MY9, TY2, TY9
 * EmplId:
 * Name: Professor Katherine Chuang
 */

 // Imports go towards top of the file
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

// This class handles the effort related to opening and reading the data file,
// and parses the needed information with available methods to access data later.
class GreatExpectations extends Thread
{
  // Java classes can have private members that are not accessible outside the class
  private int chapters = 0;

  // Java members can be final, meaning they can't be changed
  final static String data = "../data/great_expectations.txt";

  // This is a default constructor that gets called when an object is created
  public GreatExpectations()
  {
    System.out.println("Constructor called. Parsing this file: " + data);
  }

  // getter method to retrieve the private class member from another class
  int getGreatExpectations()
  {
    return this.chapters;
  }

  // setter method to set the private class member
  void setGreatExpectations(int i)
  {
    this.chapters = i;
  }

  // Implementation in its own function with default access modifier to the class
  void openBookandStudy()
  {
    System.out.print(" starting method openBookandStudy ");
    File file = new File(data);
    int counter = 0;

    // try-catch block to handle exceptions when opening and reading files
    try
    {
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine())
      {
          String s = scanner.nextLine();
          if (s.contains("Chapter"))
          {
            // Increment the counter, this is the only necessary line in this if block
            counter += 1;

            // Thread sleeping is for cosmetic reasons as . is printed to screen
            Thread.sleep(300);
            System.out.print(".");
          }
      }
      // Good habit to close the scanner after done reading a file
      scanner.close();

      // Make thread sleep, for cosmetic reasons
      Thread.sleep(100);

    } catch (Exception e) {
      System.out.println("uh oh!");
    }

    // Save the number of chapters counted to instance member so it can be accessed later
    this.setGreatExpectations(counter);
  }
} // end class GreatExpectations

// There can only be one public class in a Java file.
// The public class name must match the file name.
public class Main
{

  // Every public class has a main method.
  // There can only be one main method.
  public static void main(String[] args)
  {
    GreatExpectations thisSemester = new GreatExpectations();
    thisSemester.openBookandStudy();

    // Print to console w/o new line
    System.out.print("Charles Dickens wrote ");
    System.out.print(thisSemester.getGreatExpectations());

    // Print to console w/ new line
    System.out.println(" chapters in his book Great Expectations.");
  }
}
