public class Main {
    public static void main(String[] args) {
        System.out.println("Alô Mundo!");

        int temperatura_celcius = 30;
        double temperatura_fahrenheit = (temperatura_celcius * 1.8) + 32;
        int temperatura_fahrenheit_int = (int) temperatura_fahrenheit;

        System.out.println("Temperatura em Celsius: " + temperatura_celcius);
        System.out.println("Temperatura em Fahrenheit: " + temperatura_fahrenheit);
        System.out.println("Temperatura em Fahrenheit (int): " + temperatura_fahrenheit_int);

        int nota_1 = 90;
        int nota_2 = 80;
        double media = (nota_1 + nota_2) / 2.0;
        System.out.println("media de notas: " + media );

        double idade2 = 12.5;
        int idade = (int) idade2 ;
        System.out.println("Idade: " + idade);

        char letra = 'A';
        String palavra = "Alô Mundo!" + letra;
        System.out.println(palavra);
        //----teste alteracao-------
    }
}