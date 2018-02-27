package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.*;

public class StringProcessor {

    public String readInputText() throws IOException {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter String: ");
            return br.readLine();
}

    
public List<String> processText(String inputText) {
	List<String> matches = new LinkedList<String>();
    Matcher m = Pattern.compile("((\\d{4}\\s*){4})|\\d{16}").matcher(inputText);
    while(m.find()) {
    	//if(m.group(1).length() >= 16) {
    		matches.add(m.group());
    }
     showResult(matches);
     return matches;
}

public void showResult(List<String> resultText) {
	System.out.println(resultText);
} 

} 
