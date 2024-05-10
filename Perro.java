class Perro extends Animal {
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void mostrarRaza() {
        System.out.println("Raza: " + raza);
    }
}