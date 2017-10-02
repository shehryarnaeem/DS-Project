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

public class Trie implements TrieInterface
{
     
   
  
  @Override
  public  void insertWords(String str[])
    {
       for (int j = 0; j < str.length; j++) 
        {
           TrieNode current=Root;
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
               
            }
            
           TrieNode Buffer=new TrieNode();
           Buffer.isWord=true;
           Buffer.ch='0';
          //  System.out.println("j is"+j);
           Buffer.str=str[++j];
      //      System.out.println("check "+current.ch);
        //   System.out.println(Buffer.str);
           current.aa.put('0', Buffer);
            
        }
    }

    /**
     *
     * @param str
     * @return
     */
    @Override
  public String[] giveWords(String str)
  {
      String delim="[\n]+";
      String arr[]=str.split(delim);
      return arr;
  }

    /**
     *
     * @param str
     * @return
     */
    @Override
    public Boolean isInTrie(String str)
    {
        
        TrieNode ptr=Root;
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

    @Override
     /* public void deleteFromTrie(String Str) 
    {
        TrieNode ptr1=Root;
        TrieNode ptr2=Root;
        int i=0;
        while(!ptr1.isWord)
        {
            ptr1=ptr1.aa.get(Str.charAt(i));
            if(ptr1.isWord==false)
            {
                ptr2=ptr1;
            }
            i++;
        }
        ptr2.aa.remove(Str.charAt(i-1));
        ptr1=null;
    }*/
    public void deleteFromTrie(String Str)
    {
        if(isInTrie(Str))
        {
            TrieNode ptr1=Root;
            int i=0;
             while(i<Str.length())
             {         ptr1=ptr1.aa.get(Str.charAt(i));
                       i++;
             }
             System.out.println("ptr12"+ptr1.ch);
            ptr1.aa.remove('0');
        }
        else
        {
            System.out.println("word is not in trie");
        }
          
    }
    @Override
    public void insertWord(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    /**
     *
     * @param str
     */
    @Override
      public void showMeanings1(String str)
     {
         int i=0;
         TrieNode ptr=Root;
         if(isInTrie(str))
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
}
