
package sunil.project3.NPR;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Teaser {

    @SerializedName("$text")
    @Expose
    private String $text;

    /**
     * 
     * @return
     *     The $text
     */
    public String get$text() {
        return $text;
    }

    /**
     * 
     * @param $text
     *     The $text
     */
    public void set$text(String $text) {
        this.$text = $text;
    }

}
