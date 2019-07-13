package com.hackmeupSplit1.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class App
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String test1 = "a,b,c";
        String delimiter1 = ",";
        String output = "";

        List<String> outputArray1 = new ArrayList<>();

        for (int i = 0; i < test1.length(); i++)
        {
            String temp = "";
            temp += (test1.charAt(i));

            if (temp.equals(delimiter1))
            {
                output = "";
            }
            else
            {
                output += temp;
                outputArray1.add(output);
            }
        }
        for (String string : outputArray1)
        {
            System.out.println(string);
        }

        //Case 2
        //*********************************************************************************
        String test2 = "abcbd";
        String delimiter2 = "bc";
        String output2 = "";

        List<Character> delimiterArray = new ArrayList<>();
        List<Character> testArray = new ArrayList<>();

        //Crate the array for the delimiter
        for (int i = 0; i < delimiter2.length(); i++)
        {
            char character = delimiter2.charAt(i);
            delimiterArray.add(character);
        }
        int coincidence = 0;

        String tempSource = "";
        String tempDelimiter = "";
        //Create the test array
        for (int i = 0; i < test2.length(); i++)
        {
            char character = test2.charAt(i);
            testArray.add(character);
        }
        int delimeterPos = 0;

        // looking for coincidency
        for (int i = 0; i < testArray.size(); i++)
        {

            if (testArray.get(i) != delimiterArray.get(delimeterPos))
            {
                output2 += testArray.get(i);
                System.out.println("No hay coincidencia");
                delimeterPos = 0;
            }
            else
            {
                System.out.println("Hay coincidencia " + testArray.get(i) + "=" + delimiterArray.get(delimeterPos));
                tempSource += testArray.get(i);
                delimeterPos++;

                if (delimeterPos != delimiterArray.size())
                {
                    System.out.println("Busco siguiente coincidencia");
                }
                else
                {
                    System.out.println("Delimitador completo " + tempSource);
                    System.out.println("Añado al array de salida " + output2);
                    delimeterPos = 0;
                    tempSource = "";
                    output2 = "";
                }
            }

        }
        System.out.println("Añado al Array de salida " + output2);
    }
}
