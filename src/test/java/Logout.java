import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
    @FindBy(xpath="//a[.='Log out']")
    private WebElement logout;

    public WebElement getLogout() {
        return logout;
    }

    public Logout(WebDriver d)
    {
        PageFactory.initElements(d, this);
    }

}
