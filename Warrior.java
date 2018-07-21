package test;

public class Warrior implements Adventurer 
{
    @Override
    public String getType() 
    {
        System.out.println("我是鬥士");  
        //use reflection to get class info
        return  this.getClass().getSimpleName();
    }
}