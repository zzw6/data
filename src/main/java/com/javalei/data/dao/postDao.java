package com.javalei.data.dao;

import com.javalei.data.entity.Post;
 import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * User: zzw
 * Date: 2019-05-23-00:06
 * Description: post的接口
 * 	create table 	Post(
 * 		id int  AUTO_INCREMENT,
 * 		title_id int,
 * 		title VARCHAR(500) ,
 * 		link VARCHAR(1000),
 * 		author VARCHAR(200),
 * 		create_time Date ,
 * 		browse_volume int   DEFAULT '0',
 * 		 primary key(id)
 * )
 */

@Mapper
@Service
public interface postDao {
    @Insert("insert into post(title,link,author) values(#{title},#{link},#{author})")
    int insert(Post post);
}
