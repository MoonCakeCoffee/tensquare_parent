package com.tensquare.base.pojo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @projectName:tensquare_parent
 * @packageName:com.tensquare.base.pojo
 * @className:Label
 * @author:larry
 * @date:2019/12/19 0:25
 * @description:
 */
@Data
@Entity
@Table(name = "tb_label")
public class Label implements Serializable {
    @Id
    private String id;
    private String labelname; //标签名称
    private String state; //状态
    private Long count; //使用数量
    private String recommend; //是否推荐
    private Long fans; //关注数


}
