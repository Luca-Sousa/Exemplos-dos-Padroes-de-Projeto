
public class AdapterTomadaEUA implements TomadaBR {

    private final DispositivoTomadaEUA dispositivoEUA;

    public AdapterTomadaEUA(DispositivoTomadaEUA dispositivoEUA) {
        this.dispositivoEUA = dispositivoEUA;
    }

    @Override
    public void ligar() {
        System.out.println("Adaptador convertendo tomada EUA para padrão BR...");
        dispositivoEUA.plugIn();
    }
}
