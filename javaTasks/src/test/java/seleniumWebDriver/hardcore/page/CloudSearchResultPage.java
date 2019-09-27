package seleniumWebDriver.hardcore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloudSearchResultPage extends AbstractPage {

    public CloudSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public CloudSearchResultPage enterCalculatorPage() {
        driver.findElements(By.xpath("//*[@class='gs-title']")).get(1).click();
        return this;
    }
}
