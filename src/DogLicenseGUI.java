import javax.swing.*;
import java.awt.*;
import java.util.Date;  
public class DogLicenseGUI {

	public static void main(String[] args) {
		// Frame
		JFrame frame; // Initialize frame
		JLabel yearLabel; // Initialize year label
		JLabel userId; // Initialize user ID
		JLabel licenseNum; // Initialize license number
		// Text Fields
		JTextField yearField; // Initialize year field display
		JTextField userField; // display user id number
		JTextField licenseField; // display assigned license number
		// Submit Button
		JButton submitButton; // submit button
		// GridBag layout


		// Instantiate objects
		frame = new JFrame("Dog License Number Generator"); // creates frame w/title
		frame.setLayout(new GridBagLayout());
		yearLabel = new JLabel("Enter User Year:"); // set year label
		userId = new JLabel("Enter User ID:"); // set user id label
		licenseNum = new JLabel("Assigned Dog License:"); // set license number
		submitButton = new JButton("Submit");
		yearField = new JTextField(10);
		yearField.setEditable(true);
		userField = new JTextField(10);
		userField.setEditable(true);
		licenseField = new JTextField(10);
		licenseField.setEditable(false);


		//
		GridBagConstraints layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(10, 10, 10, 10);
		frame.add(yearLabel, layout);

		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(10, 10, 10, 10);
		frame.add(yearField, layout);

		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		layout.insets = new Insets(10, 10, 10, 10);
		frame.add(userId, layout);

		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 1;
		layout.insets = new Insets(10, 10, 10, 10);
		frame.add(userField, layout);

		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 2;
		layout.insets = new Insets(10, 10, 10, 10);
		frame.add(licenseNum, layout);

		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 2;
		layout.insets = new Insets(10, 10, 10, 10);
		frame.add(licenseField, layout);

		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 3;
		layout.insets = new Insets(10, 10, 10, 10);
		frame.add(submitButton, layout);


		frame.setVisible(true); // displays frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits window when closed
		frame.pack(); // resize window to fit components
		
		Date d=new Date();  
		int year=d.getYear();
		int currentYear=year+1900;  

		JTextField finalUserField = userField;
		JTextField finalYearField = yearField;
		JTextField finalLicenseField1 = licenseField;
		submitButton.addActionListener(e -> {
			String val1 = finalUserField.getText();
			String val2 = finalYearField.getText();
			String lisnum = val1 + val2;
			finalLicenseField1.setText(lisnum + "- " + currentYear);
		});












	}
}
