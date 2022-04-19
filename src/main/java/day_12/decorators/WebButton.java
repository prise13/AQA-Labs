package day_12.decorators;

import org.openqa.selenium.WebElement;

public class WebButton extends Element {
    public WebButton(WebElement webElement) {
        super(webElement);
        this.webElement = webElement;
    }

    public void press() {
        System.out.println("Button " + webElement.getText() + " pressed");
        webElement.click();
    }
}
