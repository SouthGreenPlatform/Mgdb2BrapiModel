package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.Call;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CallsListResponseResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T12:30:12.318Z[GMT]")
public class VariantMatrixResponseResult   {
    @JsonProperty("callSetDbIds")
    private List<String> callSetDbIds = new ArrayList<>();
    
  @JsonProperty("data")
  @Valid
  private List<List<String>> data = new ArrayList<>();

  @JsonProperty("expandHomozygotes")
  private Boolean expandHomozygotes = null;
  
  @JsonProperty("genotypeFields")
  private List<GenotypeField> genotypeFields = new ArrayList<>();
  
  @JsonProperty("pagination")
  private List<VariantMatrixPagination> pagination = new ArrayList<>();

  @JsonProperty("sepPhased")
  private String sepPhased = null;

  @JsonProperty("sepUnphased")
  private String sepUnphased = null;

  @JsonProperty("unknownString")
  private String unknownString = null;  
  
  @JsonProperty("variantSetDbIds")
  private List<String> variantSetDbIds = new ArrayList<>();
  
  @JsonProperty("variants")
  private List<VariantSummarized> variants = new ArrayList<>();

  public VariantMatrixResponseResult data(List<List<String>> data) {
    this.data = data;
    return this;
  }

//  public VariantMatrixResponseResult addDataItem(Call2 dataItem) {
//    this.data.add(dataItem);
//    return this;
//  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<List<String>>getData() {
    return data;
  }

  public void setData(List<List<String>> data) {
    this.data = data;
  }

  public VariantMatrixResponseResult expandHomozygotes(Boolean expandHomozygotes) {
    this.expandHomozygotes = expandHomozygotes;
    return this;
  }

  /**
   * Should homozygotes be expanded (true) or collapsed into a single occurence (false)
   * @return expandHomozygotes
  **/
  @ApiModelProperty(value = "Should homozygotes be expanded (true) or collapsed into a single occurence (false)")
  
    public Boolean isExpandHomozygotes() {
    return expandHomozygotes;
  }

  public void setExpandHomozygotes(Boolean expandHomozygotes) {
    this.expandHomozygotes = expandHomozygotes;
  }

  public VariantMatrixResponseResult sepPhased(String sepPhased) {
    this.sepPhased = sepPhased;
    return this;
  }

  /**
   * The string used as a separator for phased allele calls.
   * @return sepPhased
  **/
  @ApiModelProperty(value = "The string used as a separator for phased allele calls.")
  
    public String getSepPhased() {
    return sepPhased;
  }

  public void setSepPhased(String sepPhased) {
    this.sepPhased = sepPhased;
  }

  public VariantMatrixResponseResult sepUnphased(String sepUnphased) {
    this.sepUnphased = sepUnphased;
    return this;
  }

  /**
   * The string used as a separator for unphased allele calls.
   * @return sepUnphased
  **/
  @ApiModelProperty(value = "The string used as a separator for unphased allele calls.")
  
    public String getSepUnphased() {
    return sepUnphased;
  }

  public void setSepUnphased(String sepUnphased) {
    this.sepUnphased = sepUnphased;
  }

  public VariantMatrixResponseResult unknownString(String unknownString) {
    this.unknownString = unknownString;
    return this;
  }

  /**
   * The string used as a representation for missing data.
   * @return unknownString
  **/
  @ApiModelProperty(value = "The string used as a representation for missing data.")
  
    public String getUnknownString() {
    return unknownString;
  }

  public void setUnknownString(String unknownString) {
    this.unknownString = unknownString;
  }

    public List<String> getCallSetDbIds() {
        return callSetDbIds;
    }

    public void setCallSetDbIds(List<String> callSetDbIds) {
        this.callSetDbIds = callSetDbIds;
    }

    public List<String> getVariantSetDbIds() {
        return variantSetDbIds;
    }

    public void setVariantSetDbIds(List<String> variantSetDbIds) {
        this.variantSetDbIds = variantSetDbIds;
    }

    public List<VariantSummarized> getVariants() {
        return variants;
    }

    public void setVariants(List<VariantSummarized> variants) {
        this.variants = variants;
    }

    public List<GenotypeField> getGenotypeFields() {
        return genotypeFields;
    }

    public void setGenotypeFields(List<GenotypeField> genotypeFields) {
        this.genotypeFields = genotypeFields;
    }

    public List<VariantMatrixPagination> getPagination() {
        return pagination;
    }

    public void setPagination(List<VariantMatrixPagination> pagination) {
        this.pagination = pagination;
    }

  
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantMatrixResponseResult callsListResponseResult = (VariantMatrixResponseResult) o;
    return Objects.equals(this.data, callsListResponseResult.data) &&
        Objects.equals(this.expandHomozygotes, callsListResponseResult.expandHomozygotes) &&
        Objects.equals(this.sepPhased, callsListResponseResult.sepPhased) &&
        Objects.equals(this.sepUnphased, callsListResponseResult.sepUnphased) &&
        Objects.equals(this.unknownString, callsListResponseResult.unknownString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, expandHomozygotes, sepPhased, sepUnphased, unknownString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallsListResponseResult {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
    sb.append("    sepPhased: ").append(toIndentedString(sepPhased)).append("\n");
    sb.append("    sepUnphased: ").append(toIndentedString(sepUnphased)).append("\n");
    sb.append("    unknownString: ").append(toIndentedString(unknownString)).append("\n");
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
