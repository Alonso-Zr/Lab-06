public class VentanaDeComputador implements Observer {
    @Override
    public void mostrarEnPantalla(float numero) {
        System.out.println("Temperatura en la Ventana de Computador es: " + numero);
    }
}
