package com.zxsc.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    private Integer id;
    private Integer cid;
    private String title;
    private String sell_point;
    private String price;
    private Integer num;
    private String pic;
    private Integer status;
    private String content;
    private String album;
    private Date created;
    private Date updated;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", cid=" + cid +
                ", title='" + title + '\'' +
                ", sell_point='" + sell_point + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", pic='" + pic + '\'' +
                ", status=" + status +
                ", content='" + content + '\'' +
                ", album='" + album + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
