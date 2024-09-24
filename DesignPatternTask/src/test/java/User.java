public class User {
    String firstname;
    String lastname;
    String jobtitle;

    User(UserBuilder builder){
        this.firstname=builder.firstname;
        this.lastname=builder.lastname;
        this.jobtitle=builder.jobtitle;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public String getLastname() {
        return lastname;
    }
}
