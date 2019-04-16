package com.company;

public class Main {

    public static void main(String[] args) {
	String [] Name = new String []{"Nifnif", "Nafnaf", "Nufnuf"};

	    for (int i = 0; i <=2; i++) {

	        switch (i) {
              case 0:
                System.out.println("Good morning!");
                break;
              case 1:
                  System.out.println("Good afternoon!");
                  break;
              case 2:
                  System.out.println("Good evening!");
                  break;
              default:
                  System.out.println("Bye!");
	        }
        }
    }
}