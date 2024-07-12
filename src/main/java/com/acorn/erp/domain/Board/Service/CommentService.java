//package com.acorn.erp.domain.Board.Service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.acorn.erp.domain.Board.Entity.BoardPost;
//import com.acorn.erp.domain.Board.Entity.Comment;
//import com.acorn.erp.domain.Board.Repository.BoardPostRepository;
//import com.acorn.erp.domain.Board.Repository.CommentRepository;
//
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor
//public class CommentService {
//
//    private final BoardPostRepository boardPostRepository;
//    private final CommentRepository commentRepository;
//
//    @Transactional
//    public Comment addComment(Long postId, Comment comment) {
//        BoardPost post = boardPostRepository.findById(postId)
//                                          .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
//        comment.setPost(post);
//        Comment savedComment = commentRepository.save(comment);
//
//        // 댓글 수 증가
//        post.setComments(post.getComments() + 1);
//        boardPostRepository.save(post);
//
//        return savedComment;
//    }
//
//    @Transactional
//    public Comment updateComment(Long commentId, Comment updatedComment) {
//        Comment comment = commentRepository.findById(commentId)
//                                           .orElseThrow(() -> new IllegalArgumentException("댓글을 찾을 수 없습니다."));
//        comment.setContent(updatedComment.getContent());
//        return commentRepository.save(comment);
//    }
//
//    @Transactional
//    public void deleteComment(Long commentId) {
//        Comment comment = commentRepository.findById(commentId)
//                                           .orElseThrow(() -> new IllegalArgumentException("댓글을 찾을 수 없습니다."));
//        commentRepository.delete(comment);
//
//        // 댓글 수 감소
//        BoardPost post = comment.getPost();
//        post.setComments(post.getComments() - 1);
//        boardPostRepository.save(post);
//    }
//
//    @Transactional(readOnly = true)
//    public List<Comment> getCommentsByPostId(Long postId) {
//        BoardPost post = boardPostRepository.findById(postId)
//                                          .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
//        return commentRepository.findByPost(post);
//    }
//}