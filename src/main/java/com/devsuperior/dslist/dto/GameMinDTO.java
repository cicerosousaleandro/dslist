package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

	private long id;
	private String title;
	private Integer yaer;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(){
		
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		yaer = entity.getYaer();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYaer() {
		return yaer;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
