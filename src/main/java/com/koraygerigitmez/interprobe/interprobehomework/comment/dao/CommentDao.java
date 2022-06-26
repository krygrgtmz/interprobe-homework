package com.koraygerigitmez.interprobe.interprobehomework.comment.dao;

import com.koraygerigitmez.interprobe.interprobehomework.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Long> {

    List<Comment> findAllByProductId(Long productId);
    //Belirli bir ürüne ait yorumları listeleyen metot

    Comment findAllByProductIdAndCommentDateBetween(Long productId, Date commentDate, Date commentDate2);
    //Verilen tarih aralıklarında belirli bir ürüne yapılmış olan yorumları gösteren metot

    List<Comment> findAllByUserId(Long userId);
    //Bir kullanıcının yapmış olduğu yorumları listeleyen metot

    Comment findAllByUserIdAndCommentDateBetween(Long userId, Date commentDate, Date commentDate2);
    //Bir kullanıcının belirli tarihler aralığında yapmış olduğu yorumları gösteren metot

}
