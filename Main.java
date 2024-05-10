public class Main {
    public static void main(String[] args) {

        Perro miPerro = new Perro("Don Chuchito JR", 3, "Chihuahua");

        System.out.println("Descripcion del Perro");
        miPerro.detalles();
        miPerro.mostrarRaza();

        Gato miGato = new Gato("Sr Bigotes III", 6, "Siames");

        System.out.println("Descripcion del Gato");
        miGato.detalles();
        miGato.mostrarRaza();
    }
}