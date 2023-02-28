public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Gato", 3);
        cat.makeSound(); // salida: "El gato maúlla"

        int base = 2;
        int exponent = 4;
        int result = cat.power(base, exponent);
        System.out.println(base + " elevado a la " + exponent + " es igual a " + result);
    }
}


