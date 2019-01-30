import javax.swing.JOptionPane;
public class FractionTester {
    public static void main(String[] args) {
        Fraction myFraction=new Fraction(JOptionPane.showInputDialog(null, "Fraction 1:"), JOptionPane.showInputDialog(null, "Fraction 2:", JOptionPane.showInputDialog(null, "Operator(+.-.*,/)")));
        JOptionPane.showMessageDialog(null, myFraction.getAddNum()+"/"+myFraction.getAddDen());
    }
}