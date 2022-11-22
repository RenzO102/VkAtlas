package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface SendMessage extends AtlasWebElement {

    @FindBy("//span[text()='Отправить']")
    AtlasWebElement sendMessage();
}