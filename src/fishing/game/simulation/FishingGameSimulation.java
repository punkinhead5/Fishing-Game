/*
This program simulates rolling a die to catch fish.
 */
package fishing.game.simulation;
import java.util.Scanner;

public class FishingGameSimulation {

    public static void main(String[] args) {

String input;   //to hold user's answer
char choice;    // y/n for answer
final int DIE1_SIDES = 6; //the number of sides for DIE 1


int sum = 0;        //to hold the sum in each round of fishing
//Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);

Die die1= new Die(DIE1_SIDES);
System.out.println("Do you want to fish?");
System.out.println("Type 'y' for yes or 'n' for no.");

//Get user answer
input = keyboard.nextLine();

choice = input.charAt(0);

do 
{
System.out.println("Let's go.");
    die1.roll();
    
    int fishRoll = die1.getValue();
    
    switch (fishRoll)
    {
        case 1:
        {
            System.out.println("You caught a bluegill.");
            sum = sum + 0;
            System.out.println("Do you want to fish some more?");
            break;
        }
        case 2:
        {
            System.out.println("You caught a perch.");
            sum = sum + 5;
            System.out.println("Do you want to fish some more?");            
            break;
        }
        case 3:
                    {
            System.out.println("You caught invasive Eurasian milfoil seaweed. Yuck!");
            sum = sum -50;
            System.out.println("Do you want to fish some more?");            
            break;
        }
        case 4:
                    {
            System.out.println("You caught a small mouth bass.");
            sum = sum + 10;
            System.out.println("Do you want to fish some more?");            
            break;
        }
        case 5:
                    {
            System.out.println("You caught a catfish.");
            sum = sum + 15;
            System.out.println("Do you want to fish some more?");
            break;
        }
        case 6:
                    {
            System.out.println("You caught a rainbow trout.");
            sum = sum + 20;
            System.out.println("Do you want to fish some more?");            
            break;
        }
    }
        
    System.out.println("Type 'y' for yes or 'n' for no.");

//Get user answer
input = keyboard.nextLine();

choice = input.charAt(0);
    
    }
while (choice == 'y' || choice == 'Y');

{
    System.out.println("Thank you for playing! Your fishing score was " + sum);
}

if (sum < 0)
    {
        System.out.println("Truly abysmal.");
    }
else if (sum >= 0 && sum <= 25)
    {   
        System.out.println("Not bad, but you need more practice!");
    }
else if (sum > 25 && sum <= 50)
{
    System.out.println("You're an awesome angler!");
}
else 
{    
    System.out.println("FANTASTIC fishing!");
}
            
}
    }
    
//run:
//Do you want to fish?
//Type 'y' for yes or 'n' for no.
//y
//Let's go.
//You caught a small mouth bass.
//Do you want to fish some more?
//Type 'y' for yes or 'n' for no.
//y
//Let's go.
//You caught a bluegill.
//Do you want to fish some more?
//Type 'y' for yes or 'n' for no.
//y
//Let's go.
//You caught invasive Eurasian milfoil seaweed. Yuck!
//Do you want to fish some more?
//Type 'y' for yes or 'n' for no.
//n
//Thank you for playing! Your fishing score was -40
//Truly abysmal.
//BUILD SUCCESSFUL (total time: 12 seconds)
