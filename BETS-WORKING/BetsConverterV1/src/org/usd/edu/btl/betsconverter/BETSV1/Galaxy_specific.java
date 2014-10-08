
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
    "tool_type",
    "repo_contents",
    "repo_link",
    "repo_name",
    "repo_revision"
})
public class Galaxy_specific {

    @JsonProperty("tool_type")
    private String tool_type;
    @JsonProperty("repo_contents")
    private String repo_contents;
    @JsonProperty("repo_link")
    private String repo_link;
    @JsonProperty("repo_name")
    private String repo_name;
    @JsonProperty("repo_revision")
    private String repo_revision;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("tool_type")
    public String getTool_type() {
        return tool_type;
    }

    /**
     *
     * @param tool_type
     */
    @JsonProperty("tool_type")
    public void setTool_type(String tool_type) {
        this.tool_type = tool_type;
    }

    /**
     *
     * @return
     */
    @JsonProperty("repo_contents")
    public String getRepo_contents() {
        return repo_contents;
    }

    /**
     *
     * @param repo_contents
     */
    @JsonProperty("repo_contents")
    public void setRepo_contents(String repo_contents) {
        this.repo_contents = repo_contents;
    }

    /**
     *
     * @return
     */
    @JsonProperty("repo_link")
    public String getRepo_link() {
        return repo_link;
    }

    /**
     *
     * @param repo_link
     */
    @JsonProperty("repo_link")
    public void setRepo_link(String repo_link) {
        this.repo_link = repo_link;
    }

    /**
     *
     * @return
     */
    @JsonProperty("repo_name")
    public String getRepo_name() {
        return repo_name;
    }

    /**
     *
     * @param repo_name
     */
    @JsonProperty("repo_name")
    public void setRepo_name(String repo_name) {
        this.repo_name = repo_name;
    }

    /**
     *
     * @return
     */
    @JsonProperty("repo_revision")
    public String getRepo_revision() {
        return repo_revision;
    }

    /**
     *
     * @param repo_revision
     */
    @JsonProperty("repo_revision")
    public void setRepo_revision(String repo_revision) {
        this.repo_revision = repo_revision;
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
