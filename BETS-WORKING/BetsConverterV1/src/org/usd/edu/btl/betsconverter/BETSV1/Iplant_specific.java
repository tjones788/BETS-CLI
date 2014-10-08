package org.usd.edu.btl.betsconverter.BETSV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
    "ontology",
    "executionHost",
    "executionType",
    "deploymentPath",
    "templatePath",
    "testPath",
    "checkpointable",
    "modules"
})
public class Iplant_specific {

    @JsonProperty("ontology")
    private List<String> ontology;
    @JsonProperty("executionHost")
    private String executionHost;
    @JsonProperty("executionType")
    private String executionType;
    @JsonProperty("deploymentPath")
    private String deploymentPath;
    @JsonProperty("templatePath")
    private String templatePath;
    @JsonProperty("testPath")
    private String testPath;
    @JsonProperty("checkpointable")
    private String checkpointable;
    @JsonProperty("modules")
    private List<String> modules = new ArrayList<String>();

    @JsonProperty("defaultprocessors")
    private String defaultprocessors;

    @JsonProperty("defaultmemory")
    private String defaultmemory;

    @JsonProperty("defaultrequestedtime")
    private String defaultrequestedtime;
    


    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     */
    @JsonProperty("ontology")
    public List<String> getOntology() {
        return ontology;
    }

    /**
     *
     * @param ontology
     */
    @JsonProperty("ontology")
    public void setOntology(List<String> ontology) {
        this.ontology = ontology;
    }

    /**
     *
     * @return
     */
    @JsonProperty("executionHost")
    public String getExecutionHost() {
        return executionHost;
    }

    /**
     *
     * @param executionHost
     */
    @JsonProperty("executionHost")
    public void setExecutionHost(String executionHost) {
        this.executionHost = executionHost;
    }

    /**
     *
     * @return
     */
    @JsonProperty("executionType")
    public String getExecutionType() {
        return executionType;
    }

    /**
     *
     * @param executionType
     */
    @JsonProperty("executionType")
    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    /**
     *
     * @return
     */
    @JsonProperty("deploymentPath")
    public String getDeploymentPath() {
        return deploymentPath;
    }

    /**
     *
     * @param deploymentPath
     */
    @JsonProperty("deploymentPath")
    public void setDeploymentPath(String deploymentPath) {
        this.deploymentPath = deploymentPath;
    }

    /**
     *
     * @return
     */
    @JsonProperty("templatePath")
    public String getTemplatePath() {
        return templatePath;
    }

    /**
     *
     * @param templatePath
     */
    @JsonProperty("templatePath")
    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    /**
     *
     * @return
     */
    @JsonProperty("testPath")
    public String getTestPath() {
        return testPath;
    }

    /**
     *
     * @param testPath
     */
    @JsonProperty("testPath")
    public void setTestPath(String testPath) {
        this.testPath = testPath;
    }

    /**
     *
     * @return
     */
    @JsonProperty("checkpointable")
    public String getCheckpointable() {
        return checkpointable;
    }

    /**
     *
     * @param checkpointable
     */
    @JsonProperty("checkpointable")
    public void setCheckpointable(String checkpointable) {
        this.checkpointable = checkpointable;
    }

    /**
     *
     * @return
     */
    @JsonProperty("modules")
    public List<String> getModules() {
        return modules;
    }

    /**
     *
     * @param modules
     */
    @JsonProperty("modules")
    public void setModules(List<String> modules) {
        this.modules = modules;
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
    @JsonProperty("defaultprocessors")
    public String getDefaultprocessors() {
        return defaultprocessors;
    }
    
    /**
     *
     * @param defaultprocessors
     */
    @JsonProperty("defaultprocessors")
    public void setDefaultprocessors(String defaultprocessors) {
        this.defaultprocessors = defaultprocessors;
    }

    /**
     *
     * @return
     */
    @JsonProperty("defaultmemory")
    public String getDefaultmemory() {
        return defaultmemory;
    }

    /**
     *
     * @param defaultmemory
     */
    @JsonProperty("defaultmemory")
    public void setDefaultmemory(String defaultmemory) {
        this.defaultmemory = defaultmemory;
    }

    /**
     *
     * @return
     */
    @JsonProperty("defaultrequestedtime")
    public String getDefaultrequestedtime() {
        return defaultrequestedtime;
    }

    /**
     *
     * @param defaultrequestedtime
     */
    @JsonProperty("defaultrequestedtime")
    public void setDefaultrequestedtime(String defaultrequestedtime) {
        this.defaultrequestedtime = defaultrequestedtime;
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
