package org.usd.edu.btl.betsconverter.BioExtV1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

/**
 *
 * @author Tyler.Jones
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "description",
    "inputs",
    "outputs"
})
public class BioExtV1 {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("inputs")
    private List<Inputs> inputs;
    @JsonProperty("outputs")
    private List<Outputs> outputs;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("inputs")
    public List<Inputs> getInputs() {
        return inputs;
    }

    @JsonProperty("inputs")
    public void setInputs(List<Inputs> inputs) {
        this.inputs = inputs;
    }

    @JsonProperty("outputs")
    public List<Outputs> getOutputs() {
        return outputs;
    }

    @JsonProperty("outputs")
    public void setOutputs(List<Outputs> outputs) {
        this.outputs = outputs;
    }

}
