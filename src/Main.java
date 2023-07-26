public class Main {
    public static void main (String[] args) {

        PlantsManager plantsManager = new PlantsManager();
        try {
            plantsManager.loadDataFromFile(Settings.filename(), Settings.delimiter());

            } catch (PlantsException e)
                {

                    {
                        System.err.println("Nebyl nalezen pozadovany soubor " + e.getLocalizedMessage());
                    }

               } catch (Plants e)
        {
            throw new RuntimeException(e); //Chce to Runtime ne Plants -nejde, ale aspon bey chyb
        }
}
}