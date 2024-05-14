package com.example.apiiii.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Getter
@Setter

public class Book {
    @SequenceGenerator(name = "books_setup_seq_gen", sequenceName = "books_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "bookName",nullable = false,length = 100)
    private String bookName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ground_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "pk_id_fk_ground_id"))
    private Ground ground;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "pk_id_fk_user_id"))
    private User user;
}
