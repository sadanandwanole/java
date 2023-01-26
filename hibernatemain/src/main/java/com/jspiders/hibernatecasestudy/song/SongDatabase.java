package com.jspiders.hibernatecasestudy.song;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "SongsHibernate")
public class SongDatabase {
	@Id
	private int id;
	
	@Column(name = "Song_Name")
	private String name;
	
	@Column(name="Singer_Name")
	private String singer;
	
	private double duration;
	
	@Column(name="movie_album")
	private String Movie;
	
	private String lyrics;
	

}
