package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SampleNewRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-17T12:24:46.566Z[GMT]")

public class SampleNewRequest {

    @JsonProperty("additionalInfo")
    @Valid
    private Map<String, String> additionalInfo = null;

    @JsonProperty("column")
    private Integer column = null;

    @JsonProperty("externalReferences")
    @Valid
    private List<ExternalReferencesInner> externalReferences = null;

    @JsonProperty("germplasmDbId")
    private String germplasmDbId = null;

    @JsonProperty("observationUnitDbId")
    private String observationUnitDbId = null;

    @JsonProperty("plateDbId")
    private String plateDbId = null;

    @JsonProperty("plateName")
    private String plateName = null;

    @JsonProperty("programDbId")
    private String programDbId = null;

    @JsonProperty("row")
    private String row = null;

    @JsonProperty("sampleBarcode")
    private String sampleBarcode = null;

    @JsonProperty("sampleDescription")
    private String sampleDescription = null;

    @JsonProperty("sampleGroupDbId")
    private String sampleGroupDbId = null;

    @JsonProperty("sampleName")
    private String sampleName = null;

    @JsonProperty("samplePUI")
    private String samplePUI = null;

    @JsonProperty("sampleTimestamp")
    private String sampleTimestamp = null;

    @JsonProperty("sampleType")
    private String sampleType = null;

    @JsonProperty("studyDbId")
    private String studyDbId = null;

    @JsonProperty("takenBy")
    private String takenBy = null;

    @JsonProperty("tissueType")
    private String tissueType = null;

    @JsonProperty("trialDbId")
    private String trialDbId = null;

    @JsonProperty("well")
    private String well = null;

