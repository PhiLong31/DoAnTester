import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_02_newcustomer extends LeMain{

    public TS_02_newcustomer() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_0014")
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

    @Test
    @DisplayName("TC_0015")
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

    @Test
    @DisplayName("TC_0016")
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

    @Test
    @DisplayName("TC_0017")
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
