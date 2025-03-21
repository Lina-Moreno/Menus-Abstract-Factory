package menus.FabricasMenusConcretos;

import menus.Gourmet.*;
import menus.FabricaMenus;
import menus.InterfacesMenu.*;

public class MenuGourmet implements FabricaMenus {
    @Override
    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalGourmet();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public Postre crearPostre() {
        return new PostreGourmet();
    }
}