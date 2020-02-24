package com.zxsc.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Slide {
    private Integer id;
    private String title;
    private String pic;
    private Integer status;
    private Integer sort;
    private String url;
    private Date created;
    private Date updated;

    @Override
    public String toString() {
        return "Slide{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", status=" + status +
                ", sort=" + sort +
                ", url='" + url + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
