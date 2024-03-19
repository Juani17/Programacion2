public class oficial extends operario {
    private String rango;
    public oficial() {
    }

    public oficial(String nombre, int dni, String rango) {
        super(nombre, dni);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
