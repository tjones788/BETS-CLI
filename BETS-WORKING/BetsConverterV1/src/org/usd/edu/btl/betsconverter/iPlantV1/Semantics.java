package org.usd.edu.btl.betsconverter.iPlantV1;

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
    "mincardinality",
    "ontology",
    "filetypes"
})
public class Semantics {

    @JsonProperty("minCardinality")
    private Integer mincardinality;
    @JsonProperty("maxCardinality")
    private Integer maxcardinality;
    @JsonProperty("ontology")
    private List<String> ontology = new ArrayList<String>();
    @JsonProperty("fileTypes")
    private List<String> filetypes = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("minCardinality")
    public Integer getMincardinality() {
        return mincardinality;
    }

    /**
     *
     * @param mincardinality
     */
    @JsonProperty("minCardinality")
    public void setMincardinality(Integer mincardinality) {
        this.mincardinality = mincardinality;
    }

    /**
     *
     * @return
     */
    @JsonProperty("maxCardinality")
    public Integer getMaxcardinality() {
        return maxcardinality;
    }

    /**
     *
     * @param maxcardinality
     */
    @JsonProperty("maxCardinality")
    public void setMaxcardinality(Integer maxcardinality) {
        this.maxcardinality = maxcardinality;
    }
    
    /**
     *
     * @return
     */
    @JsonProperty("ontology")
    public List<String> getOntology() {
        return ontology;
    }

    /**
     *
     * @param ontology
     */
    @JsonProperty("ontology")
    public void setOntology(List<String> ontology) {
        this.ontology = ontology;
    }

    /**
     *
     * @return
     */
    @JsonProperty("fileTypes")
    public List<String> getFiletypes() {
        return filetypes;
    }

    /**
     *
     * @param filetypes
     */
    @JsonProperty("fileTypes")
    public void setFiletypes(List<String> filetypes) {
        this.filetypes = filetypes;
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
