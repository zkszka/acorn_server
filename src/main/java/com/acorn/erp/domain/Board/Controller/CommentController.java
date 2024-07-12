//package com.acorn.erp.domain.Board.Controller;
//
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.acorn.erp.domain.Board.Entity.Comment;
//import com.acorn.erp.domain.Board.Service.CommentService;
//
//import lombok.RequiredArgsConstructor;
//
//@RestController
//@RequestMapping("/api/comments")
//@RequiredArgsConstructor
//public class CommentController {
//
//    private final CommentService commentService;
//
//    @PostMapping("/posts/{postId}")
//    public ResponseEntity<Comment> addComment(@PathVariable Long postId, @RequestBody Comment comment) {
//        Comment savedComment = commentService.addComment(postId, comment);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedComment);
//    }
//
//    @PutMapping("/{commentId}")
//    public ResponseEntity<Comment> updateComment(@PathVariable Long commentId, @RequestBody Comment updatedComment) {
//        Comment comment = commentService.updateComment(commentId, updatedComment);
//        return ResponseEntity.ok(comment);
//    }
//
//    @DeleteMapping("/{commentId}")
//    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
//        commentService.deleteComment(commentId);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/posts/{postId}")
//    public ResponseEntity<List<Comment>> getCommentsByPostId(@PathVariable Long postId) {
//        List<Comment> comments = commentService.getCommentsByPostId(postId);
//        return ResponseEntity.ok(comments);
//    }
//}