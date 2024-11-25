package Level_3_Exercise_1;

import Level_1_Exercise_1.Modules.EmptySaleExcepcion;
import Level_2_Exercise_1.Modules.MessageReadException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
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
        ChairsManage chairsManage=this.cinema.getChairsManage();
        ArrayList<Armchair> armChairs=chairsManage.getArmChairs();
        for (Armchair readArrayArmchairs : armChairs) {
            System.out.println(readArrayArmchairs.toString());
        }
    }

    public void showPersonaArmchairs(){
        ChairsManage chairsManage=this.cinema.getChairsManage();
        ArrayList<Armchair> armChairs=chairsManage.getArmChairs();
        for (Armchair readArrayArmchairs : armChairs) {
            String person=readString("Write the name of the person who made the reservation");
            if(readArrayArmchairs.getPersonWhoReservesTheSeat().equals(person)){
                System.out.println(readArrayArmchairs.toString());
            }
        }
    }

    public void bookASeat(){
        int rowNumber=enterRow();
        int seatNumber=enterSeatNumber();
        String enterPerson=enterPerson();
        if(rowNumber!=-1&&seatNumber!=-1){
            Armchair armchair= new Armchair(rowNumber,seatNumber,enterPerson);
            this.cinema.getChairsManage().addArmchair(armchair);
        }
    }

    public void cancelReservation(){
        int rowNumber=enterRow();
        int seatNumber=enterSeatNumber();
        this.cinema.getChairsManage().removeArmchair(rowNumber,seatNumber);
    }

    public void cancelReservaPerson(){
        String enterPerson=enterPerson();
        ArrayList<Armchair> armChairs = this.cinema.getChairsManage().getArmChairs();

        Iterator<Armchair> it = armChairs.iterator();
        while (it.hasNext()) {
            if(it.next().getPersonWhoReservesTheSeat().equalsIgnoreCase(enterPerson)){
                it.remove();
            }
        }
    }

    public int enterRow(){
        int dataReturn=-1;
        try {
            int rowNumber=readInt("Write the row number");
            int rewTotal=this.cinema.getRows();
            if(rowNumber>0 && rowNumber<rewTotal+1){
                dataReturn=rowNumber;
            }else{
                throw new SeatOccupiedexception();
            }
        } catch(SeatOccupiedexception e) {
            System.out.println(e.getMessage());
        }
        return dataReturn;
    }

    public int enterSeatNumber(){
        int dataReturn=-1;
        try {
            int rowNumber=readInt("Write the seat number");
            int rewTotal=this.cinema.getRows();
            if(rowNumber>0 && rowNumber<rewTotal+1){
                dataReturn=rowNumber;
            }else{
                throw new InvalidSeatException();
            }
        } catch(InvalidSeatException e) {
            System.out.println(e.getMessage());
        }
        return dataReturn;
    }

    public String enterPerson(){
        String dataReturn="";
        try {
            String namePerson=readString("Write the person name");
            if(namePerson.contains("1")||namePerson.contains("2")||namePerson.contains("3")||
                    namePerson.contains("4")||namePerson.contains("5")||namePerson.contains("6")||
                    namePerson.contains("7")||namePerson.contains("8")||namePerson.contains("9")||
                    namePerson.contains("0")){
                throw new ExceptionIncorrectPersonName();
            }else{
                dataReturn=namePerson;
            }
        } catch(ExceptionIncorrectPersonName e) {
            System.out.println(e.getMessage());
        }
        return dataReturn;
    }

    public static String readString(String missatge){
        Scanner scanner = new Scanner(System.in);
        String result="";
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                result=scanner.nextLine();
                if (result.length() < 1) {
                    throw new MessageReadException("Exception: Format error");
                }else{
                    formatError=false;
                }
            } catch (MessageReadException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public int readInt(String missatge){
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
}
