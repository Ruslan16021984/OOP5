package com.gmail.carbit3333333;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group implements Voenkomat,Serializable {
	//private Student[] group = new Student[10];
	Student student1 = new Student("Иванов", "Петя", 21, "АКАДЕМИЯ", "", "");
	Student student2 = new Student("петров", "Вася", 23, "АКАДЕМИЯ", "", "");
	Student student3 = new Student("Сидоров", "Роман", 13, "АКАДЕМИЯ", "", "");
	Student student4 = new Student("Вялов", "Дима", 12, "АКАДЕМИЯ", "", "");
	Student student5 = new Student("Сдор", "Кузя", 15, "Институт", "", "");
	Student student6 = new Student("Микитин", "Руся", 25, "нститут", "", "");
	Student student7 = new Student("Овчин", "Света", 24, "нститут", "", "");
	Student student8 = new Student("Кутузова", "Марина", 22, "нститут", "", "");
	Student student9 = new Student("Маляр", "Витя", 23, "Колледж", "", "");
	Student student10 = new Student("Кирпич", "Костя", 23, "Колледж", "", "");
	Student[] group = new Student[] {student1, student2, student3,student4, student5, student6, student7,student8, student9, student10};

	

	public void addStudent() {
		int i = 0;
		for (;;) {
			int s = JOptionPane.showConfirmDialog(null, "Добавить нового ученика в группу?");
			if (s == 0) {

				try {
					if (i >= 10)
						throw new ArrayIndexOutExeption();
					group[i] = new Student();
					group[i].inputSurName();
					group[i].inputName();
					group[i].iputAge();
					group[i].inputHightScool();
					group[i].inputDepurtment();
					group[i].inputCours();
					i += 1;

				} catch (StudentException e) {
					e.NamwNull("null");
					// TODO: handle exception
				} catch (ArrayIndexOutExeption e) {
					e.ArrayIndexOut();
					break;
					// TODO: handle exception
				} catch (MyNegativOldExeption e) {
					// TODO Auto-generated catch block
					e.Negativ();
				}
			} else {
				break;
			}
		}
	}

	public void deleteStudent() {
		for (;;) {
			try {
				int n = Integer.valueOf(
						JOptionPane.showInputDialog("Введите номер записи которую вы хотите удалить(от 1 до 10)"));
				if (n < 1 & n > 10)
					throw new MyNegativOldExeption();
				group[n] = null;
				break;
			} catch (MyNegativOldExeption e) {
				e.Negativ();
				// TODO: handle exception
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Отменено");
				break;
				// TODO: handle exception
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Не правильно введен номер");
				// TODO: handle exception
			}
		}
	}

	public void poiskStudent() {
		String surname;
		for (;;) {
			try {
				surname = String
						.valueOf(JOptionPane.showInputDialog(null, "Введите Фамилию студента которого вы ищете"));
				if (surname == "null")
					throw new StudentException();
				if (checkString(surname) != true) {
					JOptionPane.showMessageDialog(null, "Ошибка");
				} else {
					break;
				}
			} catch (StudentException e) {
				e.NamwNull("null");
				// TODO: handle exception
			}
		}
		int k = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				if (group[i].getSurName().compareToIgnoreCase(surname) == 0) {
					System.out.println(group[i]);
					k += 1;
				}
			}

		}
		if (k == 0) {
			JOptionPane.showMessageDialog(null, "В группе нет такого студента");
		}
	}

	public void sortBySurName() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getSurName().compareTo(b.getSurName()));
	}

	public void sortByName() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getName().compareTo(b.getName()));
	}

	public void sortByAge() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getAge() - b.getAge());
	}

	public void sortByHightScool() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getHightScool().compareTo(b.getHightScool()));
	}

	public void sortByDepartment() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getDepurtment().compareTo(b.getDepurtment()));
	}

	public void sortByCours() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getCours().compareTo(b.getCours()));
	}

	private boolean checkString(String surname) {
		if (surname.length() == 0) {
			return false;
		}

		return true;
	}

	public Student[] getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(Student[] group) {
		this.group = group;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Student student : group) {
			if (student != null) {
				builder.append(student.toString());
				builder.append("\n");
			}

		}

		return builder.toString();
	}

	public void sortStudentsByType() {
		int n = 0;
		for (;;) {
			try {
				n = Integer.valueOf(
						JOptionPane.showInputDialog("Select by what to sort (1-name, 2-surname, 3-age, 4-HightScool)."));
				if (n < 1 & n > 4) {
					throw new MyNegativOldExeption();
				}
				break;

			} catch (MyNegativOldExeption e) {
				e.NegativNomber();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Canseled set as default");
				break;
			}
		}
		switch (n) {
		case 1:
			sortByName();
			;
			break;
		case 2:
			sortBySurName();
			break;
		case 3:
			sortByAge();
			break;
		case 4:
			sortByHightScool();
			break;
		}

	}

	@Override
	public Student[] prizivnik() {
		Student[] prizivnik = new Student[group.length];
		for (int i = 0; i < prizivnik.length; i++) {
			if (group[i] != null) {
				if (group[i].getAge() > 18) {
					for (int j = 0; j < prizivnik.length; j++) {
						if (prizivnik[i] == null) {
							prizivnik[i] = group[i];
							break;
						}
					}
				}
			}

		}
		for (int i = 0; i < prizivnik.length; i++) {
			if (prizivnik[i] != null) {
				System.out.println(prizivnik[i]);
			}
		}
		return prizivnik;
	}

	public void saveToFile(String name) {
		try (FileWriter fileWriter = new FileWriter(new File(name))) {
			fileWriter.write(toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


}
