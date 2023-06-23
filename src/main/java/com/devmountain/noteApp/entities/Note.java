package com.devmountain.noteApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Notes")
/*  The following 3 lines simplifies the class without the need of creating Constructors, getters, & setters
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
 */
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String body;

    public Note() {
    }

    public Note(Long id, String body) {
        this.id = id;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
