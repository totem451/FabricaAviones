
public class Acarga extends Avion {
    private final int peso = 200;
    private int cantidad;

    public Acarga(int cantidad, int id) {
        super(id);
        this.cantidad = cantidad;
    }

    public Acarga(int cantidad) {
        this.cantidad = cantidad;
    }

    public Acarga() {
    }

    public int getPeso() {
        return peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int pesoTotal(){
        return peso * cantidad;
    }

    @Override
    public String toString() {
        return "Avion de carga{" + "Peso por tanque=" + peso + "kg, Cantidad de tanques=" + cantidad + '}';
    }
    
    
}
