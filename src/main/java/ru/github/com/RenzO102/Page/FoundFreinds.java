package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface FoundFreinds extends WriteMessage, AtlasWebElement {

    @FindBy("//a[@href='/write163760244']")
    WithHeader foundmessage();
}