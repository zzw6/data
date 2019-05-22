package com.javalei.data.biz;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.spider.SpiderBean;
import com.javalei.data.dao.postDao;
import com.javalei.data.entity.zuanke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: zzw
 * Date: 2019-05-22-21:35
 * Description: 1
 */
@Service("consolePipeline")
public class ConsolePipeline implements Pipeline<zuanke> {
    @Autowired
    private postDao dao;
    @Override
    public void process(zuanke zuanke) {
            zuanke.getPostList().forEach(post -> {
                int i = dao.insert(post);
                System.out.println(i);
            });
    }
}