import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_01_customizedstatement extends LongMain {

    public TS_01_customizedstatement() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_001")
    public void TC_001() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("1000");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_002")
    public void TC_002() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("9326");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("1000");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_003")
    public void TC_003() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("01052021");
        customizedStatement.getToDate().sendKeys("02052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("1000");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_004")
    public void TC_004() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("999999999");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_005")
    public void TC_005() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_006")
    public void TC_006() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_007")
    public void TC_007() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("");
        customizedStatement.getToDate().sendKeys("29052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_008")
    public void TC_008() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_009")
    public void TC_009() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("");
        customizedStatement.getNumberOfTransaction().sendKeys("");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_010")
    public void TC_010() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("");
        customizedStatement.getToDate().sendKeys("");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_011")
    public void TC_011() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("");
        customizedStatement.getToDate().sendKeys("");
        customizedStatement.getMinimumTransactionValue().sendKeys("");
        customizedStatement.getNumberOfTransaction().sendKeys("");
        customizedStatement.getSubmit().click();
    }

    @Test
    @DisplayName("TC_012")
    public void TC_012() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("123%$jhdf");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getSubmit().click();
    }
}
