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
    "validator",
    "default",
    "visible",
    "required"
})
public class Value {

    @JsonProperty("validator")
    private String validator;
    @JsonProperty("default")
    private String _default;
    @JsonProperty("visible")
    private Boolean visible;
    @JsonProperty("required")
    private Boolean required;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("validator")
    public String getValidator() {
        return validator;
    }

    /**
     *
     * @param validator
     */
    @JsonProperty("validator")
    public void setValidator(String validator) {
        this.validator = validator;
    }

    /**
     *
     * @return
     */
    @JsonProperty("default")
    public String getDefault() {
        return _default;
    }

    /**
     *
     * @param _default
     */
    @JsonProperty("default")
    public void setDefault(String _default) {
        this._default = _default;
    }

    /**
     *
     * @return
     */
    @JsonProperty("visible")
    public Boolean getVisible() {
        return visible;
    }

    /**
     *
     * @param visible
     */
    @JsonProperty("visible")
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     *
     * @return
     */
    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    /**
     *
     * @param required
     */
    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
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
