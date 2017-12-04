/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.ui;

/**
 *
 * @author User;
 */
public interface markovInterface {
    
    void train(String str);
    void reTrain(String str);
    void generate(int inte);
 
}
