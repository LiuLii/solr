package com.ll.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李林林
 * @desc
 * @since 2019/12/5 16:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolrData {

    private String id;
    private String title;
    private long price;
    private String sellPoint;
    private String image;
    private String catName;
    private String itemDesc;

}
