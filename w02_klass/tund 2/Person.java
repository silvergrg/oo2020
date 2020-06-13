/**
 * Person
 */
public class Person {

    private String name;
    private int age;
    //private String gender;
    private Gender gender;

    public Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    //see on default, nt. kui kasutaja ei taha midagi sisestada
    public Person(){
        name = "Mati";
        age = 50;
        gender = Gender.MEES;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public String getGender(){
        if(gender == Gender.MEES){
            return "Mees";
        }else{
            return "Naine";
        }
    }

    public void myFriend(Person person){
        System.out.println("Minu sõber on " + person.getName());
    }

}