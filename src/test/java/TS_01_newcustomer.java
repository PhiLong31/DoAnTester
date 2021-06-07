import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class TS_01_newcustomer extends LeMain{

    public TS_01_newcustomer() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_001")
    public void TC_001(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_002")
    public void TC_002(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee123");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc34");
        newCustomer.state().sendKeys("Viet Nam@@");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_003")
    public void TC_003(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("12345");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_004")
    public void TC_004(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("09878dgh");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_005")
    public void TC_005(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("09878dgh");
        newCustomer.emailid().sendKeys("ntnle.18it4");
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_006")
    public void TC_006(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("");
        newCustomer.address().sendKeys("");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_007")
    public void TC_007(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("");
        newCustomer.state().sendKeys("");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_008")
    public void TC_008(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_009")
    public void TC_009(){
        String emailid = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_0010")
    public void TC_010(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys("");
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_0011")
    public void TC_011(String emailid){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee35");
        newCustomer.female();
        newCustomer.dob().sendKeys("13032000");
        newCustomer.address().sendKeys("74 Thanh Vinh");
        newCustomer.city().sendKeys("Binh Phuoc");
        newCustomer.state().sendKeys("Viet Nam");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("0987873520");
        newCustomer.emailid().sendKeys(emailid);
        newCustomer.custpass().sendKeys("13032000");
        newCustomer.submit().click();
    }

    @Test
    @DisplayName("TC_0012")
    public void TC_012(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("Lee");
        newCustomer.female();
        newCustomer.dob().sendKeys("");
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
    @DisplayName("TC_0013")
    public void TC_013(){
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("");
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
}
