public class Calculador {

    public void calcularCosto(Envio envio, int numeroEnvio){
        int cantidadPaquetes = envio.getPaquetes().size();
        float costo=-1;
        if(cantidadPaquetes <= 5){
            costo=50;
        } else if(cantidadPaquetes < 10){
            costo=80;
        }else if(cantidadPaquetes>10){
            costo=80+ ((cantidadPaquetes-10) * 15);
        }

        if(numeroEnvio <= 10){
            costo= (float) (costo*0.9);
        }

        envio.setCosto(costo);

    }

}
