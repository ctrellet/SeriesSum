package seriessum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SeriesSumTest {

    @Test
    public void testSeriesSum1() {

        //Set
        SeriesSum ss = new SeriesSum();
        int inputInt = 1;
        //Test
        String output = ss.sum(inputInt);
        //Assert
        assertEquals("1",output);
    }

    @Test
    public void testSeriesSum2() {

        //Set
        SeriesSum ss = new SeriesSum();
        int inputInt = 2;
        //Test
        String output = ss.sum(inputInt);
        //Assert
        assertEquals("1.25",output);
    }

    @Test
    public void testSeriesSum5() {

        //Set
        SeriesSum ss = new SeriesSum();
        int inputInt = 5;
        //Test
        String output = ss.sum(inputInt);
        //Assert
        assertEquals("1.57",output);
    }
}
