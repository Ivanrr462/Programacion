import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota numerica: ");
        int nota = sc.nextInt();
        String notaTexto = "";

        switch (nota) {
            case 0,1,2,3,4:
                notaTexto = "Suspenso";
                break;
            case 5:
                notaTexto = "Raspao";
                break;
            case 6:
                notaTexto = "Bien";
                break;
            case 7,8:
                notaTexto = "Notable";
                break;
            case 9,10:
                notaTexto = "Sobresaliente";
                break;
            default:
                notaTexto = "Error: Nota invalida";
                break;
        }
        System.out.println(notaTexto);
        sc.close();
    }
}

