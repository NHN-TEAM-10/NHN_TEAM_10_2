package young.course2.chapter3;

import java.io.*;

/*
Suppose that a file contains information about sales figures for a company in various cities.
Each line of the file contains a city name, followed by a colon (:) followed by the data for that city.
The data is a number of type double.
However, for some cities, no data was available.
In these lines, the data is replaced by a comment explaining why the data is missing.
For example, several lines from the file might look like:

San Francisco:  19887.32
Chicago:  no report received
New York: 298734.12
Write a program that will compute and print the total sales from all the cities together. The program should also report the number of cities for which data was not available. The name of the file is "sales.dat".
 */
/*
- Tip
To complete this program, you'll need one fact about file input with TextIO that was not covered in Subsection 2.4.4.
Since you don't know in advance how many lines there are in the file, you need a way to tell when you have gotten to the end of the file.
When TextIO is reading from a file, the function TextIO.eof() can be used to test for end of file.
This boolean-valued function returns true if the file has been entirely read and returns false if there is more data to read in the file.
This means that you can read the lines of the file in a loop while (TextIO.eof() == false).... The loop will end when all the lines of the file have been read.

Suggestion: For each line, read and ignore characters up to the colon.
Then read the rest of the line into a variable of type String.
Try to convert the string into a number, and use try..catch to test whether the conversion succeeds.
 */
public class Exercise05 {
    public static void main(String[] args) throws IOException {
        int countingNoInfoFiles = 0;
        String curWorkingDir = System.getProperty("user.dir");
        System.out.println("현재 작업 폴더 : " + curWorkingDir);
        String path = "./src/main/java/course2/chapter3/";
        String fileName = "sales.txt";
        BufferedReader br = new BufferedReader(new FileReader(path + fileName));
        String line = null;
        double sum = 0;

        while ((line = br.readLine()) != null) {
            String doubleValue = line.replace(" ", "").split(":")[1];
            try {
                sum += Double.parseDouble(doubleValue);
            } catch (NumberFormatException e) {
                countingNoInfoFiles++;
            }
        }

        System.out.println("Total sales: " + sum + ", no report received City's numbers: " + countingNoInfoFiles);
    }
}
