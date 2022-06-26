package com.koraygerigitmez.interprobe.interprobehomework;

import com.koraygerigitmez.interprobe.interprobehomework.comment.dao.CommentDao;
import com.koraygerigitmez.interprobe.interprobehomework.comment.entity.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterprobeHomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterprobeHomeworkApplication.class, args);
	}

}
