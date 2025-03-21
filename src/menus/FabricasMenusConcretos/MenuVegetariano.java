package menus.FabricasMenusConcretos;

import menus.Vegetariano.EntradaVegetariana;
import menus.Vegetariano.PlatoPrincipalVegetariano;
import menus.Vegetariano.BebidaVegetariana;
import menus.Vegetariano.PostreVegetariano;
import menus.FabricaMenus;
import menus.InterfacesMenu.Entrada;
import menus.InterfacesMenu.PlatoPrincipal;
import menus.InterfacesMenu.Bebida;
import menus.InterfacesMenu.Postre;

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