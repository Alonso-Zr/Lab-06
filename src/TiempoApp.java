//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TiempoApp {
    public static void main(String[] args) {

        MonitorTiempo monitor = new MonitorTiempo();

        Observer lcd = new PantallaLCD();
        Observer ventana = new VentanaDeComputador();
        Observer reloj = new PantallaRelojInteligente();

        monitor.agregarObservador(lcd);
        monitor.agregarObservador(ventana);
        monitor.agregarObservador(reloj);

        monitor.setTemperatura(20.0f);

    }
}
