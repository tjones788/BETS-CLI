package org.usd.edu.btl.betsconverter.BETSV1;

import java.util.HashMap;
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
    "hits",
    "cited",
    "references",
    "art_size",
    "art_score"
})
public class Seq_specific {

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
    public Integer getHits() {
        return hits;
    }

    /**
     *
     * @param hits
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     *
     * @return
     */
    public Integer getCited() {
        return cited;
    }

    /**
     *
     * @param cited
     */
    public void setCited(Integer cited) {
        this.cited = cited;
    }

    /**
     *
     * @return
     */
    public Integer getReferences() {
        return references;
    }

    /**
     *
     * @param references
     */
    public void setReferences(Integer references) {
        this.references = references;
    }

    /**
     *
     * @return
     */
    public Integer getArt_size() {
        return art_size;
    }

    /**
     *
     * @param art_size
     */
    public void setArt_size(Integer art_size) {
        this.art_size = art_size;
    }

    /**
     *
     * @return
     */
    public Integer getArt_score() {
        return art_score;
    }

    /**
     *
     * @param art_score
     */
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
