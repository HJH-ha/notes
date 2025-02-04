package com.secure.notes.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // id

    @Lob  // 많은 글자 , 큰 데이터 255개 이상 문자저장
    private String content;            // 노트내용
    private String ownerUsername;      //글쓴이이름
}
