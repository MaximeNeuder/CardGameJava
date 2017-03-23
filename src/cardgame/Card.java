/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.Scanner; 
/**
 *
 * @author licence
 */
public class Card {
    private int number;
    String name;
    private String description;
    
    public Card(int number,String name)
    {
        this.number = number;
        this.name = name;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void AddDescription(){
        Scanner d = new Scanner(System.in);
        System.out.println("Veuillez entrez une description de la carte :");
        this.description = d.nextLine();
    }
    
    public String getDescription()
    {
        return this.description;
    }
}
