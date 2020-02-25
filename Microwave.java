import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* This program calculates the cook time for food with user input.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-23
*/

public class Microwave {
  /**
  * This program calculates the cook time for food with user input.
  */
  public static void main(String[] args) throws IOException {

    // variables and constants
    double cookTime = 0;
    double subTime = 1;
    double pizzaTime = 0.75;
    double soupTime = 1.75;
    int quantity;
    String food = "";
    
    // Reads user input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Welcome to your microwave.");

    // input
    while (true) {
      System.out.print("\nAre you heating up a sub, pizza or soup?: ");
      food = br.readLine();

      if (food.equals("sub") || food.equals("pizza") || food.equals("soup")) {
        break;
      } else {
        System.out.println("Please pick one of the options.");
      }
    }
    
    // input
    while (true) {
      System.out.print("How many " + food + "(s) are you heating up (1-3)?: ");
      try {
        quantity = Integer.parseInt(br.readLine());
        if (quantity > 3 || quantity < 0) {
          System.err.println("Invalid input. Please try again: ");
        } else {
          break;
        }
      } catch (NumberFormatException nfe) {
        System.err.println("Invalid input. Please try again.");
      }
    }
    
    // process
    if (quantity == 1 && food.equals("sub")) {
      cookTime = subTime * 1;
    } else if (quantity == 1 && food.equals("pizza")) {
      cookTime = pizzaTime * 1;
    } else if (quantity == 1 && food.equals("soup")) {
      cookTime = soupTime * 1;
    } else if (quantity == 2 && food.equals("sub")) {
      cookTime = subTime * 1.5;
    } else if (quantity == 2 && food.equals("pizza")) {
      cookTime = pizzaTime * 1.5;
    } else if (quantity == 2 && food.equals("soup")) {
      cookTime = soupTime * 1.5;
    } else if (quantity == 3 && food.equals("sub")) {
      cookTime = subTime * 2;
    } else if (quantity == 3 && food.equals("pizza")) {
      cookTime = pizzaTime * 2;
    } else if (quantity == 3 && food.equals("soup")) {
      cookTime = soupTime * 2;
    }

    // output
    System.out.print("\nThe total cooking time for " + quantity + " "
                     + food + "(s) is " + cookTime + " minutes.");
  }
}