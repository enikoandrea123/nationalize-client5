package nationalize;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@lombok.Data
public class Nationality {
    /**
     * Stores the possible countries of origin for a last name.
     *
     * @param count the number of rows examined
     * @param name a last name for which the possible countries of origin are
     *             predicted
     * @param countries a list of the most likely countries of origin
     */

    private long count;
    private String name;

    @SerializedName("country")
    private List<Country> countries;

    @lombok.Data
/**
 * Associates a probability with a country of origin.
 *
 * @param countryId a two-letter country code
 * @param probability a number between 0 and 1
 */
    public static class Country {
        private String countryId;
        private float probability;
    }

}
