package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface WriteMessage extends AtlasWebElement, SendMessage {

    @FindBy("//div[@id='mail_box_editable']")
    AtlasWebElement writeMessage();
}