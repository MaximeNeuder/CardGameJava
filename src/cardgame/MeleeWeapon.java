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
public class MeleeWeapon extends Weapon{
    private int protection;
    public MeleeWeapon(int number, String name, int damage, int protection) {
        super(number, name, damage);
        this.protection= protection;
    }
    
    public int GetProtection()
    {
        return this.protection;
    }
    
    public void Update(String name, int damage, int protection)
    {
        this.name = name;
        this.damage = damage;
        this.protection= protection;
    }
    
}

