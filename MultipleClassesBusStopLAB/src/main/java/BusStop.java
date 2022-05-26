import java.util.ArrayList;

public class BusStop {

    private String StopName;
    private ArrayList<Person> queue;

    public BusStop(String StopName) {
        this.StopName = StopName;
        this.queue = new ArrayList<Person>();

    }



    public int QueueCount() {
        return this.queue.size();
    }

    public void addFromQueue(Person person) {
        this.queue.add(person);
    }
//This is tricky as it wants a static?
    //This is becuase to move, it must return ...A person
    public void removeFromQueue(Person person) {
        if (this.queue.size() > 0) {
            this.queue.remove(person);
        }
//null means Null serves as the default value of
// any uninitialized reference variable, including instance variables and static variables
//    public Person removeFromQueue(Person person){
//      Person  myPerson = null;
//        if(this.QueueCount() > 0){
//            myPerson= this.queue.remove(0);
//        }
//        return myPerson;
//    }
    }
    }

