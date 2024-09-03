package com.nael.todoapp.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Todo {
	private Integer id;
	private String title;
	private String description;
	private LocalDateTime dateFinal;
	private Boolean finished = false;
	
	// [Alt+Shift+S] Generate Constructors from Superclass
	public Todo() {
		super();		
	}

	// [Alt+Shift+S] Generate Constructor using Fields
	public Todo(Integer id, String title, String description, LocalDateTime dateFinal, Boolean finished) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.dateFinal = dateFinal;
		this.finished = finished;
	}

	// [Alt+Shift+S] Generate Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDateFinal() {
		return dateFinal;
	}

	public void setDateFinal(LocalDateTime dateFinal) {
		this.dateFinal = dateFinal;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	
	// [Alt+Shift+S] Generate hashCode() and equals()
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(id, other.id);
	}
}
