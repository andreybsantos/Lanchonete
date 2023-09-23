import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, suco = 0, refri = 0, pizza = 0, hotdog = 0, total = 0;
        char valor;

        System.out.println("Anhembi Lanches");
        System.out.println("Cardápio");
        System.out.println("1-suco R$ 2,00");
        System.out.println("2-refri R$ 5,00");
        System.out.println("3-pizza R$ 8,00");
        System.out.println("4-hotdog R$ 11,00");

        do {
            System.out.println("digite o numero do seu pedido");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("vc escolheu suco");
                    suco = suco + 1;
                    break;
                case 2:
                    System.out.println("vc escolheu refri");
                    refri = refri + 1;
                    break;
                case 3:
                    System.out.println("vc escolheu pizza");
                    pizza = pizza + 1;
                    break;
                case 4:
                    System.out.println("vc escolheu hotdog");
                    hotdog = hotdog + 1;
                    break;
                default:
                    System.out.println("vc escolheu uma opcao invalida!, digite novamente");
            }

            System.out.println("deseja incluir outro item? (s ou n)");
            valor = entrada.next().charAt(0);
        } while (valor != 'n');

        if (suco > 0) {
            System.out.println("qtd de sucos " + suco);
        }
        if (refri > 0) {
            System.out.println("qtd de refris " + refri);
        }
        if (pizza > 0) {
            System.out.println("qtd de pizzas " + pizza);
        }
        if (hotdog > 0) {
            System.out.println("qtd de hotdogs " + hotdog);
        }

        total = suco * 2 + refri * 5 + pizza * 8 + hotdog * 11;
        System.out.println("o total do pedido sera: R$ " + total);

        entrada.close();

    }
}