    public SampleNewRequest additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public SampleNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new HashMap<String, String>();
        }
        this.additionalInfo.put(key, additionalInfoItem);
        return this;
    }

    /**
     * Additional arbitrary info
     *
     * @return additionalInfo
   *
     */
    @Schema(description = "Additional arbitrary info")

    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public SampleNewRequest column(Integer column) {
        this.column = column;
        return this;
    }

    /**
     * The Column identifier for this samples location in the plate minimum: 1
     * maximum: 12
     *
     * @return column
   *
     */
    @Schema(example = "6", description = "The Column identifier for this samples location in the plate")

    @Min(1)
    @Max(12)
    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public SampleNewRequest externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public SampleNewRequest addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<ExternalReferencesInner>();
        }
        this.externalReferences.add(externalReferencesItem);
        return this;
    }

    /**
     * An array of external reference ids. These are references to this piece of
     * data in an external system. Could be a simple string or a URI.
     *
     * @return externalReferences
   *
     */
    @Schema(example = "[{\"referenceID\":\"doi:10.155454/12341234\",\"referenceSource\":\"DOI\"},{\"referenceID\":\"http://purl.obolibrary.org/obo/ro.owl\",\"referenceSource\":\"OBO Library\"},{\"referenceID\":\"75a50e76\",\"referenceSource\":\"Remote Data Collection Upload Tool\"}]", description = "An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.")
    @Valid
    public List<ExternalReferencesInner> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public SampleNewRequest germplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a germplasm
     *
     * @return germplasmDbId
   *
     */
    @Schema(example = "7e08d538", description = "The ID which uniquely identifies a germplasm")

    public String getGermplasmDbId() {
        return germplasmDbId;
    }

    public void setGermplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
    }

    public SampleNewRequest observationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies an observation unit
     *
     * @return observationUnitDbId
   *
     */
    @Schema(example = "073a3ce5", description = "The ID which uniquely identifies an observation unit")

    public String getObservationUnitDbId() {
        return observationUnitDbId;
    }

    public void setObservationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
    }

    public SampleNewRequest plateDbId(String plateDbId) {
        this.plateDbId = plateDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a plate of samples
     *
     * @return plateDbId
   *
     */
    @Schema(example = "2dce16d1", description = "The ID which uniquely identifies a plate of samples")

    public String getPlateDbId() {
        return plateDbId;
    }

    public void setPlateDbId(String plateDbId) {
        this.plateDbId = plateDbId;
    }

    public SampleNewRequest plateName(String plateName) {
        this.plateName = plateName;
        return this;
    }

    /**
     * The human readable name of a plate
     *
     * @return plateName
   *
     */
    @Schema(example = "Plate_alpha_20191022", description = "The human readable name of a plate")

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }

    public SampleNewRequest programDbId(String programDbId) {
        this.programDbId = programDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a program within the given database
     * server
     *
     * @return programDbId
   *
     */
    @Schema(example = "bd748e00", description = "The ID which uniquely identifies a program within the given database server")

    public String getProgramDbId() {
        return programDbId;
    }

    public void setProgramDbId(String programDbId) {
        this.programDbId = programDbId;
    }

    public SampleNewRequest row(String row) {
        this.row = row;
        return this;
    }

    /**
     * The Row identifier for this samples location in the plate
     *
     * @return row
   *
     */
    @Schema(example = "B", description = "The Row identifier for this samples location in the plate")

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public SampleNewRequest sampleBarcode(String sampleBarcode) {
        this.sampleBarcode = sampleBarcode;
        return this;
    }

    /**
     * A unique identifier physically attached to the sample
     *
     * @return sampleBarcode
   *
     */
    @Schema(example = "3a027b59", description = "A unique identifier physically attached to the sample")

    public String getSampleBarcode() {
        return sampleBarcode;
    }

    public void setSampleBarcode(String sampleBarcode) {
        this.sampleBarcode = sampleBarcode;
    }

    public SampleNewRequest sampleDescription(String sampleDescription) {
        this.sampleDescription = sampleDescription;
        return this;
    }

    /**
     * Description of a sample MIAPPE V1.1 (DM-79) Sample description - Any
     * information not captured by the other sample fields, including
     * quantification, sample treatments and processing.
     *
     * @return sampleDescription
   *
     */
    @Schema(example = "This sample was taken from the root of a tree", description = "Description of a sample  MIAPPE V1.1 (DM-79) Sample description - Any information not captured by the other sample fields, including quantification, sample treatments and processing.")

    public String getSampleDescription() {
        return sampleDescription;
    }

    public void setSampleDescription(String sampleDescription) {
        this.sampleDescription = sampleDescription;
    }

    public SampleNewRequest sampleGroupDbId(String sampleGroupDbId) {
        this.sampleGroupDbId = sampleGroupDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a group of samples
     *
     * @return sampleGroupDbId
   *
     */
    @Schema(example = "8524b436", description = "The ID which uniquely identifies a group of samples")

    public String getSampleGroupDbId() {
        return sampleGroupDbId;
    }

    public void setSampleGroupDbId(String sampleGroupDbId) {
        this.sampleGroupDbId = sampleGroupDbId;
    }

    public SampleNewRequest sampleName(String sampleName) {
        this.sampleName = sampleName;
        return this;
    }

    /**
     * The name of the sample
     *
     * @return sampleName
   *
     */
    @Schema(example = "Sample_alpha_20191022", description = "The name of the sample")

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public SampleNewRequest samplePUI(String samplePUI) {
        this.samplePUI = samplePUI;
        return this;
    }

    /**
     * A permanent unique identifier for the sample (DOI, URL, UUID, etc) MIAPPE
     * V1.1 (DM-81) External ID - An identifier for the sample in a persistent
     * repository, comprising the name of the repository and the accession
     * number of the observation unit therein. Submission to the EBI Biosamples
     * repository is recommended. URI are recommended when possible.
     *
     * @return samplePUI
   *
     */
    @Schema(example = "doi:10.15454/312953986E3", description = "A permanent unique identifier for the sample (DOI, URL, UUID, etc)  MIAPPE V1.1 (DM-81) External ID - An identifier for the sample in a persistent repository, comprising the name of the repository and the accession number of the observation unit therein. Submission to the EBI Biosamples repository is recommended. URI are recommended when possible. ")

    public String getSamplePUI() {
        return samplePUI;
    }

    public void setSamplePUI(String samplePUI) {
        this.samplePUI = samplePUI;
    }

    public SampleNewRequest sampleTimestamp(String sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
        return this;
    }

    /**
     * The date and time a sample was collected from the field MIAPPE V1.1
     * (DM-80) Collection date - The date and time when the sample was collected
     * / harvested
     *
     * @return sampleTimestamp
   *
     */
    @Schema(description = "The date and time a sample was collected from the field  MIAPPE V1.1 (DM-80) Collection date - The date and time when the sample was collected / harvested")

    @Valid
    public String getSampleTimestamp() {
        return sampleTimestamp;
    }

    public void setSampleTimestamp(String sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
    }

    public SampleNewRequest sampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }

    /**
     * The type of sample taken. ex. 'DNA', 'RNA', 'Tissue', etc
     *
     * @return sampleType
   *
     */
    @Schema(example = "Tissue", description = "The type of sample taken. ex. 'DNA', 'RNA', 'Tissue', etc")

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public SampleNewRequest studyDbId(String studyDbId) {
        this.studyDbId = studyDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a study within the given database server
     *
     * @return studyDbId
   *
     */
    @Schema(example = "64bd6bf9", description = "The ID which uniquely identifies a study within the given database server")

    public String getStudyDbId() {
        return studyDbId;
    }

    public void setStudyDbId(String studyDbId) {
        this.studyDbId = studyDbId;
    }

    public SampleNewRequest takenBy(String takenBy) {
        this.takenBy = takenBy;
        return this;
    }

    /**
     * The name or identifier of the entity which took the sample from the field
     *
     * @return takenBy
   *
     */
    @Schema(example = "Bob", description = "The name or identifier of the entity which took the sample from the field")

    public String getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(String takenBy) {
        this.takenBy = takenBy;
    }

    public SampleNewRequest tissueType(String tissueType) {
        this.tissueType = tissueType;
        return this;
    }

    /**
     * The type of tissue sampled. ex. 'Leaf', 'Root', etc. MIAPPE V1.1 (DM-78)
     * Plant anatomical entity - A description of the plant part (e.g. leaf) or
     * the plant product (e.g. resin) from which the sample was taken, in the
     * form of an accession number to a suitable controlled vocabulary (Plant
     * Ontology).
     *
     * @return tissueType
   *
     */
    @Schema(example = "Root", description = "The type of tissue sampled. ex. 'Leaf', 'Root', etc.  MIAPPE V1.1 (DM-78) Plant anatomical entity - A description of  the plant part (e.g. leaf) or the plant product (e.g. resin) from which the sample was taken, in the form of an accession number to a suitable controlled vocabulary (Plant Ontology).")

    public String getTissueType() {
        return tissueType;
    }

    public void setTissueType(String tissueType) {
        this.tissueType = tissueType;
    }

    public SampleNewRequest trialDbId(String trialDbId) {
        this.trialDbId = trialDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a trial within the given database server
     *
     * @return trialDbId
   *
     */
    @Schema(example = "d34c5349", description = "The ID which uniquely identifies a trial within the given database server")

    public String getTrialDbId() {
        return trialDbId;
    }

    public void setTrialDbId(String trialDbId) {
        this.trialDbId = trialDbId;
    }

    public SampleNewRequest well(String well) {
        this.well = well;
        return this;
    }

    /**
     * The Well identifier for this samples location in the plate. Usually a
     * concatenation of Row and Column, or just a number if the samples are not
     * part of an ordered plate.
     *
     * @return well
   *
     */
    @Schema(example = "B6", description = "The Well identifier for this samples location in the plate. Usually a concatenation of Row and Column, or just a number if the samples are not part of an ordered plate.")

    public String getWell() {
        return well;
    }

    public void setWell(String well) {
        this.well = well;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleNewRequest sampleNewRequest = (SampleNewRequest) o;
        return Objects.equals(this.additionalInfo, sampleNewRequest.additionalInfo)
                && Objects.equals(this.column, sampleNewRequest.column)
                && Objects.equals(this.externalReferences, sampleNewRequest.externalReferences)
                && Objects.equals(this.germplasmDbId, sampleNewRequest.germplasmDbId)
                && Objects.equals(this.observationUnitDbId, sampleNewRequest.observationUnitDbId)
                && Objects.equals(this.plateDbId, sampleNewRequest.plateDbId)
                && Objects.equals(this.plateName, sampleNewRequest.plateName)
                && Objects.equals(this.programDbId, sampleNewRequest.programDbId)
                && Objects.equals(this.row, sampleNewRequest.row)
                && Objects.equals(this.sampleBarcode, sampleNewRequest.sampleBarcode)
                && Objects.equals(this.sampleDescription, sampleNewRequest.sampleDescription)
                && Objects.equals(this.sampleGroupDbId, sampleNewRequest.sampleGroupDbId)
                && Objects.equals(this.sampleName, sampleNewRequest.sampleName)
                && Objects.equals(this.samplePUI, sampleNewRequest.samplePUI)
                && Objects.equals(this.sampleTimestamp, sampleNewRequest.sampleTimestamp)
                && Objects.equals(this.sampleType, sampleNewRequest.sampleType)
                && Objects.equals(this.studyDbId, sampleNewRequest.studyDbId)
                && Objects.equals(this.takenBy, sampleNewRequest.takenBy)
                && Objects.equals(this.tissueType, sampleNewRequest.tissueType)
                && Objects.equals(this.trialDbId, sampleNewRequest.trialDbId)
                && Objects.equals(this.well, sampleNewRequest.well);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, column, externalReferences, germplasmDbId, observationUnitDbId, plateDbId, plateName, programDbId, row, sampleBarcode, sampleDescription, sampleGroupDbId, sampleName, samplePUI, sampleTimestamp, sampleType, studyDbId, takenBy, tissueType, trialDbId, well);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleNewRequest {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
        sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
        sb.append("    plateDbId: ").append(toIndentedString(plateDbId)).append("\n");
        sb.append("    plateName: ").append(toIndentedString(plateName)).append("\n");
        sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
        sb.append("    row: ").append(toIndentedString(row)).append("\n");
        sb.append("    sampleBarcode: ").append(toIndentedString(sampleBarcode)).append("\n");
        sb.append("    sampleDescription: ").append(toIndentedString(sampleDescription)).append("\n");
        sb.append("    sampleGroupDbId: ").append(toIndentedString(sampleGroupDbId)).append("\n");
        sb.append("    sampleName: ").append(toIndentedString(sampleName)).append("\n");
        sb.append("    samplePUI: ").append(toIndentedString(samplePUI)).append("\n");
        sb.append("    sampleTimestamp: ").append(toIndentedString(sampleTimestamp)).append("\n");
        sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
        sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
        sb.append("    takenBy: ").append(toIndentedString(takenBy)).append("\n");
        sb.append("    tissueType: ").append(toIndentedString(tissueType)).append("\n");
        sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
        sb.append("    well: ").append(toIndentedString(well)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
