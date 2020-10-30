package lessons.lesson20.tests;

import lessons.lesson20.application.ConvetorApp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static lessons.lesson20.application.ConvetorApp.ConvertorTypes.*;


@RunWith(Parameterized.class)
public class PositveConvertorTest extends BaseTest{
    private ConvetorApp app;
    private ConvetorApp.ConvertorTypes type;
    private float expected;
    private int convertData;

    public PositveConvertorTest(ConvetorApp.ConvertorTypes type, int convertData, float expected) {
        this.type = type;
        this.convertData = convertData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection coverterData() {
        return Arrays.asList(new Object[][]{
                {FROM_KM_TO_L, 358, 42.95f},
                {FROM_KILLOGRAMM_TO_GRAMM, 1000, 1000000},
                {FROM_METERS_TO_KILOMETERS, 1000, 1}
        });
    }

    @Test
    public void testPositiveConvetParametrized() {
        app = new ConvetorApp();
        float actual = app.convert(type, convertData);
        Assert.assertEquals(expected, actual, 0.2);
        System.out.println("parametrized test with type "  + type);
    }

//    @Test
//    public void testPositiveConvetMtoKm(){
//        ConvetorApp app = new ConvetorApp();
//        float actual = app.convert(FROM_METERS_TO_KILOMETERS, 1000);
//        Assert.assertEquals(1, actual, 0);
//    }
//
//    @Test
//    public void testPositiveConvetKgtoGram(){
//        ConvetorApp app = new ConvetorApp();
//        float actual = app.convert(FROM_KILLOGRAMM_TO_GRAMM, 350);
//        Assert.assertEquals(350000, actual, 0);
//    }
//
//    @Test
//    public void testPositiveConvetKmtoL(){
//        ConvetorApp app = new ConvetorApp();
//        float actual = app.convert(FROM_KM_TO_L, 601);
//        Assert.assertEquals(72, actual, 0.13);
//    }
}

