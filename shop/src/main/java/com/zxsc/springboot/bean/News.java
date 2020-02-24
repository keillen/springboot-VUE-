package com.zxsc.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class News {
    private Integer id;
    private String title;
    private String color;
    private Integer status;
    private Integer sort;
    private String url;
    private Date created;
    private Date updated;

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", status=" + status +
                ", sort=" + sort +
                ", url='" + url + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
