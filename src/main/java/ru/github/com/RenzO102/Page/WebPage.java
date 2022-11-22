package ru.github.com.RenzO102.Page;

import io.qameta.atlas.webdriver.extension.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;

public interface WebPage extends WrapsDriver {
    @DriverProvider
    @Override
    WebDriver getWrappedDriver();

    default void open(String url) {
        getWrappedDriver().get(url);
    }

    default void open() {
        getWrappedDriver().get(System.getProperties().getProperty("VK_SITE"));
    }
}