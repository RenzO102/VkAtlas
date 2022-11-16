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
    }

    @Test
    @Ignore
    public void shouldTestAWebSite() {
        onMainPage().open("https://vk.com/feed");
        onMainPage().searchlogin().sendKeys("stson102@ya.ru");
        onMainPage().buttonnext().click();
        onMainPage().searchpassword().sendKeys("Omon9876");
        onMainPage().buttonent().click();
    }

    @Test
    public void shouldTestBMainIcons(){
        onMainPage().open("https://vk.com/feed");
        onMainPage().searchlogin().sendKeys("stson102@ya.ru");
        onMainPage().buttonnext().click();
        onMainPage().searchpassword().sendKeys("Omon9876");
        onMainPage().buttonent().click();
        onMainPage().input("Друзья").click();
    }

    @After
    public void stopDriver() {
//        this.driver.quit();
    }

    private MainPage onMainPage() {
        return onPage(MainPage.class);
    }

    private <T extends WebPage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }
}