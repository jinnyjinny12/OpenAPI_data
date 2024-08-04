package com.ohgiraffers.dataexample;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseDTO {


    @JsonProperty("header")
    private Header header;

    @JsonProperty("body")
    private Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public static class Header {
        @JsonProperty("resultCode")
        private String resultCode;

        @JsonProperty("resultMsg")
        private String resultMsg;

        // getters and setters


        public String getResultCode() {
            return resultCode;
        }

        public void setResultCode(String resultCode) {
            this.resultCode = resultCode;
        }

        public String getResultMsg() {
            return resultMsg;
        }

        public void setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
        }
    }

    public static class Body {
        @JsonProperty("items")
        private Items items;

        // getters and setters


        public Items getItems() {
            return items;
        }

        public void setItems(Items items) {
            this.items = items;
        }

        public static class Items {
            @JsonProperty("item")
            private List<Item> item;

            // getters and setters


            public List<Item> getItem() {
                return item;
            }

            public void setItem(List<Item> item) {
                this.item = item;
            }

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


                public String getExamRegStartDt() {
                    return examRegStartDt;
                }

                public void setExamRegStartDt(String examRegStartDt) {
                    this.examRegStartDt = examRegStartDt;
                }

                public String getExamRegEndDt() {
                    return examRegEndDt;
                }

                public void setExamRegEndDt(String examRegEndDt) {
                    this.examRegEndDt = examRegEndDt;
                }

                public String getExamStartDt() {
                    return examStartDt;
                }

                public void setExamStartDt(String examStartDt) {
                    this.examStartDt = examStartDt;
                }

                public String getExamEndDt() {
                    return examEndDt;
                }

                public void setExamEndDt(String examEndDt) {
                    this.examEndDt = examEndDt;
                }

                public String getPassStartDt() {
                    return passStartDt;
                }

                public void setPassStartDt(String passStartDt) {
                    this.passStartDt = passStartDt;
                }

                public String getPassEndDt() {
                    return passEndDt;
                }

                public void setPassEndDt(String passEndDt) {
                    this.passEndDt = passEndDt;
                }
            }
        }
    }


}
