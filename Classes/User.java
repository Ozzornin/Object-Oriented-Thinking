
import java.util.*;

/**
 * 
 */
public abstract class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String surname;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Role role;

    /**
     * 
     */
    private Dormitory dormitory;

    /**
     * 
     */
    private DormitoryService dormitoryService;

    /**
     * @param name 
     * @param surname 
     * @param email 
     * @param password 
     * @param dormitory
     */
    public void User(String name, String surname, String email, String password, Dormitory dormitory) {
        // TODO implement here
    }

    /**
     * @param role 
     * @return
     */
    public void setRole(Role role) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Role getRole() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getSurname() {
        // TODO implement here
        return "";
    }

    /**
     * @param surname 
     * @return
     */
    public void setSurname(String surname) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return "";
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        // TODO implement here
        return null;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Dormitory getDormitory() {
        // TODO implement here
        return null;
    }

}