import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

//@RunWith(MockitoJUnitRunner.class)
public class AsignadorTest {
   // @Mock
    //private Envio envioMock;


    @Test
    public void calcularCosto (){
         Envio envioMock= new Mock(Envio.class);
        Mockito.when(envioMock.getPaquetes().size()).thenReturn(10);
        Calculador calculador= new Calculador();
        calculador.calcularCosto(envioMock,1);

        Assertions.assertThat(envioMock.getCosto()).isEqualTo(72);
    }

}
