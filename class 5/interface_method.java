interface Animal
{
 	public void speak();
	public void eat();
}
	class Cat implements Animal
	{
          public void speak()
           {
            System.out.println("Cat is speaking");
           }
		
		   public void eat()
	            {
	              System.out.println("Cat is eating");
                    }
		
          }
class Dog implements Animal
	{
          public void speak()
           {
            System.out.println("Dog is speaking");
           }
		
		   public void eat()
	            {
	              System.out.println("Dog is eating");
                    }
		
          }
public class interface_method
{
	public static void main(String[] args)
	{
	Animal a=new Cat();
	a.speak();
	a.eat();
	Animal a=new Dog();
	a.speak();
	a.eat();
	}
}