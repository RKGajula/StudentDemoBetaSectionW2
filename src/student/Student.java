/*
 * 
 * Student ID: 999999999
 * Syst date is 31 Jan 2019.
 */
package student;

/**
 *
 * @author none
 */
public class Student {

    private String name;
    private int studentId;
    private int numOfHours;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return studentId;
    }

    /**
     * @param id the id to set
     */
    public void setId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the numOfHours
     */
    public int getNumOfHours() {
        return numOfHours;
    }

    /**
     * @param numOfHours the numOfHours to set
     */
    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }
    
}
