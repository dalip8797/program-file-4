package animal;



 

public class Animal {
   String breed;
   String color;
   public void speak()
   {
       System.out.println("i am animal");
   }

    
     
     
   
   
     
    
    
}

package animal;
        
 
public class Dog extends Animal {
    String breed="dog";
    String color="Black";
    public void speak()
    {
        System.out.println("i am dog");
    }
           
            

    
   
}
package animal;

/**
 *
 * @author User
 */
public class Driver {
    

public static void main(String [] args)
{
Animal animal = new Animal();
animal.speak();
Dog dog=new Dog();
dog.speak();
}
}
