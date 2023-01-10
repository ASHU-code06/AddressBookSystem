package com.bridgelabz;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class Contacts {

    ArrayList<ContactModel> myContactlist = new ArrayList<ContactModel>();
    public int contactId;
    public void addContact(){//Method for cresting contacts only
        ContactModel contactModel = new ContactModel();
        System.out.println("Enter your details as follows ");
        Scanner myinput = new Scanner(System.in);

        System.out.println("Enter first  name ");
        contactModel.firstname = myinput.nextLine();

        System.out.println("Now enter last name ");
        contactModel.lastname = myinput.nextLine();

        System.out.println("Enter your address ");
        contactModel.address = myinput.nextLine();

        System.out.println("Enter city ");
        contactModel.city = myinput.nextLine();

        System.out.println("Enter state ");
        contactModel.state = myinput.nextLine();

        System.out.println("Enter ZIP  ");
        contactModel.zip = myinput.nextLine();

        System.out.println("Enter Phone Number ");
        contactModel.phoneNumber = myinput.nextLine();

        System.out.println("Enter E-mail ");
        contactModel.email = myinput.nextLine();
        
        myContactlist.add(contactModel);
    }
    public void displayContactList(){
        myContactlist.forEach((contact)->{
            System.out.println("Name :  "+contact.firstname+" "+contact.lastname);
            System.out.println("Address :  "+contact.address);
            System.out.println("City :  "+contact.city);
            System.out.println("State :  "+contact.state);
            System.out.println("ZIP :  "+contact.zip);
            System.out.println("Phone no :  "+contact.phoneNumber);
            System.out.println("Email  :  "+contact.email);
        });
    }

    public void editContact(){
        System.out.println("SELECT ");
        int input = (new Scanner(System.in)).nextInt();
        System.out.println("1. firstname \n2. lastname \n3. address \n4. city \n5. state \n6. zip \n7. phone-number \n8. email \n9. exit ");
        int select = (new Scanner(System.in)).nextInt();
        switch (select) {
            case 1:

                editContact();
                break;
            case 2:
                editContact();
                break;
            case 3:
                editContact();
                break;
            case 4:
                editContact();
                break;
            case 5:
                editContact();
                break;
            case 6:
                editContact();
                break;
            case 7:
                editContact();
                break;
            case 8:
                editContact();
                break;
            case 9:
                break;
            default:
                editContact();
                break;
        }

        }
    }

