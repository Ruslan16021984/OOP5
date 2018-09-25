package com.gmail.carbit3333333;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group {
	private Student[] group = new Student[10];

	public void addStudent() {
		int i = 0;
		for (;;) {
			int s = JOptionPane.showConfirmDialog(null, "Добавить нового ученика в группу?");
			if (s == 0) {

				try {
					if (i >=10)
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
			}else {
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
				surname = String.valueOf(JOptionPane.showInputDialog(null, "Введите имя студента которого вы ищете"));
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
		if(k ==0) {
			JOptionPane.showMessageDialog(null, "В группе нет такого студента");
		}
	}
	public void sortArray() {
		Student temp = new Student();
		for (int i = 0; i < group.length; i++) {
			for (int j = group.length - 1; j > i; j--) {
				if (group[j] != null & group[j - 1] != null) {
					if (group[j].getSurName().compareToIgnoreCase(group[j - 1].getSurName()) < 0) {
						temp = group[j];
						group[j] = group[j - 1];
						group[j - 1] = temp;
					}
				}
			}
		}
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
		int k = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				System.out.println(group[i] + " ");
				k += 1;
			}
		}

		return "In Group [" + k + "]";
	}

	
	

}
