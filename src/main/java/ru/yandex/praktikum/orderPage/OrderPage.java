package ru.yandex.praktikum.orderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {

    private WebDriver webDriver;

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // Тестовые данные
    protected String nameTest = "Иван";
    protected String lastNameTest = "Иванов";
    protected String adressTest = "г.Москва, Севанская 8, кв 36";
    protected String telTest = "81233455678";


    protected String commentTest = "Комментарий для курьера";


    //    Локатор для кнопки заказа верхний
    protected By topOrderButton = By.className("Button_Button__ra12g");

    //    Локатор для кнопки заказа внизу
    protected By bottomOrderButton = By.xpath("//button[contains(@class, 'Button_Middle__1CSJM')]");

    //    Локатор поля Name
    protected By name = By.xpath("//input[@placeholder='* Имя']");

    //    Локатор поля
    protected By lastName = By.xpath("//input[@placeholder='* Фамилия']");

    //    Локатор поля адресс
    protected By adress = By.xpath("//input[contains(@placeholder, 'куда')]");

    //    Локатор поля метро
    protected By metro = By.xpath("//input[@placeholder='* Станция метро']");


    //    Локатор выбора станции метро Черкизовская
    protected By cherkizon = By.xpath("//div[@class='select-search__select']//*[text()='Черкизовская']");

    //    Локатор для поля номаре телефона
    protected By tel = By.xpath("//input[contains(@placeholder, 'на')]");

    //    Локатор для кнопки Далее
    protected By further = By.xpath("//*[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    //    Локатор отображения страницы после нажатия кнопки Далее
    protected By pageDisplay = By.xpath("//div[@class='Order_Content__bmtHS']");

    //    Локатор поля даты
    protected By data = By.
            xpath("//*[contains(@placeholder, '* Когда привезти самокат')]");

    //    Локатор поля выпадшки с выбором даты
    protected By calendarDate = By.
            xpath("//*[@class = 'react-datepicker__day react-datepicker__day--008']");

    //    Локатор срока аренды
    protected By rental = By.xpath("//*[@class='Dropdown-placeholder']");

    //    Локатор выпадашки срока аренды
    protected By rentalPeriod = By.xpath("//*[@class='Dropdown-placeholder']");

    //    Локатор выбора даты в выпадашке
    protected By datePicker = By.xpath("//*[text()='четверо суток']");

    //    Локатор выбора цвета самоката
    protected By color = By.id("black");

    //    Локатор комментария
    protected By comment = By.xpath("//*[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");

    //    Локатор кнопки заказать
    protected By order = By.
            xpath("//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать')]");

    //    Локатор кнопки подтверждения заказа ДА
    protected By confirmationOrder = By.
            xpath("//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text()='Да')]");


    //    Локатор подтверждения заказа
    protected By orderConfirmed = By.xpath("//*[contains(text(), 'Посмотреть статус')]");


    //    Метод клика по верхней кнопки заказа
    public void clickOrderButton(By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        webDriver.findElement(by).click();
    }

    //    Метод клика по кнопке Да
    public void clickBottomYes(By by) {
        webDriver.findElement(by).click();
    }

    //    Метод ввода валидных данных
    public void enterValidData() {
        webDriver.findElement(name).sendKeys(nameTest);
        webDriver.findElement(lastName).sendKeys(lastNameTest);
        webDriver.findElement(adress).sendKeys(adressTest);
        webDriver.findElement(metro).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cherkizon));
        webDriver.findElement(cherkizon).click();
        webDriver.findElement(tel).sendKeys(telTest);
    }

    //    Метод клика по кнопке далее и ввода даты
    public void clickButtonFurther(By by) {
        webDriver.findElement(by).click();
    }

    //    Метод подтверждающий отображение страницы после нажатия
    public boolean isDisplay(By by) {
        return webDriver.findElement(by).isDisplayed();
    }

    //    Метод ввода даты
    public void enterDate(By locator, By data) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriver.findElement(locator).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(data));
        webDriver.findElement(data).click();
    }

    //    Метод ввода срока аренды
    public void rentPeriod(By field, By rent) {
        webDriver.findElement(field).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(data));
        webDriver.findElement(rent).click();
    }

    //    Метод выбора цвета самоката
    public void colorSelection(By by) {
        webDriver.findElement(by).click();
    }

    //    Метод коммента для курьера
    public void commentEnter(By by, String text) {
        webDriver.findElement(by).sendKeys(text);
    }

    // Метод получения текста подтверждающего заказ
    public String genText() {
        return webDriver.findElement(orderConfirmed).getText();
    }
}
