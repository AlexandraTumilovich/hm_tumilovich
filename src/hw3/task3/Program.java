package hw3.task3;

public class Program {
    //private static final String INPUT = "1234234534564564";
    public static void main(String[] args) {
        // Создадим 6 карт, первая карта - валидная, 5 остальных - не валидные
        Card card1 = new Card("1234234534564564", "VISA", "IVAN IVANOV", "01/20", 111);
        Card card2 = new Card("123423453456456", "VISA", "IVAN IVANOV", "01/20", 111);
        Card card3 = new Card("1234234534564564", "", "IVAN IVANOV", "01/20", 111);
        Card card4 = new Card("1234234534564564", "VISA", "", "01/20", 111);
        Card card5 = new Card("1234234534564564", "VISA", "IVAN IVANOV", "sdf", 111);
        Card card6 = new Card("1234234534564564", "VISA", "IVAN IVANOV", "01/20", 3333);

        // Выведем в консоль поля всех созданных карт. Обратите внимание на "Valid status"
        card1.printCard();
        card2.printCard();
        card3.printCard();
        card4.printCard();
        card5.printCard();
        card6.printCard();

        // Попробуем изменить cardNumber первой карты
        TestCard.testCardNumber(card1, "111"); // не валидный номер
        TestCard.testCardNumber(card1, ""); // не валидный номер
        TestCard.testCardNumber(card1, "sdfsdfsdf"); // не валидный номер
        TestCard.testCardNumber(card1, "1234234534564565"); // валидный номер

        // Попробуем изменить cardType первой карты
        TestCard.testCardType(card1, null); // не валидный тип карты
        TestCard.testCardType(card1, ""); // не валидный тип карты
        TestCard.testCardType(card1, "Maestro"); // валидный тип карты

        // Попробуем изменить имя владельца первой карты
        TestCard.testCardName(card1, null); // не валидное имя
        TestCard.testCardName(card1, ""); // не валидное имя
        TestCard.testCardName(card1, "Petya Petrov"); // валидное имя

        // Попробуем изменить expirationDate первой карты
        TestCard.testExpirationDate(card1, null); // не валидный срок действия
        TestCard.testExpirationDate(card1, ""); // не валидный срок действия
        TestCard.testExpirationDate(card1, "qwe"); // не валидный срок действия
        TestCard.testExpirationDate(card1, "/20"); // не валидный срок действия
        TestCard.testExpirationDate(card1, "20/"); // не валидный срок действия
        TestCard.testExpirationDate(card1, "99/20"); // не валидный срок действия
        TestCard.testExpirationDate(card1, "12/20"); // валидный срок действия

        // Попробуем изменить CVV код
        TestCard.testCVV(card1, 0); // не валидный CVV
        TestCard.testCVV(card1, -25); // не валидный CVV
        TestCard.testCVV(card1, 25); // не валидный CVV
        TestCard.testCVV(card1, 99); // не валидный CVV
        TestCard.testCVV(card1, 1000); // не валидный CVV
        TestCard.testCVV(card1, 555); // валидный CVV
    }
}
