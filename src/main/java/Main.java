import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Setup
        Scanner sc = new Scanner(System.in);
        
        //Input
        int s = sc.nextInt(); // Hora de saída
        int t = sc.nextInt(); // Tempo de viagem
        int f = sc.nextInt(); // Fuso horário

        //Logic
        int horaChegada = s + t + f;

        if (horaChegada >= 24) {
            horaChegada -= 24;
        } else if (horaChegada < 0) {
            horaChegada += 24;
        }

        //Output
        System.out.println(horaChegada);

        sc.close();
    }
}