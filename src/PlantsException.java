import java.time.LocalDate;

public class PlantsException extends Exception {
    public PlantsException (String message) {
        super(message); //mělo by uložit chybova hlaseni
    }


    int frequencyNull; //vyjímka - čislo zalevání 0 nebo zaporná


    //Metoda ošetřeni vyjimky pro zadaní čísla zalivky 0 a záporné
    public void setFrequencyNull (int frequencyOfWatering) throws PlantsException {
        if (frequencyOfWatering < 1) {
            throw new PlantsException("Frekvence zalevani nesmi byt " + frequencyOfWatering);
        }
        int frequencyNull = frequencyOfWatering;
    }
    public int getFrequencyNull() {return frequencyNull;}

    //Metoda  vyjimky, aby datum poslední zalivky nebo starsi nez datum zasazeni

    LocalDate altDate;
    public void setAltDate(LocalDate planted,LocalDate watering) throws PlantsException {
        if (altDate.isAfter(watering)) {
            throw new PlantsException("Datum"+planted+"nesmí být drive nez datum"+watering);
        }
        LocalDate altDate=planted;
    }
    public LocalDate getAltDate()
        {return altDate;}
}


