package com.helloworld.api.dto.tdk;

public enum ChannelType {
    HOMEPAGE("homepage", 1);


    private String eName;
    private int code;

    ChannelType(String eName, int code) {
        this.eName = eName;
        this.code = code;
    }
}
