/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;

/**
 *
 * @author licence
 */
public class Inquisitor extends Hero{
    private MeleeWeapon m;
    private int nbMagicMax;
    private ArrayList<Magic> mag;
    public Inquisitor(int number, String name, int life) {
        super(number, name, life);
        this.m = m;
        this.nbMagicMax = nbMagicMax;
        this.mag = new ArrayList<Magic>();
    }
    
     public void Attack(Hero h)
    {
        if(m != null)
        {
            h.life = h.life - m.damage;
        }
    }
     
     public void UseMagic(Magic ma)
     {
         ma.timeToWait= ma.useDelay;
         
     }
    
    public void AddMagic(Magic ma)
    {
       if(mag.size() < nbMagicMax)
       {
        mag.add(ma);
       }
       else
       {
           System.out.println("Vous avez attein le nombre maximum de sorts permis");
       }
    }
    
    public void AddWeapon(MeleeWeapon mw)
    {
        if(m==null)
        {
        m = mw;
        }
        else{
            System.out.println("Vous ne pouvez posseder qu'une arme");
        }
    }
    
    public void DropWeapon(MeleeWeapon mw)
    {
        if(m!=null)
        {
            m = null;
        }
        else{
            System.out.println("Vous n'avez pas d'arme à jeter");
        }
    }
    
    public void Update(String name, int life,int nbMagicMax)
    {
        this.name = name;
        this.life = life;
        this.nbMagicMax=nbMagicMax;
        
    }
}
