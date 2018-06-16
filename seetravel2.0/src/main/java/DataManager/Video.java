package DataManager;
// Generated 2018-5-6 18:06:16 by Hibernate Tools 5.3.0.Beta2

/**
 * Video generated by hbm2java
 */
public class Video implements java.io.Serializable {

	private Integer id;
	private int owner;
	private String videoname;
	private String videourl;
	private String location;
	private Integer likes;
	private String abstract_;

	public Video() {
	}

	public Video(int owner, String videoname, String videourl) {
		this.owner = owner;
		this.videoname = videoname;
		this.videourl = videourl;
	}

	public Video(int owner, String videoname, String videourl, String location, Integer likes, String abstract_) {
		this.owner = owner;
		this.videoname = videoname;
		this.videourl = videourl;
		this.location = location;
		this.likes = likes;
		this.abstract_ = abstract_;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getOwner() {
		return this.owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public String getVideoname() {
		return this.videoname;
	}

	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}

	public String getVideourl() {
		return this.videourl;
	}

	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

}
