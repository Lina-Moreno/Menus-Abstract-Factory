package menus.FabricasMenusConcretos;

import menus.Gourmet.EntradaGourmet;
import menus.Gourmet.PlatoPrincipalGourmet;
import menus.Gourmet.BebidaGourmet;
import menus.Gourmet.PostreGourmet;
import menus.FabricaMenus;
import menus.InterfacesMenu.Entrada;
import menus.InterfacesMenu.PlatoPrincipal;
import menus.InterfacesMenu.Bebida;
import menus.InterfacesMenu.Postre;

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