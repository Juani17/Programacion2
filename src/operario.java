public class operario extends empleado{
    private int dni;
    public operario(){

    }

    public operario(String nombre, int dni){
        super(nombre);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
