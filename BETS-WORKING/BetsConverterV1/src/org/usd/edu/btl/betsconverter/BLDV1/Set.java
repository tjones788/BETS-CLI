
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
    "set_id",
    "set_name"
})
public class Set {

    @JsonProperty("set_id")
    private String set_id;
    @JsonProperty("set_name")
    private String set_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("set_id")
    public String getSet_id() {
        return set_id;
    }

    /**
     *
     * @param set_id
     */
    @JsonProperty("set_id")
    public void setSet_id(String set_id) {
        this.set_id = set_id;
    }

    /**
     *
     * @return
     */
    @JsonProperty("set_name")
    public String getSet_name() {
        return set_name;
    }

    /**
     *
     * @param set_name
     */
    @JsonProperty("set_name")
    public void setSet_name(String set_name) {
        this.set_name = set_name;
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
