package steps;

import io.qameta.allure.Step;

import static PageObject.AuthorisationPage.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AutorizationSteps {

    @Step("Открываем страницу авторизации")
    public static void openUrl(String url) {
        open(url);
    }

    @Step("Проверяем переход на страницу авторизации")
    public static void checkIsOpened() {
        $x(header).exists();
    }

    @Step("Вводим логин")
    public static void clickBtnLogin() {
        $x(loginLane).click();
        $x(loginLane).sendKeys(settings.Configuration.getConfigurationValue("login"));
    }

    @Step("Вводим пароль")
    public static void clickBtnPassword() {
        $x(passworLane).click();
        $x(passworLane).sendKeys(settings.Configuration.getConfigurationValue("password"));
    }

    @Step("Кликаем кнопку войти")
    public static void clickIn() {
        $x(logInBtn).click();
    }
}
