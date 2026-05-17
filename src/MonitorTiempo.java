import java.util.ArrayList;
import java.util.List;

public class MonitorTiempo {
    private float temperatura;
    private List<Observer> observadores;

    public MonitorTiempo() {
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    public void eliminarObservador(Observer o) {
        observadores.remove(o);
    }

    public void setTemperatura(float t) {
        this.temperatura = t;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observer o : observadores) {
            o.mostrarEnPantalla(this.temperatura);
        }
    }
}
