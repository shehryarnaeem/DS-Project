/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.ui;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class TrieNode 
{
        public boolean isWord; 
        public HashMap<Character,TrieNode> aa=new HashMap();
        char ch;
        String word;
        String str="";
        public TrieNode()
        {
          isWord=false;
        }
    
}
