import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Plants extends Throwable {

    private String name;
    private String notes; //poznámky
    private  LocalDate planted; //kdy byla rostlina zasazena
    private  LocalDate watering; //kdy byla naposledy rostlina zalita
    private int frequencyOfWatering; //frekvence zalevani ve dnech

    public Plants (String name, String notes, LocalDate planted, LocalDate watering, int frequencyOfWatering) {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
    }


    public Plants (String name, LocalDate planted, int frequencyOfWatering){
        this(name,"" ,planted,LocalDate.now(),frequencyOfWatering);
    }


    public Plants (String name){
        this(name,"",LocalDate.now(),LocalDate.now(),7);
    }



    public String getName () {
        return name;
    }

    public void setName () {
        this.name = name;
    }

    public String getNotes () {
        return notes;
    }

    public void setNotes (String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted () {
        return planted;
    }

    public void setPlanted (LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering () {
        return watering;
    }

    public void setWatering (LocalDate watering) {
        this.watering = watering;
    }

    public int getFrequencyOfWatering () {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering (int frequencyOfWatering) {
        this.frequencyOfWatering = frequencyOfWatering;
    }




    // Metoda getWateringInfo() - vrati nazev kvetiny, datum posledni zalivky a datum doporucené denní zalivky
    List<Plants>plantsList=new ArrayList<>();
    public static void getWateringInfo(String name, LocalDate watering, int frequencyOfWatering ){}


    public void getWateringInfo() {
        this.name=name;
        this.watering=watering;
        this.frequencyOfWatering=frequencyOfWatering;
    }

    // Nevim jestli jsem spravně pochopil, takto nebo pomoci toStringu by to mohlo fungovat

    @Override
    public String toString () {
        return "Plants{" +
                "notes='" + notes + '\'' +
                ", watering=" + watering +
                ", frequencyOfWatering=" + frequencyOfWatering +
                '}';
    }
}

