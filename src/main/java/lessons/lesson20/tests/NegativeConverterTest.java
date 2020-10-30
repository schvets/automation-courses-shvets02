package lessons.lesson20.tests;

import lessons.lesson20.application.ConvetorApp;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static lessons.lesson20.application.ConvetorApp.ConvertorTypes.FROM_KILLOGRAMM_TO_GRAMM;

public class NegativeConverterTest extends BaseTest{
    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test(expected = IllegalArgumentException.class)
    public void verifyNegativeConvertedValuesTest(){
        System.out.println("negative test without rules  ");

        ConvetorApp app = new ConvetorApp();
        float actualData = app.convert(FROM_KILLOGRAMM_TO_GRAMM, -50);

    }

    @Test
    public void verifyNegativeConvertedValuesWithRules(){
        System.out.println("negative test with rules  ");

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("value less then 0 not permitted");
        ConvetorApp app = new ConvetorApp();
        float actualData = app.convert(FROM_KILLOGRAMM_TO_GRAMM, -50);
    }
}
