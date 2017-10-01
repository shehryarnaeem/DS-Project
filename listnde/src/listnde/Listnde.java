/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listnde;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author User
 */
public class Listnde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        stringy str=new stringy();
        String str1[]= str.parser();
        System.out.println("pagal");
        for (int i = 0; i <str1.length-1; i++) 
        {
            String Temp;
            
            if(i==0)
            {
                Temp=str1[i];
                str1[i]="";
                str1[i+1]=Temp+str1[i+1];
            }
            else
            {
                String delims="[.\n ]+";
              // System.out.println("string to be split "+str1[i]);
                String Temp1[]=str1[i].split(delims);
                Temp=Temp1[Temp1.length-1];
                
             //  System.out.println("temp 2"+Temp);
               // System.out.println("---------------------");
                str1[i]=str1[i].replace(Temp, ""); 
              Temp+="=";
              Temp="="+Temp;
                str1[i+1]=Temp+str1[i+1];
              //  System.out.println("-------------");
            }
                
                
        }
        System.out.println(str1.length);
       try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream("test.txt"), "utf-8"))) {
              for (int i = 0; i < str1.length; i++) {
               writer.write(str1[i]);
               writer.write("\n\r");
               
           }
           
                } 
        
    }
    
}
