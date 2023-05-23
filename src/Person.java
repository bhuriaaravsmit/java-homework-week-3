public class Person {

    String firstName, lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        if(firstName.isEmpty()){
            return lastName;

        }
        else if(lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEmpty() {
        if (firstName.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if(this.age>12 && this.age<20){
        return true;
        }else{
            return false;
        }
    }
    public void setAge(int age) {
        if(age<0 || age>100){
            this.age=0;
        }else {
            this.age = age;
        }
    }


    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }




}
