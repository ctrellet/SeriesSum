package seriessum;

/**
 * Hello world!
 *
 */
public class SeriesSum
{

    public String sum(int inputInt) {
        Float result = new Float(0);
        for (int i = 1; i <= inputInt; i++) {
            result = result + (1/((float) (1+(3*(i-1)))));
        }
        String returnStr = String.format("%.2f", result);
        returnStr = returnStr.replace(',','.');
        return returnStr;
    }
}
