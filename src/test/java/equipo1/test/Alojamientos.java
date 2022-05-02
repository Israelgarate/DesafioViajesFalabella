package equipo1.test;

import equipo1.base.JunitBaseTest;
import equipo1.pages.BusquedaAlojamientosFalabellaPage;
import org.junit.Test;


public class Alojamientos extends JunitBaseTest {

    BusquedaAlojamientosFalabellaPage busquedaAlojamientosFalabellaPage;

    @Test
    public void ATC01(){
        busquedaAlojamientosFalabellaPage = new BusquedaAlojamientosFalabellaPage(driver);
        busquedaAlojamientosFalabellaPage.irAlojamientosFalabella();
        busquedaAlojamientosFalabellaPage.aceptarCookies();
        busquedaAlojamientosFalabellaPage.ingresarDestino("VLN");
        busquedaAlojamientosFalabellaPage.ingresarFechaIda(10, 2022, 5);
        busquedaAlojamientosFalabellaPage.ingresarFechaVuelta(25, 2022, 5, 2022, 5);
        busquedaAlojamientosFalabellaPage.aplicarFecha();
        busquedaAlojamientosFalabellaPage.buscarAlojamiento();

    }
}
