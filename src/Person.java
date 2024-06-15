public class Person {
    private String name;
    private String surname;

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }

    public void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
