package lessons.lesson17;

import infrastusture.data.FileDataMapper;
import infrastusture.data.User;

import java.util.List;


public class LessonApp {
    public static void main(String[] args) {
        FileDataMapper mapper = new FileDataMapper();
        List<User> users =  mapper.getAll();
        System.out.println(mapper.findUserByUserName("user1111"));
    }

}
