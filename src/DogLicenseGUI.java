/**
 * Author: Julian.Postell@asu.edu
 * Version: 1.1
 * Date Created: 02/27/20
 * Date Last Modified
 * Updated by: Julian.Postell@asu.edu
 */

import java.awt.*;
import javax.swing.*;

public class DogLicenseGUI {

	public static void main(String[] args) {
		JFrame frame = null; // Initialize frame
		JLabel yearLabel = null; // Initialize year label
		JLabel userId = null; // Initialize user ID
		JLabel licenseNum = null; // Initialize license number
		JTextField yearField = null; // Initialize year field display
		JTextField userField = null; // display user id number
		JTextField licenseField = null; // display assigned license number
		JButton submitButton = null; // submit button
		GridBagConstraints layout = null; // GUI layout

		yearLabel = new JLabel("Enter User Year:"); // set year label
		userId = new JLabel("Enter User ID:"); // set user id label
		licenseNum = new JLabel("Assigned Dog License:"); // set license number
		submitButton = new JButton("Submit");

		yearField = new JTextField(10);
		yearField.setEditable(true);

		userField = new JTextField(10);
		userField.setEditable(true);

		licenseField = new JTextField(10);
		licenseField.setEditable(true);

		frame = new JFrame("Dog License Number Generator"); // creates frame w/title
		frame.setLayout(new GridBagLayout());

		layout = new GridBagConstraints();
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

	}

	/*
	TODO: Create a DogLicense class
	 */
	// Template for dog license
	static class DogLicense {
		String year;
		int id;

	}

	// Function to create dog license
	static String submit(String year, int id) {
		String assignedNumber;
		assignedNumber = year + id;
		return assignedNumber;
	}

	/*
	TODO: Create a function to take input and create a new DogLicense object
	 */
}
