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
public class Mercenary extends Hero{
    private DistanceWeapon d1;
    private DistanceWeapon d2;
    public Mercenary(int number, String name, int life) {
        super(number, name, life);
        this.d1 = d1;
        this.d2 = d2;
    }
    
    public DistanceWeapon D1()
    {
        return d1;
    }
    
    public DistanceWeapon D2()
    {
        return d2;
    }
    
    public void Attack(Hero h)
    {
        if(d1 != null)
        {
            h.life = h.life - d1.GetDamage()*d1.getNombreTir();
        }
        
        if(d2 != null)
        {
            h.life = h.life - d2.GetDamage()*d2.getNombreTir();
        }
    }
    
    public void AddWeapon(DistanceWeapon mv)
    {
        if(d1 == null)
        {
            d1 = mv;
        }
        
        else if(d2 == null)
        {
            d2 = mv;
        }
        
        else{
            System.out.println("Vous avez les 2 mains prises");
        }
    }
    
    public void DropWeapon()
    {
        if(d2 != null)
        {
            d2 = null;
        }
        
        else if(d1 == null)
        {
            d1 = null;
        }
        
        else{
            System.out.println("Vous n'avez pas d'arme à jeter");
        }
    }
    public void Update(String name, int life)
    {
        this.name = name;
        this.life = life;
        
    }
    
}
