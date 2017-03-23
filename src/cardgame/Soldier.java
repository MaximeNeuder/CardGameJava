/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Tedplates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;

/**
 *
 * @author licence
 */
public class Soldier extends Hero{
     private DistanceWeapon d;
    private int nbItemMax;
    private ArrayList<Item> items;
    public Soldier(int number, String name, int life) {
        super(number, name, life);
        this.d = d;
        this.nbItemMax = nbItemMax;
        this.items = new ArrayList<Item>();
    }
    
    
     public void Attack(Hero h)
    {
        if(d != null)
        {
            h.life = h.life - d.damage;
        }
    }
     
     public void UseItem(Item i)
     {      
         i.Use();
         if(i.NbTime() == 0)
         {
             items.remove(i);
         }
     }
    
    public void AddItem(Item i)
    {
       if(items.size() < nbItemMax)
       {
        items.add(i);
       }
       else
       {
           System.out.println("Vous avez attein le nombre maximum d'item permis");
       }
    }
    
    public void DropItem(Item i)
    {
        if(items.contains(i))
        {
            items.remove(i);
        }
        else{
            System.out.println("Vous n'avez pas d'item à jeter");
        }
    }
    
    public void AddWeapon(DistanceWeapon dw)
    {
        if(d==null)
        {
        d = dw;
        }
        else{
            System.out.println("Vous ne pouvez posseder qu'une arme");
        }
    }
    
    public void DropWeapon(DistanceWeapon dw)
    {
        if(d!=null)
        {
            d = null;
        }
        else{
            System.out.println("Vous n'avez pas d'arme à jeter");
        }
    }
    
       public void Update(String name, int life, int nbItemMax)
    {
        this.name = name;
        this.life = life;
        this.nbItemMax= nbItemMax;
    }
    
}
