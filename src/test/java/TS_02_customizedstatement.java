public class TS_02_customizedstatement {
    private CustomizedStatement customizedStatement;

    public TS_02_customizedstatement(CustomizedStatement customizedStatement) {
        this.customizedStatement = customizedStatement;
    }

    public void TC_013() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("123%$jhdf");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getReset().click();
    }

    public void TC_014() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("9326");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("123%$jhdf");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getReset().click();
    }

    public void TC_015() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("9326");
        customizedStatement.getFromDate().sendKeys("02042021");
        customizedStatement.getToDate().sendKeys("06042021");
        customizedStatement.getMinimumTransactionValue().sendKeys("123%$jhdf");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getReset().click();
    }

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
