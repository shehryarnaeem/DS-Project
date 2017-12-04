/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EventListener;
import static javafx.application.ConditionalFeature.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Lenovo
 */
public class C1 {
    @FXML
    private AnchorPane main;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;
    
    public String str=Trie.readFile("test.txt");;
    public Trie tr=new Trie();
   public C1() throws IOException
   {
       tr.insertWords(tr.giveWords(str));
   //      Trie tr=new Trie();
        }
   
    
    
    public ListView sug;
    public void show() throws IOException{
        
  
      String s=tf1.getText();
      String ss[]=s.split(" ");
              ObservableList<String> items=FXCollections.observableArrayList();
        ArrayList<String> words;
        if(ss.length==1)
        {
          words=tr.bfsSearch(s);  
        }
        else{
           words=tr.bfsSearch(ss[ss.length-1]);
        }
        
          
          //System.out.println(words);
          if(words!=null)
          {
          for(int j=0;j<words.size();j++)
          {
             items.add(j,words.get(j));
          }
      sug.setItems(items);
          }
    }
    public void meaning()
    {
        String s=tf1.getText();
      String ss[]=s.split(" ");
      for(int i=0;i<ss.length;i++)
      {
        String str=tr.showMeanings(ss[i]);
        if(str!=null)
        {
            tf2.setText(str);
        }
      }
      
    }

}
