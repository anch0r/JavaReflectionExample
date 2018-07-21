package test;

import java.lang.reflect.Constructor;

public class TrainingCamp 
{
     public static Adventurer trainAdventurer(String type)
     {
         try
         {
            //reflection,return an instance based on class name,respectively 
            Class<?> className = Class.forName("test." + type);
            Constructor constr = className.getConstructor();
            Object obj = className.newInstance();
            return (Adventurer)obj;
         }
         catch(ClassNotFoundException | NoSuchMethodException | 
               InstantiationException | IllegalAccessException except )
         {
             except.getMessage();
             return null;
         }
                  
        /*
        switch(type)
        {
            case "archer" : 
            {
                System.out.println("訓練一個弓箭手");
                return new Archer();             
            }
            case "warrior": 
            {
                System.out.println("訓練一個鬥士");
                return new Warrior();                
            }
            // 假如冒險者種類新增，增加case就可以
            default : return null;
        }
        */
    }
    
}
