package com.bridgelabz;
import java.util.Scanner;
   public class Main {
       Contacts contacts = new Contacts();
        public static void main(String[] args) {
            //there i prefered non-static methods so i m calling them using object creation .
            Main main = new Main();
            while(true){
            main.initiate();
            }
        }//MAIN METHOD ENDS HERE
       private void initiate(){
           System.out.println("Press 1 for ADD CONTACT ");
           System.out.println("Press 2 for EDIT CONTACT ");
           System.out.println("Press 3 for DELETE CONTACT ");
           System.out.println("Press 4 for DISPALY CONTACT ");
           int input = (new Scanner(System.in)).nextInt();
           switch (input){
               case 1:
                   contacts.addContact();
                   break;
               case 2:

                   break;
               case 3:
                   break;
               case 4:
                   contacts.displayContactList();
                   break;
               default:
                   System.out.println("INVALID");
                   break;
           }

       }
   }


