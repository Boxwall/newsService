package com.news.entity;

public class News {
	private Long newsId;
	private String newsName;
	private Long createdTime;
	private String newsDate;
	private String newsContent;
	private Integer topicId;
	private Integer tagId;
	private Integer authorId;
	public Long getNewsId() {
		return newsId;
	}
	public void setNewsIdLong(Long newsId) {
		this.newsId = newsId;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public Long getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}
	public String getNewsDate() {
		return newsDate;
	}
	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsName=" + newsName + ", createdTime=" + createdTime
				+ ", newsDate=" + newsDate + ", newsContent=" + newsContent + ", topicId=" + topicId + ", tagId="
				+ tagId + ", authorId=" + authorId + "]";
	}
	
	
}
