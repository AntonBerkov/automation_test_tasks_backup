package seleniumWebDriver.bringItOn.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumWebDriver.bringItOn.page.PastebinHomePage;
import seleniumWebDriver.bringItOn.page.PastebinResultPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebDriverPastebinTest {

    private WebDriver driver;
    private PastebinResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        createPaste();
        resultPage = new PastebinResultPage(driver);
    }

    private void createPaste() {
        List<String> inputCode = new ArrayList<>(Arrays.asList(
                "git config --global user.name  \"New Sheriff in Town\"" + "\n",
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")" + "\n",
                "git push origin master --force"
        ));
        new PastebinHomePage(driver)
                .openPage()
                .sendContent(inputCode, "how to gain dominance among developers");
    }

    @Test
    public void checkForTitleEquality() {
        String title = resultPage.searchTitle();
        Assert.assertEquals(title, "how to gain dominance among developers");
    }

    @Test
    public void checkForBushColor() {
        List<String> bashColors = resultPage.searchBushColor();
        for (String color : bashColors) {
            Assert.assertEquals(color, "#c20cb9");
        }
    }

    @Test
    public void checkForCodeEquality() {
        List<String> code = resultPage.searchCode();
        List<String> inputCode = new ArrayList<>(Arrays.asList(
                "git config --global user.name  \"New Sheriff in Town\"",
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")",
                "git push origin master --force"
        ));
        Assert.assertEquals(code, inputCode);
    }

    @AfterMethod(alwaysRun = true)
    public void browserShutdown() {
        driver.quit();
        driver = null;
    }
}
