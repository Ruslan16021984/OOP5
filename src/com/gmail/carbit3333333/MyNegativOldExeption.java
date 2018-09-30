package com.gmail.carbit3333333;

import javax.swing.JOptionPane;

public class MyNegativOldExeption extends Exception {
	public void Negativ() {
		JOptionPane.showMessageDialog(null, "Нет отрицательного возраста");
	}
	public void NegativNomber() {
		JOptionPane.showMessageDialog(null, "Не правильно введено число");
	}
}
