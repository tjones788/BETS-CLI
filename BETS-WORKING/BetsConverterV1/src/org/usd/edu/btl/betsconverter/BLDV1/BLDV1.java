
package org.usd.edu.btl.betsconverter.BLDV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author Tyler.Jones
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "url",
    "url_linksdir",
    "title",
    "description",
    "twitter",
    "wikipedia",
    "pmids",
    "categories",
    "journals",
    "related_links",
    "tags",
    "sets"
})
public class BLDV1 {

    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;
    @JsonProperty("url_linksdir")
    private String url_linksdir;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("wikipedia")
    private String wikipedia;
    @JsonProperty("pmids")
    private List<String> pmids = new ArrayList<String>();
    @JsonProperty("categories")
    private List<Category> categories = new ArrayList<Category>();
    @JsonProperty("journals")
    private List<Journal> journals = new ArrayList<Journal>();
    @JsonProperty("related_links")
    private List<String> related_links = new ArrayList<String>();
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("sets")
    private List<Set> sets = new ArrayList<Set>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    @JsonProperty("url_linksdir")
    public String getUrl_linksdir() {
        return url_linksdir;
    }

    /**
     *
     * @param url_linksdir
     */
    @JsonProperty("url_linksdir")
    public void setUrl_linksdir(String url_linksdir) {
        this.url_linksdir = url_linksdir;
    }

    /**
     *
     * @return
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     *
     * @param twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     *
     * @return
     */
    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    /**
     *
     * @param wikipedia
     */
    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    /**
     *
     * @return
     */
    @JsonProperty("pmids")
    public List<String> getPmids() {
        return pmids;
    }

    /**
     *
     * @param pmids
     */
    @JsonProperty("pmids")
    public void setPmids(List<String> pmids) {
        this.pmids = pmids;
    }

    /**
     *
     * @return
     */
    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    /**
     *
     * @param categories
     */
    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     *
     * @return
     */
    @JsonProperty("journals")
    public List<Journal> getJournals() {
        return journals;
    }

    /**
     *
     * @param journals
     */
    @JsonProperty("journals")
    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }

    /**
     *
     * @return
     */
    @JsonProperty("related_links")
    public List<String> getRelated_links() {
        return related_links;
    }

    /**
     *
     * @param related_links
     */
    @JsonProperty("related_links")
    public void setRelated_links(List<String> related_links) {
        this.related_links = related_links;
    }

    /**
     *
     * @return
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     */
    @JsonProperty("sets")
    public List<Set> getSets() {
        return sets;
    }

    /**
     *
     * @param sets
     */
    @JsonProperty("sets")
    public void setSets(List<Set> sets) {
        this.sets = sets;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     *
     * @return
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     *
     * @param name
     * @param value
     */
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
