public class TS_02_newcustomer {
    private NewCustomer newCustomer;

    public TS_02_newcustomer(NewCustomer newCustomer){
        this.newCustomer = newCustomer;
    }

    public void TC_014(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("");
        newCustomer.male();
        newCustomer.dob().sendKeys("");
        newCustomer.address().sendKeys("");
        newCustomer.city().sendKeys("");
        newCustomer.state().sendKeys("");
        newCustomer.pin().sendKeys("");
        newCustomer.mob().sendKeys("");
        newCustomer.emailid().sendKeys("");
        newCustomer.custpass().sendKeys("");
        newCustomer.submit().click();
    }

    public void TC_015(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Leeeee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys("ntnle.18it4@vku.udn.vn");
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    public void TC_016(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Leeeee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("");
        newCustomer.state().sendKeys("");
        newCustomer.pin().sendKeys("");
        newCustomer.mob().sendKeys("");
        newCustomer.emailid().sendKeys("");
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    public void TC_017(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys("ntnl1.18it4@vku.udn.vn");
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }
}
