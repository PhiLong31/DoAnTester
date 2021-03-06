import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransfer {
    @FindBy(xpath="//a[.='Fund Transfer']")
    private WebElement fundTrans;

    @FindBy(name="payersaccount")
    private WebElement payersAcc;

    @FindBy(name="payeeaccount")
    private WebElement payeesAcc;

    @FindBy(name="ammount")
    private WebElement ammount;

    @FindBy(name="desc")
    private WebElement desc;

    @FindBy(name="AccSubmit")
    private WebElement submit;

    @FindBy(name="AccReset")
    private WebElement reset;


    public FundTransfer(WebDriver d)
    {
        PageFactory.initElements(d, this);
    }

    public WebElement fundTrans()
    {
        return fundTrans;
    }

    public WebElement payersAcc()
    {
        return payersAcc;
    }

    public WebElement payeesAcc()
    {
        return payeesAcc;
    }

    public WebElement desc()
    {
        return desc;
    }

    public WebElement submit() { return submit; }

    public WebElement reset() { return reset; }

    public WebElement ammount()
    {
        return ammount;
    }
}
