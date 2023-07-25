package com.example.rabbitmq_example.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;


@AllArgsConstructor
@ToString
@Getter
public class Exobject{
    String name;
    String content;
    Date date;

    @JsonCreator
    public Exobject(@JsonProperty("content") String content,
                    @JsonProperty("date") Date date,
                    @JsonProperty("name") String name) {
        this.content = content;
        this.date = date;
        this.name = name;
    }
}
