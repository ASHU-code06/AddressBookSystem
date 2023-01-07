package com.bridgelabz;
import java.util.Scanner;
   public class Main {
        static  String firstname;
        static String l;
        static String addre;
        static String c,s,z,ph,e;
        Contacts myobj;//here we can access this anywhere . Contacts is like a data type and myobj is variable
        public static void main(String[] args) {
            //there i prefered non-static methods so i m calling them using object creation .
            Main object = new Main();
            object.persondetails();
            object.addPersondetails();
            object.dispalyPersondetails();

        }//MAIN METHOD ENDS HERE
        public void persondetails(){//Method for cresting contacts only
            System.out.println("Enter your details as follows ");
            Scanner myinput = new Scanner(System.in);

            System.out.println("Enter first  name ");
            firstname = myinput.nextLine();

            System.out.println("Now enter last name ");
            l = myinput.nextLine();

            System.out.println("Enter your address ");
            addre = myinput.nextLine();

            System.out.println("Enter city ");
            c = myinput.nextLine();

            System.out.println("Enter state ");
            s = myinput.nextLine();

            System.out.println("Enter ZIP  ");
            z = myinput.nextLine();

            System.out.println("Enter Phone Number ");
            ph = myinput.nextLine();

            System.out.println("Enter E-mail ");
            e = myinput.nextLine();




            //create local variables only for single time contacts
            // create inctance( like global) variables for multiples contacts entry { place inside class outside of method }


        }
        public void addPersondetails(){
            myobj = new Contacts(firstname,l,addre,c,s,z,ph,e);
            //this is a constructor and i have to initialize here for bulk contry of contacts & order of arguments/parametrs MUST BE SAME
        }
        public void dispalyPersondetails(){
            System.out.println(myobj.toString());
        }
   }


