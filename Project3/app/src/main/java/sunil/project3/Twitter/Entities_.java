
package sunil.project3.Twitter;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Entities_ {

    @SerializedName("url")
    @Expose
    private Url_ url;
    @SerializedName("description")
    @Expose
    private Description description;

    /**
     * 
     * @return
     *     The url
     */
    public Url_ getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(Url_ url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

}
