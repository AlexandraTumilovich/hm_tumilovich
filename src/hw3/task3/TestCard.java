package hw3.task3;

// Класс для тестирования различных значений для полей класса Card

public class TestCard {
    public static void testCardNumber(Card card, String newNumber) {
        System.out.println("\nOld card number: " + card.getCardNumber());
        card.setCardNumber(newNumber);
    }

    public static void testCardType(Card card, String cardType) {
        System.out.println("\nOld card type: " + card.getCardType());
        card.setCardType(cardType);
    }

    public static void testCardName(Card card, String cardName) {
        System.out.println("\nOld card name: " + card.getName());
        card.setName(cardName);
    }

    public static void testExpirationDate(Card card, String expirationDate) {
        System.out.println("\nOld expiration date: " + card.getExpirationDate());
        card.setExpirationDate(expirationDate);
    }

    public static void testCVV(Card card, int cvv) {
        System.out.println("\nOld CVV: " + card.getCvv());
        card.setCvv(cvv);
    }
}
