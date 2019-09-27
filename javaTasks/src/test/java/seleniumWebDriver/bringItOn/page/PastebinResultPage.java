package seleniumWebDriver.bringItOn.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.util.stream.Collectors;

import java.util.List;

public class PastebinResultPage extends AbstractPage {

    public PastebinResultPage(WebDriver driver) {
        super(driver);
    }

    public String searchTitle() {
        return driver.findElement(By.xpath("//*[@class='paste_box_line1']")).getText();
    }

    public List<String> searchCode() {
        List<WebElement> bashCode = driver.findElements(By.xpath("//*[@class='li1']"));
        return bashCode.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public List<String> searchBushColor() {
        List<WebElement> bashColor = driver.findElements(By.xpath("//*[@class='kw2']"));
        return bashColor.stream()
                .map(
                        webElementColor -> Color.fromString(webElementColor.getCssValue("color")).asHex()
                )
                .collect(Collectors.toList());
    }
}

