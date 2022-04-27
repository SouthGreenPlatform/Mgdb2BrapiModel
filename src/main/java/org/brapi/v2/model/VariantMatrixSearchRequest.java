/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author boizet
 */
public class VariantMatrixSearchRequest extends CallsSearchRequest {
    
    @JsonProperty("dimensionVariantPage")
    private Integer dimensionVariantPage;
    
    @JsonProperty("dimensionVariantPageSize")
    private Integer dimensionVariantPageSize;
    
    @JsonProperty("dimensionCallSetPage")
    private Integer dimensionCallSetPage;
    
    @JsonProperty("dimensionCallSetPageSize")
    private Integer dimensionCallSetPageSize;
    
    @JsonProperty("positionRange")
    private String positionRange;
    
    @JsonProperty("germplasmDbIds")
    private List<String> germplasmDbIds;
    
    @JsonProperty("germplasmNames")
    private List<String> germplasmNames;
    
    @JsonProperty("germplasmPUIs")
    private List<String> germplasmPUIs;
    
    @JsonProperty("sampleDbIds")
    private List<String> sampleDbIds;

    public Integer getDimensionVariantPage() {
        return dimensionVariantPage;
    }

    public void setDimensionVariantPage(Integer dimensionVariantPage) {
        this.dimensionVariantPage = dimensionVariantPage;
    }

    public Integer getDimensionVariantPageSize() {
        return dimensionVariantPageSize;
    }

    public void setDimensionVariantPageSize(Integer dimensionVariantPageSize) {
        this.dimensionVariantPageSize = dimensionVariantPageSize;
    }

    public Integer getDimensionCallSetPage() {
        return dimensionCallSetPage;
    }

    public void setDimensionCallSetPage(Integer dimensionCallSetPage) {
        this.dimensionCallSetPage = dimensionCallSetPage;
    }

    public Integer getDimensionCallSetPageSize() {
        return dimensionCallSetPageSize;
    }

    public void setDimensionCallSetPageSize(Integer dimensionCallSetPageSize) {
        this.dimensionCallSetPageSize = dimensionCallSetPageSize;
    }

    public String getPositionRange() {
        return positionRange;
    }

    public void setPositionRange(String positionRange) {
        this.positionRange = positionRange;
    }

    public List<String> getGermplasmDbIds() {
        return germplasmDbIds;
    }

    public void setGermplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
    }

    public List<String> getGermplasmNames() {
        return germplasmNames;
    }

    public void setGermplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
    }

    public List<String> getGermplasmPUIs() {
        return germplasmPUIs;
    }

    public void setGermplasmPUIs(List<String> germplasmPUIs) {
        this.germplasmPUIs = germplasmPUIs;
    }

    public List<String> getSampleDbIds() {
        return sampleDbIds;
    }

    public void setSampleDbIds(List<String> sampleDbIds) {
        this.sampleDbIds = sampleDbIds;
    }
            
    
    
    
}
