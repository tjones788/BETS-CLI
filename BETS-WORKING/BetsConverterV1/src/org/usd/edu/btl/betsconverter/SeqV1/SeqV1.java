
package org.usd.edu.btl.betsconverter.SeqV1;

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
    "label",
    "summary",
    "bio_tags",
    "meth_tags",
    "language",
    "os",
    "hits",
    "cited",
    "references",
    "art_size",
    "art_score"
})
public class SeqV1 {

    @JsonProperty("label")
    private String label;
    @JsonProperty("summary")
    private List<String> summary = new ArrayList<String>();
    @JsonProperty("bio_tags")
    private List<String> bio_tags = new ArrayList<String>();
    @JsonProperty("meth_tags")
    private List<String> meth_tags = new ArrayList<String>();
    @JsonProperty("language")
    private List<String> language = new ArrayList<String>();
    @JsonProperty("os")
    private List<String> os = new ArrayList<String>();
    @JsonProperty("hits")
    private Integer hits;
    @JsonProperty("cited")
    private Integer cited;
    @JsonProperty("references")
    private Integer references;
    @JsonProperty("art_size")
    private Integer art_size;
    @JsonProperty("art_score")
    private Integer art_score;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     *
     * @return
     */
    @JsonProperty("summary")
    public List<String> getSummary() {
        return summary;
    }

    /**
     *
     * @param summary
     */
    @JsonProperty("summary")
    public void setSummary(List<String> summary) {
        this.summary = summary;
    }

    /**
     *
     * @return
     */
    @JsonProperty("bio_tags")
    public List<String> getBio_tags() {
        return bio_tags;
    }

    /**
     *
     * @param bio_tags
     */
    @JsonProperty("bio_tags")
    public void setBio_tags(List<String> bio_tags) {
        this.bio_tags = bio_tags;
    }

    /**
     *
     * @return
     */
    @JsonProperty("meth_tags")
    public List<String> getMeth_tags() {
        return meth_tags;
    }

    /**
     *
     * @param meth_tags
     */
    @JsonProperty("meth_tags")
    public void setMeth_tags(List<String> meth_tags) {
        this.meth_tags = meth_tags;
    }

    /**
     *
     * @return
     */
    @JsonProperty("language")
    public List<String> getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    /**
     *
     * @return
     */
    @JsonProperty("os")
    public List<String> getOs() {
        return os;
    }

    /**
     *
     * @param os
     */
    @JsonProperty("os")
    public void setOs(List<String> os) {
        this.os = os;
    }

    /**
     *
     * @return
     */
    @JsonProperty("hits")
    public Integer getHits() {
        return hits;
    }

    /**
     *
     * @param hits
     */
    @JsonProperty("hits")
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     *
     * @return
     */
    @JsonProperty("cited")
    public Integer getCited() {
        return cited;
    }

    /**
     *
     * @param cited
     */
    @JsonProperty("cited")
    public void setCited(Integer cited) {
        this.cited = cited;
    }

    /**
     *
     * @return
     */
    @JsonProperty("references")
    public Integer getReferences() {
        return references;
    }

    /**
     *
     * @param references
     */
    @JsonProperty("references")
    public void setReferences(Integer references) {
        this.references = references;
    }

    /**
     *
     * @return
     */
    @JsonProperty("art_size")
    public Integer getArt_size() {
        return art_size;
    }

    /**
     *
     * @param art_size
     */
    @JsonProperty("art_size")
    public void setArt_size(Integer art_size) {
        this.art_size = art_size;
    }

    /**
     *
     * @return
     */
    @JsonProperty("art_score")
    public Integer getArt_score() {
        return art_score;
    }

    /**
     *
     * @param art_score
     */
    @JsonProperty("art_score")
    public void setArt_score(Integer art_score) {
        this.art_score = art_score;
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
