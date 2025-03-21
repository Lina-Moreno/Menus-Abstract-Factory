package menus.FabricasMenusConcretos;

import menus.Saludable.*;
import menus.FabricaMenus;
import menus.InterfacesMenu.*;

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