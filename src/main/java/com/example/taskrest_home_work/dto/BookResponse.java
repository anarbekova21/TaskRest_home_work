package com.example.taskrest_home_work.dto;

import com.example.taskrest_home_work.enums.Gender;
import com.example.taskrest_home_work.enums.Genre;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BookResponse {
    private Long id;
    private String name;
    private LocalDate publicationDate;
    private String description;
    private Genre genre;
    private String publisher;
    private int bookYear;

}
