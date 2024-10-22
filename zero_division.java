import java.util.Scanner;  // Adicionando a importação da classe Scanner

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int divisor, dividendo, quociente = 0;
        String controle = "s";
        
        Scanner s = new Scanner(System.in);  // Criando o scanner para leitura de entrada
        do {    
            System.out.println("Entre com o dividendo.");
            dividendo = s.nextInt();
            System.out.println("Entre com o divisor.");
            divisor = s.nextInt();
            
            // Verificação para evitar divisão por zero
            if (divisor != 0) {
                quociente = dividendo / divisor;
                System.out.println("O quociente é: " + quociente);
            } else {
                System.out.println("Erro: Divisão por zero não permitida.");
            }

            System.out.println("Repetir? (s/n)");
            controle = s.next();  // Não precisa de toString(), next() já retorna uma String
        } while (controle.equalsIgnoreCase("s"));  // Comparação sem case sensitivity
        
        s.close();
    }    
}
