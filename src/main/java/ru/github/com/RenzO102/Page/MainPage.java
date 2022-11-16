package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.*;

public interface MainPage extends WebPage, WithHeader, FoundGroup, FoundFriend{

    @FindBy(("//input[@id='index_email']"))
   AtlasWebElement searchlogin();

    @FindBy(("//button[@type='submit']"))
    AtlasWebElement buttonnext();

    @FindBy(("//input[@name='password']"))
    AtlasWebElement searchpassword();

    @FindBy(("//span[@class='vkuiButton__in']"))
    AtlasWebElement buttonent();
}