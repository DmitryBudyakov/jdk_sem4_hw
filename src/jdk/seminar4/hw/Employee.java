package jdk.seminar4.hw;

public class Employee {
    private int id;
    private String name;
    private String phoneNumber;
    private int experience;

    public Employee(int id, String name, String phoneNumber, int experience) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append(", ");
        sb.append(name);
        sb.append(", ");
        sb.append(phoneNumber);
        sb.append(", ");
        sb.append(experience);
        sb.append("]");
        return sb.toString();
    }
}
