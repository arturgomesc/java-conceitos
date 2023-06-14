public class ex01 {
    public static void main(String[] args) {

        final int numCarros = 5;

        carro[] carros = new carro[numCarros];
        String[] modelosCarros = {"Ford", "Ferrari", "Fiat", "Subaru", "Alfa Romeo"} ;

        for (int i = 0; i < numCarros; i++) {
            carros[i] = new carro(modelosCarros[i]);
        }

        for(carro c:carros) {
            c.info();
        }
    }
}
