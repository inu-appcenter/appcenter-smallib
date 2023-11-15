package com.appcenter.smallib.book.repository;

import com.appcenter.smallib.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
