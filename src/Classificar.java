public class Classificar {
    public static void main(String[] args) {

        Double precoProduto = 150.00;

        String categoria;



        if (precoProduto <= 50.00) {
          categoria = "Econômico";
        } else if (precoProduto > 50.00 && precoProduto <= 200.00){
            categoria = "Intermediário";
        } else {
            categoria = "Premium";
        }

        System.out.println ( "A categoria do produto é: " + categoria);
    }
}
