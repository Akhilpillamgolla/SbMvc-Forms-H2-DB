package com.SpringMvc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringMvc.enity.BookEntity;
import com.SpringMvc.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepo;   //to talk to DB
	
	
	@GetMapping(value={"/","/addBook"})
	public String loadForm(Model model) {
		BookEntity bookobj = new BookEntity();
		model.addAttribute("book", bookobj);
		return "addBook";
	}
	
	@PostMapping(value="/saveBook")
	public String saveBook(@ModelAttribute("book") BookEntity book,Model model) {
		
		BookEntity savedEntity  = bookRepo.save(book);
		
		if(savedEntity!=null && savedEntity.getBookId()!=null) {
			model.addAttribute("succMsg", "Book Stored Successfully");
		}
		else {
			model.addAttribute("failMsg", "Book Shelf is empty");
		}
		
		return "addBook";		
	}
	
	@GetMapping(value="/viewBooks")
	public String viewBooks(Model model) {
		
		List<BookEntity> bookList= bookRepo.findAll();
		
		return "viewBooks";

	}
}
