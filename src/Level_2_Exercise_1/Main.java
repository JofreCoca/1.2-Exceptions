package Level_2_Exercise_1;

public class Main {

    public static void main(String[] args) throws MessageReadException{
        Entrance entrance = new Entrance();

        byte resultByte=entrance.readByte("Write your age");
        System.out.println("Your age is "+resultByte+"\n");

        int resultInt=entrance.readInt("Write your phone number");
        System.out.println("Your phone number is "+resultInt+"\n");

        float resultFloat=entrance.readFloat("Write your height");
        System.out.println("Your height is "+resultFloat+"\n");

        double resultDouble=entrance.readDouble("Write the number pi with 10 decimal places");
        System.out.println("The number pi with 10 decimal places is "+resultDouble+"\n");

        char resultChar=entrance.readChar("Write a character");
        System.out.println("The character is "+resultChar+"\n");

        String resultString=entrance.readString("Write a String");
        System.out.println("The String is "+resultString+"\n");

        boolean resultBoolean=entrance.readSiNo("Write y or n");
        System.out.println("The boolean is "+resultBoolean+"\n");
    }
}
