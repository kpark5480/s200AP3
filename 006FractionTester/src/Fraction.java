/**
 *Add two fractions. Learn Javadocs. Enter the two fractions as Strings
 *then use String methods
 * @author Kyle Parke
 *
 */
import javax.swing.JOptionPane;
public class Fraction {
    private int Numerator1;
    private int Denominator1;
    private int Numerator2;
    private int Denominator2;
    private int Numerator3;
    private int Denominator3;
    private int NumAdd1;
    private int NumAdd2;
    public Fraction(String passFraction, String string) {
        int separatorLocation=passFraction.indexOf("/");
        String strNumerator1=passFraction.substring(0,separatorLocation);
        String strDenominator1=passFraction.substring(separatorLocation + 1);
        Numerator1=Integer.parseInt(strNumerator1);
        Denominator1=Integer.parseInt(strDenominator1);
        String strNumerator2=string.substring(0,separatorLocation);
        String strDenominator2=string.substring(separatorLocation + 1);
        Numerator2=Integer.parseInt(strNumerator2);
        Denominator2=Integer.parseInt(strDenominator2);
        NumAdd1=Denominator1 * Numerator2;
        NumAdd2=Denominator2 * Numerator1;
        Numerator3=NumAdd1 + NumAdd2;
        Denominator3=Denominator1 * Denominator2;
        gcd(Denominator1, Denominator2);
        String strNumerator3=string.substring(0,separatorLocation);
        String strDenominator3=string.substring(separatorLocation + 1);
        Numerator1=Integer.parseInt(strNumerator3);
        Denominator1=Integer.parseInt(strDenominator3);

        
        
    }
    private void gcd(int denominator12, int denominator22) {
		// TODO Auto-generated method stub
    	int a=Numerator3;
        int b=Denominator3;
        int gcd;
        if (a==0)
            gcd=b;
        while (b!=0) {
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        gcd=a;
        Numerator3=Numerator3/gcd;
        Denominator3=Denominator3/gcd;
	}
	public void setAddNum(int numerator){
        Numerator3=numerator;
    }
    public void setAddDen(int denominator) {
        Denominator3=denominator;
    }
    public int getAddNum() {
        return Numerator3;
    }
    public int getAddDen() {
        return Denominator3;
    }
    public void setNumerator1(int numerator) {
        Numerator1=numerator;
    }
    public int getNumerator1() {
        return Numerator1;
    }
    public void setDenominator1(int denominator) {
        Denominator1=denominator;
    }
    public int getDenominator1() {
        return Denominator1;
    }
    public void setNumerator2(int numerator) {
        Numerator2=numerator;
    }
    public int getNumerator2() {
        return Numerator2;
    }
    public void setDenominator2(int denominator) {
        Denominator2=denominator;
    }
    public int getDenominator2() {
        return Denominator2;
    }
}


	

