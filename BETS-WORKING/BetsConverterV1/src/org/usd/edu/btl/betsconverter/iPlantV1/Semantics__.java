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
    "fileTypes",
    "maxCardinality",
    "minCardinality",
    "ontology"
})
public class Semantics__ {

    @JsonProperty("fileTypes")
    private List<String> fileTypes = new ArrayList<String>();
    @JsonProperty("maxCardinality")
    private Integer maxCardinality;
    @JsonProperty("minCardinality")
    private Integer minCardinality;
    @JsonProperty("ontology")
    private List<String> ontology = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("fileTypes")
    public List<String> getFileTypes() {
        return fileTypes;
    }

    /**
     *
     * @param fileTypes
     */
    @JsonProperty("fileTypes")
    public void setFileTypes(List<String> fileTypes) {
        this.fileTypes = fileTypes;
    }

    /**
     *
     * @return
     */
    @JsonProperty("maxCardinality")
    public Integer getMaxCardinality() {
        return maxCardinality;
    }

    /**
     *
     * @param maxCardinality
     */
    @JsonProperty("maxCardinality")
    public void setMaxCardinality(Integer maxCardinality) {
        this.maxCardinality = maxCardinality;
    }

    /**
     *
     * @return
     */
    @JsonProperty("minCardinality")
    public Integer getMinCardinality() {
        return minCardinality;
    }

    /**
     *
     * @param minCardinality
     */
    @JsonProperty("minCardinality")
    public void setMinCardinality(Integer minCardinality) {
        this.minCardinality = minCardinality;
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
