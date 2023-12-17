package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface PhotoLike extends AtlasWebElement {

    @FindBy("//a[@href='/photo101386142_456244870?all=1']")
    AtlasWebElement photo();

    @FindBy("//div[@class='like_button_icon']")
    AtlasWebElement like();

    @FindBy("//span[text()='Подтвердить']")
    AtlasWebElement accept();
}