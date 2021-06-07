import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_02_customizedstatement extends LongMain{

    public TS_02_customizedstatement() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_013")
    public void TC_013() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("123%$jhdf");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getReset().click();
    }

    @Test
    @DisplayName("TC_014")
    public void TC_014() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("9326");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("123%$jhdf");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getReset().click();
    }

    @Test
    @DisplayName("TC_015")
    public void TC_015() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("9326");
        customizedStatement.getFromDate().sendKeys("02042021");
        customizedStatement.getToDate().sendKeys("06042021");
        customizedStatement.getMinimumTransactionValue().sendKeys("123%$jhdf");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getReset().click();
    }

    @Test
    @DisplayName("TC_016")
    public void TC_016() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("");
        customizedStatement.getFromDate().sendKeys("");
        customizedStatement.getToDate().sendKeys("");
        customizedStatement.getMinimumTransactionValue().sendKeys("1000");
        customizedStatement.getNumberOfTransaction().sendKeys("");
        customizedStatement.getReset().click();
    }
}
