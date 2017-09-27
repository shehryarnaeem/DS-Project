/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listnde;

/**
 *
 * @author User
 */
public class Listnde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   lists1 nl=new lists1();
    nl.insertAtEnd("my");
    nl.insertAtEnd("name");
    nl.insertAtEnd("is");
    nl.insertAtEnd("my");
    nl.insertAtright("hi", 2);
    nl.insertAtright("name", 2);
    nl.insertAtright("is", 2);
    nl.insertAtright("is", 2);
    nl.insertAtright("shi", 2);
    nl.insertAtright("shis", 2);
    nl.display();
    }
    
}
