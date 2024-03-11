package TesteCalculadoraIMC;

    public class CalculadoraIMC {
    public double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }
}
 