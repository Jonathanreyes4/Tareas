public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Misi", 3);
        gato.emitirSonido(); 
        int resultado = gato.calcularPotencia(2, 3);
        System.out.println(resultado); 
    }
}

