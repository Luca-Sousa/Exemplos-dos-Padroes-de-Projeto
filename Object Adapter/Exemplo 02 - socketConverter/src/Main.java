
public class Main {

    public static void main(String[] args) {
        DispositivoTomadaEUA dispositivoEUA = new DispositivoTomadaEUA();
        TomadaBR adaptador = new AdapterTomadaEUA(dispositivoEUA);

        adaptador.ligar();
    }
}
