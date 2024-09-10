import javax.swing.*;
import java.awt.event.*;

/*
Create a GUI application where the user enters the wholesale cost of an item and its
markup percentage into text fields. (For example, if an item’s wholesale cost is $5 and its
markup percentage is 100 percent, then its retail price is $10.) The application should
have a button that displays the item’s retail price when clicked.
*/

public class CelciustoFarenheit extends JFrame{
	private JPanel panel;

	private JLabel celciusLabel; 
	private JTextField celciusField;
	private JButton convertButton;

	private final int WINDOW_WIDTH = 310; 
	private final int WINDOW_HEIGHT = 200;

	CelciustoFarenheit() {
		setTitle("Retail Price Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);

		setVisible(true);
	}

	private void buildPanel() {
		panel = new JPanel();

		celciusLabel = new JLabel("Enter the temperature (°C) : ");
		celciusField = new JTextField(10);
		convertButton = new JButton("Convert");

		convertButton.addActionListener(new CalcButtonListener());

		panel.add(celciusLabel);
		panel.add(celciusField);
		panel.add(convertButton);
	}
	
	public static void main(String[] args) {
		new CelciustoFarenheit();
	}

	private class CalcButtonListener implements ActionListener
	{
		String inputCelcius;

		double celcius;

		double farenheit;

		@Override
		public void actionPerformed(ActionEvent event) {
			inputCelcius = celciusField.getText();

			try {
				celcius = Double.parseDouble(inputCelcius);
			} catch (NumberFormatException e) {
				return;
			}

			System.out.println(celcius);
			System.out.println(1.8*celcius);

			farenheit = 32.0 + 1.8*celcius;

			JOptionPane.showMessageDialog(rootPane, "The temperature in farenheit is "+farenheit);

		}

	}
}
