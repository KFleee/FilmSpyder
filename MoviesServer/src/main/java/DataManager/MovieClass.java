package DataManager;
// Generated 2018-12-18 10:02:08 by Hibernate Tools 5.2.10.Final

/**
 * MovieClass generated by hbm2java
 */
public class MovieClass implements java.io.Serializable {

	private Integer id;
	private Movie movie;
	private String class_;

	public MovieClass() {
	}

	public MovieClass(Movie movie, String class_) {
		this.movie = movie;
		this.class_ = class_;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

}
