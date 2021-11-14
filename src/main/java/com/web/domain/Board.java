package com.web.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.User;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Board implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column
    private String title;
    @Column
    private String subtitle;
    @Column
    private String content;
    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;
    @Column
    private LocalDateTime createdDate;
    @Column
    private LocalDateTime updatedDate;
    @Column
    private String user;

    @Builder
    public Board(String title,String subtitle,String content,BoardType boardType,LocalDateTime createdDate,LocalDateTime updatedDate,String user){
        this.title=title;
        this.subtitle=subtitle;
        this.content=content;
        this.boardType=boardType;
        this.createdDate=createdDate;
        this.updatedDate=updatedDate;
        this.user=user;
    }

}
