
public class Main {

    public static void main(String[] args) {
//        Apasajeros pasajero = new Apasajeros(2, 3, 1);
//        Acarga carga = new Acarga(4,2);
//        Avion[] listaAvion = {carga, pasajero};
        Avion[] listaAvion = {};
        Fabrica fabrica = new Fabrica(listaAvion);
        VPrincipal vp = new VPrincipal(fabrica);
        vp.setVisible(true);
        vp.setDefaultCloseOperation(VPrincipal.EXIT_ON_CLOSE);
        vp.setResizable(false);
        
    }
    
}
