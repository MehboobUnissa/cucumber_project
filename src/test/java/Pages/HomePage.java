package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }

    @FindBy(xpath = "//span[@Class='a-color-state a-text-bold']")
    WebElement searchResult;

    public WebElement getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(WebElement searchResult) {
        this.searchResult = searchResult;
    }
}
