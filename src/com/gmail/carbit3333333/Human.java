package com.gmail.carbit3333333;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Human implements Serializable{
	private String name;
	private String surName;
	private int age;
	public Human(String name, String surName, int age) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
	}
	
	public Human() {

		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}
	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void inputName() throws StudentException {
		name="";
		for(;;) {
			name = String.valueOf(JOptionPane.showInputDialog(null, "введите имя"));
			if(name =="null") {
				throw new StudentException();
			}
			if(checkString(name)!= true) {
				JOptionPane.showMessageDialog(null, "Error input");
			}else {
				break;
			}
		}
		
	}
	public void inputSurName() throws StudentException {
		surName="";
		for(;;) {
			surName = String.valueOf(JOptionPane.showInputDialog(null,"введите Фамилию"));
			if(name =="null") {
				throw new StudentException();
			}
			if(checkString(surName)!= true) {
				JOptionPane.showMessageDialog(null, "Error input");
			}else {
				break;
			}
		}
	}
	public void iputAge() throws MyNegativOldExeption {
		for(;;) {
			try {
				age = Integer.parseInt(JOptionPane.showInputDialog("Введите возраст"));
				if(age <=0)throw new MyNegativOldExeption();
				break;
			} catch (MyNegativOldExeption e) {
				e.Negativ();
				// TODO: handle exception
			}catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null,"Canceled");
				break;
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Error number format");
				//break;
			}
			
		}
	}
	public boolean checkString(String string) {
		if (string.length()==0) {
			return false;
		}else {
			return true;
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Human [name=" + name + ", surName=" + surName + ", age=" + age + "]";
	}


	
}
