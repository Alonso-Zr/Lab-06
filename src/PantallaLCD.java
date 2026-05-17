public class PantallaLCD implements Observer {
    @Override
    public void mostrarEnPantalla(float numero) {
        System.out.println("Temperatura en la Pantalla LCD es : " + numero);
    }
}
