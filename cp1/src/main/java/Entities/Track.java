package Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_TRACK")
public class Track {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long Track_ID;
	@Column(name="nm_track")
	private String track_name;
	@Column(name="vl_lenght")
	private double track_lenght;
	@Column(name="vl_size")
	private double track_sixe;
	@Column(name="ds_language")
	private String track_language;
	@Column(name="vl_price")
	private String track_price;
	@Column(name="nm_producer")
	private String track_producer;
	@Column(name="nm)songwriters")
	private String track_songwriters;
	@Column(name="ds_released")
	private String track_released;
	
	@ManyToMany
	@JoinTable(name="tb_genre_track",
			joinColumns = @JoinColumn(name="track_id"),
			inverseJoinColumns = @JoinColumn(name="genre_id")
			)
	private List<Genre> genres= new ArrayList<Genre>();
	
	@ManyToMany(mappedBy = "tracks")
	private List<Album> albums = new ArrayList<Album>();
	
	@ManyToMany(mappedBy = "tracks")
	private List<Artist> artists = new ArrayList<Artist>();
	
	public Track() {
		
	}


	public Track(Long track_ID, String track_name, double track_lenght, double track_sixe, String track_language,
			String track_price, String track_producer, String track_songwriters, String track_released) {
		super();
		Track_ID = track_ID;
		this.track_name = track_name;
		this.track_lenght = track_lenght;
		this.track_sixe = track_sixe;
		this.track_language = track_language;
		this.track_price = track_price;
		this.track_producer = track_producer;
		this.track_songwriters = track_songwriters;
		this.track_released = track_released;
	}


	public Long getTrack_ID() {
		return Track_ID;
	}


	public void setTrack_ID(Long track_ID) {
		Track_ID = track_ID;
	}


	public String getTrack_name() {
		return track_name;
	}


	public void setTrack_name(String track_name) {
		this.track_name = track_name;
	}


	public double getTrack_lenght() {
		return track_lenght;
	}


	public void setTrack_lenght(double track_lenght) {
		this.track_lenght = track_lenght;
	}


	public double getTrack_sixe() {
		return track_sixe;
	}


	public void setTrack_sixe(double track_sixe) {
		this.track_sixe = track_sixe;
	}


	public String getTrack_language() {
		return track_language;
	}


	public void setTrack_language(String track_language) {
		this.track_language = track_language;
	}


	public String getTrack_price() {
		return track_price;
	}


	public void setTrack_price(String track_price) {
		this.track_price = track_price;
	}


	public String getTrack_producer() {
		return track_producer;
	}


	public void setTrack_producer(String track_producer) {
		this.track_producer = track_producer;
	}


	public String getTrack_songwriters() {
		return track_songwriters;
	}


	public void setTrack_songwriters(String track_songwriters) {
		this.track_songwriters = track_songwriters;
	}


	public String getTrack_released() {
		return track_released;
	}


	public void setTrack_released(String track_released) {
		this.track_released = track_released;
	}


	public List<Genre> getGenres() {
		return genres;
	}


	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}


	public List<Album> getAlbums() {
		return albums;
	}


	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}


	public List<Artist> getArtists() {
		return artists;
	}


	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	
	public void adicionarTrackGenre(Genre genre) {
		this.genres.add(genre);
		genre.getTracks().add(this);
	}
	
	
}
