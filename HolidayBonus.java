/*

 * Class: CMSC203 32689

 * Instructor: Grinberg

 * Assignment 5

 * Description: use ragged arrays to plot data

 * Due: 04/15/24
 
 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming

 * assignment independently. I have not copied the code

 * from a student or any source. I have not given my code

 * to any student.

   Print your Name here: Jeffrey Navarro

*/
public class HolidayBonus 
{

    private static final double HIGHEST_BONUS = 5000.0;
    private static final double LOWEST_BONUS = 1000.0;
    private static final double OTHER_BONUS = 2000.0;

    public static double[] calculateHolidayBonus(double[][] data) 
    {
        double[] bonus = new double[data.length];
        for (int i = 0; i < data.length; i++) 
        {
            double highestInRow = TwoDimRaggedArrayUtility.getHighestInRow(data, i);
            double lowestInRow = TwoDimRaggedArrayUtility.getLowestInRow(data, i);
            if (highestInRow == lowestInRow) 
            {
                bonus[i] = HIGHEST_BONUS;
            } else
            {
                bonus[i] = OTHER_BONUS;
                if (highestInRow > 0) 
                {
                    bonus[i] += HIGHEST_BONUS;
                }
                if (lowestInRow > 0) 
                {
                    bonus[i] += LOWEST_BONUS;
                }
            }
        }
        return bonus;
    }

    public static double calculateTotalHolidayBonus(double[][] salesData) 
    {
        double totalBonus = 0.0;
        double[] bonus2 = calculateHolidayBonus(salesData);
        for (double bonus : bonus2) 
        {
            totalBonus += bonus;
        }
        return totalBonus;
    }
}
