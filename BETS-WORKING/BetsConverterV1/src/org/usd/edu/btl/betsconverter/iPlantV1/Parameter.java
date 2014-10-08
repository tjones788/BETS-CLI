package org.usd.edu.btl.betsconverter.iPlantV1;

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
    "id",
    "defaultvalue",
    "value",
    "details",
    "semantics"
})
public class Parameter {

    @JsonProperty("id")
    private String id;
    @JsonProperty("defaultvalue")
    private String defaultvalue;
    @JsonProperty("value")
    private Value_ value;
    @JsonProperty("details")
    private Details_ details;
    @JsonProperty("semantics")
    private Semantics_ semantics;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @JsonProperty("defaultvalue")
    public String getDefaultvalue() {
        return defaultvalue;
    }

    /**
     *
     * @param defaultvalue
     */
    @JsonProperty("defaultvalue")
    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    /**
     *
     * @return
     */
    @JsonProperty("value")
    public Value_ getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Value_ value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    @JsonProperty("details")
    public Details_ getDetails() {
        return details;
    }

    /**
     *
     * @param details
     */
    @JsonProperty("details")
    public void setDetails(Details_ details) {
        this.details = details;
    }

    /**
     *
     * @return
     */
    @JsonProperty("semantics")
    public Semantics_ getSemantics() {
        return semantics;
    }

    /**
     *
     * @param semantics
     */
    @JsonProperty("semantics")
    public void setSemantics(Semantics_ semantics) {
        this.semantics = semantics;
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
