package java.dataMapperTests;

import infrastusture.data.DataMapper;
import infrastusture.data.FileDataMapper;
import infrastusture.data.User;
import infrastusture.data.UserNotFoundException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NegativeDataMapperTestCase extends BaseTest{
    @Test
    public void findUserByEmailTest(){
        ex.expectMessage("can't find user with user6999@gmail.com");
        ex.expect(UserNotFoundException.class);
        mapper = new FileDataMapper();
        User expectedUser = new User("6", "user6", "user6@gmail.com", "6666666qwe");
        User actualUser = mapper.findUserByEmail("user6999@gmail.com");
    }
}
