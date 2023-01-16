package thisJava;

public class AnimalExam {
	
	public static void main(String[]args) {
		Dog gae = new Dog();
		Cat goyang = new Cat();
		
		gae.sound();
		goyang.sound();
		animalSound(new Dog());
	}
	public static void animalSound(Animal animal) {
		animal.sound();        
	}

}
