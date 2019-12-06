package com.ll.service;

import com.ll.pojo.SolrData;

import java.util.List;

/**
 * @author 李林林
 * @desc
 * @since 2019/12/5 16:48
 */
public interface ISolrService {

    List<SolrData> getAllData();

    boolean dataFromDB2Solr();

    List<SolrData> getDataFromSolrByKeyWord(String keyword, int pageNum, int pageSize);

}
