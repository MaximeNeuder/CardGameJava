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
public class DistanceWeapon extends Weapon{
    private int nbTir;
    public DistanceWeapon(int number, String name, int damage,int nbTir) {
        super(number, name, damage);
        this.nbTir = nbTir;
    }
    
    public int getNombreTir()
    {
        return nbTir;
    }
    
     public void Update(String name, int damage, int nbTir)
    {
        this.name = name;
        this.damage = damage;
        this.nbTir= nbTir;
    }
    
}
