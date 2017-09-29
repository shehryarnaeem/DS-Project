/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gen;

import gen.lists.Node;

/**
 *
 * @author User
 */
public class implementingMarkov implements markovInterface{
    String res [];
     lists wordsList=new lists();
    public implementingMarkov() {
       
    }

    /**
     *
     * @param str
     */
    @Override
    public void train(String str) {
        String delim="[ .!,?()-]+";
        res=str.split(delim);
        strParser(res);
        wordsList.display();
            
     
     }

    @Override
    public void reTrain(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generate(int inte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void strParser(String str[]){
        int changer=1;
        for (int i = 0; i < str.length; i++) {
            if(wordsList.size==0){
                wordsList.insertAtEnd(str[i]);
               
                
                               wordsList.insertAtright(str[i+1], 1);
                              // System.out.print("curr");
                               //wordsList.display();
            }
            else {
                //System.out.println("hey");
               // wordsList.display();
            int k=wordsList.findInlist(str[i]);
                if(k>0){
                    if(i+1<str.length){
                    wordsList.insertAtright(str[i+1], k);}
                }
                else{
                     wordsList.insertAtEnd(str[i]);
                      if(i+1<str.length){
                    wordsList.insertAtright(str[i+1], wordsList.size);}
                }
            }
        }
    }
  int isNewword(String str[],String strp,int i){
      for (int j = 0; j < i; j++) {
          if(str[j].equals(strp)){
              return j;
          }
      }
      return -1;
  }
  
    
}
