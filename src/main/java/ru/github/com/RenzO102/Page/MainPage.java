package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.*;

public interface MainPage extends WebPage, WithHeader, FoundGroup, FoundFriend, PhotoLike{

    @FindBy("//input[@id='index_email']")
   AtlasWebElement searchLogin();

    @FindBy("//button[@type='submit']")
    AtlasWebElement buttonNext();

    @FindBy("//input[@name='password']")
    AtlasWebElement searchPassword();

    @FindBy("//span[@class='vkuiButton__in']")
    AtlasWebElement buttonEnt();
}