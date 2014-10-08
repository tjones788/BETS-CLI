
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
    "display_name",
    "version",
    "summary",
    "description",
    "limitations",
    "example",
    "links",
    "references",
    "author",
    "created_at",
    "owner",
    "maintained",
    "availability",
    "contact",
    "category",
    "technology",
    "programming_language",
    "license",
    "operating_system",
    "software_features",
    "software_libraries",
    "inputs",
    "parameters",
    "outputs",
    "requirements",
    "quality",
    "learn_flow",
    "release_date",
    "algorithm",
    "iplant_specific",
    "seq_specific",
    "galaxy_specific",
    "bld_specific",
    "parallelism"
})
public class BETSV1 {

    @JsonProperty("name")
    private String name;
    @JsonProperty("display_name")
    private String display_name;
    @JsonProperty("version")
    private String version;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("limitations")
    private String limitations;
    @JsonProperty("example")
    private List<Example> example = new ArrayList<Example>();
    @JsonProperty("links")
    private List<Link> links = new ArrayList<Link>();
    @JsonProperty("references")
    private List<Reference> references = new ArrayList<Reference>();
    @JsonProperty("author")
    private String author;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("maintained")
    private String maintained;
    @JsonProperty("availability")
    private List<Availability> availability = new ArrayList<Availability>();
    @JsonProperty("contact")
    private Contact contact;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("technology")
    private List<Technology> technology = new ArrayList<Technology>();
    @JsonProperty("programming_language")
    private List<Programming_language> programming_language = new ArrayList<Programming_language>();
    @JsonProperty("license")
    private List<License> license = new ArrayList<License>();
    @JsonProperty("operating_system")
    private List<Operating_system> operating_system = new ArrayList<Operating_system>();
    @JsonProperty("software_features")
    private String software_features;
    @JsonProperty("software_libraries")
    private String software_libraries;
    @JsonProperty("inputs")
    private List<Input> inputs = new ArrayList<Input>();
    @JsonProperty("parameters")
    private List<Parameter> parameters = new ArrayList<Parameter>();
    @JsonProperty("outputs")
    private List<Output> outputs = new ArrayList<Output>();
    @JsonProperty("requirements")
    private String requirements;
    @JsonProperty("quality")
    private List<Quality_> quality = new ArrayList<Quality_>();
    @JsonProperty("learn_flow")
    private List<Learn_flow> learn_flow = new ArrayList<Learn_flow>();
    @JsonProperty("release_date")
    private String release_date;
    @JsonProperty("algorithm")
    private List<Algorithm> algorithm = new ArrayList<Algorithm>();
    @JsonProperty("iplant_specific")
    private Iplant_specific iplant_specific;
    @JsonProperty("seq_specific")
    private Seq_specific seq_specific;
    @JsonProperty("galaxy_specific")
    private Galaxy_specific galaxy_specific;
    @JsonProperty("bld_specific")
    private Bld_specific bld_specific;
    @JsonProperty("parallelism")
    private String parallelism;
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
    @JsonProperty("display_name")
    public String getDisplay_name() {
        return display_name;
    }

    /**
     *
     * @param display_name
     */
    @JsonProperty("display_name")
    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
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
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     *
     * @param summary
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     *
     * @return
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    @JsonProperty("limitations")
    public String getLimitations() {
        return limitations;
    }

    /**
     *
     * @param limitations
     */
    @JsonProperty("limitations")
    public void setLimitations(String limitations) {
        this.limitations = limitations;
    }

    /**
     *
     * @return
     */
    @JsonProperty("example")
    public List<Example> getExample() {
        return example;
    }

    /**
     *
     * @param example
     */
    @JsonProperty("example")
    public void setExample(List<Example> example) {
        this.example = example;
    }

    /**
     *
     * @return
     */
    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    /**
     *
     * @param links
     */
    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     *
     * @return
     */
    @JsonProperty("references")
    public List<Reference> getReferences() {
        return references;
    }

    /**
     *
     * @param references
     */
    @JsonProperty("references")
    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    /**
     *
     * @return
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     */
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return
     */
    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    /**
     *
     * @param created_at
     */
    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     *
     * @return
     */
    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     */
    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     */
    @JsonProperty("maintained")
    public String getMaintained() {
        return maintained;
    }

    /**
     *
     * @param maintained
     */
    @JsonProperty("maintained")
    public void setMaintained(String maintained) {
        this.maintained = maintained;
    }

    /**
     *
     * @return
     */
    @JsonProperty("availability")
    public List<Availability> getAvailability() {
        return availability;
    }

    /**
     *
     * @param availability
     */
    @JsonProperty("availability")
    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    /**
     *
     * @return
     */
    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    /**
     *
     * @param contact
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     *
     * @return
     */
    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    /**
     *
     * @param category
     */
    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     *
     * @return
     */
    @JsonProperty("technology")
    public List<Technology> getTechnology() {
        return technology;
    }

