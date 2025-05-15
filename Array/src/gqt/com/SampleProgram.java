package gqt.com;
import javax.swing.JOptionPane;

public class SampleProgram {
    public static void main(String[] args) {
        // Input weight in kilograms
        String weightInput = JOptionPane.showInputDialog("Enter your weight in kilograms:");
        double weight = Double.parseDouble(weightInput);

        // Input height in meters
        String heightInput = JOptionPane.showInputDialog("Enter your height in meters:");
        double height = Double.parseDouble(heightInput);

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display the result
        String message = String.format("Your BMI is: %.2f", bmi);
        JOptionPane.showMessageDialog(null, message);

        // Optional: Show category
        if (bmi < 18.5) {
            JOptionPane.showMessageDialog(null, "You are underweight.");
        } else if (bmi < 24.9) {
            JOptionPane.showMessageDialog(null, "You have a normal weight.");
        } else if (bmi < 29.9) {
            JOptionPane.showMessageDialog(null, "You are overweight.");
        } else {
            JOptionPane.showMessageDialog(null, "You are obese.");
        }
    }
}
