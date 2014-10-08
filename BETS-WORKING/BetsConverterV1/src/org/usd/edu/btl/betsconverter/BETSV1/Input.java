
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

/**
 *
 * @author Tyler.Jones
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "description",
    "format",
    "name",
    "label",
    "type",
    "constraint",
    "validator",
    "default",
    "required",
    "ontology_uri",
    "visible"
})
public class Input {

    @JsonProperty("description")
    private String description;
    @JsonProperty("format")
    private String format;
    @JsonProperty("name")
    private String name;
    @JsonProperty("label")
    private String label;
    @JsonProperty("type")
    private String type;
    @JsonProperty("constraint")
    private List<Constraint> constraint = new ArrayList<Constraint>();
    @JsonProperty("validator")
    private String validator;
    @JsonProperty("default")
    private String _default;
    @JsonProperty("required")
    private Boolean required;
    @JsonProperty("ontology_uri")
    private String ontology_uri;
    @JsonProperty("visible")
    private Boolean visible;
     
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     *
     * @param format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

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
    @JsonProperty("ontology_uri")
    public String getOntology_uri() {
        return ontology_uri;
    }

    /**
     *
     * @param ontology_uri
     */
    @JsonProperty("ontology_uri")
    public void setOntology_uri(String ontology_uri) {
        this.ontology_uri = ontology_uri;
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
