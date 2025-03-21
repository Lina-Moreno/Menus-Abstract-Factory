package menus;

import menus.InterfacesMenu.*;

public class GeneradorMenus {
    private FabricaMenus fabrica;

    public GeneradorMenus(FabricaMenus fabrica) {
        this.fabrica = fabrica;
    }

    public void crear() {
        Entrada entrada = fabrica.crearEntrada();
        PlatoPrincipal platoPrincipal = fabrica.crearPlatoPrincipal();
        Bebida bebida = fabrica.crearBebida();
        Postre postre = fabrica.crearPostre();

        System.out.println("Entrada: " + entrada.obtenerNombre());
        System.out.println("Plato Principal: " + platoPrincipal.obtenerNombre());
        System.out.println("Bebida: " + bebida.obtenerNombre());
        System.out.println("Postre: " + postre.obtenerNombre());
    }

    public FabricaMenus getFabrica() {
        return fabrica;
    }

    public void setFabrica(FabricaMenus fabrica) {
        this.fabrica = fabrica;
    }
}