package facades;

import entities.Phone;
import org.eclipse.persistence.exceptions.DatabaseException;

public class PhoneFacade {

    public static void saveNewPhone(Phone phone) throws DatabaseException {
        PhoneMapper.saveNewPhone(phone);
    }
}
