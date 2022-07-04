package hw18_1;

import static hw18_1.CardType.*;

public class User {
    private Info info;
    private Card card;
    private String user;
    private CardType cardType;
    private long id = (int) (Math.random() * 999999999);

    User() {
    }

    public Info getInfo() {
        return info;
    }

    public Card getCard() {
        return card;
    }

    public long getId() {
        return id;
    }

    void setUserInfo() {
        info = new Info();
        info.setInfo();
    }

    void setUserCard() {

    }

    public CardType setCardType(String wishedCardType) {
        CardType cardType;
        cardType = CardType.valueOf(wishedCardType);
        switch (cardType) {
            case BRONZE:
                cardType = BRONZE;
                break;
            case SILVER:
                cardType = SILVER;
                break;
            case GOLD:
                cardType = GOLD;
                break;
            default:
                System.out.println("no such type of cards");
        }
        return cardType;
    }

    public void printUser(User user) {
        System.out.println("Имя: " + user.getInfo().name + " " +
                "Фамилия: " + user.getInfo().surname + " " +
                "Адрес: " + user.getInfo().address.getCity() + " " +
                "Улица: " + user.getInfo().address.getStreet() + " " +
                "Дом: " + user.getInfo().address.getBuilding() + " " +
                "Кв.: " + user.getInfo().address.getFlat());
    }
}
