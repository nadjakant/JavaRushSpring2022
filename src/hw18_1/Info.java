package hw18_1;

import java.util.Scanner;

public class Info
{
    String name;
    String surname;
    Address address ;
    String userName;
    String password;

    Info(){}

    void setInfo()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter surname: ");
        this.surname = sc.nextLine();
        address = new Address();
        address.setAddress(sc);
        System.out.println("Enter your username");
        this.userName = sc.nextLine();
        System.out.println("--------------");
        System.out.println("Enter your password");
        this.password = sc.next();




    }

}
