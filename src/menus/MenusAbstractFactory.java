package menus;
import menus.FabricasMenusConcretos.MenuGourmet;
import menus.FabricasMenusConcretos.MenuSaludable;
import menus.FabricasMenusConcretos.MenuVegetariano;

public class MenusAbstractFactory {


    public static void main(String[] args) {
 
        GeneradorMenus compradorGourmet = new GeneradorMenus(new MenuGourmet());
        System.out.println("=== Generado: Menu Gourmet ===");
        compradorGourmet.comprarMenu();

        GeneradorMenus compradorSaludable = new GeneradorMenus(new MenuSaludable());
        System.out.println("\n=== Generado: Menu Saludable ===");
        compradorSaludable.comprarMenu();

        GeneradorMenus compradorVegetariano = new GeneradorMenus(new MenuVegetariano());
        System.out.println("\n=== Generado: Menu Vegetariano ===");
        compradorVegetariano.comprarMenu();
    }
    
}
