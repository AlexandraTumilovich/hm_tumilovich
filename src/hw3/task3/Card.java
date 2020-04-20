package hw3.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Представьте, что Вы разрабатываете программу для банка.
В банк обращается организация с просьбой завести для своих сотрудников дебетовые карты для выплаты заработной платы.
Каждой банковская карта имеет свой уникальный номер. Необходимо написать класс-валидатор номера банковской карты.
Подумайте, каким должен быть такой класс.
Класс-валидатор должен проверять:
- количество цифр в номере карты
- вид карты
- наличие владельца
- срок действия
- CVV код
 */

public class Card {
    private String cardNumber; // номер карты
    private String cardType; // тип карты
    private String name; // имя владельца
    private String expirationDate; // срок действия
    int cvv; // CVV код
    boolean validStatus; // валидность карты (если все поля правильные)
    Validator validator = new Validator(); // создание объекта внутреннего класса

    public Card(String cardNumber, String cardType, String name, String expirationDate, int cvv) {
        if (validator.validateCardNumber(cardNumber)) { // валидация номера
            this.cardNumber = cardNumber;
        }

        if (validator.validateCardType(cardType)) { // валидация типа карты (не пустое значение)
            this.cardType = cardType;
        }

        if (validator.validateName(name)) { // валидация имени владельца (не пустое)
            this.name = name;
        }

        if (validator.validateExpirationDate(expirationDate)) { // валидация срока действия
            this.expirationDate = expirationDate;
        }

        if (validator.validateCvv(cvv)) { // валидация CVV кода
            this.cvv = cvv;
        }

        if (validator.validateCardFieldsNotNull(this)) {
            System.out.println("New valid card is created.");
            this.validStatus = true;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public String getName() {
        return name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public boolean isValidStatus() {
        return validStatus;
    }

    public void setCardNumber(String cardNumber) { // сеттер с валидацией номера
        if (validator.validateCardNumber(cardNumber)) {
            this.cardNumber = cardNumber;
            this.checkValidStatus(); // перепроверка валидности карты после установки нового поля
            System.out.println("New card number: " + cardNumber);
        }
    }

    public void setCardType(String cardType) { // сеттер с валидацией типа карты
        if (validator.validateCardType(cardType)) {
            this.cardType = cardType;
            this.checkValidStatus(); // перепроверка валидности карты после установки нового поля
            System.out.println("New card type: " + cardType);
        }
    }

    public void setName(String name) { // сеттер с валидацией имени владельца
        if (validator.validateName(name)) {
            this.name = name;
            this.checkValidStatus(); // перепроверка валидности карты после установки нового поля
            System.out.println("New card name: " + name);
        }
    }

    public void setExpirationDate(String expirationDate) { // сеттер с валидацией срока действия
        if (validator.validateExpirationDate(expirationDate)) {
            this.expirationDate = expirationDate;
            this.checkValidStatus(); // перепроверка валидности карты после установки нового поля
            System.out.println("New expiration date: " + expirationDate);
        }
    }

    public void setCvv(int cvv) { // сеттер с валидацией CVV кода
        if (validator.validateCvv(cvv)) {
            this.cvv = cvv;
            this.checkValidStatus(); // перепроверка валидности карты после установки нового поля
            System.out.println("New CVV code: " + cvv);
        }
    }

    public void printCard() { // выведение в консоль всех полей объекта Card
        System.out.println("\n" + "Card Number: " + this.getCardNumber() + "\n" + "Card Type: " + this.getCardType() + "\n" + "Name: " + this.getName() +
                "\n" + "Expiration Date: " + this.getExpirationDate() + "\n" + "CVV: " + this.getCvv() + "\n" + "Valid status: " + this.isValidStatus());
    }

    public void checkValidStatus() { // Проверка валидности карты после установки новых полей в сеттерах
        this.validStatus = validator.validateCardFieldsNotNull(this);
    }

    private static class Validator { // Внутренний класс валидатора
        private Validator() {
        }

        public boolean validateCardNumber(String cardNumber) { // метод валидации номера карты
            final String CARD_NUMBER_REGEX = "^[0-9]{16}$"; // номер карты должен состоять из 16 цифр
            if (cardNumber != null && cardNumber.length() != 0) {
                Pattern p = Pattern.compile(CARD_NUMBER_REGEX);
                Matcher m = p.matcher(cardNumber);
                if (m.matches()) {
                    return true;
                } else {
                    System.out.println("New card number \"" + cardNumber + "\" is not valid! Old card number wasn't changed.");
                }
            } else {
                System.out.println("New card number is empty! Old card number wasn't changed.");
                return false;
            }
            return false;
        }

        public boolean validateCardType(String type) { // метод валидации типа карты
            if (type != null && type.length() > 0) {
                return true;
            }
            System.out.println("New card type is empty! Old card type wasn't changed.");
            return false;
        }

        public boolean validateName(String name) { // метод валидации имени владельца
            if (name != null && name.length() > 0) {
                return true;
            } else {
                System.out.println("New name is empty! Old card name wasn't changed.");
                return false;
            }
        }

        public boolean validateExpirationDate(String input) { // метод валидации срока действия
            final String EXPIRATION_DATE_REGEX = "^[0,1][0-9][/][0-9]{2}$";
            if (input != null && input.length() != 0) {
                Pattern p = Pattern.compile(EXPIRATION_DATE_REGEX);
                Matcher m = p.matcher(input);
                if (m.matches()) {
                    return true;
                } else {
                    System.out.println("Expiration Date \"" + input + "\" is not valid! Old expiration date wasn't changed.");
                    return false;
                }
            } else {
                System.out.println("New expiration date is empty! Old expiration date wasn't changed.");
                return false;
            }
        }

        public boolean validateCvv(int cvv1) { // Метод валидации CVV
            if (cvv1 > 99 && cvv1 < 1000) {
                return true;
            } else {
                System.out.println("New CVV " + cvv1 + " is not valid! Old CVV wasn't changed.");
                return false;
            }
        }

        public boolean validateCardFieldsNotNull(Card card) { // Проверка полей на null и 0 (дефолтные значения) для установления валидности карты
            return card.cardNumber != null && card.cardType != null && card.name != null && card.expirationDate != null && card.cvv != 0;
        }
    }
}
