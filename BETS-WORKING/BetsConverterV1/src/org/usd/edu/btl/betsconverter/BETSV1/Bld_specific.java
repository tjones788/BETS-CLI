package org.usd.edu.btl.betsconverter.BETSV1;

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
import org.usd.edu.btl.betsconverter.BLDV1.Journal;
import org.usd.edu.btl.betsconverter.BLDV1.Set;

/**
 *
 * @author Tyler.Jones
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "journals",
    "related_links",
    "set",
    "categories",
    "tags"
})
public class Bld_specific {

    @JsonProperty("journals")
    private List<Journal> journals = new ArrayList<>();
    @JsonProperty("related_links")
    private List<Related_link> related_links = new ArrayList<Related_link>();
    @JsonProperty("sets")
    private List<Set> sets;
    @JsonProperty("categories")
    private List<BLD_categories> categories;
    @JsonProperty("tags")
    private List<BLD_tags> tags;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public List<Related_link> getRelated_links() {
        return related_links;
    }

    /**
     *
     * @param related_links
     */
    @JsonProperty("related_links")
    public void setRelated_links(List<Related_link> related_links) {
        this.related_links = related_links;
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
     * @param set
     */
    @JsonProperty("sets")
    public void setSets(List<Set> set) {
        this.sets = set;
    }

    /**
     *
     * @return
     */
    @JsonProperty("categories")
    public List<BLD_categories> getCategories() {
        return categories;
    }

    /**
     *
     * @param categories
     */
    @JsonProperty("categories")
    public void setCategories(List<BLD_categories> categories) {
        this.categories = categories;
    }

    /**
     *
     * @return
     */
    @JsonProperty("tags")
    public List<BLD_tags> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    @JsonProperty("tags")
    public void setTags(List<BLD_tags> tags) {
        this.tags = tags;
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
