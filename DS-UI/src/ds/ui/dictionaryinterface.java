/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.ui;

import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author User
 */
public interface dictionaryinterface 
{   
    TrieNode root=new TrieNode();
    public HashMap<TrieNode,String> Meanings=new HashMap();
    Trie dictionary =new Trie();
    String readFile(String filename)throws IOException;
    void showMeanings(String str);
    void createDictionary(String [] str);
    String []createWordArray(String str1);
    Boolean isIndictionary(String str);
            
}
