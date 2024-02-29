package app;

/**
 * Class represeting a Movie from the Movies database
 * For simplicity this uses public fields
 * You could use private fields with getters to be safer
 *
 * @author Timothy Wiley, 2023. email: timothy.wiley@rmit.edu.au
 */
public class Country {
   // Movie id
   public String code;

   // Movie name
   public String name;

   /**
    * Create a movie withou setting any of the fields,
    * Fields will have default "empty" values
    */
   public Country() { }

   /**
    * Create a movie setting all of the fields
    */
   public Country(String code, String name) {
      this.code = code;
      this.name = name;
   }
}
