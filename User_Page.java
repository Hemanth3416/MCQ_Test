package Mcq_Test;

public class User_Page 
{
	private String username;
    private String password;
    private String profile;

    public User_Page(String username, String password, String profile) 
    {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProfile() {
        return profile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
