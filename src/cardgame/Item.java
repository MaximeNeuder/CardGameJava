/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author licence
 */
public class Item extends Card{
     private int nbTime;
    private int nbTarget;
    public Item(int number, String name) {
        super(number, name);
        this.nbTime = nbTime;
        this.nbTarget = nbTarget;
    }
    
    
    public int NbTime()
    {
        return nbTime;
    }
   
 
    public int nbTarget()
    {
        return nbTarget;
    }
    
    public void Use()
    {
        this.nbTime--;
    }
    
     public void Update(String name, int nbTime,int nbTarget)
    {
        this.name = name;
        this.nbTime = nbTime;
        this.nbTarget= nbTarget;
    }
   
}
