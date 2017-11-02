package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {

    private String content;
    private long id;

	/**
	* Default empty Greeting constructor
	*/
	public Greeting() {
		super();
	}

	/**
	* Default Greeting constructor
	*/
	public Greeting(String content, long id) {
		super();
		this.content = content;
		this.id = id;
	}

	/**
	* Returns value of content
	* @return
	*/
	public String getContent() {
		return content;
	}

	/**
	* Sets new value of content
	* @param
	*/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	* Returns value of id
	* @return
	*/
	public long getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(long id) {
		this.id = id;
	}

	/**
	* Create string representation of Greeting for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Greeting [content=" + content + ", id=" + id + "]";
	}
}
