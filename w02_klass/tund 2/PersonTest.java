/**
 * PersonTest
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("Silver", 32, Gender.MEES);
        Person person2 = new Person();
        /*System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getGender());
        */
        person1.myFriend(person1);

        Person[] people = {person1, person2};

        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
            System.out.println(people[i].getAge());
            System.out.println(people[i].getGender());
        }
    }
}