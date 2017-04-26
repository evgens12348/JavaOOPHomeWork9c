package com.gmail.s12348.evgen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CharArray {
	private ArrayList<CharContainer> charCont = new ArrayList<>();

	public CharArray() {
		super();
	}

	public ArrayList<CharContainer> getCharCont() {
		return charCont;
	}

	public void setCharCont(ArrayList<CharContainer> charCont) {
		this.charCont = charCont;
	}

	public void fillingArray() {
		for (char i = 'a'; i <= 'z'; i++) {
			CharContainer cc = new CharContainer(i, 0);
			charCont.add(cc);
		}
	}

	public void sortArray() {
		Collections.sort(charCont, new Comparator<CharContainer>() {
			public int compare(CharContainer a, CharContainer b) {
				return Integer.compare(b.getN(), a.getN());
			}
		});
	}

	public void print() {
		for (CharContainer charContainer : charCont) {
			System.out.println("The letter " + charContainer.getCh() + " will meet " + charContainer.getN() + " times");
		}

	}
}
