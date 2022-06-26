package com.koraygerigitmez.interprobe.interprobehomework.comment;

import com.koraygerigitmez.interprobe.interprobehomework.comment.dao.CommentDao;
import com.koraygerigitmez.interprobe.interprobehomework.comment.entity.Comment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CommentDao commentDao;

}
