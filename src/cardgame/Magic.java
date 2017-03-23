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
public class Magic extends Card{
    
    int useDelay;
    int timeToWait;
    public Magic(int number, String name,int damage,int heal, int nbTime,int nbTarget) {
        super(number, name);
        this.useDelay = useDelay; 
        this.timeToWait = 0;
    }
    
    
    public int Delay()
    {
        return useDelay;
    }
    
    public int TimeToWait()
    {
        return timeToWait;
    }
    
    public void Use()
    {
        this.timeToWait = useDelay;
    }
    
    public void Update(String name, int useDelay, int timeToWait)
    {
        this.name = name;
        this.useDelay = useDelay;
        this.timeToWait= timeToWait;
    }
}
