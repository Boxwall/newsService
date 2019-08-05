package com.news.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.news.entity.Reader;

@Mapper
public interface ReaderMapper {
	String TABLE_NAME = "reader";
	String INSERT_FIELDS ="reader_name,nick_name,e_mail,topic_total,topic_list";
	String VALUES_FIELDS = "#{readerName},#{nickName},#{eMail},#{topicTotal},#{topicList}";
	@Insert({"insert into ",TABLE_NAME,"(",INSERT_FIELDS,") values (",VALUES_FIELDS,")"})
	int addReader(Reader reader);	
	
	Reader getReader(@Param("id") Integer id,@Param("reader_name") String readerName,@Param("nick_name") String nickName);
	
	Integer getReaderCount();
	
	Integer updateReader(@Param("id") Integer id,@Param("reader_name") String readerName,@Param("nick_name") String nickName,@Param("e_mail") String eMail,@Param("topic_total")Integer topicTotal,@Param("topic_list") String topicList);
}
