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
        String str=tr.readFile("dictionary.txt");
        tr.insertWords(tr.giveWords(str));
        tr.showMeanings("reshma");
      
        
    }
    
}
