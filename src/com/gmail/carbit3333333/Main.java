package com.gmail.carbit3333333;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Group group= new Group();
		group.addStudent();

		int s = JOptionPane.showConfirmDialog(null, "Вам нужно удалить студента из группы?");
		if (s == 0) {
			group.deleteStudent();
		}
		s = JOptionPane.showConfirmDialog(null, "Вам нужно найти студента из списка?");
		if (s == 0) {
			group.poiskStudent();
		}
		group.sortArray();

		System.out.println(group.toString());
	}

}
