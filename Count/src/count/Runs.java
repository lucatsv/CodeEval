// ******************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// *******************************************************************
public class Runs
{
    public static void main (String[] args)
    {
        final int FLIPS = 100; // number of coin flips
        int currentRun =0; // length of the current run of HEADS
        int maxRun =0; // length of the maximum run so far
        
        // Create a coin object
        Coin coin = new Coin();
        
        //Inside the loop, you should use the flip method to flip the coin, the toString method (used implicitly) to print the results
        //of the flip, and the getFace method to see if the result was HEADS. Keeping track of the current run length (the number
        //of times in a row that the coin was HEADS) and the maximum run length is an exercise in loop techniques! 
        
        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
         {
            // Flip the coin & print the result
             coin.flip();
             System.out.println(coin);
            // Update the run information
             if(coin.isHeads())
                 currentRun++;
             else
                 maxRun++;                         
         }
        // Print the results
        System.out.println("Current run length:" + currentRun);
        System.out.println("Maximum run length:" + maxRun);
    }
}