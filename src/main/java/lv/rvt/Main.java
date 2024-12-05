package lv.rvt;

public class Main {

    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annasCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annasCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annasCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annasCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annasCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annasCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}