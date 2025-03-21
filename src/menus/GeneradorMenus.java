package menus;

import menus.InterfacesMenu.Entrada;
import menus.InterfacesMenu.PlatoPrincipal;
import menus.InterfacesMenu.Bebida;
import menus.InterfacesMenu.Postre;

public class GeneradorMenus {
    private FabricaMenus fabrica;
    private Entrada entradaCreada;
    private PlatoPrincipal platoPrincipalCreado;
    private Bebida bebidaCreada;
    private Postre postreCreado;

    public GeneradorMenus(FabricaMenus fabrica) {
        this.fabrica = fabrica;
    }

    public void comprarMenu() {
        entradaCreada = fabrica.crearEntrada();
        platoPrincipalCreado = fabrica.crearPlatoPrincipal();
        bebidaCreada = fabrica.crearBebida();
        postreCreado = fabrica.crearPostre();

        System.out.println("Entrada: " + entradaCreada.obtenerNombre());
        System.out.println("Plato Principal: " + platoPrincipalCreado.obtenerNombre());
        System.out.println("Bebida: " + bebidaCreada.obtenerNombre());
        System.out.println("Postre: " + postreCreado.obtenerNombre());
    }

    public FabricaMenus getFabrica() {
        return fabrica;
    }

    public void setFabrica(FabricaMenus fabrica) {
        this.fabrica = fabrica;
    }
}