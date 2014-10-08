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
    "format",
    "value",
    "type",
    "file",
    "filter",
    "quality",
    "constraint"
})
public class Output {

    @JsonProperty("name")
    private String name;
    @JsonProperty("format")
    private String format;
    @JsonProperty("value")
    private String value;
    @JsonProperty("type")
    private String type;
    @JsonProperty("file")
    private String file;
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("quality")
    private Quality quality;
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
    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    /**
     *
     * @param file
     */
    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    /**
     *
     * @return
     */
    @JsonProperty("filter")
    public String getFilter() {
        return filter;
    }

    /**
     *
     * @param filter
     */
    @JsonProperty("filter")
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     *
     * @return
     */
    @JsonProperty("quality")
    public Quality getQuality() {
        return quality;
    }

    /**
     *
     * @param quality
     */
    @JsonProperty("quality")
    public void setQuality(Quality quality) {
        this.quality = quality;
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
