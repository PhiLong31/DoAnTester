public class TS_01_customizedstatement {
    private CustomizedStatement customizedStatement;

    public TS_01_customizedstatement(CustomizedStatement customizedStatement) {
        this.customizedStatement = customizedStatement;
    }

    public void TC_001() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("1000");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    public void TC_002() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("1000");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    public void TC_003() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("01052021");
        customizedStatement.getToDate().sendKeys("02052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("1000");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    public void TC_004() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("999999");
        customizedStatement.getNumberOfTransaction().sendKeys("4");
        customizedStatement.getSubmit().click();
    }

    public void TC_005() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("0");
        customizedStatement.getSubmit().click();
    }

    public void TC_006() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("30052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    public void TC_007() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("");
        customizedStatement.getToDate().sendKeys("29052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    public void TC_008() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    public void TC_009() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("29052021");
        customizedStatement.getToDate().sendKeys("20052021");
        customizedStatement.getMinimumTransactionValue().sendKeys("");
        customizedStatement.getNumberOfTransaction().sendKeys("");
        customizedStatement.getSubmit().click();
    }

    public void TC_010() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("");
        customizedStatement.getToDate().sendKeys("");
        customizedStatement.getMinimumTransactionValue().sendKeys("20000");
        customizedStatement.getNumberOfTransaction().sendKeys("3");
        customizedStatement.getSubmit().click();
    }

    public void TC_011() {
        customizedStatement.getCustomisedStatement().click();
        customizedStatement.getAccountNo().sendKeys("93268");
        customizedStatement.getFromDate().sendKeys("");
        customizedStatement.getToDate().sendKeys("");
        customizedStatement.getMinimumTransactionValue().sendKeys("");
        customizedStatement.getNumberOfTransaction().sendKeys("");
        customizedStatement.getSubmit().click();
    }

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
