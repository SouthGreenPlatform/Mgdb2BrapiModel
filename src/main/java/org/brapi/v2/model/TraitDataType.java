package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Class of the scale, entries can be</p> <p>\"Code\" -  This scale class is exceptionally used to express complex traits. Code is a nominal scale that combines the expressions of the different traits composing the complex trait. For example a severity trait might be expressed by a 2 digit and 2 character code. The first 2 digits are the percentage of the plant covered by a fungus and the 2 characters refer to the delay in development, e.g. \"75VD\" means \"75 %\" of the plant is infected and the plant is very delayed.</p> <p>\"Date\" - The date class is for events expressed in a time format, See ISO 8601</p> <p>\"Duration\" - The Duration class is for time elapsed between two events expressed in a time format, e.g. days, hours, months</p> <p>\"Nominal\" - Categorical scale that can take one of a limited and fixed number of categories. There is no intrinsic ordering to the categories</p> <p>\"Numerical\" - Numerical scales express the trait with real numbers. The numerical scale defines the unit e.g. centimeter, ton per hectare, branches</p> <p>\"Ordinal\" - Ordinal scales are scales composed of ordered categories</p> <p>\"Text\" - A free text is used to express the trait.</p>
 */
public enum TraitDataType {
  CODE("Code"),
    DATE("Date"),
    DURATION("Duration"),
    NOMINAL("Nominal"),
    NUMERICAL("Numerical"),
    ORDINAL("Ordinal"),
    TEXT("Text");

  private String value;

  TraitDataType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TraitDataType fromValue(String text) {
    for (TraitDataType b : TraitDataType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
