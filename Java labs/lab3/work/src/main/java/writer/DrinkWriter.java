package writer;

import com.iot.model.Drink;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DrinkWriter {

    public final void writeToFile(final List<Drink> drinks) {
        try (PrintWriter writer = new PrintWriter("menu.csv")) {
            for (Drink drink : drinks) {
                writer.println(drink.getHeaders());
                writer.println(drink.toCSV());
                writer.println("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
