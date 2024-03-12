package Module02;

//Week1Dem2

import javax.swing.JOptionPane;

public class Addition

{
    public static void main(String[] args)

    {

        int num1, num2, result;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer: "));

        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter another integer : "));

        result = num1 + num2;

        JOptionPane.showMessageDialog(null, "The result is " + result + ".");

    }

}
