package Level_3_Exercise_1;

import java.util.Scanner;

public class CinemaManager {
    Cinema cinema;
    public CinemaManager(Cinema cinema) {
        this.cinema=cinema;
    }
    public byte menu(){
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

    public void showArmchairs(){

    }

}
