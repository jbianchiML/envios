import java.util.ArrayList;
import java.util.List;

public class Envio {

    private List<Paquete> paquetes = new ArrayList<Paquete>();

    public float getCosto() {
        return costo;
    }

    private float costo;
    private String direccion;
    private Transporte transporte;

    public Envio(String direccion, List<Paquete> paquetes){
        this.direccion=direccion;
        this.paquetes=paquetes;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setTransporte(Transporte transporte){
        this.transporte=transporte;
    }
}
