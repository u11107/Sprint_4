package ru.yandex.praktikum.orderPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class OrderPageTest {

    private WebDriver webDriver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        webDriver = new ChromeDriver();
        webDriver = new FirefoxDriver();
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
        webDriver.manage().window().maximize();

    }

    @After
    public void teardown() {
        webDriver.quit();
    }

    // Тест для Chrome
    @Test
    public void checkRentOrderChrome() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButton(orderPage.topOrderButton);
        orderPage.enterValidData();
        orderPage.clickButtonFurther(orderPage.further);
        orderPage.enterDate(orderPage.data, orderPage.calendarDate);
        orderPage.rentPeriod(orderPage.rentalPeriod, orderPage.datePicker);
        orderPage.colorSelection(orderPage.color);
        orderPage.commentEnter(orderPage.comment, orderPage.commentTest);
        orderPage.clickOrderButton(orderPage.order);
        orderPage.clickBottomYes(orderPage.confirmationOrder);
        String expectation = "Посмотреть статус";
        String actual = orderPage.genText();
        assertEquals("Ошибка, заказан не оформлен", expectation, actual);
    }

    //    Тест для FireFox
    @Test
    public void checkRentOrderFireFox() {
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickOrderButton(orderPage.topOrderButton);
        orderPage.enterValidData();
        orderPage.clickButtonFurther(orderPage.further);
        orderPage.enterDate(orderPage.data, orderPage.calendarDate);
        orderPage.rentPeriod(orderPage.rentalPeriod, orderPage.datePicker);
        orderPage.colorSelection(orderPage.color);
        orderPage.commentEnter(orderPage.comment, orderPage.commentTest);
        orderPage.clickOrderButton(orderPage.order);
        orderPage.clickBottomYes(orderPage.confirmationOrder);
        String expectation = "Посмотреть статус";
        String actual = orderPage.genText();
        assertEquals("Ошибка, заказан не оформлен", expectation, actual);
    }
}