import com.prateep.model.UserDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by prateep.gedupudi on 16-05-2016.
 */
public class PrateepTest {
    public static void main(String args[]){
        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        Session session= sf.openSession();
        session.beginTransaction();

        UserDetail userDetail=new UserDetail();
        userDetail.setUserName("Prateep");

        session.save(userDetail);
        session.getTransaction().commit();
        session.close();

    }
}
