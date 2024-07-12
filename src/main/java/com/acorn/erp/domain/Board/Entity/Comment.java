//package com.acorn.erp.domain.Board.Entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "comment")
//public class Comment {
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Long id;
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "post_id", nullable = false, referencedColumnName = "id")
//	private BoardPost post;
//
//	private String content;
//
//}
