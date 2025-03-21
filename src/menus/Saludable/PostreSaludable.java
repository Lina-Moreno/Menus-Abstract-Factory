package menus.Saludable;
import menus.InterfacesMenu.Postre;

public class PostreSaludable implements Postre {
    @Override
    public String obtenerNombre() {
        return "Yogur Griego con Frutas y Miel";
    }
}
