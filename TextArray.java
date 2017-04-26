package com.gmail.s12348.evgen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextArray {
	private char[] arr;

	public TextArray() {
		super();
	}

	public char[] getArr() {
		return arr;
	}

	public void readFileToArray(File fileOne) {
		String txt = "";
		try (BufferedReader bf = new BufferedReader(new FileReader(fileOne))) {
			while (true) {
				String s = bf.readLine();
				if (s == null) {
					break;
				}
				txt = txt + s;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		txt = txt.replaceAll("[\\pP\\s\\d\\W]", "");
		arr = txt.toCharArray();
	}

}
