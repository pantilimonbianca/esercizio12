public class Person {

    private String name;
    private String surname;
    private double height;

    private int age;

    public Person(String name, String surname, double height, int age) {
        this.setName(name);
        this.setSurname(surname);
        this.setHeight(height);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", height=" + getHeight() +
                ", age=" + getAge() +
                '}';
    }
}
