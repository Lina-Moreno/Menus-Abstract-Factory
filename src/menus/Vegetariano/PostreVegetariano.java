package menus.Vegetariano;
import menus.InterfacesMenu.Postre;

public class PostreVegetariano implements Postre {
    @Override
    public String obtenerNombre(){
        return "Tarta de Manzana Vegana";
    }
}
