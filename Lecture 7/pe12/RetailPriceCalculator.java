import javax.swing.*;
import java.awt.event.*;

/*
Create a GUI application where the user enters the wholesale cost of an item and its
markup percentage into text fields. (For example, if an item’s wholesale cost is $5 and its
markup percentage is 100 percent, then its retail price is $10.) The application should
have a button that displays the item’s retail price when clicked.
*/

public class RetailPriceCalculator extends JFrame{
	private JPanel panel;

	private JLabel wholesaleCostLabel; 
	private JTextField wholesaleCost;
	private JLabel markupPercentageLabel; 
	private JTextField markupPercentage;
	private JButton displayPrice;

	private final int WINDOW_WIDTH = 310; 
	private final int WINDOW_HEIGHT = 200;

	RetailPriceCalculator() {
		setTitle("Retail Price Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);

		setVisible(true);
	}

	private void buildPanel() {
		panel = new JPanel();

		wholesaleCostLabel = new JLabel("Enter the wholesale cost : ");
		wholesaleCost = new JTextField(10);
		markupPercentageLabel = new JLabel("Enter the markup percentage : ");
		markupPercentage = new JTextField(10);
		displayPrice = new JButton("Calculate");

		displayPrice.addActionListener(new CalcButtonListener());

		panel.add(wholesaleCostLabel);
		panel.add(wholesaleCost);
		panel.add(markupPercentageLabel);
		panel.add(markupPercentage);
		panel.add(displayPrice);
	}
	
	public static void main(String[] args) {
		new RetailPriceCalculator();
	}

	private class CalcButtonListener implements ActionListener
	{
		String inputwC;
		String inputmP;

		double cost;
		double markup;

		double finalPrice;

		@Override
		public void actionPerformed(ActionEvent event) {
			inputwC = wholesaleCost.getText();
			inputmP = markupPercentage.getText();

			try {
				cost = Double.parseDouble(inputwC);
				markup = Double.parseDouble(inputmP);
			} catch (NumberFormatException e) {
				return;
			}

			finalPrice = cost * (1 + markup/100);

			JOptionPane.showMessageDialog(rootPane, "The total price is "+finalPrice);

		}

	}
}
