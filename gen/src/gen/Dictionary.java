/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gen;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dictionary implements dictionaryinterface
        
{

    @Override
    public String readFile(String filename) throws IOException
    {
           BufferedReader br = new BufferedReader(new FileReader(filename));
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

    @Override
    public void showMeanings(String str) 
    {
       int i=0;
         TrieNode ptr=root;
         if(isIndictionary(str))
        {
             while(!ptr.isWord)
             {
                if(i<str.length())
                {
                    ptr=ptr.aa.get(str.charAt(i));
                }
                else
                { 
                   ptr=ptr.aa.get('0');
                    System.out.println("meaning \n"+ptr.str);
                }
                
                i++;
             }
        }
         else
             System.out.println("word is not in trie");
         
    }
    

    @Override
    public void createDictionary(String[] str) {
          for (int j = 0; j < str.length; j++) 
        {
           TrieNode current=root;
           for(int i=0;i<str[j].length();i++)
            {
                TrieNode newNode=new TrieNode();
          //     System.out.println(current.aa.containsKey(str[j].charAt(i)));
             //   System.out.println(current.aa);
                if(!current.aa.containsKey(str[j].charAt(i))) 
                {  
                    newNode.ch=str[j].charAt(i);
                    current.aa.put(str[j].charAt(i), newNode);
                   // System.out.println("check 1"+current.ch);
                    current=newNode;
                } 
                else
                {
                  //  System.out.println(str[j].charAt(i));
                    current=current.aa.get(str[j].charAt(i));

                }
               // System.out.print(current.ch);
               
            }
            
           TrieNode Buffer=new TrieNode();
           Buffer.isWord=true;
           Buffer.ch='0';

           //  System.out.println("j is"+j);
           // System.out.println(str[j]);
if(str[j+1]!=null){
          Buffer.str=str[++j];}
       //     System.out.println();
           Meanings.put(Buffer, Buffer.str);
      //      System.out.println("check "+current.ch);
        //   System.out.println(Buffer.str);
           current.aa.put('0', Buffer);
            
        }
    }

    @Override
    public String []createWordArray(String str1) 
    {
         String delim="[=]+";
      String arr[]=str1.split(delim);
      return arr;
    }

    @Override
    public Boolean isIndictionary(String str) {
          TrieNode ptr=root;
        int i=0;
        for (int j = 0; j < str.length(); j++) 
        {
            
            ptr=ptr.aa.get(str.charAt(j));
       //     System.out.println(ptr.ch);
            if(ptr==null)
            {
                return false;
            }
            
        }
    //System.out.println("ptr3"+ptr.ch+"abc");
    return true;
    }
    void instantiateDictionary() throws IOException
    {
        String str=readFile("test.txt");
        String [] arr=createWordArray(str);
        createDictionary(arr);
        
    }
    void showMeaninggs2(String str)
    {
        if(isIndictionary(str))
        {   TrieNode ptr=root;
            for (int i = 0; i < str.length(); i++) 
            {
                ptr=ptr.aa.get(str.charAt(i));
                System.out.print(ptr.ch);
            }
            ptr=ptr.aa.get('0');
            String str1=Meanings.get(ptr);
            System.out.println(str1);
        }
        else 
            System.out.println("word is not in dictionary");
            
    }
    
      
       
}
