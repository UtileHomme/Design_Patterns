// https://www.youtube.com/watch?v=vNHpsC5ng_E&index=1&list=PLF206E906175C7E07

public class Dog extends Animal{
	
	public void digHole(){
		
		System.out.println("Dug a hole");
		
	}
		// The constructor initializes all objects
	
	public Dog(){
		
		// Executes the parents constructor
		// Every class has a constructor whether you make it or not
		
		super();
		
		// Sets bark for all Dog objects by default
		
		setSound("Bark");
		
	}
	
	public void changeVar(int randNum)
	{
		randNum = 12; 
		
		System.out.println("randNUm in method: " +  randNum);
	}
	
}