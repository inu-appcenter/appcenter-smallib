package com.appcenter.smallib.book.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Table(name = "book_tb")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "book_id")
    private Long id;

    private String title;

    private String author;

    private String publisher;

    private String isbn;

    private String donor;

    @Column(name = "user_id")
    private Long userId;
}
