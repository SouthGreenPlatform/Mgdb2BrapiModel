/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author boizet
 */
class GenotypeField {
    
    @JsonProperty("fieldAbbreviation")
    private String fieldAbbreviation = null;
    
    @JsonProperty("fieldName")
    private String fieldName = null;
    
    @JsonProperty("fieldType")
    private String fieldType = null;
    
    @JsonProperty("fieldvalue")
    private String fieldvalue = null;

    public String getFieldAbbreviation() {
        return fieldAbbreviation;
    }

    public void setFieldAbbreviation(String fieldAbbreviation) {
        this.fieldAbbreviation = fieldAbbreviation;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue;
    }
    
}
