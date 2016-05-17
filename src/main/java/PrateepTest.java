import com.prateep.model.Book;
import com.prateep.model.UserDetail;
import com.prateep.model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by prateep.gedupudi on 16-05-2016.
 */
public class PrateepTest {
    public static void main(String args[]) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        UserDetail userDetail = new UserDetail();
        userDetail.setUserName("Prateep");

        Book book1 = new Book();
        book1.setBookName("Tesla");
        Book book2 = new Book();
        book2.setBookName("Motors");

        Set<Book> books = new HashSet<Book>();
        books.add(book1);
        books.add(book2);

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Yamaha-FZ");

        Set<Vehicle> vehicles = new HashSet<Vehicle>();
        vehicles.add(vehicle);

        userDetail.setBooks(books);
        userDetail.setVehicles(vehicles);

        book1.getCheckedUsers().add(userDetail);
        book2.getCheckedUsers().add(userDetail);
        vehicle.getUsers().add(userDetail);

        session.save(userDetail);
        session.save(book1);
        session.save(book2);
        session.save(vehicle);
        session.getTransaction().commit();
        session.close();
    }
}
