
package sunil.project3.Twitter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ExtendedEntities_ {

    @SerializedName("media")
    @Expose
    private List<Medium______> media = new ArrayList<Medium______>();

    /**
     * 
     * @return
     *     The media
     */
    public List<Medium______> getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(List<Medium______> media) {
        this.media = media;
    }

}
