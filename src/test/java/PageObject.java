import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected WebDriver driver;
    public  PageObject(WebDriver ldriver){
        this.driver = ldriver;
        PageFactory.initElements(ldriver,this);
    }
}
