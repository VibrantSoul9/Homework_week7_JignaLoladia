package homework_week7;

public class Person {
    String firstName, lastName;
    int age;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int age() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age){
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
        }
        public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
        }
        public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
        }
        public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is empty
        person.setLastName(""); // lastName is Empty
        person.setAge(10);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // first name is John
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith"); // last name is Smith
        System.out.println("fullNAme = " + person.getFullName());
    }
}
