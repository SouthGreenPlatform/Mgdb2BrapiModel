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
public class VariantMatrixPagination extends IndexPagination {
    
    public enum Dimension {
        VARIANT, CALLSET;
    }
    
    @JsonProperty("dimension")
    private Dimension dimension = null;

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    
}
