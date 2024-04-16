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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public static double[][] readFile(File file) throws FileNotFoundException 
	{
        final int MAX_ROW = 10;
        final int MAX_COLUMN = 10;

        Scanner input = new Scanner(file);
        String[][] tempArr = new String[MAX_ROW][MAX_COLUMN];

        int rows = 0;
        
        while (input.hasNextLine()) 
        {
            String[] values = input.nextLine().trim().split(" ");
            for (int i = 0; i < values.length && i < MAX_COLUMN; i++) 
            {
                tempArr[rows][i] = values[i];
            }
            rows++;
        }
        input.close();

        if (rows == 0) 
        {
            return null;
        }

        double[][] arr = new double[rows][];
        for (int i = 0; i < rows; i++) 
        {
            int column = 0;
            while (column < MAX_COLUMN && tempArr[i][column] != null) 
            {
                column++;
            }
            arr[i] = new double[column];
            for (int k = 0; k < column; k++) 
            {
                arr[i][k] = Double.parseDouble(tempArr[i][k]);
            }
        }
        return arr;
    }

    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException 
    {
        PrintWriter writer = new PrintWriter(outputFile);
        for (double[] row : data)
        {
            for (double value : row) 
            {
                writer.print(value + " ");
            }
            writer.println();
        }
        writer.close();
    }

    public static double getTotal(double[][] data) 
    {
        double total = 0.0;
        for (double[] row : data) 
        {
            for (double value : row) 
            {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) 
    {
        double total = getTotal(data);
        int i = 0;
        for (double[] row : data) 
        {
            i += row.length;
        }
        return total / i;
    }

    public static double getRowTotal(double[][] data, int row) 
    {
        double total = 0.0;
        if (row >= 0 && row < data.length) 
        {
            for (double value : data[row]) 
            {
                total += value;
            }
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int col) 
    {
        double total = 0.0;
        for (double[] row : data) {
            if (col >= 0 && col < row.length) 
            {
                total += row[col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int row) 
    {
        double highest = Double.MIN_VALUE;
        if (row >= 0 && row < data.length) 
        {
            for (double value : data[row]) 
            {
                if (value > highest) 
                {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] data, int row) 
    {
        double highest = Double.MIN_VALUE;
        int i = -1;
        if (row >= 0 && row < data.length) 
        {
            for (int k = 0; k < data[row].length; k++) 
            {
                if (data[row][k] > highest)
                {
                    highest = data[row][k];
                    i = k;
                }
            }
        }
        return i;
    }

    public static double getLowestInRow(double[][] data, int row) 
    {
        double low = Double.MAX_VALUE;
        if (row >= 0 && row < data.length)
        {
            for (double value : data[row]) 
            {
                if (value < low) 
                {
                    low = value;
                }
            }
        }
        return low;
    }

    public static int getLowestInRowIndex(double[][] data, int row) 
    {
        double low = Double.MAX_VALUE;
        int i = -1;
        if (row >= 0 && row < data.length) 
        {
            for (int k = 0; k < data[row].length; k++) 
            {
                if (data[row][k] < low) 
                {
                    low = data[row][k];
                    i = k;
                }
            }
        }
        return i;
    }

    public static double getHighestInColumn(double[][] data, int col) 
    {
        double high = Double.MIN_VALUE;
        for (double[] row : data) 
        {
            if (col >= 0 && col < row.length) 
            {
                high = Math.max(high, row[col]);
            }
        }
        return high;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) 
    {
        double high = Double.MIN_VALUE;
        int i = -1;
        for (int k = 0; k < data.length; k++)
        {
            if (col >= 0 && col < data[k].length) 
            {
                if (data[k][col] > high)
                {
                    high = data[k][col];
                    i = k;
                }
            }
        }
        return i;
    }

    public static double getLowestInColumn(double[][] data, int col) 
    {
        double low = Double.MAX_VALUE;
        for (double[] row : data)
        {
            if (col >= 0 && col < row.length)
            {
                low = Math.min(low, row[col]);
            }
        }
        return low;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) 
    {
        double low = Double.MAX_VALUE;
        int i = -1;
        for (int k = 0; k < data.length; k++) 
        {
            if (col >= 0 && col < data[k].length) 
            {
                if (data[k][col] < low) 
                {
                    low = data[k][col];
                    i = k;
                }
            }
        }
        return i;
    }

    public static double getHighestInArray(double[][] data) 
    {
        double high = Double.MIN_VALUE;
        for (double[] row : data)
        {
            for (double value : row) 
            {
                high = Math.max(high, value);
            }
        }
        return high;
    }

    public static double getLowestInArray(double[][] data) 
    {
        double low = Double.MAX_VALUE;
        for (double[] row : data)
        {
            for (double value : row) 
            {
                low = Math.min(low, value);
            }
        }
        return low;
    }
}
