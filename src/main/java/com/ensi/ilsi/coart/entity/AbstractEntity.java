/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.coart.entity;

import java.io.*;
import java.time.Instant;
import javax.persistence.*;
import org.springframework.data.annotation.CreatedDate;

/**
 *
 * @author aklom
 */
public abstract class AbstractEntity implements Serializable {
    
    private static final long serialVersionUID = 2L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    
    
    @CreatedDate
    @Column(name = "created_date", nullable = false)
    private Instant createdDate = Instant.now(); 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }
    
    
    
}
