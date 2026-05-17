public class PantallaRelojInteligente implements Observer {
    @Override
    public void mostrarEnPantalla(float numero) {
        System.out.println("Temperatura en la Pantalla de Reloj Inteligente: " + numero);
    }
}
