
import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeDriverService;

    public class ChromeDriverTest {
        private static ChromeDriverService service;
        public static WebDriver driver;

        @BeforeClass
        public static void createAndStartService() throws IOException {
            service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File("/Users/viktoriya/projects/mob/Exam/src/test/java/chromedriver"))
                    .usingAnyFreePort()
                    .build();
            service.start();
        }

        @Before
        public void setUp(){
            driver = new ChromeDriver(service);
        }


        @After
        public void tearDown(){
            driver.quit();
        }

        @AfterClass
        public static void createAndStopService() {
            service.stop();
        }
    }
