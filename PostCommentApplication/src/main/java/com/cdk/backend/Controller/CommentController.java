package com.cdk.backend.Controller;


import com.cdk.backend.Model.Comment;
import com.cdk.backend.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/{postId}/comments")
    public Comment addCommentToPost(@PathVariable Long postId, @RequestBody Comment comment) {
        return commentService.addCommentToPost(postId, comment);
    }
}
