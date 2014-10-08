
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
    "synonyms",
    "definitions",
    "id",
    "created_in"
})
public class Domain {

    @JsonProperty("name")
    private String name;
    @JsonProperty("synonyms")
    private String synonyms;
    @JsonProperty("definitions")
    private String definitions;
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_in")
    private String created_in;
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
    @JsonProperty("synonyms")
    public String getSynonyms() {
        return synonyms;
    }

    /**
     *
     * @param synonyms
     */
    @JsonProperty("synonyms")
    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    /**
     *
     * @return
     */
    @JsonProperty("definitions")
    public String getDefinitions() {
        return definitions;
    }

    /**
     *
     * @param definitions
     */
    @JsonProperty("definitions")
    public void setDefinitions(String definitions) {
        this.definitions = definitions;
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
    @JsonProperty("created_in")
    public String getCreated_in() {
        return created_in;
    }

    /**
     *
     * @param created_in
     */
    @JsonProperty("created_in")
    public void setCreated_in(String created_in) {
        this.created_in = created_in;
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
