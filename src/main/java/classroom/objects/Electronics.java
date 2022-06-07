package classroom.objects;

public class Electronics extends Shop {

    boolean isAcceptingCards;

    public Electronics(String address, String telephoneNumber, String shopType, boolean isAcceptingCards) {
        super(address, telephoneNumber, shopType);
        this.isAcceptingCards = isAcceptingCards;
    }
}
