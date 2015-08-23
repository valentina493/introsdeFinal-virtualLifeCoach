package processlogicservice.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = { "generalComment", "suggestion", "quote", "recipe", "color"})
public class MyResponse implements Serializable {
	private static final long serialVersionUID = -7477364185013158802L;
	
	@XmlElement String generalComment;
	@XmlElement String suggestion;
	@XmlElement Quote quote;
	@XmlElement Recipe recipe;
	@XmlElement String color;
	
	public MyResponse(){}
	
	public Quote getQuote() {
		return quote;
	}
	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public String getGeneralComment() {
		return generalComment;
	}
	public void setGeneralComment(String generalComment) {
		this.generalComment = generalComment;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
