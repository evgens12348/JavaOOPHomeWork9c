package com.gmail.s12348.evgen;

import java.io.File;
import java.io.IOException;

public class Counting {
	private CharArray charArray = new CharArray();
	private TextArray textArray = new TextArray();

	public Counting() {
		super();
	}

	public void count() {
		File fileOne = new File("a.txt");
		try {
			if (fileOne.exists() == false) {
				fileOne.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		textArray.readFileToArray(fileOne);
		charArray.fillingArray();
		for (int i = 0; i < charArray.getCharCont().size(); i++) {
			for (int j = 0; j < textArray.getArr().length; j++) {
				if (charArray.getCharCont().get(i).getCh() == textArray.getArr()[j]) {
					charArray.getCharCont().get(i).setN(charArray.getCharCont().get(i).getN() + 1);
				}
			}
		}
		charArray.sortArray();
		charArray.print();
	}

}
