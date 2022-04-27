/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author boizet
 */
public class VariantSummarized {
    @JsonProperty("contig")
    private String contig = null;

    @JsonProperty("end")
    private Long end = null;
    
    @JsonProperty("ploidy")
    private Integer ploidy = null;
    
    @JsonProperty("start")
    private Long start = null;

    @JsonProperty("variantDbId")
    private String variantDbId = null;
    
    @JsonProperty("referenceBases")
    private String referenceBases = null;
            
    @JsonProperty("alternateBases")
    private List<String> alternateBases = new ArrayList<>();

    public String getContig() {
        return contig;
    }

    public void setContig(String contig) {
        this.contig = contig;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public Integer getPloidy() {
        return ploidy;
    }

    public void setPloidy(Integer ploidy) {
        this.ploidy = ploidy;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public String getVariantDbId() {
        return variantDbId;
    }

    public void setVariantDbId(String variantDbId) {
        this.variantDbId = variantDbId;
    }

    public String getReferenceBases() {
        return referenceBases;
    }

    public void setReferenceBases(String referenceBases) {
        this.referenceBases = referenceBases;
    }

    public List<String> getAlternateBases() {
        return alternateBases;
    }

    public void setAlternateBases(List<String> alternateBases) {
        this.alternateBases = alternateBases;
    }
    
    public void addAlternateBases(String alternateBases) {
        this.alternateBases.add(alternateBases);
    }
    
}
