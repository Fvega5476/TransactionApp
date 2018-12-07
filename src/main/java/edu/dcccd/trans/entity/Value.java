package edu.dcccd.trans.entity;

import lombok.Data;
import lombok.Getter;

@Data
public class Value {
    private int id;
    @Getter
    private String joke;

    public String getJoke() {
        return joke;
    }
}
