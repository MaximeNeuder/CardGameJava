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
public class Warrior extends Hero{
    private MeleeWeapon m1;
    private MeleeWeapon m2;
    public Warrior(int number, String name, int life) {
        super(number, name, life);
        this.m1 = m1;
        this.m2 = m2;
    }
    
    public MeleeWeapon M1()
    {
        return m1;
    }
    
    public MeleeWeapon M2()
    {
        return m2;
    }
    
    public void Attack(Hero h)
    {
        if(m1 != null)
        {
            h.life = h.life - m1.damage;
        }
        
        if(m2 != null)
        {
            h.life = h.life - m2.damage;
        }
    }
    
    public void AddWeapon(MeleeWeapon mv)
    {
        if(m1 == null)
        {
            m1 = mv;
        }
        
        else if(m2 == null)
        {
            m2 = mv;
        }
        
        else{
            System.out.println("Vous avez les 2 mains prises");
        }
    }
    
    public void DropWeapon()
    {
        if(m2 != null)
        {
            m2 = null;
        }
        
        else if(m1 == null)
        {
            m1 = null;
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
