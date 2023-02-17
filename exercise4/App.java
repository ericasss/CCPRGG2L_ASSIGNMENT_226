public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");

        // Person Object
        Person Me = new Person("Erica", 19);
        // Person Object
        Person Friend = new Person("Aicka", 18);

        Me.addFriend(Friend);


        // Pet Object
        Pet Dog = new Pet("Niel", 5, Me);
        Dog.showOwner();

        Person Classmate = new Person("Anna", 18);
        Person Classmate1 = new Person("Niel", 18);
        Person Classmate2 = new Person("Mika", 19);
        Person Classmate3 = new Person("Jordan", 19);

        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);

        Car SportsCar =  new Car("Ferrari", "Pink", Me);
        SportsCar.showOwner();


    }
}
