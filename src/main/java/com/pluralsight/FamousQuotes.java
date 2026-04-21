package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
 static Scanner thScanner = new Scanner(System.in);
    public static void main(String[] args) {

        String [] quotes = new String[10];
        quotes[0]= "Everything is temporary";
        quotes[1]= "Nothing is impossible";
        quotes[2]= "Believe you can and you are halfway there ";
        quotes[3]= "Done is better than perfect";
        quotes[4]= "Work hard stay humble ";
        quotes[5]= "Dream big. Pray bigger";
        quotes[6]= "Choose to shine";
        quotes[7]= "Growth over comfort";
        quotes[8]= "Stay focused";
        quotes[9]= "Finish trong";




try{
    System.out.println("Choose a number 0 to 9 " );
    int number = thScanner.nextInt();
    System.out.println(quotes[number]);

}catch (Exception e){
    System.out.println("try again");
}

    }
}
