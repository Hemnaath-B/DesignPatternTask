public class UserBuilder {
    String firstname;
    String lastname;
    String jobtitle;

    public UserBuilder setFirstName(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public UserBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public UserBuilder setJob(String jobtitle) {
        this.jobtitle = jobtitle;
        return this;
    }

    public User build(){
        return new User(this);
    }
}
