import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
    @FindBy(xpath="//a[.='New Account']")
    private WebElement newAcc;

    @FindBy(name="cusid")
    private WebElement custID;

    @FindBy(xpath="//select[@name='selaccount']")
    private WebElement accType;

    @FindBy(name="inideposit")
    private WebElement iniDeposit;

    @FindBy(name="button2")
    private WebElement submit;


    @FindBy(name="button3")
    private WebElement reset;

    @FindBy(xpath="//td[.='Account ID']/..//td[2]")
    private WebElement accID;

    @FindBy(xpath="//td[.='Current Amount']/..//td[2]")
    private WebElement availBal;

    public NewAccount(WebDriver d)
    {
        PageFactory.initElements(d, this);
    }

    public WebElement newAcc()
    {
        return newAcc;
    }

    public WebElement custID() { return custID; }

    public WebElement accType() { return accType; }

    public WebElement iniDeposit()
    {
        return iniDeposit;
    }

    public WebElement submit()
    {
        return submit;
    }

    public WebElement reset()
    {
        return reset;
    }

    public WebElement accID()
    {
        return accID;
    }

    public WebElement availBal()
    {
        return availBal;
    }
}
