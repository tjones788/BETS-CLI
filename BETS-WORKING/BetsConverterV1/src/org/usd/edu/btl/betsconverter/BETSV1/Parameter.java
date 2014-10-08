package org.usd.edu.btl.betsconverter.BETSV1;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author Tyler.Jones
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "value",
    "type",
    "label",
    "required",
    "default",
    "validator",
    "visible",
    "description",
    "constraint"
})
public class Parameter {

    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonProperty("type")
    private String type;
    @JsonProperty("label")
    private String label;
    @JsonProperty("required")
    private String required;
    @JsonProperty("default")
    private String _default;
    @JsonProperty("validator")
    private String validator;
    @JsonProperty("visible")
    private String visible;
    @JsonProperty("description")
    private String description;
    @JsonProperty("constraint")
    private List<Constraint> constraint;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

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
    @JsonProperty("required")
    public String getRequired() {
        return required;
    }

    /**
     *
     * @param required
     */
    @JsonProperty("required")
    public void setRequired(String required) {
        this.required = required;
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
    @JsonProperty("visible")
    public String getVisible() {
        return visible;
    }

    /**
     *
     * @param visible
     */
    @JsonProperty("visible")
    public void setVisible(String visible) {
        this.visible = visible;
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
    @JsonProperty("constraint")
    public List<Constraint> getConstraint() {
        return constraint;
    }

    /**
     *
     * @param constraint
     */
    @JsonProperty("constraint")
    public void setConstraint(List<Constraint> constraint) {
        this.constraint = constraint;
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
