package com.example.inshortsnewsapp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DataModel implements Serializable {

	@SerializedName("author")
	private String author;

	@SerializedName("content")
	private String content;

	@SerializedName("date")
	private String date;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("readMoreUrl")
	private String readMoreUrl;

	@SerializedName("time")
	private String time;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setReadMoreUrl(String readMoreUrl){
		this.readMoreUrl = readMoreUrl;
	}

	public String getReadMoreUrl(){
		return readMoreUrl;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"DataModel{" + 
			"author = '" + author + '\'' + 
			",content = '" + content + '\'' + 
			",date = '" + date + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",readMoreUrl = '" + readMoreUrl + '\'' + 
			",time = '" + time + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}