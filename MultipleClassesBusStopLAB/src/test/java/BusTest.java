import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {
    Bus bus;
    Person person;
    Person person1;
    Person person2;
    Person person3;

    BusStop busStop;

    @Before
    public void Setup() {
        bus = new Bus("Hackney Central", 100);
        person = new Person();


    }

    @Test
    public void passengerCountStartsAt0() {
        assertEquals(0, bus.getPeopleCount());
    }

    @Test
    public void getBusCapacity() {
        assertEquals(100, bus.getCapacity());

    }

    @Test
    public void CanAddPeopleToTheBus() {
        bus.addPeaple(person);
        bus.addPeaple(person1);
        bus.addPeaple(person2);
        bus.addPeaple(person3);

        assertEquals(4, bus.getPeopleCount());
    }

    @Test
    public void canRemovePerson() {
        bus.addPeaple(person);
        bus.addPeaple(person1);
        bus.removePeople(person);
        assertEquals(1, bus.getPeopleCount());

    }


}
