
public class Fabrica {
    private Avion[] lista;

    public Fabrica(Avion[] lista) {
        this.lista = lista;
    }

    public Avion[] getLista() {
        return lista;
    }

    public void setLista(Avion[] lista) {
        this.lista = lista;
    }
    
    public void darAlta(Avion a){
        
        Avion[] listaAviones = new Avion[this.lista.length+1];
        for(int i = 0; i< this.lista.length; i++){
            listaAviones[i] = this.lista[i];
        }
        listaAviones[listaAviones.length-1] = a;
        this.lista = listaAviones;
    }
}

