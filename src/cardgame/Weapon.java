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
public class Weapon extends Card{
    int damage;
    public Weapon(int number, String name, int damage) {
        super(number, name);
        this.damage = damage;
    }
    
    public int GetDamage(){
        return this.damage;
    }
    
}
