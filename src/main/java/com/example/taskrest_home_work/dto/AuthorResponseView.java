package com.example.taskrest_home_work.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuthorResponseView {
    private List< AuthorResponse > authorResponse;
}
