package Level_3_Exercise_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int rows=readInt("how many rows does the movie theater have?");
        int sealsEachRow=readInt("how many seats does each row of the movie theater have?");

        boolean goOut = false;
        do{
            switch(menu()){
                case 0:
                    System.out.println("Thank you for using the program");
                    goOut = true;
                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        }while(!goOut);
    }
    public static int readInt(String missatge){
        Scanner scanner = new Scanner(System.in);
        int result=0;
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                result=scanner.nextInt();
                formatError=false;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return result;
    }

    public static byte menu(){
        Scanner entradaTeclat = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO =5;
        do{
            System.out.println("\nMenu");
            System.out.println("1.- Show all reserved seats.");
            System.out.println("2.- Show seats reserved by one person.");
            System.out.println("3.- Reserve a seat.");
            System.out.println("4.- Cancel the reservation of a seat.");
            System.out.println("5.- Cancel all reservations for a person.");
            System.out.println("0.- Go out.");
            opcio = entradaTeclat.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Choose a valid option");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
}
