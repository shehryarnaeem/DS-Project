/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listnde;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class stringy 
{
    String Example;
    String Wordwithpartofspeech
            ;
    String [] parser() throws IOException
    {
        Example=readFile("dict.txt");
        String delims="[#$%&]+";
        String res [] = Example.split(delims);
       
    return res;
    }
     public static String readFile(String fileName)throws IOException  
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) 
            {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
            } 
            finally 
            {
                br.close();
            }
    }
}
