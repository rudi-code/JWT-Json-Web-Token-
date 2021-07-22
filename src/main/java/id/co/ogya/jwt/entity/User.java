package id.co.ogya.jwt.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name= "users")
public class User {
	@Id   
    @Column(name="UserID")	
    @GenericGenerator(name = "user_id", strategy = "com.workup.model.UserIdGenerator")
    @GeneratedValue(generator = "user_id")	
	@Size(max=6)
	private String userid;
	
	@Column(name="email", unique=true, nullable=false)
	@Size(max=50)
	private String email;
	
	@Column(name="username", unique=true, nullable=false)
	@Size(max=25)
	private String username;
	
	@Column(name="password")
	@NotBlank
	@Size(min = 6, max = 100)
	private String password;
	
	@Column(name="fullname")
	@NotNull
	@Size(max=50)
	private String fullname;
	

//	@JsonBackReference(value = "userRole")
//	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JoinColumn(name = "role_id")
//    private Role roles;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

	public User() {
		
	}	

	public User(String email, String username, String password, String fullname) {
		this.email = email;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}	
	
	
}