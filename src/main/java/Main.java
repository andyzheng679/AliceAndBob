/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main

        // call the compute() method on that new object
        Main mainobj = new Main();
        mainobj.compute();

    }

    public void compute() {
        // Get input string of name from user
        
        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String getName = scanner.nextLine();

        if(getName.equalsIgnoreCase("Alice") || getName.equalsIgnoreCase("Bob")){
            System.out.println("Hello " + getName);
        }else{
            System.out.println("You are neither Alice or Bob");
        }
    }
}
