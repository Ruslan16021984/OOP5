package com.gmail.carbit3333333;

import javax.swing.JOptionPane;

public class Student extends Human {

	private String cours;
	private String depurtment;
	private String hightScool;

	public Student(String name, String surName, int age, String cours, String depurtment, String hightScool) {
		super(name, surName, age);
		this.cours = cours;
		this.depurtment = depurtment;
		this.hightScool = hightScool;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the cours
	 */
	public String getCours() {
		return cours;
	}
	/**
	 * @param cours the cours to set
	 */
	public void setCours(String cours) {
		this.cours = cours;
	}
	/**
	 * @return the depurtment
	 */
	public String getDepurtment() {
		return depurtment;
	}
	/**
	 * @param depurtment the depurtment to set
	 */
	public void setDepurtment(String depurtment) {
		this.depurtment = depurtment;
	}
	/**
	 * @return the hightScool
	 */
	public String getHightScool() {
		return hightScool;
	}
	/**
	 * @param hightScool the hightScool to set
	 */
	public void setHightScool(String hightScool) {
		this.hightScool = hightScool;
	}
	public void inputCours() throws StudentException {
		cours="";
		for(;;) {
			cours = String.valueOf("введите имя");
			if(cours =="null") {
				throw new StudentException();
			}
			if(checkString(cours)!= true) {
				JOptionPane.showMessageDialog(null, "Error input");
			}
		}
	}
	public void inputDepurtment() throws StudentException {
		depurtment="";
		for(;;) {
			depurtment = String.valueOf("введите имя");
			if(depurtment =="null") {
				throw new StudentException();
			}
			if(checkString(depurtment)!= true) {
				JOptionPane.showMessageDialog(null, "Error input");
			}
		}
	}
	public void inputHightScool() throws StudentException {
		hightScool="";
		for(;;) {
			hightScool = String.valueOf("введите имя");
			if(hightScool =="null") {
				throw new StudentException();
			}
			if(checkString(hightScool)!= true) {
				JOptionPane.showMessageDialog(null, "Error input");
			}
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [cours=" + cours + ", depurtment=" + depurtment + ", hightScool=" + hightScool + "]";
	}
	

}
