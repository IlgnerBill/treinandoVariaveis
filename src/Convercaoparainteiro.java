public class Convercaoparainteiro {
    public static void main(String[] args) {


        double produto = 19.5;

        int quantidade;
        quantidade = (int) produto;

        System.out.println ( "Quantidade no estoque " + quantidade
        );
    }
}

/* O casting não arredonda o número, ele simplesmente corta a parte decimal.
Se precisar arredondar, pode-se usar Math.round(), Math.floor() (arredondamento para baixo) ou Math.ceil() (arredondamento para cima).*/