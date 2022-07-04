package hw18_1;

public class Card
{
    private long cardNumber = (long)(Math.random() * 999999999);
    private short cvv = (short)(100+(Math.random() * 900));
    private long userId;
    private float money;
    private CardType cardType;
    Card(){}
    Card createCard(long userId,CardType cardType)
    {
        Card card = new Card();
        card.userId = userId;
        return card;
    }


}
