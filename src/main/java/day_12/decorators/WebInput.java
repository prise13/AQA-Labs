package day_12.decorators;

import org.openqa.selenium.WebElement;

public class WebInput extends Element{

    public WebInput(WebElement webElement) {
        super(webElement);
        this.webElement = webElement;
    }

    // Custom method to fill input with logging
    public void fillWith(String value) {
        System.out.println("Sent value to input: " + "'" + webElement.getAccessibleName() + "'" + ", value: " + value);
        webElement.sendKeys(value);
    }

}
