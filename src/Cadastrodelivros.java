public class Cadastrodelivros {
    public static void main(String[] args) {

        String titulo = "O Pequeno Príncipe";
        String autor = "de Antoine de Saint-Exupéry";
        int paginas = 96;
        double preco = 39.9;
        char categoria = 'F';

        String qualCategoria;

        if (categoria == 'F'){
            qualCategoria = "Ficção";
        } else if (categoria == 'N' ) {
            qualCategoria = "Não-ficção";
        } else if (categoria == 'T') {
            qualCategoria = "Tecnologia";
        } else if (categoria == 'H') {
            qualCategoria = "História";
        } else {
            qualCategoria = "Categoria invalida";
        }




         System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + qualCategoria + ".");
    }
}

