package testjunit;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTest {
	@Test
    public void genLicenseShouldReturnBeRight() {
		License license = new License();
        assertEquals("License should be equal","17861076885551838230", license.genLicense());
    }
}
