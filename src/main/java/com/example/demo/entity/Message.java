package com.example.demo.entity;

import javax.validation.constraints.NotNull;


public class Message {
    @NotNull
    public String sender;
    @NotNull
    public String receiver;
    @NotNull
    public String text;
    public boolean seen;
    public String sentDate;
}
