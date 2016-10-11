
package sunil.project3.Twitter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Medium__ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("indices")
    @Expose
    private List<Integer> indices = new ArrayList<Integer>();
    @SerializedName("media_url")
    @Expose
    private String mediaUrl;
    @SerializedName("media_url_https")
    @Expose
    private String mediaUrlHttps;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("expanded_url")
    @Expose
    private String expandedUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sizes")
    @Expose
    private Sizes_ sizes;
    @SerializedName("source_status_id")
    @Expose
    private Integer sourceStatusId;
    @SerializedName("source_status_id_str")
    @Expose
    private String sourceStatusIdStr;
    @SerializedName("source_user_id")
    @Expose
    private Integer sourceUserId;
    @SerializedName("source_user_id_str")
    @Expose
    private String sourceUserIdStr;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The idStr
     */
    public String getIdStr() {
        return idStr;
    }

    /**
     * 
     * @param idStr
     *     The id_str
     */
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     * 
     * @return
     *     The indices
     */
    public List<Integer> getIndices() {
        return indices;
    }

    /**
     * 
     * @param indices
     *     The indices
     */
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    /**
     * 
     * @return
     *     The mediaUrl
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * 
     * @param mediaUrl
     *     The media_url
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * 
     * @return
     *     The mediaUrlHttps
     */
    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    /**
     * 
     * @param mediaUrlHttps
     *     The media_url_https
     */
    public void setMediaUrlHttps(String mediaUrlHttps) {
        this.mediaUrlHttps = mediaUrlHttps;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The displayUrl
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * 
     * @param displayUrl
     *     The display_url
     */
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    /**
     * 
     * @return
     *     The expandedUrl
     */
    public String getExpandedUrl() {
        return expandedUrl;
    }

    /**
     * 
     * @param expandedUrl
     *     The expanded_url
     */
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The sizes
     */
    public Sizes_ getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes
     *     The sizes
     */
    public void setSizes(Sizes_ sizes) {
        this.sizes = sizes;
    }

    /**
     * 
     * @return
     *     The sourceStatusId
     */
    public Integer getSourceStatusId() {
        return sourceStatusId;
    }

    /**
     * 
     * @param sourceStatusId
     *     The source_status_id
     */
    public void setSourceStatusId(Integer sourceStatusId) {
        this.sourceStatusId = sourceStatusId;
    }

    /**
     * 
     * @return
     *     The sourceStatusIdStr
     */
    public String getSourceStatusIdStr() {
        return sourceStatusIdStr;
    }

    /**
     * 
     * @param sourceStatusIdStr
     *     The source_status_id_str
     */
    public void setSourceStatusIdStr(String sourceStatusIdStr) {
        this.sourceStatusIdStr = sourceStatusIdStr;
    }

    /**
     * 
     * @return
     *     The sourceUserId
     */
    public Integer getSourceUserId() {
        return sourceUserId;
    }

    /**
     * 
     * @param sourceUserId
     *     The source_user_id
     */
    public void setSourceUserId(Integer sourceUserId) {
        this.sourceUserId = sourceUserId;
    }

    /**
     * 
     * @return
     *     The sourceUserIdStr
     */
    public String getSourceUserIdStr() {
        return sourceUserIdStr;
    }

    /**
     * 
     * @param sourceUserIdStr
     *     The source_user_id_str
     */
    public void setSourceUserIdStr(String sourceUserIdStr) {
        this.sourceUserIdStr = sourceUserIdStr;
    }

}
