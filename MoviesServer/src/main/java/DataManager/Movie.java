package DataManager;
// Generated 2018-12-18 10:02:08 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Movie generated by hbm2java
 */
public class Movie implements java.io.Serializable {

	private Integer id;
	private String moviename;
	private String director;
	private String boxOffice;
	private String class_;
	private String year;
	private String month;
	private String day;
	private String introduce;
	private String thumburl;
	private String actor;
	private Integer rate;
	private Set actorLists = new HashSet(0);
	private Set ratings = new HashSet(0);
	private Set movieClasses = new HashSet(0);

	public Movie() {
	}

	public Movie(String moviename) {
		this.moviename = moviename;
	}

	public Movie(String moviename, String director, String boxOffice, String class_, String year, String month,
			String day, String introduce, String thumburl, String actor, Integer rate, Set actorLists, Set ratings,
			Set movieClasses) {
		this.moviename = moviename;
		this.director = director;
		this.boxOffice = boxOffice;
		this.class_ = class_;
		this.year = year;
		this.month = month;
		this.day = day;
		this.introduce = introduce;
		this.thumburl = thumburl;
		this.actor = actor;
		this.rate = rate;
		this.actorLists = actorLists;
		this.ratings = ratings;
		this.movieClasses = movieClasses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMoviename() {
		return this.moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getBoxOffice() {
		return this.boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getThumburl() {
		return this.thumburl;
	}

	public void setThumburl(String thumburl) {
		this.thumburl = thumburl;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Integer getRate() {
		return this.rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Set getActorLists() {
		return this.actorLists;
	}

	public void setActorLists(Set actorLists) {
		this.actorLists = actorLists;
	}

	public Set getRatings() {
		return this.ratings;
	}

	public void setRatings(Set ratings) {
		this.ratings = ratings;
	}

	public Set getMovieClasses() {
		return this.movieClasses;
	}

	public void setMovieClasses(Set movieClasses) {
		this.movieClasses = movieClasses;
	}

}
