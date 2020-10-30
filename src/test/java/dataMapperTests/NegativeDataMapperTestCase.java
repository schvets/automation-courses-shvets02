package dataMapperTests;

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
        User actualUser = mapper.findUserByEmail("user6999@gmail.com");
    }

    @Test
    public void findUserByNameTest(){
        ex.expectMessage("can't find user with user6");
        ex.expect(UserNotFoundException.class);
        mapper = new FileDataMapper();
        User actualUser = mapper.findUserByUserName("user678");
    }

    @Test
    public void unableTorReadSourceFileTest(){
        ex.expectMessage("unable to read data from file");
        ex.expect(IllegalArgumentException.class);
        mapper = new FileDataMapper("users777.txt");
    }
}
