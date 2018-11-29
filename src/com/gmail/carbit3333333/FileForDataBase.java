package com.gmail.carbit3333333;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileForDataBase {
	

		public FileForDataBase() {
		super();
		// TODO Auto-generated constructor stub
	}

		public static void saveToData(Group group2) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
				oos.writeObject(group2);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		public static void loadFromData(Group group2) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
				group2 = (Group) ois.readObject();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(group2.toString());
			
		}
	

}
