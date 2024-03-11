package TesteCalculadoraIMC;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import TesteCalculadoraIMC.IMCChartExample;

public class IMCChartExampleTest {

    @Test
    public void testCalcularIMC() {
        double altura = 1.75;
        double peso = 70;
        double expectedIMC = 22.86;
        assertEquals(expectedIMC, IMCChartExample.calcularIMC(peso, altura), 0.01);
    }

    @Test
    public void testCategorizarIMCSaudavel() {
        double imc = 22.0;
        assertEquals("Saudável", IMCChartExample.categorizarIMC(imc));
    }

    @Test
    public void testCategorizarIMCSobrepeso() {
        double imc = 27.0;
        assertEquals("Sobrepeso", IMCChartExample.categorizarIMC(imc));
    }

    @Test
    public void testCategorizarIMCObesidade() {
        double imc = 35.0;
        assertEquals("Obesidade", IMCChartExample.categorizarIMC(imc));
    }
}