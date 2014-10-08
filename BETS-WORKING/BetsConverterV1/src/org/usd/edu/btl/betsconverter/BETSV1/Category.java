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
    "name",
    "id",
    "path",
    "application",
    "domain",
    "method",
    "format",
    "ngs_provider",
    "sequence_platform",
    "reference"
})
public class Category {

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("path")
    private String path;
    @JsonProperty("application")
    private List<Application> application = new ArrayList<Application>();
    @JsonProperty("domain")
    private List<Domain> domain = new ArrayList<Domain>();
    @JsonProperty("method")
    private List<Method> method = new ArrayList<Method>();
    @JsonProperty("format")
    private Format format;
    @JsonProperty("ngs_provider")
    private Ngs_provider ngs_provider;
    @JsonProperty("sequence_platform")
    private Sequence_platform sequence_platform;
    @JsonProperty("reference")
    private Reference_ reference;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

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
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     */
    @JsonProperty("application")
    public List<Application> getApplication() {
        return application;
    }

    /**
     *
     * @param application
     */
    @JsonProperty("application")
    public void setApplication(List<Application> application) {
        this.application = application;
    }

    /**
     *
     * @return
     */
    @JsonProperty("domain")
    public List<Domain> getDomain() {
        return domain;
    }

    /**
     *
     * @param domain
     */
    @JsonProperty("domain")
    public void setDomain(List<Domain> domain) {
        this.domain = domain;
    }

    /**
     *
     * @return
     */
    @JsonProperty("method")
    public List<Method> getMethod() {
        return method;
    }

    /**
     *
     * @param method
     */
    @JsonProperty("method")
    public void setMethod(List<Method> method) {
        this.method = method;
    }

    /**
     *
     * @return
     */
    @JsonProperty("format")
    public Format getFormat() {
        return format;
    }

    /**
     *
     * @param format
     */
    @JsonProperty("format")
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     *
     * @return
     */
    @JsonProperty("ngs_provider")
    public Ngs_provider getNgs_provider() {
        return ngs_provider;
    }

    /**
     *
     * @param ngs_provider
     */
    @JsonProperty("ngs_provider")
    public void setNgs_provider(Ngs_provider ngs_provider) {
        this.ngs_provider = ngs_provider;
    }

    /**
     *
     * @return
     */
    @JsonProperty("sequence_platform")
    public Sequence_platform getSequence_platform() {
        return sequence_platform;
    }

    /**
     *
     * @param sequence_platform
     */
    @JsonProperty("sequence_platform")
    public void setSequence_platform(Sequence_platform sequence_platform) {
        this.sequence_platform = sequence_platform;
    }

    /**
     *
     * @return
     */
    @JsonProperty("reference")
    public Reference_ getReference() {
        return reference;
    }

    /**
     *
     * @param reference
     */
    @JsonProperty("reference")
    public void setReference(Reference_ reference) {
        this.reference = reference;
    }

    /**
     *
     * @return
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
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
