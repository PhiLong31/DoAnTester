import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account {
    @FindBy(name="uid")
    private WebElement username;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(name="btnLogin")
    private WebElement login;

    @FindBy(xpath="//td[.='Manager Id : mngr328490']")
    private WebElement mgrId;

    public Account(WebDriver d)
    {
        PageFactory.initElements(d, this);
    }

    public WebElement username()
    {
        return username;
    }

    public WebElement password()
    {
        return password;
    }

    public WebElement login()
    {
        return login;
    }

    public WebElement mgrId()
    {
        return mgrId;
    }

}
