import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidarValorTest {
    @Test
    public void testIstoEUmValorValidoRetornaVerdadeiro() throws Exception {
        boolean resultado;
        resultado = istoEUmValorValido(7000.01);

        assertTrue(resultado);
    }

    @Test
    public void testIstoEUmValorValidoRetornaException() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {istoEUmValorValido(0);});

        String mensagemEsperada = "Valores abaixo de 0,01 são proibidos";
        String mensagemRetornada = exception.getMessage();

        assertTrue(mensagemRetornada.contains(mensagemEsperada));

    }

    private boolean istoEUmValorValido(double valor) throws Exception {
        if(valor>0){
            if(valor >= 7000){
                return true;
            }
        }
        throw new Exception("Valores abaixo de 0,01 são proibidos");
    }
}
