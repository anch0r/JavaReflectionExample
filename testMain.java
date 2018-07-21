package test;

public class testMain 
{
    
     public static void main(String[] args) 
    {
      Adventurer A = TrainingCamp.trainAdventurer("Archer");
      Adventurer W = TrainingCamp.trainAdventurer("Warrior");
      System.out.println(A.getType());
      System.out.println(W.getType());
    }
    
}
