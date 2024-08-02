package com.ohgiraffers.dataexample;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseDTO {


    @JsonProperty("header")
    private Header header;

    @JsonProperty("body")
    private Body body;

    // getters and setters

    public static class Header {
        @JsonProperty("resultCode")
        private String resultCode;

        @JsonProperty("resultMsg")
        private String resultMsg;

        // getters and setters
    }

    public static class Body {
        @JsonProperty("items")
        private Items items;

        // getters and setters

        public static class Items {
            @JsonProperty("item")
            private List<Item> item;

            // getters and setters

            public static class Item {
                @JsonProperty("examregstartdt")
                private String examRegStartDt;

                @JsonProperty("examregenddt")
                private String examRegEndDt;

                @JsonProperty("examstartdt")
                private String examStartDt;

                @JsonProperty("examenddt")
                private String examEndDt;

                @JsonProperty("passstartdt")
                private String passStartDt;

                @JsonProperty("passenddt")
                private String passEndDt;

                // getters and setters
            }
        }
    }


}
