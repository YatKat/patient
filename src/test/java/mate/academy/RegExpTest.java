package mate.academy;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RegExpTest {

    @Test
    public void mobilePhoneValidation(){
        Pattern p = Pattern.compile("^((\\+38)[\\- ]?)?(\\(?0\\d[1-9]{2}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
        assertTrue(p.matcher("06761234567").matches());
        assertFalse(p.matcher("8676123456").matches());
    }
}
