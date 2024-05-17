package class2;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public String Name;
    public int Age;

    public void ShowProfile() {
        System.out.println( "名前は、" + this.Name + "、" + this.Age + "歳です。" );
    }
    
    public void Speak() {
    	System.out.println("......");
    }
}

class Cat extends Animal {
    
	public void Sleep() {
		System.out.println("スースー");
	}
	
	@Override
	public void Speak() {
		System.out.println("ニャー");
	}
}

class Dog extends Animal {
	public void Run() {
		System.out.println("トコトコ");
	}
	
	@Override
	public void Speak() {
		System.out.println("ワンワン");
	}
}

public class Practice8 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		
		cat.Name = "ポチ";
		cat.Age = 13;
		dog.Name = "太郎";
		dog.Age = 7;
		
		cat.ShowProfile();
		dog.ShowProfile();
		
		cat.Speak();
		dog.Speak();
		
		cat.Sleep();
		dog.Run();
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cat());
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		
		for(Animal animal: animals) {
			animal.Speak();
		}
	}
}
