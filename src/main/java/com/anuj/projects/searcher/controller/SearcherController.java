package com.anuj.projects.searcher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.projects.searcher.apipojo.BaseResponse;
import com.anuj.projects.searcher.apipojo.Book;
import com.anuj.projects.searcher.service.BookOperations;

@RestController
@RequestMapping("/book")
public class SearcherController {

	private static String WELCOME = "Welcome to my Library Application";
	private BaseResponse response;

	@Autowired
	BookOperations bookoperations;

	@RequestMapping("/home")
	public String welcome() {// Welcome page, non-rest
		return WELCOME;
	}

	@RequestMapping(method = RequestMethod.POST, value = "add")
	public String addBook(@RequestBody Book bookData) {// Welcome page, non-rest
		response = bookoperations.addBook(bookData);

		return response.getResponseMessage();
	}

	@RequestMapping(method = RequestMethod.GET, value = "get")
	public String addBook(@RequestParam("title") String title) {// Welcome page, non-rest
		response = bookoperations.getBook(title);

		return response.getResponseData().toString();
	}

	@RequestMapping("/delete")
	public String deleteBook(@PathVariable String name) {
		String msg = "Hello " + name;
		return msg;
	}

	@RequestMapping("/update")
	public String updateBook(@PathVariable String name) {
		String msg = "Hello " + name;
		return msg;
	}

	@RequestMapping("/count")
	public int countBook(@PathVariable String name) {
		int result = 0;
		return result;
	}

	@RequestMapping("/search")
	public String searchBook(@PathVariable String name) {
		String msg = "Hello " + name;
		return msg;
	}
}
