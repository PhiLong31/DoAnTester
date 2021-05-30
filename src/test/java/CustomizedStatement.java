import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatement {
    @FindBy(xpath="//a[.='Customised Statement']")
    private WebElement customisedStatement;

    @FindBy(name = "accountno")
    private WebElement accountNo;

    @FindBy(name = "fdate")
    private WebElement fromDate;

    @FindBy(name = "tdate")
    private WebElement toDate;

    @FindBy(name = "amountlowerlimit")
    private WebElement minimumTransactionValue;

    @FindBy(name = "numtransaction")
    private WebElement numberOfTransaction;

    @FindBy(name = "AccSubmit")
    private WebElement submit;

    @FindBy(name = "res")
    private WebElement reset;

    public CustomizedStatement(WebDriver d)
    {
        PageFactory.initElements(d, this);
    }

    public WebElement getAccountNo() {
        return accountNo;
    }

    public WebElement getFromDate() {
        return fromDate;
    }

    public WebElement getToDate() {
        return toDate;
    }

    public WebElement getMinimumTransactionValue() {
        return minimumTransactionValue;
    }

    public WebElement getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getReset() {
        return reset;
    }

    public WebElement getCustomisedStatement() {
        return customisedStatement;
    }
}
