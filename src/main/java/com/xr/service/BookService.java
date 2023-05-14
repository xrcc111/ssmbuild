package com.xr.service;

import com.xr.pojo.Books;

import java.util.List;

/**
 * @author xurui
 * @create 2023-05-12 0:59
 */
public interface BookService {
    int addBook(Books books);

    int deleteBookById(int bookId);

    int updateBook(Books books);

    Books queryBookById(int bookId);

    List<Books> queryAllBook();

    List<Books> queryBookByName(String BookName);
}
