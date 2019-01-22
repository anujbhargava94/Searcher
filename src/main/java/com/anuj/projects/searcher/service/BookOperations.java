package com.anuj.projects.searcher.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.projects.searcher.apipojo.BaseResponse;
import com.anuj.projects.searcher.apipojo.Book;

@Service
public class BookOperations {

	private Map<String, Book> bookLibrary = new HashMap<String, Book>();
	@Autowired
	BaseResponse response;

	public BaseResponse addBook(Book bookData) {
		if (bookData != null) {
			bookLibrary.put(bookData.getTitle(), bookData);
			response.setResponseMessage("Book with title: " + bookData.getTitle() + " successfully added to library");
		} else {
			response.setResponseMessage("Error: data is not there");
		}
		return response;
	}

	public BaseResponse getBook(String title) {
		if (!bookLibrary.isEmpty() && bookLibrary.containsKey(title)) {
			response.setResponseData(bookLibrary.get(title));
			response.setResponseMessage("found");
		} else {
			response.setResponseMessage("not found");
		}
		return response;
	}

}
