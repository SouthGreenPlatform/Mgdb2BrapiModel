package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * An array of Linear Rings. Each Linear Ring is an array of Points.   A Point is an array of numbers. There MUST be two or more elements. The first two elements are longitude and latitude, or easting and northing, precisely in that order and using decimal numbers. Altitude or elevation MAY be included as an optional third element.
 */
@Schema(description = "An array of Linear Rings. Each Linear Ring is an array of Points.   A Point is an array of numbers. There MUST be two or more elements. The first two elements are longitude and latitude, or easting and northing, precisely in that order and using decimal numbers. Altitude or elevation MAY be included as an optional third element.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-14T15:36:09.576Z[GMT]")

public class PolygonGeometry  implements OneOfgeoJSONGeometry {
  @JsonProperty("coordinates")
  private Polygon coordinates = null;

  @JsonProperty("type")
  private String type = "Polygon";

  public PolygonGeometry coordinates(Polygon coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
   **/
  @Schema(description = "")
  
    @Valid
    public Polygon getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Polygon coordinates) {
    this.coordinates = coordinates;
  }

  public PolygonGeometry type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The literal string \"Polygon\"
   * @return type
   **/
  @Schema(example = "Polygon", description = "The literal string \"Polygon\"")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolygonGeometry polygonGeometry = (PolygonGeometry) o;
    return Objects.equals(this.coordinates, polygonGeometry.coordinates) &&
        Objects.equals(this.type, polygonGeometry.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolygonGeometry {\n");
    
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
