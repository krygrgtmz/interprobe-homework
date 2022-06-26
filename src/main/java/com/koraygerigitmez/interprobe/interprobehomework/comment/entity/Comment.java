package com.koraygerigitmez.interprobe.interprobehomework.comment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COMMENT")
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(generator = "Comment")
    @SequenceGenerator(name = "Comment", sequenceName = "COMMENT_ID_SEQ")
    private Long id;

    @ManyToOne (
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JoinColumn (
            name = "ID_PRODUCT",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_COMMENT_PRODUCT")
    )
    private Comment comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date commentDate;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;

    @Column(name = "USER_ID", nullable = false)
    private Long userId;

}
