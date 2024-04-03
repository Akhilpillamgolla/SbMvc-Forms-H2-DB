package com.SpringMvc.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="BOOK_DTLS")
public class BookEntity {
	
	@Id
	@GeneratedValue   //Each time ID is created automatically
	
	@Column(name="BOOK_ID")
	private Integer bookId;
	
	@Column(name="BOOK_NAME")
	private String  bookName;
	
	@Column(name="BOOK_PRICE")
	private String  bookPrice;
	
	@Column(name="AUTHOR_NAME")
	private String  authorName;

}
