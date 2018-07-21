package test;

public class Archer implements Adventurer
{
    @Override
    public String getType() 
    {
        System.out.println("我是弓箭手");
        //use reflection to get class info
        return  this.getClass().getSimpleName();
    }
}