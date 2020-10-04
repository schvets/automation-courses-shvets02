package main.lessons.lesson14;

public class LessonApp {
    public static void main(String[] args) {
//        Currency.values();
//        Currency uan = Currency.valueOf("UAN");
//        Currency.valueOf("uan".toUpperCase());
//        Enum.valueOf(Currency.class, "UAN");

        new TestUrl.Builder().withProtocol("http://")
                .withDomain("google.com.ua")
                .withDomain("test.com.ua")

                .withPort("80")
                .withPath("/search")
                .withParam("q", "test")
                .build();
    }

    public static void selectCur(Currency cur){
        switch (cur){
            case EUR:
                System.out.println("hryvna");
            case UAN:
                System.out.println("evro");
            case USD:
                System.out.println("dollar");
        }
    }
}
