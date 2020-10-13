/*
The Die class simulates a six-sided die.
 */
package fishing.game.simulation;
import java.util.Random;

public class Die {
    private int value;
    private int sides = 6;
    /**
     * The constructor performs an initial roll of the die.
     * @param numSides The number of sides for this die.
     */
    
    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }
    /** 
     * The roll method simulates the rolling of the die.
     */
    public void roll()
    {
    //Create a random object.
        Random rand = new Random();
        
        //Get a random value for die.
        value = rand.nextInt(sides) + 1;
}
    
    /*
    getSides method
    @return The number of sides for this die.
    */
    
    public int getSides()
    {
        return sides;
    }
    
   
    /*
    getValue method
    @return The value of the die
    */

    public int getValue()
    {
        return value;
    }

    }
