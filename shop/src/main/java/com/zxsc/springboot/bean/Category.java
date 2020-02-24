package com.zxsc.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category implements Serializable {
    private Integer id;
    private Integer parent_id;
    private String name;
    private Integer status;
    private Integer sort;
    private Integer is_parent;
    private Date created;
    private Date updated;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", sort=" + sort +
                ", is_parent=" + is_parent +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
