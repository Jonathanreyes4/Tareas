public class Gato extends Animal {
    private int edad; 

    public Gato(String nombre, int edad) {
        super(nombre); 
        this.edad = edad;
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido(); 
        System.out.println("El gato maúlla");
    }
    public int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }
}


