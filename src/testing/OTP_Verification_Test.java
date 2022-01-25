package testing;
import logic.Logic_Verification;
import org.junit.*;
public class OTP_Verification_Test {

    Logic_Verification verifyMe;

    @Before
    public void init(){
        verifyMe = new Logic_Verification();

    }

    @Test
    public void testOtpMethod(){
        /*
        This test fails every time because OTP is generated by
         random 6 digits in each execution
         */
        String expectedOTP = "123456";
        String systemGeneratedOTp = verifyMe.buildCode();

        Assert.assertEquals(expectedOTP, systemGeneratedOTp);
    }

    @After
    public void tearDown(){
        verifyMe = null;
    }

}
