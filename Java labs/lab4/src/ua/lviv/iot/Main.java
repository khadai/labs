package ua.lviv.iot;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		StringProcessor stringProc = new StringProcessor();
		try {
			String text = stringProc.readInputText();
			stringProc.processText(text);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
