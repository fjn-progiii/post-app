/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.progIII.postapp.model;

import java.time.LocalDate;

/**
 *
 * @author leonardo
 */
public class Post {
    
    private String content;
    private LocalDate createdAt = LocalDate.now();

    public Post(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    
    
    
    
}
