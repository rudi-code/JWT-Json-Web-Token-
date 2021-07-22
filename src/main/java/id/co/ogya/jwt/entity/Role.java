package id.co.ogya.jwt.entity;

public class Role {
	
	private long id;
	private RoleName name;
	
	public Role() {
    }

    public Role(RoleName name) {
        this.name = name;
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public RoleName getName() {
		return name;
	}
	public void setName(RoleName name) {
		this.name = name;
	}
	
	
	

}
