import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit {
    @FindBy(name = "accountno")
    private WebElement accountno;

    @FindBy(name = "ammount")
    private WebElement ammount;

    @FindBy(name = "desc")
    private WebElement desc;

    @FindBy(name = "AccSubmit")
    private WebElement accSubmit;

    @FindBy(name = "res")
    private WebElement reset;

    @FindBy(xpath = "//a[.='Deposit']")
    private WebElement deposit;

    public Deposit(WebDriver d)
    {
        PageFactory.initElements(d, this);
    }

    public WebElement getDeposit() {
        return deposit;
    }

    public WebElement getAccountno() {
        return accountno;
    }

    public WebElement getAmmount() {
        return ammount;
    }

    public WebElement getDesc() {
        return desc;
    }

    public WebElement getAccSubmit() {
        return accSubmit;
    }

    public WebElement getReset() {
        return reset;
    }
}
