package com.springai.semanticsearch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimilaritySearchRequest {
    private String input;

    public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private String language;
}
