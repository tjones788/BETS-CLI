
package org.usd.edu.btl.betsconverter.BLDV1;

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
    "tag_id",
    "tag_name"
})
public class Tag {

    @JsonProperty("tag_id")
    private String tag_id;
    @JsonProperty("tag_name")
    private String tag_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("tag_id")
    public String getTag_id() {
        return tag_id;
    }

    /**
     *
     * @param tag_id
     */
    @JsonProperty("tag_id")
    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    /**
     *
     * @return
     */
    @JsonProperty("tag_name")
    public String getTag_name() {
        return tag_name;
    }

    /**
     *
     * @param tag_name
     */
    @JsonProperty("tag_name")
    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.tag_id.toString();
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
