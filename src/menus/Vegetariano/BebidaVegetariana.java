package menus.Vegetariano;
import menus.InterfacesMenu.Bebida;

public class BebidaVegetariana implements Bebida {
    @Override 
    public String obtenerNombre(){
        return "Batido de Frutas Tropicales";
    }
}
