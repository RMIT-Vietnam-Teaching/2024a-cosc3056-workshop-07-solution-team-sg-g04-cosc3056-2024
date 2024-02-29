package app;

/**
 * Class represeting a Movie from the Movies database
 * For simplicity this uses public fields
 * You could use private fields with getters to be safer
 *
 * @author Timothy Wiley, 2023. email: timothy.wiley@rmit.edu.au
 */
public class City {
   // Movie id
   public String name;

   // Movie name
   public int population;

   /**
    * Create a movie withou setting any of the fields,
    * Fields will have default "empty" values
    */
   public City() { }

   /**
    * Create a movie setting all of the fields
    */
   public City(String name, int population) {
      this.name = name;
      this.population = population;
   }
}
