/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.coart.entity;

import java.io.*;
import javax.persistence.*;

/**
 *
 * @author aklom
 */
public abstract class AbstractEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    
}
