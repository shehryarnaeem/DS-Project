/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gen;

import java.io.IOException;


/**
 *
 * @author User
 */
public class Gen {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        Trie tr=new Trie();
        String str=tr.readFile("test1.txt");
        tr.insertWords(tr.giveWords(str));
       // System.out.println(tr.isInTrie("abaser"));
       tr.showMeanings1("help");
       // System.out.println(tr.Root.aa);
       /* Dictionary dd=new Dictionary();
        dd.insertArray();*/
       Dictionary dd=new Dictionary();
       dd.instantiateDictionary();
        System.out.println("he");
        dicttemp dp = new dicttemp();
            dd.showMeaninggs2("abbreviate");
        dd.showMeaninggs2("contradictory");
        dd.showMeanings("shakeeb");
    
        //  dd.shodpwMeanings("hello");
      //  System.out.println(dd.Meanings);
        
    }
    
}
