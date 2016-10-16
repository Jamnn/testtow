package testJam;

import java.util.Random;

import org.apache.log4j.Logger;

interface Animal{
	
	public void eat();
}

class Cat implements Animal{
	private static final Logger logger = Logger.getLogger(Cat.class);

	public void eat() {
		logger.debug("吃鱼");
	}
	
}
class Dog implements Animal{
	private static final Logger logger = Logger.getLogger(Cat.class);
	
	public void eat() {
		logger.debug("吃骨头");
	}
	
}
class sheep implements Animal{
	private static final Logger logger = Logger.getLogger(Cat.class);
	
	public void eat() {
		logger.debug("吃草");
	}
	
}



public class TestPloyori {

	private static final Logger logger = Logger.getLogger(TestPloyori.class);
	
	public static Animal getAnimalinstance(int key){
		Animal result = null;
		
		switch (key) {
		case 0:
			result = new Cat();
			break;
		case 1:
			result = new Dog();
			break;
		default:
			result = new sheep();
			break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int number = new Random().nextInt(3);
		
		Animal animal = getAnimalinstance(number);
		animal.eat();
	}
}
