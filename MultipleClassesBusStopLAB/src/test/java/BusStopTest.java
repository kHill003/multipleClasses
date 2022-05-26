import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusStopTest {
    Person person;
    Person person1;
    Person person2;

    BusStop busStop;

    @Before
    public void Setup() {
        busStop = new BusStop("Stoke Newington");
        person = new Person();
    }
    @Test
    public void QueueIsEmptyToStart() {
        assertEquals(0,busStop.QueueCount());
    }
    @Test
    public void CanAddPersonFromQueue(){
        busStop.addFromQueue(person);
        assertEquals(1,busStop.QueueCount());

    }
    @Test
    public void canRemovePerson() {
        busStop.addFromQueue(person);
        busStop.addFromQueue(person1);
        busStop.removeFromQueue(person);
        assertEquals(1, busStop.QueueCount());
    }
}