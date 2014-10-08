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
    "defaultValue",
    "details",
    "id",
    "semantics",
    "value"
})
public class Output {

    @JsonProperty("defaultvalue")
    private String defaultValue;
    @JsonProperty("details")
    private Details__ details;
    @JsonProperty("id")
    private String id;
    @JsonProperty("semantics")
    private Semantics__ semantics;
    @JsonProperty("value")
    private Value__ value;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("defaultvalue")
    public String getDefaultvalue() {
        return defaultValue;
    }

    /**
     *
     * @param defaultValue
     */
    @JsonProperty("defaultvalue")
    public void setDefaultvalue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     *
     * @return
     */
    @JsonProperty("details")
    public Details__ getDetails() {
        return details;
    }

    /**
     *
     * @param details
     */
    @JsonProperty("details")
    public void setDetails(Details__ details) {
        this.details = details;
    }

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
    @JsonProperty("semantics")
    public Semantics__ getSemantics() {
        return semantics;
    }

    /**
     *
     * @param semantics
     */
    @JsonProperty("semantics")
    public void setSemantics(Semantics__ semantics) {
        this.semantics = semantics;
    }

    /**
     *
     * @return
     */
    @JsonProperty("value")
    public Value__ getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Value__ value) {
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
