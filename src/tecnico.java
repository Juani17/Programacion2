public class tecnico extends operario{
    private int edad;
    public tecnico() {
    }

    public tecnico(String nombre, int dni, int edad) {
        super(nombre, dni);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
