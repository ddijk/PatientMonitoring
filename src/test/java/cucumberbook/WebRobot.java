package cucumberbook;
import javax.swing.JOptionPane;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by dick on 6-4-17.
 */
public class WebRobot {

    public static void main(String[] args) {
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(firefoxDriver);

        System.out.printf("About to go to google");
        eventFiringWebDriver.get("http://www.google.com");
        System.out.printf("After going to google");


        // ...etc
        ask("Click to Fin");
        eventFiringWebDriver.quit();

    }

    private static void ask(final String question) {
        JOptionPane.showMessageDialog(null, question, "Äsk for response", JOptionPane.PLAIN_MESSAGE);
    }
}
