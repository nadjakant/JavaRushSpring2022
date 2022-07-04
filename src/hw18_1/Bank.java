package hw18_1;

import java.util.ArrayList;

public class Bank
{
    public  static final Bank bank = new Bank();
    private User user;
    final String bankPassword = "myPassword";
    public static ArrayList<User> users = new ArrayList<>();

    private Bank()
    {

    }

    public void addUser(String password, User user)
    {
        if(password.equals(bankPassword) )
        {
            user.setUserInfo();
            users.add(user);
            Authorization.userLogins.put(user.getInfo().userName,user.getInfo().password);
            System.out.println("User was added");

        } else
        {
            System.out.println("Wrong password");
        }
    }
   public void printUsers(){
       for (int i = 0; i < users.size() ; i++) {
           System.out.println("Имя: "+ users.get(i).getInfo().name+ " "+
                       "Фамилия: "+users.get(i).getInfo().surname+ " "+
                       "Адрес: "+users.get(i).getInfo().address.getCity()+ " "+
                       "Улица: "+users.get(i).getInfo().address.getStreet()+ " "+
                       "Дом: "+users.get(i).getInfo().address.getBuilding()+ " "+
                       "Кв.: "+ users.get(i).getInfo().address.getFlat());

       }
   }

   public void getUserById(int id){
       for (int i = 0; i < users.size(); i++) {
           if(i==id){
               users.get(i).printUser(users.get(i));
           }
           }
   }
   public User getUsersBySurname(String surname) {
       for (int i = 0; i < users.size(); i++) {
           if (users.get(i).getInfo().name.equalsIgnoreCase(surname)) ;
           users.get(i).printUser(users.get(i));
           return users.get(i);

       }
       return null;
   }
}

