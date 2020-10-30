package dataMapperTests;

import infrastusture.data.FileDataMapper;
import infrastusture.data.User;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


public class PositiveDataMapperTest extends BaseTest {
    @Test
    public void findUserByEmailTest(){
        mapper = new FileDataMapper();
        User expectedUser = new User("6", "user6", "user6@gmail.com", "6666666qwe");
        User actualUser = mapper.findUserByEmail("user6@gmail.com");
        Assert.assertEquals("user not match expected",expectedUser, actualUser);
    }

    @Test
    public void findUserByUserNameTest(){
        mapper = new FileDataMapper();
        User expectedUser = new User("5", "user5", "user5@gmail.com", "5555555qwe");
        User actualUser = mapper.findUserByUserName("user5");
        Assert.assertEquals("user not match expected",expectedUser, actualUser);
    }

    @Test
    public void readAllUsersFromFie(){
        FileDataMapper mapper = new FileDataMapper();
        List<User> actualUserList = mapper.getAll();
        assertThat("data from file not matched to actual data ",actualUserList, hasSize(9));
    }

}
