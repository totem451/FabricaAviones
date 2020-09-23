
public class Apasajeros extends Avion {
    private int cantidade;
    private int cantidadv;
    private final int pesoe = 150;
    private final int pesov = 200;

    public Apasajeros(int cantidade, int cantidadv, int id) {
        super(id);
        this.cantidade = cantidade;
        this.cantidadv = cantidadv;
    }

    public Apasajeros() {
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    public int getCantidadv() {
        return cantidadv;
    }

    public void setCantidadv(int cantidadv) {
        this.cantidadv = cantidadv;
    }

    public int getPesoe() {
        return pesoe;
    }

    public int getPesov() {
        return pesov;
    }

    public int pesoTotal(){
        return cantidade * pesoe + cantidadv * pesov;
    }

    @Override
    public String toString() {
        return "Avion de pasajeros{" + "Cantidad de asientos economicos=" + cantidade + ", Cantidad de asientos VIP=" + cantidadv + ", Peso por asiento economico=" + pesoe + "kg, Peso por asiento VIP=" + pesov + "kg" + '}';
    }
    
    

}
