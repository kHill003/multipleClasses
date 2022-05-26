import java.util.ArrayList;

public class Bus {


    private String destination;
    private int capacity;
    private ArrayList<Person>people;

    Person person;

public Bus (String Destination, int capacity){
    this.capacity = capacity;
    this.destination = destination;
    this.people = new ArrayList<Person>();

}

public int getPeopleCount(){
    return this.people.size();
}

public int getCapacity() {
    return capacity;
    }


    public void addPeaple(Person person) {
        if (this.getPeopleCount() < this.getCapacity())
        {
            this.people.add(person);
        }
    }

    public void removePeople(Person person) {
    this.people.remove(person);
    }


}
