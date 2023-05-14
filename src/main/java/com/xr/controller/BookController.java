package com.xr.controller;

import com.xr.pojo.Books;
import com.xr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xurui
 * @create 2023-05-13 0:54
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // 查询全部书籍，返回页面
    @RequestMapping("/all")
    public String list(Model model) {
      List<Books> booksList = bookService.queryAllBook();
      model.addAttribute("booksList",booksList);
      return "allBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPager() {
        return "addBook";
    }

    @RequestMapping("addBook")
    public String addBook(Books books) {
        System.out.println("addBook =>" + books);
        bookService.addBook(books);
        return "redirect:/book/all";
    }

    /*跳转到修改页面*/
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Integer id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("queryBooks", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("update=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/all";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/all";
    }

    // 根据名称查询书籍
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String queryBookName, Model model) {
        List<Books> booksList = bookService.queryBookByName(queryBookName);
        model.addAttribute("booksList",booksList);
        return "allBook";
    }

}
