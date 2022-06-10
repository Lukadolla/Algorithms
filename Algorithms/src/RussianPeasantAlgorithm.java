import java.lang.System;
//Based on Russian peasant algorithm for multiplying
public class RussianPeasantAlgorithm {

    public static void RussianMultiply(int number1, int number2, int total)
    {
        while(number1 != 0)     //While loop that runs until the first number is 0
        {
            if(number1%2 != 0)      //If the first number is odd, the corresponding number2 value is added to the total
            {
                total += number2;
            }
            number1 = number1/2;    //Reducing number1 by dividing it by 2
            number2 = number2*2;    //Multiplying number2 by 2
        }
        System.out.println("Answer: " + total);     //Displaying total
    }

    public static void main(String[] args) {        //Code to measure how long the program runs
        final long startTime = System.nanoTime();
        RussianMultiply(10, 10, 0);
        final long elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken: " + elapsedTime);
    }
}

