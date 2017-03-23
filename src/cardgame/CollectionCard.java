/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Maxime
 */
public class CollectionCard {
     ArrayList<Card> card ;
     public CollectionCard()
     {
         ArrayList<Card> card = new ArrayList<Card>();
     }
     
    public void AddCard(Card c){
        card.add(c);
    }
    
    public void DeleteCard(Card c){
        card.remove(c);
    }
     
     public void SendCardToDeck(Deck d,Card c)
     {
         card.remove(c);
         d.AddCard(c);
     }
    
      public void ViewCollection()
    {
        for(int nbC = 0; nbC < card.size() ; nbC++)
        {
            System.out.println(card.get(nbC).getNumber());
            System.out.println(card.get(nbC).getName());
        }
    }
      
      public ArrayList<Card> Research()
      {
          
         ArrayList<Card> c =new ArrayList<Card>();
         ArrayList<String> cond = new ArrayList<String>();
        Scanner d = new Scanner(System.in);
        System.out.println("Veuillez entrez 2 critères minimum :");
         if (d.nextLine()=="name")
            {
                cond.add("name");
            }
            if (d.nextLine()=="num")
            {
                cond.add("num");
            }
        for(int nbC = 0; nbC < card.size() ; nbC++)
        {
           
            
            
        }
        return c;
      }
}
