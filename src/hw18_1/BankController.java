package hw18_1;

import java.util.Arrays;

import static hw18_1.Bank.bank;
import static hw18_1.Bank.users;

public class BankController
{

    public static void main(String[] args)
    {

        bank.addUser("myPassword", new User());
        bank.printUsers();
        bank.getUserById(0);
        bank.getUsersBySurname("Kant");
        Authorization.checkLogin("kant");
        Authorization.checkPassword("password");
        Authorization.printUserLogins();

    }

}
