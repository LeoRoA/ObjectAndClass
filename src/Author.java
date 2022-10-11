import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /*public String getFullName() {
        return firstName + ' ' + lastName;
    }*/

    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    //@Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

