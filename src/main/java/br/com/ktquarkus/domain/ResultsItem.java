package br.com.ktquarkus.domain;

import java.util.List;
import lombok.Data;

public @Data class ResultsItem{
	private String edited;
	private String director;
	private String created;
	private List<String> vehicles;
	private String openingCrawl;
	private String title;
	private String url;
	private List<String> characters;
	private int episodeId;
	private List<String> planets;
	private String releaseDate;
	private List<String> starships;
	private List<String> species;
	private String producer;
}