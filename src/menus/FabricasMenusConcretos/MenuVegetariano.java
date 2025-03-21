package menus.FabricasMenusConcretos;

import menus.Vegetariano.*;
import menus.FabricaMenus;
import menus.InterfacesMenu.*;

public class MenuVegetariano implements FabricaMenus {
    @Override
    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalVegetariano();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }
}