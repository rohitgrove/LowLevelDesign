package models;

public class Card extends Payment {
    private String cardInfo;

    @Override
    public void startTransaction() {

    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }
}
