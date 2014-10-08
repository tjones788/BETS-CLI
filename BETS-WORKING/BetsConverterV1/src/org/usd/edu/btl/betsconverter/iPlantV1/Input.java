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
    "details",
    "semantics",
    "defaultvalue",
    "value"
})
public class Input {

    @JsonProperty("id")
    private String id;
    
    @JsonProperty("details")
    private Details details;
    
    @JsonProperty("semantics")
    private Semantics semantics;
    
    @JsonProperty("defaultvalue")
    private String defaultvalue;
    
    @JsonProperty("value")
    private Value value;
    
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
    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    /**
     *
     * @param details
     */
    @JsonProperty("details")
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     *
     * @return
     */
    @JsonProperty("semantics")
    public Semantics getSemantics() {
        return semantics;
    }

    /**
     *
     * @param semantics
     */
    @JsonProperty("semantics")
    public void setSemantics(Semantics semantics) {
        this.semantics = semantics;
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
    public Value getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
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
