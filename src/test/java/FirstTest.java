import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends ChromeDriverTest {









    @Test
    public  void Search() {
        driver.get("http://rabota.ua");
        MainPage mainPage = new MainPage(driver).searchByCity();

    }



}
