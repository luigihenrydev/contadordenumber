import java.util.Scanner;
class ContadorNumeros {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int par = 0;
            int impar = 0;
   
            System.out.print("Digite uma sequência de números inteiros positivos: ");
            String numeros = scan.nextLine();
   
            String[] numerosSeparados = numeros.split(" ");
   
            for (int i = 0; i < numerosSeparados.length; i++) {
                int numero = Integer.parseInt(numerosSeparados[i]);
   
                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
   
            System.out.println("Quantidade de números pares: " + par);
            System.out.println("Quantidade de números ímpares: " + impar);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}