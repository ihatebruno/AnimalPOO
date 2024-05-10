class Gato extends Animal {
    String raza;

    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    
    public void mostrarRaza() {
        System.out.println("Raza: " + raza);
        
    }
}