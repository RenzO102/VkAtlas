import org.junit.ClassRule;
import org.junit.Test;

public class TestAtlasVk extends MyRule {

    @ClassRule
    public static MyRule wdriver = new MyRule();

    @Test
    public void shouldFoundMusic() throws Exception {
        wdriver.onMainPage().leftMenu("Музыка").click();
        wdriver.onMainPage().playMusic().click();
    }

    @Test
    public void shouldFoundGroup() throws Exception {
        wdriver.onMainPage().leftMenu("Сообщества").click();
        wdriver.onMainPage().searchCom().sendKeys("Рифмы и Панчи");
    }

    @Test
    public void shouldSendLoveMessageToMyPassion() throws Exception {
        wdriver.onMainPage().leftMenu("Друзья").click();
        wdriver.onMainPage().foundMessage().click();
        wdriver.onMainPage().writeMessage().sendKeys("Вот ты и дома");
        wdriver.onMainPage().sendMessage().click();
    }

    @Test
    public void shouldAddNewFreind() throws Exception {
        wdriver.onMainPage().leftMenu("Друзья").click();
        wdriver.onMainPage().foundFriend().sendKeys("Юрий Калинин");
        wdriver.onMainPage().foundPerson().click();
        wdriver.onMainPage().addFreind().click();
    }

    @Test
    public void ShouldLikeNewMyPhoto() throws Exception {
        wdriver.onMainPage().leftMenu("Фотографии").click();
        wdriver.onMainPage().photo().click();
        wdriver.onMainPage().like().click();
    }

    @Test
    public void shouldAcceptMyPhoto() throws Exception {
        wdriver.onMainPage().leftMenu("Фотографии").click();
        wdriver.onMainPage().accept().click();
    }
}