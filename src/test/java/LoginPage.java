import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{

    public LoginPage(WebDriver ldriver) {
        super(ldriver);
    }
    private final String txtEmail =" your email";
    private final String password = "your password";
    @FindBy(id = "email")
    @CacheLookup
    private WebElement email;

    @FindBy(id = "passContainer")
    @CacheLookup
    private WebElement pwd;

    @FindBy(xpath = "//*[@id=\"u_0_d_Um\"]")
    @CacheLookup
    private WebElement submit;

    public  void setEmail(){
        this.email.sendKeys(txtEmail);
    }

    public void  setPassword(){
        this.pwd.sendKeys(password);
    }

    public void clickSubmit(){
        submit.click();
    }


}
