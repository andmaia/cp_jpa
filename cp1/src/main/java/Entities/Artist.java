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
@Table(name="tb_artist")
public class Artist {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nm_artist")
	private String artistName;
	@Column(name="tp_artist")
	private String artistType;
	
	@ManyToMany
	@JoinTable(name="tb_track_artist",
			joinColumns = @JoinColumn(name="artist_id"),
			inverseJoinColumns = @JoinColumn(name="track_id")
			)
	private List<Track> tracks = new ArrayList<Track>();
	
	public Artist() {
		
	}
	
	public Artist(Long id, String artistName, String artistType) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.artistType = artistType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getArtistType() {
		return artistType;
	}
	public void setArtistType(String artistType) {
		this.artistType = artistType;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	public void InserirArtistTrack(Track track) {
		this.tracks.add(track);
		track.getArtists().add(this);
	}
	
	
	
}