    /**
     *
     * @param technology
     */
    @JsonProperty("technology")
    public void setTechnology(List<Technology> technology) {
        this.technology = technology;
    }

    /**
     *
     * @return
     */
    @JsonProperty("programming_language")
    public List<Programming_language> getProgramming_language() {
        return programming_language;
    }

    /**
     *
     * @param programming_language
     */
    @JsonProperty("programming_language")
    public void setProgramming_language(List<Programming_language> programming_language) {
        this.programming_language = programming_language;
    }

    /**
     *
     * @return
     */
    @JsonProperty("license")
    public List<License> getLicense() {
        return license;
    }

    /**
     *
     * @param license
     */
    @JsonProperty("license")
    public void setLicense(List<License> license) {
        this.license = license;
    }

    /**
     *
     * @return
     */
    @JsonProperty("operating_system")
    public List<Operating_system> getOperating_system() {
        return operating_system;
    }

    /**
     *
     * @param operating_system
     */
    @JsonProperty("operating_system")
    public void setOperating_system(List<Operating_system> operating_system) {
        this.operating_system = operating_system;
    }

    /**
     *
     * @return
     */
    @JsonProperty("software_features")
    public String getSoftware_features() {
        return software_features;
    }

    /**
     *
     * @param software_features
     */
    @JsonProperty("software_features")
    public void setSoftware_features(String software_features) {
        this.software_features = software_features;
    }

    /**
     *
     * @return
     */
    @JsonProperty("software_libraries")
    public String getSoftware_libraries() {
        return software_libraries;
    }

    /**
     *
     * @param software_libraries
     */
    @JsonProperty("software_libraries")
    public void setSoftware_libraries(String software_libraries) {
        this.software_libraries = software_libraries;
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
    @JsonProperty("requirements")
    public String getRequirements() {
        return requirements;
    }

    /**
     *
     * @param requirements
     */
    @JsonProperty("requirements")
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    /**
     *
     * @return
     */
    @JsonProperty("quality")
    public List<Quality_> getQuality() {
        return quality;
    }

    /**
     *
     * @param quality
     */
    @JsonProperty("quality")
    public void setQuality(List<Quality_> quality) {
        this.quality = quality;
    }

    /**
     *
     * @return
     */
    @JsonProperty("learn_flow")
    public List<Learn_flow> getLearn_flow() {
        return learn_flow;
    }

    /**
     *
     * @param learn_flow
     */
    @JsonProperty("learn_flow")
    public void setLearn_flow(List<Learn_flow> learn_flow) {
        this.learn_flow = learn_flow;
    }

    /**
     *
     * @return
     */
    @JsonProperty("release_date")
    public String getRelease_date() {
        return release_date;
    }

    /**
     *
     * @param release_date
     */
    @JsonProperty("release_date")
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    /**
     *
     * @return
     */
    @JsonProperty("algorithm")
    public List<Algorithm> getAlgorithm() {
        return algorithm;
    }

    /**
     *
     * @param algorithm
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(List<Algorithm> algorithm) {
        this.algorithm = algorithm;
    }

    /**
     *
     * @return
     */
    @JsonProperty("iplant_specific")
    public Iplant_specific getIplant_specific() {
        return iplant_specific;
    }

    /**
     *
     * @param iplant_specific
     */
    @JsonProperty("iplant_specific")
    public void setIplant_specific(Iplant_specific iplant_specific) {
        this.iplant_specific = iplant_specific;
    }

    /**
     *
     * @return
     */
    @JsonProperty("seq_specific")
    public Seq_specific getSeq_specific() {
        return seq_specific;
    }

    /**
     *
     * @param seq_specific
     */
    @JsonProperty("seq_specific")
    public void setSeq_specific(Seq_specific seq_specific) {
        this.seq_specific = seq_specific;
    }

    /**
     *
     * @return
     */
    @JsonProperty("galaxy_specific")
    public Galaxy_specific getGalaxy_specific() {
        return galaxy_specific;
    }

    /**
     *
     * @param galaxy_specific
     */
    @JsonProperty("galaxy_specific")
    public void setGalaxy_specific(Galaxy_specific galaxy_specific) {
        this.galaxy_specific = galaxy_specific;
    }

    /**
     *
     * @return
     */
    @JsonProperty("bld_specific")
    public Bld_specific getBld_specific() {
        return bld_specific;
    }

    /**
     *
     * @param bld_specific
     */
    @JsonProperty("bld_specific")
    public void setBld_specific(Bld_specific bld_specific) {
        this.bld_specific = bld_specific;
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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("***BETS JSON FILE***\n");
            sb.append("Name= " + getName() + "\n");
            sb.append("Display Name= " + getDisplay_name() + "\n");


            return sb.toString();
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
