
package menus;

import menus.InterfacesMenu.Postre;
import menus.InterfacesMenu.PlatoPrincipal;
import menus.InterfacesMenu.Entrada;
import menus.InterfacesMenu.Bebida;

public interface FabricaMenus {
    public Entrada crearEntrada();
    public PlatoPrincipal crearPlatoPrincipal();
    public Bebida crearBebida();
    public Postre crearPostre();
}
