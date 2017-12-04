package ds.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Trie implements TrieInterface
{
     
   ArrayList bfs(String str)
{
    ArrayList<String>arr=new ArrayList<>();
    TrieNode curr=nodeFinder(str);
    Queue<TrieNode>q=new LinkedList();
    Set a=curr.aa.keySet();
  
   Iterator ij= a.iterator();
    for (int i=0;i<a.size();i++)
    {
        Character aj=(Character) ij.next();
      
        q.add(curr.aa.get(aj));
        
    }
    String str2=str;
    while(!q.isEmpty()&& arr.size()<4)
    {
        curr=q.remove();
        str2+=curr.ch;
       /// System.out.println(curr.ch);
       if(curr.isWord==true)
       {
           arr.add(curr.word);
       }
       Set at=curr.aa.keySet();
   Iterator ijt= at.iterator();
    for (int i=0;i<at.size();i++)
    { Character aj=(Character) ijt.next();
        q.add(curr.aa.get(aj));
        
    }
    }
    return arr;
}
public ArrayList<String> bfsSearch(String str)
{
    ArrayList<String> s= bfs(str);
   return s; 
}
TrieNode nodeFinder(String str)
{
    TrieNode ptr=Root;
    System.out.println(str.length());
    for (int i=0;i<str.length();i++)
    {

     //   System.out.println(str.charAt(i));
        ptr=ptr.aa.get(str.charAt(i));
        //char ch=ptr.ch;
        //System.out.println(ch);
         //  System.out.println("hello");
    }
    return ptr;
}
  
  @Override
  public  void insertWords(String str[])
    {
       for (int j = 0; j < str.length; j++) 
        {
          //  System.out.println("for word "+str[j]);
           TrieNode current=Root;
           for(int i=0;i<str[j].length();i++)
            {
                TrieNode newNode=new TrieNode();
               if(!current.aa.containsKey(str[j].charAt(i))) 
                {  
                    newNode.ch=str[j].charAt(i);
                    current.aa.put(str[j].charAt(i), newNode);
                    current=newNode;
                } 
                else
                {
                    current=current.aa.get(str[j].charAt(i));

                }
               
            }
            
           TrieNode Buffer=new TrieNode();
           Buffer.isWord=true;
            Buffer.word=str[j];
           Buffer.ch='0';
             Buffer.str=str[++j];
         
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
      String delim="[=]+";
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

    
    
      public String showMeanings(String str)
     {String s=" ";
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
                   
                     s=s+ptr.str;
                }
                i++;
               
             }
        }
         else
             s=null;
            
         
         return s;
         
    }

    @Override
    public void showMeanings1(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
