package Level_3_Exercise_1;
import Level_2_Exercise_1.Modules.MessageReadException;

import java.util.ArrayList;

public class ChairsManage {
    private ArrayList<Armchair> armChairs;

    public ChairsManage() {
        this.armChairs = new ArrayList<Armchair>();
    }

    public ArrayList<Armchair> getArmChairs() {
        return armChairs;
    }

    public void addArmchair(Armchair armChair){
        int search=searchArmchair(armChair.getRowNumber(),armChair.getNumberOfSeats());
        try {
            if(search==-1){
                this.armChairs.add(armChair);
            }else{
                throw new SeatOccupiedexception();
            }
        } catch (SeatOccupiedexception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeArmchair(int rowNumber, int numberOfSeats){
       int search= searchArmchair(rowNumber,numberOfSeats);
        try {
            if(search==-1){
                throw new FreeArmchairExeption("Exception: Chair Free");
            }else{
                this.armChairs.remove(search);
            }
        } catch (FreeArmchairExeption e) {
            System.out.println(e.getMessage());
        }
    }

    public int searchArmchair(int rowNumber, int numberOfSeats){
        int position=-1;
        int i=0;
        while(i<armChairs.size() && position==-1){
            if(armChairs.get(i).getRowNumber()==rowNumber && armChairs.get(i).getNumberOfSeats() ==numberOfSeats){
                position=i;
            }
            i++;
        }
        return position;
    }
}
