class Animal
{
	int breed;
	int color;
	void speak()
		{
		  System.out.println("animal is barking");
		}
}
class dog extends Animal{
	void speak()
	{
	   System.out.println("dog is barking");
	}
}
class cat extends Animal{
	void speak()
	{
	   System.out.println("cat is mewing");
	}
}
class snake extends Animal{
	void speak()
	{
	   System.out.println("snake is hissing");
	}
}
class Speaking
	{
		public static void main(String[] args)
	{
		Animal a=new Animal();
		a.speak();
		dog d=new dog();
		d.speak();
		cat c=new cat();
		c.speak();
		snake s=new snake();
		s.speak();
	}

	}