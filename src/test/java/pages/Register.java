package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import static utils.WebDriverUtils.clickButtonByText;
import static utils.WebDriverUtils.inputByPlaceholder;

public class Register {

    private static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"green-btn\"]")
    private WebElement registerButton;

    @FindBy(xpath = "//a[normalize-space(.)='Кабінет']")
    private WebElement accountButton;

    @FindBy(xpath = "//button[contains(@class, 'green-btn')]")
    private WebElement loginButton;

    public Register (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openRegister() {
        WebDriverUtils.openUrl(driver, "https://hozsklad.ua/ua/auth/register");
    }

    public void inputUserName(String text) {
        inputByPlaceholder(driver, "Введіть Ваше ім'я", text);
    }

    public void inputUserSName(String text) {
        inputByPlaceholder(driver, "Введіть Ваше прізвище", text);
    }

    public void inputUserSecondName(String text) {
        inputByPlaceholder(driver, "Введіть по-батькові", text);
    }

    public void inputUserEmail(String mail) {
        inputByPlaceholder(driver, "Введіть Ваш Email", mail);
    }

    public void inputUserPhoneNumber(String phoneNumber) {
        inputByPlaceholder(driver, "Введіть Ваш телефон", phoneNumber);
    }

    public void inputUserPassword(String password) {
        inputByPlaceholder(driver, "Введіть Ваш пароль", password);
    }

    public void inputUserSPassword(String password) {
        inputByPlaceholder(driver, "Введіть пароль ще раз", password);
    }

    public void inputEmailForLogin(String userMail) {
        inputByPlaceholder(driver, "Введіть Ваш E-Mail", userMail);
    }

    public void inputPassForLogin(String userPass) {
        inputByPlaceholder(driver, "Введіть Ваш пароль", userPass);
    }

    public void login (String userMail, String userPass){
        inputEmailForLogin(userMail);
        inputPassForLogin(userPass);
        System.out.println("Введено дані для авторизації");
        loginButton.click();
        System.out.println("Натиснуто кнопку Увійти");
    }

    public void clickRegisterButton() {
        registerButton.click();
        System.out.println("Кнопка Зареєструватися натиснута...");
    }

    public void inputFieldsForRegister (String Name, String SName, String SecondName, String mail, String phoneNumber, String password){
        inputUserName(Name);
        inputUserSName(SName);
        inputUserSecondName(SecondName);
        inputUserEmail(mail);
        inputUserPhoneNumber(phoneNumber);
        inputUserPassword(password);
        inputUserSPassword(password);
        System.out.println("Всі поля для реєстрації заповнено");
    }

    public void clickAccount() {
        accountButton.click();
    }



}
