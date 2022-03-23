package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import settings.BaseSettings;

import static steps.AutorizationSteps.*;
import static steps.TaskSteps.checkTaskNumber;
import static steps.TaskSteps.createTask;

public class ClassTest extends BaseSettings {

    @Test
    @Tag("test1")
    @DisplayName("Проверяем количество задач в системе")
    public void Test1() {

        openUrl(settings.Configuration.getConfigurationValue("url"));
        checkIsOpened();
        clickBtnLogin();
        clickBtnPassword();
        clickIn();

        openUrl(settings.Configuration.getConfigurationValue("dashboardUrl"));
        checkIsOpened();
        checkTaskNumber();
    }

    @Test
    @Tag("test2")
    @DisplayName("Создаём задачу с последующим прохождением её ЖЦ")
    public void Test2() throws InterruptedException {

        openUrl(settings.Configuration.getConfigurationValue("url"));
        checkIsOpened();
        clickBtnLogin();
        clickBtnPassword();
        clickIn();

        openUrl(settings.Configuration.getConfigurationValue("dashboardUrl"));
        checkIsOpened();

        createTask();
    }
}
