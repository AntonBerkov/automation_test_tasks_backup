package seleniumWebDriver.iCanWin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PastebinHomePage extends AbstractPage {

    private static final String HOMEPAGE_URL = "https://pastebin.com";

    @FindBy(xpath = "//*[@id=\"paste_code\"]")
    private WebElement pasteCode;

    @FindBy(xpath = "//*[@class='select2-selection__arrow']")
    private List<WebElement> fieldChoose;

    @FindBy(xpath = "//*[@class='select2-results__option']")
    private List<WebElement> selectResult;

    @FindBy(xpath = "//*[@name='paste_name']")
    private WebElement pasteName;

    public PastebinHomePage(WebDriver driver) {
        super(driver);
    }

    public PastebinHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public PastebinHomePage sendContent(String codeAreaContent, String pasteNameContent) {
        pasteCode.sendKeys(codeAreaContent);
        fieldChoose.get(1).click();
        selectResult.get(0).click();
        pasteName.sendKeys(pasteNameContent);
        return this;
    }
}
