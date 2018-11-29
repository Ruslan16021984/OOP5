package com.gmail.carbit3333333;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Group group = new Group();
		// group.addStudent();

		int s = JOptionPane.showConfirmDialog(null, "Вам нужно удалить студента из группы?");
		if (s == 0) {
			group.deleteStudent();
		}
		s = JOptionPane.showConfirmDialog(null, "Вам нужно найти студента из списка?");
		if (s == 0) {
			group.poiskStudent();
		}
		s = JOptionPane.showConfirmDialog(null, "Хоти ли вы отсортировать по группам");
		if (s == 0) {
			group.sortStudentsByType();
		}
		s = JOptionPane.showConfirmDialog(null, "Хоти ли вы созхранить группу в файл?");
		if (s == 0) {
			group.saveToFile("ab.txt");

		}
		System.out.println(group);
		s = JOptionPane.showConfirmDialog(null, "Хоти ли вы созхранить  в database?");
		if (s == 0) {
			FileForDataBase.saveToData(group);

		}
		s = JOptionPane.showConfirmDialog(null, "Хоти ли вы выгрузить из database?");
		if (s == 0) {
			FileForDataBase.loadFromData(group);

		}
		
		
		
	}


}
