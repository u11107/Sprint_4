package ru.yandex.praktikum.orderPage;

import org.junit.Test;
import ru.yandex.praktikum.basePageTest.BasePageTest;

import static org.junit.Assert.assertEquals;

public class OrderPageTest extends BasePageTest {

    // Тестовые данные  1
    protected String nameTest1 = "Иван";
    protected String lastNameTest1 = "Иванов";
    protected String addressTest1 = "г.Москва, Севанская 8, кв 36";
    protected String telTest1 = "81233455678";
    protected String commentTest1 = "Комментарий для курьера";
    //Тестовые данные 2
    protected String nameTest2 = "Виктор";
    protected String lastNameTest2 = "Викторов";
    protected String addressTest2 = "г.Москва, Кутузовский 10, кв 36";
    protected String telTest2 = "812000765328";
    protected String commentTest2 = "Без комментариев";

    // Тест для Chrome клик через по верхней кнопке заказа
    @Test
    public void checkRentOrderChromeOfClickTopButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButton(orderPage.topOrderButton);
        orderPage.inputName(nameTest1);
        orderPage.inputLastName(lastNameTest1);
        orderPage.inputAddress(addressTest1);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest1);
        orderPage.clickButtonFurther(orderPage.further);
        orderPage.enterDate(orderPage.data, orderPage.calendarDate);
        orderPage.dateInput(orderPage.rentalPeriod, orderPage.datePicker);
        orderPage.blackColorChoice(orderPage.color);
        orderPage.inputComment(orderPage.comment, commentTest1);
        orderPage.clickOrderButton(orderPage.order);
        orderPage.clickBottomYes(orderPage.confirmationOrder);
        String expectation = "Посмотреть статус";
        String actual = orderPage.gettingTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expectation, actual);
    }

    //   Тест для FireFox клик по верхней кнопке заказа
    @Test
    public void checkRentOrderFireFoxClickTopButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButton(orderPage.topOrderButton);
        orderPage.inputName(nameTest2);
        orderPage.inputLastName(lastNameTest2);
        orderPage.inputAddress(addressTest2);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest2);
        orderPage.clickButtonFurther(orderPage.further);
        orderPage.enterDate(orderPage.data, orderPage.calendarDate);
        orderPage.dateInput(orderPage.rentalPeriod, orderPage.datePicker);
        orderPage.blackColorChoice(orderPage.color);
        orderPage.inputComment(orderPage.comment, commentTest2);
        orderPage.clickOrderButton(orderPage.order);
        orderPage.clickBottomYes(orderPage.confirmationOrder);
        String expectation = "Посмотреть статус";
        String actual = orderPage.gettingTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expectation, actual);
    }

    //     Тест для Chrome клик через по нижней кнопке заказа
    @Test
    public void checkRentOrderChromeClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButton(orderPage.bottomOrderButton);
        orderPage.inputName(nameTest1);
        orderPage.inputLastName(lastNameTest1);
        orderPage.inputAddress(addressTest1);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest1);
        orderPage.clickButtonFurther(orderPage.further);
        orderPage.enterDate(orderPage.data, orderPage.calendarDate);
        orderPage.dateInput(orderPage.rentalPeriod, orderPage.datePicker);
        orderPage.blackColorChoice(orderPage.color);
        orderPage.inputComment(orderPage.comment, commentTest1);
        orderPage.clickOrderButton(orderPage.order);
        orderPage.clickBottomYes(orderPage.confirmationOrder);
        String expectation = "Посмотреть статус";
        String actual = orderPage.gettingTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expectation, actual);
    }

    //    Тест для FireFox  клик через по нижней кнопке заказа
    @Test
    public void checkRentOrderFireFoxClickBottomButton() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.scrollToElement(orderPage.bottomOrderButton);
        orderPage.clickOrderButton(orderPage.bottomOrderButton);
        orderPage.inputName(nameTest2);
        orderPage.inputLastName(lastNameTest2);
        orderPage.inputAddress(addressTest2);
        orderPage.choiceOfMetroStation();
        orderPage.enterPhone(telTest2);
        orderPage.clickButtonFurther(orderPage.further);
        orderPage.enterDate(orderPage.data, orderPage.calendarDate);
        orderPage.dateInput(orderPage.rentalPeriod, orderPage.datePicker);
        orderPage.blackColorChoice(orderPage.color);
        orderPage.inputComment(orderPage.comment, commentTest2);
        orderPage.clickOrderButton(orderPage.order);
        orderPage.clickBottomYes(orderPage.confirmationOrder);
        String expectation = "Посмотреть статус";
        String actual = orderPage.gettingTextFromButtonViewStatus();
        assertEquals("Ошибка, заказан не оформлен", expectation, actual);
    }

}