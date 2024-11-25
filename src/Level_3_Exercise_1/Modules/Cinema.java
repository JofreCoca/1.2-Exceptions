package Level_3_Exercise_1.Modules;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cinema {
    private int rows;
    private int sealsEachRow;
    private ChairsManage chairsManage;
    private CinemaManager cinemaManager;

    public Cinema() {
        this.chairsManage=new ChairsManage();
        this.cinemaManager=new CinemaManager(this);
        requestInitialData();
    }

    public int getRows() {
        return rows;
    }

    public int getSealsEachRow() {
        return sealsEachRow;
    }

    public ChairsManage getChairsManage() {
        return chairsManage;
    }

    public CinemaManager getCinemaManager() {
        return cinemaManager;
    }

    public void start(){
        boolean goOut = false;
        do{
            switch(this.cinemaManager.menu()){
                case 0:
                    System.out.println("Thank you for using the program");
                    goOut = true;
                    break;
                case 1:
                    this.cinemaManager.showArmchairs();
                    break;
                case 2:
                    this.cinemaManager.showPersonaArmchairs();
                    break;
                case 3:
                    this.cinemaManager.bookASeat();
                    break;
                case 4:
                    this.cinemaManager.cancelReservation();
                    break;
                case 5:
                    this.cinemaManager.cancelReservaPerson();
                    break;
            }
        }while(!goOut);
    }

    public void requestInitialData(){
        int rows=readInt("how many rows does the movie theater have?");
        this.rows=rows;
        int sealsEachRow=readInt("how many seats does each row of the movie theater have?");
        this.sealsEachRow=sealsEachRow;
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
