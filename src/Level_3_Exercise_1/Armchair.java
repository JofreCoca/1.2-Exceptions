package Level_3_Exercise_1;

public class Armchair {
    int rowNumber;
    int numberOfSeats;
    String personWhoReservesTheSeat;
    public Armchair(int rowNumber,int numberOfSeats,String personWhoReservesTheSeat) {
        this.rowNumber=rowNumber;
        this.numberOfSeats=numberOfSeats;
        this.personWhoReservesTheSeat=personWhoReservesTheSeat;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getPersonWhoReservesTheSeat() {
        return personWhoReservesTheSeat;
    }

    public boolean equals(Armchair armchair){
        boolean result=false;
        if (armchair.getRowNumber()==this.rowNumber && armchair.getNumberOfSeats()==this.numberOfSeats){
            result=true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Armchair{" +
                "rowNumber=" + rowNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", personWhoReservesTheSeat='" + personWhoReservesTheSeat + '\'' +
                '}';
    }
}
