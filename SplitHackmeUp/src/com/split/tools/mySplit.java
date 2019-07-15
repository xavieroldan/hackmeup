package com.split.tools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class mySplit
{
    public static List<String> splitMe(String text, String div) throws NullPointerException
    {
        String stackText = "";
        String stackDiv = "";
        int posDiv = 0;
        List<String> exitArray = new ArrayList<>();

        if (text == "" || text == div) // Launch error void input text o input text same as the div
        {
            throw new NullPointerException();
        }
        else if (div == "" || text.length() == 1) // Add if no div or text length one char
        {
            addNotVoid(exitArray, text);
        }
        else
        {
            for (int i = 0; i < text.length(); i++)
            {

                if (text.charAt(i) != div.charAt(posDiv)) //No coincidence text and div
                {
                    //Repeat the first divisor when expected the second
                    if (text.charAt(i) == div.charAt(0))
                    {
                        //Test
                        //stackText += div.charAt(posDiv);
                        stackText += div.charAt(0);
                        stackDiv = "";
                        stackDiv += div.charAt(0);
                        posDiv = 1;
                    }

                    else if (text.length() == i) //Arrives to the end of the text
                    {
                        stackText += text.charAt(i);
                        addNotVoid(exitArray, stackText + stackDiv);
                        stackText = "";
                    }
                    else //NO at the end of text, no div coincidence
                    {
                        stackText += stackDiv + text.charAt(i);
                        posDiv = 0;
                        stackDiv = "";
                    }
                }
                else // Div coincidence
                {
                    if ((div.length() - 1) == posDiv)// At the last position
                    {
                        addNotVoid(exitArray, stackText);
                        posDiv = 0;
                        stackDiv = "";
                        stackText = "";
                    }
                    else // No at the last position
                    {
                        stackDiv += div.charAt(posDiv);
                        posDiv++;
                    }
                }
            }
        }
        addNotVoid(exitArray, stackText);
        return exitArray;
    }

    //Not add to List if is void
    private static void addNotVoid(List<String> arrayToAdd, String input)
    {
        if (input != "")
        {
            arrayToAdd.add(input);
        }
    }
}
