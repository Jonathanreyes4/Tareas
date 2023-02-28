public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("El animal hace un sonido");
    }
}

public class Cat extends Animal {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("El gato maúlla");
    }
}

