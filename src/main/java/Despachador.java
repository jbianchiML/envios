import java.util.ArrayList;
import java.util.List;

public class Despachador {

    private List <Envio> envios= new ArrayList<Envio>();
    private Asignador asignador;
    private Calculador calculador;

    public void generarEnvio(String direccion,List<Paquete> paquetes){
        Envio envio = new Envio(direccion,paquetes);
        envios.add(envio);
        calculador.calcularCosto(envio,envios.size());
        asignador.asignar(envio);
    }


}
