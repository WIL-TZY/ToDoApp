package com.nael.todoapp.domain;

import java.time.LocalDateTime;

public class Todo {
	private Integer id;
	private String title;
	private String description;
	private LocalDateTime dateFinal;
	private Boolean finished = false;
	
	// Superclass constructed without params
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
