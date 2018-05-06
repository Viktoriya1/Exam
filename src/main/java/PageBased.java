import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class PageBased {


        protected WebDriver driver;

        public PageBased(WebDriver driver) {
            this.driver = driver;
        }


        protected boolean isElementPresent(By by) {


            try {

                driver.findElement(by);

                return true;

            } catch (NoSuchElementException exception) {

                return false;


            }

        }
    }


