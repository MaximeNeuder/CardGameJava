/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author licence
 */
public class Deck {
    private int limit;
    ArrayList<Card> card ;
    
    public Deck(int limit)
    {
        this.limit = limit;
        ArrayList<Card> card = new ArrayList<Card>();
    }
    
    public int NbCard()
    {
       return card.size();
    }
    public void AddCard(Card c){
        card.add(c);
    }   
    
    public void ShuffleCard()
    {
        Collections.shuffle(card);
    }
    
    public void ViewDeck()
    {
        for(int nbC = 0; nbC < card.size() ; nbC++)
        {
            System.out.println(card.get(nbC).getNumber());
            System.out.println(card.get(nbC).getName());
        }
    }
    
    public void SendCardToCollection(CollectionCard d, Card c)
    {
        card.remove(c);
        d.AddCard(c);
    }
}
