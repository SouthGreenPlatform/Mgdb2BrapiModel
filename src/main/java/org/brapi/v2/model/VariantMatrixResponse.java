package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VariantMatrixResponse
 */
@Validated
public class VariantMatrixResponse   {
  @JsonProperty("@context")
  private Context _atContext = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("result")
  private VariantMatrixResponseResult result = null;

  public VariantMatrixResponse _atContext(Context _atContext) {
    this._atContext = _atContext;
    return this;
  }

  /**
   * Get _atContext
   * @return _atContext
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Context getAtContext() {
    return _atContext;
  }

  public void setAtContext(Context _atContext) {
    this._atContext = _atContext;
  }

  public VariantMatrixResponse metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public MetadataBase getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public VariantMatrixResponse result(VariantMatrixResponseResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public VariantMatrixResponseResult getResult() {
    return result;
  }

  public void setResult(VariantMatrixResponseResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantMatrixResponse callListResponse = (VariantMatrixResponse) o;
    return Objects.equals(this._atContext, callListResponse._atContext) &&
        Objects.equals(this.metadata, callListResponse.metadata) &&
        Objects.equals(this.result, callListResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantMatrixResponse {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
