package com.bridgelabz;

public class Contacts {

        private String Firstname;
        private String  Lastname;
        private String  Address;
        private String  City;
        private String  State;
        private String  ZIP;
        private String  PhoneNumber;
        private String  Email;
        public void setfirstname(String personfname){
            Firstname=personfname;
        }
        public String getfirstname(){
            return Firstname;
        }
        public void setlastname(String personlname){
            Lastname=personlname;
        }
        public void getlastname(){
            System.out.println("Entered input is    "+Lastname);
        }



}
