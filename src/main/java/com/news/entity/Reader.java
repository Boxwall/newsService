package com.news.entity;

public class Reader {
	private Integer id;
	private String readerName;
	private String nickName;
	private String eMail;
	private Integer topicTotal;
	private String topicList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Integer getTopicTotal() {
		return topicTotal;
	}
	public void setTopicTotal(Integer topicTotal) {
		this.topicTotal = topicTotal;
	}
	public String getTopicList() {
		return topicList;
	}
	public void setTopicList(String topicList) {
		this.topicList = topicList;
	}
	@Override
	public String toString() {
		return "Reader [id=" + id + ", readerName=" + readerName + ", nickName=" + nickName + ", eMail=" + eMail
				+ ", topicTotal=" + topicTotal + ", topicList=" + topicList + "]";
	}
	
	
	
}
