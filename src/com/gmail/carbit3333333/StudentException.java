package com.gmail.carbit3333333;

import javax.swing.JOptionPane;

public class StudentException extends Exception {

	public void NamwNull(String name) {
		if (name == "null") {
			JOptionPane.showInputDialog(null, "отменено");

		}

	}

}
