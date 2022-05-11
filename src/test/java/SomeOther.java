import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SomeOther {
    @Test
    public void someOtherMethod() {
        BigDecimal d = new BigDecimal("10.73");
//      d.round(new MathContext(1));
        d = d.setScale(1, RoundingMode.UP);


        System.out.println(d);
    }
}
