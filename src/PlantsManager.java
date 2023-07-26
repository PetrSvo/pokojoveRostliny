import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
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


    File file1=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\moje soubory z programování\\pokojoveRostliny\\out\\kvetiny.txt");
    File file2=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\moje soubory z programování\\pokojoveRostliny\\out\\kvetiny-spatne-datum.txt");
    File file3=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\moje soubory z programování\\pokojoveRostliny\\out\\/kvetiny-spatne-frekvence.txt");



    public void loadDataFromFile(String filename, String delimiter) throws Plants, PlantsException  {
        String[] items =new String[0];
        String line= "";
        int lineNumber=1;

        try (Scanner scanner= new Scanner(new BufferedReader(new FileReader(filename))))    {
            while (scanner.hasNextLine())
            {
                line =scanner.nextLine();
                items=line.split(delimiter);

                //nevim jestli nedoplnit co je v jednolivých rádcích poté

                lineNumber++;
            }

        } catch (FileNotFoundException e)
            {
            throw new PlantsException("Soubor "+ filename +" " +
                    "nebyl nalezen"+ e.getLocalizedMessage()); //s PlantsExceptions jde jen s metodou pod
            }  //připadně doplnit i chyby v rádcích, např. spatné |LocalDate
    }




    //Metoda pro vraceni aktualizovaného seznamu kvetin do souboru


    public List<Plants> getPlantsList() {
        return new ArrayList<>(plantsList);
    }



    int frequencyNull; //vyjímka - čislo zalevání 0 nebo zaporná


    //Metoda ošetřeni vyjimky pro zadaní čísla zalivky 0 a záporné
    public void setFrequencyNull (int frequencyOfWatering) throws PlantsExceptions {
        if (frequencyOfWatering < 1)
        {
            throw new PlantsExceptions("Frekvence zalevani nesmi byt " + frequencyOfWatering);
        }
        int frequencyNull = frequencyOfWatering;
    }


    //Takto by to mělo jít jednodušeji přímo se setrem
    public  void setFrequencyOfWatering (int frequencyOfWatering) throws PlantsExceptions {
        if (frequencyOfWatering<1)
        {
            throw  new PlantsExceptions("Frekvence zalevani nesmi byt " + frequencyOfWatering);
        } int setFrequencyOfWatering= frequencyOfWatering;
    }




    public int getFrequencyNull() {return frequencyNull;}

    //Metoda  vyjimky, aby datum poslední zalivky nebo starsi nez datum zasazeni

    LocalDate altDate;
    public void setAltDate(LocalDate planted,LocalDate watering) throws PlantsExceptions {
        if (altDate.isAfter(watering))
        {
            throw new PlantsExceptions("Datum"+planted+"nesmí být drive nez datum"+watering);
        }
        LocalDate altDate=planted;
    }

    //jednodušeji se setrem
    public void setPlanted(LocalDate planted,LocalDate watering) throws PlantsExceptions {
        if (planted.isAfter(watering))
        {
            throw new PlantsExceptions("Datum"+planted+"nesmí být drive nez datum"+watering);
        }
        LocalDate setPlanted =planted;
    }

    public LocalDate getAltDate()
    {return altDate;}
}




