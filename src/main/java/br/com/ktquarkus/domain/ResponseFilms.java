package br.com.ktquarkus.domain;

import java.util.List;
import lombok.Data;

public @Data class ResponseFilms{
	private Object next;
	private Object previous;
	private int count;
	private List<ResultsItem> results;
}