import java.util.Arrays;

public class Main
{
    public static int[] startingIndices(String text, String pattern)
    {
        int countTimes = 0;
        int[] tempArr = new int[text.length()];

        //looping through the text to find out how many times the pattern occurs
        int i = text.indexOf(pattern);
        while(i >= 0)
        {
            //adding occurrence to array
            tempArr[countTimes] = i;

            //the loop stops here if there are no more occurrences of the pattern
            //in the string. Because indexOf returns -1 in that case
            i = text.indexOf(pattern, i+1);

            countTimes ++;
        }

        //resizing the array now that i know how many times the pattern occurs
        int[] startIndexArray = new int[countTimes];
        for (int j = 0; j < startIndexArray.length; j++)
        {
            startIndexArray[j] = tempArr[j];
        }
        return startIndexArray;
    }

    public static void main(String[] args)
    {
        String text = "abracadabr";
        String pattern = "abr";
        System.out.println(Arrays.toString(startingIndices(text, pattern)));
    }
}
