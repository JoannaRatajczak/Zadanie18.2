import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.regex.MatchResult;

import static org.junit.jupiter.api.Assertions.*;

class TaxMethodsTest {

    @Test
    void countingTax85528() {
        //given
        double income = 85528;

        //when
        double tax = TaxMethods.countingTax(income);

        //try
        Assert.assertThat(tax, CoreMatchers.is(14839.0));
    }

    @Test
    void countingTax86500() {
        //given
        double income = 86500;

        //when
        double tax = TaxMethods.countingTax(income);

        //try
        Assert.assertThat(tax, CoreMatchers.is(15150.0));
    }


}