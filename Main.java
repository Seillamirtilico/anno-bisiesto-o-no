import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu programa para saber si el año es bisiesto o no");
        System.out.println("Ingresa El Año");
        int anno = sc.nextInt();

        if (anno%400==0){
            System.out.println("el año "+anno+ " es bisciesto");

        }
        else if ((anno%4==0) && (anno%100!=0)){
            System.out.println("el año "+anno+ " es bisciesto");
        }else{
            System.out.println("el año "+anno+ " NO es bisciesto");
        }

    }
}