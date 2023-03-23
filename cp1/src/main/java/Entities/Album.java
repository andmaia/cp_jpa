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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_album")
public class Album {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="id_artist")
	private Artist artist;
		
	@ManyToOne
	@JoinColumn(name="id_record_label")
	private RecordLabel recordLabel;
	
	@Column(name="nm_album")
	private String albumName;
	@Column(name="tp_album")
	private String albumType;
	private String albumReleased;
	private String albumRecorded;
	
	
	@ManyToMany
	@JoinTable(name="tb_album_track",
			joinColumns = @JoinColumn(name="album_id"),
			inverseJoinColumns = @JoinColumn(name="track_id")
			)
	private List<Track> tracks = new ArrayList<Track>();
	
	public Album() {
		
	}
	
	
	
	public Album(Long id, Artist artist, RecordLabel recordLabel, String albumName, String albumType,
			String albumReleased, String albumRecorded) {
		super();
		this.id = id;
		this.artist = artist;
		this.recordLabel = recordLabel;
		this.albumName = albumName;
		this.albumType = albumType;
		this.albumReleased = albumReleased;
		this.albumRecorded = albumRecorded;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public RecordLabel getRecordLabel() {
		return recordLabel;
	}
	public void setRecordLabel(RecordLabel recordLabel) {
		this.recordLabel = recordLabel;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumType() {
		return albumType;
	}
	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}
	public String getAlbumReleased() {
		return albumReleased;
	}
	public void setAlbumReleased(String albumReleased) {
		this.albumReleased = albumReleased;
	}
	public String getAlbumRecorded() {
		return albumRecorded;
	}
	public void setAlbumRecorded(String albumRecorded) {
		this.albumRecorded = albumRecorded;
	}
	
	
	
}
