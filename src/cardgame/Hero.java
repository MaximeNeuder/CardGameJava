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
public class Hero extends Card{
    int life;
    int currentLife;

    public Hero(int number, String name, int life) {
        super(number, name);
        this.life = life;
        this.currentLife= life;
    }
    
    public int GetLife()
    {
        return this.life;
    }
    
  public int GetCurrentLife()
    {
        return this.currentLife;
    }
    
            
}
