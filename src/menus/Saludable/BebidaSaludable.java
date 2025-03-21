package menus.Saludable;
import menus.InterfacesMenu.Bebida;

public class BebidaSaludable implements Bebida {
    @Override
    public String obtenerNombre() {
        return "Jugo de Zanahoria y Jengibre";
    }
}