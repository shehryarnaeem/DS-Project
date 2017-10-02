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
import java.util.HashMap;
public interface TrieInterface 
{

   
    public final TrieNode Root = new TrieNode();
    
    public  void insertWords(String str[]);
    String[] giveWords(String str);
    public Boolean isInTrie(String str);
    public void deleteFromTrie(String Str);
    public void insertWord(String str);

    /**
     *
     * @param str
     */
    void showMeanings1(String str);
}