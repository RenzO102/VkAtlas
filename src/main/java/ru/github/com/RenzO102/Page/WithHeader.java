package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithHeader extends AtlasWebElement, FoundSound, FoundFriend{
    @FindBy("//span[text()='{{ text }}']")
    AtlasWebElement leftMenu(@Param("text") String text);
}