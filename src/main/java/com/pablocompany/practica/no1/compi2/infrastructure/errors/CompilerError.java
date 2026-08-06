/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocompany.practica.no1.compi2.infrastructure.errors;

import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author pablo03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompilerError {
    
    private String lexeme;
    private int line;
    private int column;
    private ErrorType errorType;
    private String description;
    
}
