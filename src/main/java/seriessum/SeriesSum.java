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
        if(result==0f) {
            return "0.00";
        }else if(result==1f) {
            return "1";
        }else {
            String returnStr = String.format("%.2f", result);
            returnStr = returnStr.replace(',','.');
            return returnStr;
        }
    }
}
