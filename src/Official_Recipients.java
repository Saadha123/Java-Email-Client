// class to represent official recipients
public class Official_Recipients extends Recipients {
    protected String designation;

    public Official_Recipients(String name, String email, String designation) {
        super(name, email);
        this.designation = designation;
    }

}
