import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        /*String nome = "João";
        if (nome.equals("PedroJoão")) {
            System.out.println("Olá, João!");
        } else {
            System.out.println("Olá, estranho!");
        }*/
        System.out.println("Digite um número de 1 a 7 para representar um dia da semana:");
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
