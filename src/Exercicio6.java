public class Exercicio6 {
    public static void main(String[] args) {
        double precoOriginal = 50.65;
        double percentualDesconto = 10; //10 para um desconto de 10%, 20 para 20%, etc
        double precoComDesconto = precoOriginal * ((100 - percentualDesconto)/100);

        System.out.println("Preço Original: R$" + precoOriginal);
        System.out.println("Preço com Desconto: R$" + precoComDesconto);
    }
}
