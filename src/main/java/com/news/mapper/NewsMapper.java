package com.news.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.news.entity.News;

@Mapper
public interface NewsMapper {
	String TABLE_NAME = "news";
	String INSERT_FIELDS ="news_name,created_time,news_date,news_content,topic_id,tag_id,author_id";
	String VALUES_FIELDS = "#{newsName},#{createdTime},#{newsDate},#{newsContent},#{topicId},#{tagId},#{authorId}";
	@Insert({"insert into ",TABLE_NAME,"(",INSERT_FIELDS,") values (",VALUES_FIELDS,")"})
	int addNews(News news);
}
