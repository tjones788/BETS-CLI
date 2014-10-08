
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
    "name",
    "link",
    "description",
    "version",
    "features",
    "complexity",
    "reference"
})
public class Algorithm {

    @JsonProperty("name")
    private String name;
    @JsonProperty("link")
    private Link___ link;
    @JsonProperty("description")
    private String description;
    @JsonProperty("version")
    private String version;
    @JsonProperty("features")
    private String features;
    @JsonProperty("complexity")
    private String complexity;
    @JsonProperty("reference")
    private String reference;
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
    @JsonProperty("link")
    public Link___ getLink() {
        return link;
    }

    /**
     *
     * @param link
     */
    @JsonProperty("link")
    public void setLink(Link___ link) {
        this.link = link;
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
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     *
     * @param version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *
     * @return
     */
    @JsonProperty("features")
    public String getFeatures() {
        return features;
    }

    /**
     *
     * @param features
     */
    @JsonProperty("features")
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     *
     * @return
     */
    @JsonProperty("complexity")
    public String getComplexity() {
        return complexity;
    }

    /**
     *
     * @param complexity
     */
    @JsonProperty("complexity")
    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    /**
     *
     * @return
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     *
     * @param reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
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
