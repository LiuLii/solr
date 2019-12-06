package com.ll.controller;

import com.ll.pojo.SolrData;
import com.ll.service.ISolrService;
import com.mysql.jdbc.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author 李林林
 * @desc
 * @since 2019/12/5 16:52
 */
@RestController
public class SolrController {

    @Resource
    private ISolrService solrService;

    @GetMapping("/SolrDatas")
    public List<SolrData> getAllData(){
        return solrService.getAllData();
    }

    @GetMapping("/dataFromDB2Solr")
    public boolean dataFromDB2Solr(){
        return solrService.dataFromDB2Solr();
    }

    @GetMapping("/search")
    public List<SolrData> getDatasFromSolr(@RequestParam(value="keyword", defaultValue="") String keyword,
                                           @RequestParam(value="page", defaultValue="1") int pageNum,
                                           @RequestParam(value="pageSize", defaultValue="10") int pageSize) throws UnsupportedEncodingException {

        if(!StringUtils.isNullOrEmpty(keyword)){
            keyword = new String(keyword.getBytes("ISO-8859-1"), "UTF-8");
        }

        return solrService.getDataFromSolrByKeyWord(keyword, pageNum, pageSize);
    }


}
