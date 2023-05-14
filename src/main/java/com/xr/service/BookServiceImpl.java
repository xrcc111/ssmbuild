package com.xr.service;

import com.xr.dao.BookMapper;
import com.xr.pojo.Books;

import java.util.List;

/**
 * @author xurui
 * @create 2023-05-12 1:01
 */
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int bookId) {
        return bookMapper.deleteBookById(bookId);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int bookId) {
        return bookMapper.queryBookById(bookId);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> queryBookByName(String BookName) {
        return bookMapper.queryBookByName(BookName);
    }
}
