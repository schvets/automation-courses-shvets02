package lessons.lesson17;

import infrastusture.data.FileDataMapper;
import infrastusture.data.User;


public class LessonApp {
    public static void main(String[] args) {
        FileDataMapper mapper = new FileDataMapper();
        User[] users = mapper.getAll();
        System.out.println(mapper.findUserByUserName("user1111"));
    }

}
