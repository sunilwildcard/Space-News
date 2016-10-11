
package sunil.project3.NPR;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Story {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("link")
    @Expose
    private List<Link_> link = new ArrayList<Link_>();
    @SerializedName("title")
    @Expose
    private Title_ title;
    @SerializedName("storyDate")
    @Expose
    private StoryDate storyDate;
    @SerializedName("text")
    @Expose
    private Text text;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The link
     */
    public List<Link_> getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(List<Link_> link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Title_ getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title_ title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The storyDate
     */
    public StoryDate getStoryDate() {
        return storyDate;
    }

    /**
     * 
     * @param storyDate
     *     The storyDate
     */
    public void setStoryDate(StoryDate storyDate) {
        this.storyDate = storyDate;
    }

    /**
     * 
     * @return
     *     The text
     */
    public Text getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(Text text) {
        this.text = text;
    }

}
