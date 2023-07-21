import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class PlantsManager {

    //kolekce pro uchování seznamu květin - ArrayList
    public List<Plants>plantsList=new ArrayList<>();

    //pridani indexu kvetiny
    public Plants get(int index) {
        return plantsList.get(index);
    }

    //Metoda pro načtení souboru
    return importFromFile("out/kvetiny.txt");

    public void loadDataFromFile(String filename, String delimiter) throws Plants {
        try (Scanner scanner= new Scanner(new BufferedReader(new FileReader(filename)))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Soubor "+ filename +" " +
                    "nebyl nalezen"+ e.getLocalizedMessage()); //s PlantsExceptions nejde, proc?
        }
    }
}
