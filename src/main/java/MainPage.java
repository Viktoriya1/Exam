import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends PageBased {
    private WebDriverWait wait;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By SearchButton = By.cssSelector("#content_vacSearch_lnkSearch");
    private By SearchField = By.cssSelector(".keyword.ui-autocomplete-input");
    private By CitySelection = By.cssSelector("input[name=\"ctl00$content$vacSearch$CityPickerWork$inpCity\"]");


    public MainPage clickSearchButton() {
        driver.findElement(SearchButton).click();
        return new MainPage(driver);
    }


    public MainPage enterDataToSearchField(String SearchData) {
        driver.findElement(SearchField).sendKeys(SearchData);
        return new MainPage(driver);
    }

    public MainPage selectCity(String city) {
        driver.findElement(CitySelection).click();
        driver.findElement(CitySelection).sendKeys(city);
        return new MainPage(driver);
    }

    public MainPage searchByCity() {
        this.enterDataToSearchField("QA AUTOMATON");
        this.selectCity("Днепр");
        this.clickSearchButton();

        return new MainPage(driver);
    }
}