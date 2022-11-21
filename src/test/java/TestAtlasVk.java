import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import ru.github.com.RenzO102.Page.MainPage;

public  class TestAtlasVk  {

    public Atlas atlas;

    public WebDriver driver;

    @ClassRule
    public static MyRule wdriver = new MyRule();

    @Test
    public void shouldFoundMusic() throws Exception {
        onMainPage().leftMenu("Музыка").click();
        onMainPage().playMusic().click();
    }

    @Test
    public void shouldFoundGroup() {
        onMainPage().leftMenu("Сообщества").click();
        onMainPage().searchCom().sendKeys("Рифмы и Панчи");
    }

    @Test
    public void shouldSendLoveMessageToMyPassion() {
        onMainPage().leftMenu("Друзья").click();
        onMainPage().foundMessage().click();
        onMainPage().writeMessage().sendKeys("Вот ты и дома");
        onMainPage().sendMessage().click();
    }

    @Test
    public void shouldAddNewFreind() {
        onMainPage().leftMenu("Друзья").click();
        onMainPage().foundFriend().sendKeys("Юрий Калинин");
        onMainPage().foundPerson().click();
        onMainPage().addFreind().click();
    }

    @Test
    public void ShouldLikeNewMyPhoto() {
        onMainPage().leftMenu("Фотографии").click();
        onMainPage().photo().click();
        onMainPage().like().click();
    }

    @Test
    public void shouldAcceptMyPhoto() {
        onMainPage().leftMenu("Фотографии").click();
        onMainPage().accept().click();
    }

    public MainPage onMainPage() {
        return onPage(MainPage.class);
    }

    public <T extends WebPage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }
}