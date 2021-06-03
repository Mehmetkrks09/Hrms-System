package kodlama.io.Hrms.entities.concretes.CV;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kodlama.io.Hrms.entities.concretes.Job;
import kodlama.io.Hrms.entities.concretes.JobAdvertisement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv")
public class CvMain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	@Column(name = "id")
	private int id;

	@Column(name = "jobSeeker_id")
	private int jobSeeker_id;

	@Column(name = "photo")
	private String photo;

	@Column(name = "github_link")
	private String GitHubLink;

	@Column(name = "linkedin_link")
	private String LinkedLink;

	@Column(name = "description")
	private String description;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "active")
	private boolean active;

}