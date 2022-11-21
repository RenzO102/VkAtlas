import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.core.api.Retry;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.github.com.RenzO102.Page.MainPage;

public  class MyRule extends ExternalResource {

    public Atlas atlas;

    public WebDriver driver;

    public MainPage onMainPage() {
        return onPage(MainPage.class);
    }

    public  <T extends WebPage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }

    @Override
    public void before() throws Throwable{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            atlas = new Atlas(new WebDriverConfiguration(driver));
            onMainPage().open("https://vk.com/feed");
            onMainPage().searchLogin().sendKeys("stson102@ya.ru");
            onMainPage().buttonNext().click();
            onMainPage().searchPassword().sendKeys("Omon9876");
            onMainPage().buttonEnt().click();
        }

    @Override
    public void after() {
            this.driver.quit();
        }
}