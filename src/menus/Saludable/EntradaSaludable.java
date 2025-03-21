package menus.Saludable;
import menus.InterfacesMenu.Entrada;

public class EntradaSaludable implements Entrada {
    @Override
    public String obtenerNombre() {
        return "Ensalada con Pollo";
    }
}