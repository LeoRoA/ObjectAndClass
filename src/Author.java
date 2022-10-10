import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    /*public String getFullName() {
        return this.firstName + ' ' + this.lastName;
    }*/

    public String toString() {
        return this.firstName + " " + this.lastName ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(getFirstName(), author.getFirstName()) &&
                Objects.equals(getLastName(), author.getLastName());
    }

    //@Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

