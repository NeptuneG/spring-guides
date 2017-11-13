package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String name;
    private String blog;

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of blog
	* @return
	*/
	public String getBlog() {
		return blog;
	}

	/**
	* Sets new value of blog
	* @param
	*/
	public void setBlog(String blog) {
		this.blog = blog;
	}

	/**
	* Create string representation of User for printing
	* @return
	*/
	@Override
	public String toString() {
		return "User [name=" + name + ", blog=" + blog + "]";
	}
}
