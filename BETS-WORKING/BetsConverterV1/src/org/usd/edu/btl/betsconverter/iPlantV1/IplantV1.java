package org.usd.edu.btl.betsconverter.iPlantV1;

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
    "parallelism",
    "version",
    "helpURI",
    "label",
    "defaultprocessors",
    "defaultmemory",
    "defaultrequestedtime",
    "shortDescription",
    "longDescription",
    "author",
    "tags",
    "ontology",
    "executionType",
    "executionHost",
    "deploymentPath",
    "templatePath",
    "testPath",
    "checkpointable",
    "modules",
    "available",
    "inputs",
    "parameters",
    "outputs"
})
public class IplantV1 {

    @JsonProperty("name")
    private String name;
    @JsonProperty("parallelism")
    private String parallelism;
    @JsonProperty("version")
    private String version;
    @JsonProperty("helpURI")
    private String helpURI;
    @JsonProperty("label")
    private String label;
    @JsonProperty("defaultprocessors")
    private String defaultprocessors;
    @JsonProperty("defaultmemory")
    private String defaultmemory;
    @JsonProperty("defaultrequestedtime")
    private String defaultrequestedtime;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("author")
    private String author;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("ontology")
    private List<String> ontology = new ArrayList<String>();
    @JsonProperty("executionType")
    private String executionType;
    @JsonProperty("executionHost")
    private String executionHost;
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
    @JsonProperty("available")
    private String available;
    @JsonProperty("inputs")
    private List<Input> inputs = new ArrayList<Input>();
    @JsonProperty("parameters")
    private List<Parameter> parameters = new ArrayList<Parameter>();
    @JsonProperty("outputs")
    private List<Output> outputs = new ArrayList<Output>();

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
    @JsonProperty("parallelism")
    public String getParallelism() {
        return parallelism;
    }

    /**
     *
     * @param parallelism
     */
    @JsonProperty("parallelism")
    public void setParallelism(String parallelism) {
        this.parallelism = parallelism;
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
    @JsonProperty("helpURI")
    public String getHelpURI() {
        return helpURI;
    }

    /**
     *
     * @param helpURI
     */
    @JsonProperty("helpURI")
    public void setHelpURI(String helpURI) {
        this.helpURI = helpURI;
    }

    /**
     *
     * @return
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
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
    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     *
     * @param shortDescription
     */
    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     *
     * @return
     */
    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    /**
     *
     * @param longDescription
     */
    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    /**
     *
     * @return
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

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
    @JsonProperty("available")
    public String getAvailable() {
        return available;
    }

    /**
     *
     * @param available
     */
    @JsonProperty("available")
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     *
     * @return
     */
    @JsonProperty("inputs")
    public List<Input> getInputs() {
        return inputs;
    }

    /**
     *
     * @param inputs
     */
    @JsonProperty("inputs")
    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    /**
     *
     * @return
     */
    @JsonProperty("parameters")
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     *
     * @param parameters
     */
    @JsonProperty("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     *
     * @return
     */
    @JsonProperty("outputs")
    public List<Output> getOutputs() {
        return outputs;
    }

    /**
     *
     * @param outputs
     */
    @JsonProperty("outputs")
    public void setOutputs(List<Output> outputs) {
        this.outputs = outputs;
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
