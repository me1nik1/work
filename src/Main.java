import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        {
            int value = 33;
            changeValue(value);
            System.out.println(value);
        }

        {
            Integer value = 33;
            changeValue(value);
            System.out.println(value);
        }
        {
            Integer[] value = new Integer[]{3, 4};
            changeValue(value);
            System.out.println(Arrays.toString(value));
            changeValue2(value);
            System.out.println(Arrays.toString(value));
        }
        {
            Person person = new Person("Lyapis", "Trubetskoy");
            person.changePerson(person);
            System.out.println(person);
            person.changePerson2(person);
            System.out.println(person);
        }
    }

    private static void changeValue(int value) {
        value = 22;
    }

    private static void changeValue(Integer value) {
        value = 22;
    }

    private static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    private static void changeValue2(Integer[] value) {
        value[0] = 99;
    }
}