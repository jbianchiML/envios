public class Asignador {

    public void asignar(Envio envio){
        Double peso= envio.getPaquetes().stream().mapToDouble(Paquete::getPeso).sum();
        if(peso <= 5)
            envio.setTransporte(new Bicicleta());
        else if (peso >5 && peso <= 50)
            envio.setTransporte(new Auto());
        else if (peso >50 && peso <= 150)
            envio.setTransporte(new Camioneta());
    }
}
