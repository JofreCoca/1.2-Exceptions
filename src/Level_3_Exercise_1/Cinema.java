package Level_3_Exercise_1;

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

    public void start(){
        boolean goOut = false;
        do{
            switch(this.cinemaManager.menu()){
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
