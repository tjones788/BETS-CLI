
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
    "category_id",
    "category_name",
    "category_path"
})
public class Category {

    @JsonProperty("category_id")
    private Integer category_id;
    @JsonProperty("category_name")
    private String category_name;
    @JsonProperty("category_path")
    private String category_path;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("category_id")
    public Integer getCategory_id() {
        return category_id;
    }

    /**
     *
     * @param category_id
     */
    @JsonProperty("category_id")
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    /**
     *
     * @return
     */
    @JsonProperty("category_name")
    public String getCategory_name() {
        return category_name;
    }

    /**
     *
     * @param category_name
     */
    @JsonProperty("category_name")
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    /**
     *
     * @return
     */
    @JsonProperty("category_path")
    public String getCategory_path() {
        return category_path;
    }

    /**
     *
     * @param category_path
     */
    @JsonProperty("category_path")
    public void setCategory_path(String category_path) {
        this.category_path = category_path;
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
