package nationalize;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@lombok.Data
public class Nationality {

    private long count;
    private String name;

    @SerializedName("country")
    private List<Country> countries;
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
    }

    @lombok.Data
    public static class Country {
        private String countryId;
        private float probability;
        @Override
        public String toString() {
            return ReflectionToStringBuilder.toString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
        }
    }

}
