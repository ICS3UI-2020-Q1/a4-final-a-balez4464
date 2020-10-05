import java.util.Scanner;

/**
 *This program asks the user for a number nad shows them all thier factors
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user to put in positive integer
    System.out.println("Please enter a positive integer to determine its factors:");
    int usersNumber = input.nextInt();

    //while loop to make them enter a positive int
    while(usersNumber <= 0){
      System.out.println("Please enter a positive integer to determine its factors:");
      //allows them to enter new number
      usersNumber = input.nextInt();
    }

    //delcares interger for the dividers and remainders
    int divider = 1;
    int remainder = 0;

    //while loop to determine factors
    System.out.println("The factors of " + usersNumber + " are:");
    while(divider <= usersNumber){
      remainder = usersNumber % divider;
      //to print out the divider number as a factor
      if(remainder == 0){
        System.out.println(divider);
      }
      //adds 1 to the divider until it reaches users number
      divider = divider + 1;
    } 
    
  }
}
