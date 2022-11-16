import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;

import io.qameta.atlas.webdriver.WebPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.github.com.RenzO102.Page.MainPage;

public class TestAtlasVk {

    private Atlas atlas;
    private WebDriver driver;

    @Before
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        atlas = new Atlas(new WebDriverConfiguration(driver));
        onMainPage().open("https://vk.com/feed");
        onMainPage().searchLogin().sendKeys("stson102@ya.ru");
        onMainPage().buttonNext().click();
        onMainPage().searchPassword().sendKeys("Omon9876");
        onMainPage().buttonEnt().click();
    }

    @Test
    public void shouldFoundMusic(){
        onMainPage().leftMenu("Музыка").click();
        onMainPage().playMusic().click();
    }

    @Ignore
    @Test
    public void shouldFoundGroup(){
        onMainPage().leftMenu("Сообщества").click();
        onMainPage().searchCom().sendKeys("Рифмы и Панчи");
    }


    @Test
    public void shouldSendLoveMessageToMyPassion(){
        onMainPage().leftMenu("Друзья").click();
        onMainPage().foundMessage().click();
        onMainPage().writeMessage().sendKeys("Вот ты и дома");
        onMainPage().sendMessage().click();
    }

    @Ignore
    @Test
    public void shouldAddNewFreind(){
        onMainPage().leftMenu("Друзья").click();
        onMainPage().foundFriend().sendKeys("Юрий Калинин");
        onMainPage().foundPerson().click();
        onMainPage().addFreind().click();
    }

    @Ignore
    @Test
    public void ShouldLikeNewMyPhoto(){
        onMainPage().leftMenu("Фотографии").click();
        onMainPage().photo().click();
        onMainPage().like().click();
    }

    @Ignore
    @Test
    public void shouldAcceptMyPhoto(){
        onMainPage().leftMenu("Фотографии").click();
        onMainPage().accept().click();
    }

    @After
    public void stopDriver() {
        this.driver.quit();
    }

    private MainPage onMainPage() {
        return onPage(MainPage.class);
    }

    private <T extends WebPage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }
}