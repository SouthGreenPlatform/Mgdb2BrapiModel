package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * One geometry as defined by GeoJSON (RFC 7946). All coordinates are decimal values on the WGS84 geographic coordinate reference system.  Copied from RFC 7946 Section 3.1.1  A position is an array of numbers. There MUST be two or more elements. The first two elements are longitude and latitude, or easting and northing, precisely in that order and using decimal numbers. Altitude or elevation MAY be included as an optional third element.
 */
@Schema(description = "One geometry as defined by GeoJSON (RFC 7946). All coordinates are decimal values on the WGS84 geographic coordinate reference system.  Copied from RFC 7946 Section 3.1.1  A position is an array of numbers. There MUST be two or more elements. The first two elements are longitude and latitude, or easting and northing, precisely in that order and using decimal numbers. Altitude or elevation MAY be included as an optional third element.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-14T15:37:29.213Z[GMT]")


public class GeoJSON   {
  
  @JsonProperty("geometry")
  private PointGeometry geometry = null;

  @JsonProperty("type")
  private String type = "Feature";

  public GeoJSON geometry(PointGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * A geometry as defined by GeoJSON (RFC 7946). In this context, only Point or Polygon geometry are allowed.
   * @return geometry
   **/
  @Schema(example = "{\"coordinates\":[-76.506042,42.417373,123],\"type\":\"Point\"}", description = "A geometry as defined by GeoJSON (RFC 7946). In this context, only Point or Polygon geometry are allowed.")
  
    public OneOfgeoJSONGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(PointGeometry geometry) {
    this.geometry = geometry;
  }

  public GeoJSON type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The literal string \"Feature\"
   * @return type
   **/
  @Schema(example = "Feature", description = "The literal string \"Feature\"")
  
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
    GeoJSON geoJSON = (GeoJSON) o;
    return Objects.equals(this.geometry, geoJSON.geometry) &&
        Objects.equals(this.type, geoJSON.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJSON {\n");
    
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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
