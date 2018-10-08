// https://www.youtube.com/watch?v=vNHpsC5ng_E&index=1&list=PLF206E906175C7E07

public class WorkWithAnimal{

	int justANum = 10;

	public static void main(String[] args){

		Dog fido = new Dog();

		fido.setName("Fido");
		System.out.println(fido.getName());

		fido.digHole();

		fido.setWeight(-1);

		// Everything is pass by value
		// The original is not effected by changes in methods

		int randNum = 10; 

		fido.changeVar(randNum);

		System.out.println("randNum after method call: " + randNum);

		changeObjectName(fido);
		
		System.out.println("Dog name after method call " + fido.getName());
		
	}

	// Any methods that are in a class and not tied to an object must
	// be labeled static. Every object created by this class will	
	// share just one static method

	public static void changeObjectName(Dog fido)
	{
		fido.setName("Marcus");
	}



}