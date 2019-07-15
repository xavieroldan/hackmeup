package com.split.app;

import com.split.tools.mySplit;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class App
{
    public static void main(String[] args)
    {
        //Inicialize the variables
        String text = "bc,bc,abc,bdbcbc,abbbc,bc,"; // text to split
        String div = "bc,"; // divisor

        //Call mySplit and show it
        for (String output : mySplit.splitMe(text, div))
        {
            System.out.println(output);
        }
    }
}
