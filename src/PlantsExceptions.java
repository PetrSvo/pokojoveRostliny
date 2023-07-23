import java.time.LocalDate;


public class PlantsExceptions extends Throwable { //neni mi jasný proc nefunguje jako potomek Exceptions
    public PlantsExceptions(String message) {
        super(message);} //mělo by uložit chybova hlaseni



    int frequencyNull; //vyjímka - čislo zalevání 0 nebo zaporná


    //Metoda ošetřeni vyjimky pro zadaní čísla zalivky 0 a záporné
    public void setFrequencyNull (int frequencyOfWatering) throws PlantsExceptions {
        if (frequencyOfWatering < 1) {
            throw new PlantsExceptions("Frekvence zalevani nesmi byt " + frequencyOfWatering);
        }
        int frequencyNull = frequencyOfWatering;
    }

    //Takto by to mělo jít jednodušeji přímo se setrem
    public  void setFrequencyOfWatering (int frequencyOfWatering) throws PlantsExceptions {
        if (frequencyOfWatering<1){
            throw  new PlantsExceptions("Frekvence zalevani nesmi byt " + frequencyOfWatering);
        } int setFrequencyOfWatering= frequencyOfWatering;
    }
    public int getFrequencyNull() {return frequencyNull;}

    //Metoda  vyjimky, aby datum poslední zalivky nebo starsi nez datum zasazeni

    LocalDate altDate;
    public void setAltDate(LocalDate planted,LocalDate watering) throws PlantsExceptions {
        if (altDate.isAfter(watering)) {
            throw new PlantsExceptions("Datum"+planted+"nesmí být drive nez datum"+watering);
        }
        LocalDate altDate=planted;
    }

    //jednodušeji se setrem
    public void setPlanted(LocalDate planted,LocalDate watering) throws PlantsExceptions {
        if (planted.isAfter(watering)) {
            throw new PlantsExceptions("Datum"+planted+"nesmí být drive nez datum"+watering);
        }
        LocalDate setPlanted =planted;
    }

    public LocalDate getAltDate()
    {return altDate;}
}


