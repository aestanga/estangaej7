package estangaej7;
import java.util.Scanner;

public class Estangaej7 {

    public static void main(String[] args) {
        //Atributos
        int base, altura;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la base del rectàngulo:");
        base= teclado.nextInt();
        System.out.println("ingrese la altura del rectangulo:");
        altura= teclado.nextInt();
        
        calculoarea valor = new calculoarea(base, altura);
        valor.imprimir();
    }
    
}
