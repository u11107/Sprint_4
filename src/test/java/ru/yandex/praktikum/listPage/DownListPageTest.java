package ru.yandex.praktikum.listPage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DownListPageTest {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
        webDriver.manage().window().maximize();
    }

    @After
    public void teardown() {
        webDriver.quit();
    }


    @Test
    public void checkPanel1() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading0);
        downListPage.clickList(downListPage.heading0);
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actually = downListPage.getText(downListPage.accordion0);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }

    @Test
    public void checkPanel2() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading1);
        downListPage.clickList(downListPage.heading1);
        String expected = "Пока что у нас так: один заказ — один самокат." +
                " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actually = downListPage.getText(downListPage.accordion1);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }

    @Test
    public void checkPanel3() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading2);
        downListPage.clickList(downListPage.heading2);
        String expected = "Допустим, вы оформляете заказ на 8 мая." +
                " Мы привозим самокат 8 мая в течение дня." +
                " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actually = downListPage.getText(downListPage.accordion2);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }

    @Test
    public void checkPanel4() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading3);
        downListPage.clickList(downListPage.heading3);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actually = downListPage.getText(downListPage.accordion3);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }

    @Test
    public void checkPanel5() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading4);
        downListPage.clickList(downListPage.heading4);
        String expected = "Пока что нет!" +
                " Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actually = downListPage.getText(downListPage.accordion4);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }

    @Test
    public void checkPanel6() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading5);
        downListPage.clickList(downListPage.heading5);
        String expected = "Самокат приезжает к вам с полной зарядкой." +
                " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                " Зарядка не понадобится.";
        String actually = downListPage.getText(downListPage.accordion5);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }

    @Test
    public void checkPanel7() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading6);
        downListPage.clickList(downListPage.heading6);
        String expected = "Да, пока самокат не привезли." +
                " Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actually = downListPage.getText(downListPage.accordion6);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }

    @Test
    public void checkPanel8() {
        DownListPage downListPage = new DownListPage(webDriver);
        downListPage.scrollToElement(downListPage.heading7);
        downListPage.clickList(downListPage.heading7);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actually = downListPage.getText(downListPage.accordion7);
        Assert.assertEquals("Текст в поле не верный", expected, actually);
    }
}
