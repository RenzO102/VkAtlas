package ru.github.com.RenzO102.Page;

import io.qameta.atlas.core.api.Retry;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithHeader {
    @FindBy("//span[text()='']")
    WithHeader input(@Param("text") String text);

    void click();
}