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

    //Metoda pro smazaní květiny
    public ArrayList<Plants> clear(int index) { plantsList.clear();
    return new ArrayList<Plants>(plantsList);}

    //Metoda pro načtení souboru


    File file1=new File("Tento počítač/Plocha/Open JDK/moje soubory z programování/pokojovéRostliny/out/kvetiny.txt");
    File file2=new File("Tento počítač/Plocha/Open JDK/moje soubory z programování/pokojovéRostliny/out/kvetiny-spatne-datum.txt");
    File file3=new File("Tento počítač/Plocha/Open JDK/moje soubory z programování/pokojovéRostliny/out/kvetiny-spatne-frekvence.txt");

    public void loadDataFromFile(String filename, String delimiter) throws Plants, PlantsException {
        String[] items =new String[0];
        String line= "";
        int lineNumber=1;

        try (Scanner scanner= new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                line =scanner.nextLine();
                items=line.split(delimiter);

                //nevim jestli nedoplnit co je v jednolivých rádcích poté

                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            throw new PlantsException("Soubor "+ filename +" " +
                    "nebyl nalezen"+ e.getLocalizedMessage()); //s PlantsExceptions jde jen s metodou pod
        }  //připadně doplnit i chyby v rádcích, např. spatné |LocalDate
    }

    private class PlantsException extends Throwable {
        public PlantsException(String s) {
        }
    }

    //Metoda pro vraceni aktualizovaného seznamu kvetin do souboru


    public List<Plants> getPlantsList() {
        return new ArrayList<>(plantsList);
    }
}
