package menus.FabricasMenusConcretos;

import menus.Saludable.EntradaSaludable;
import menus.Saludable.PlatoPrincipalSaludable;
import menus.Saludable.BebidaSaludable;
import menus.Saludable.PostreSaludable;
import menus.FabricaMenus;
import menus.InterfacesMenu.Entrada;
import menus.InterfacesMenu.PlatoPrincipal;
import menus.InterfacesMenu.Bebida;
import menus.InterfacesMenu.Postre;

public class MenuSaludable implements FabricaMenus {
    @Override
    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalSaludable();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaSaludable();
    }

    @Override
    public Postre crearPostre() {
        return new PostreSaludable();
    }
}