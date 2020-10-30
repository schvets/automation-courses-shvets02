package lessons.lesson16;

import infrastusture.data.FileDataMapper;
import lessons.lesson16.generic.Box;


public class LessonApp {
    public static void main(String[] args) {
        FileDataMapper mapper = new FileDataMapper();
//        System.out.println(Arrays.toString(mapper.getAll()));
//        System.out.println(mapper.findUserByEmail("user1@gmail.com"));
//        System.out.println(mapper.findUserByEmail("user9@gmail.com"));
//        System.out.println(mapper.findUserByEmail("user999@gmail.com"));

//        Developer dev = new JavaTeamLead(new JavaDeveloper());
//        System.out.println(dev.makeJob());

//        Box<String> box = new Box();
//        box.setItem("qqq");
//        String item1 = box.getItem();
//        item1.

        Box<Integer> box2 = new Box();
        box2.setItem(5);
        box2.sum();

        Box<Float> box3 = new Box();
        box3.setItem((float) 5.0);
        box3.sum();

        Box<Number> box4 = new Box();
        box4.setItem((float) 5.0);
        box4.setItem((short) 5.0);
        box3.sum();

        test2(5, 5);
        test2("eee","rrr");


    }

    public static <T extends String,K ,M > T test2(K item1, M item2){
        String s = String.valueOf((Integer) item1 + (Integer) item2);
        return (T) s;
}
}
