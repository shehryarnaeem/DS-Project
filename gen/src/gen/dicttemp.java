/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gen;

import static gen.dictionaryinterface.Meanings;
import static gen.dictionaryinterface.root;

/**
 *
 * @author User
 */
public class dicttemp extends Trie
{
     void showMeaninggs2(String str)                         // show meanings 2 shows the mening of the word in a the hash map Meanings
    {
        if(isInTrie(str))
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
