package org.usd.edu.btl.betsconverter.BETSV1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;

/**
 *
 * @author Tyler.Jones
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "id",
    "path"
})
public class BLD_categories {

    @JsonProperty("category_name")
    private String name;
    @JsonProperty("category_id")
    private int id;
    @JsonProperty("category_path")
    private String path;

    /**
     *
     * @return
     */
    @JsonProperty("category_name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    @JsonProperty("category_name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @JsonProperty("category_id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    @JsonProperty("category_id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @JsonProperty("category_path")
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     */
    @JsonProperty("category_path")
    public void setPath(String path) {
        this.path = path;
    }
    
    

}
