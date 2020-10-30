package lessons.lesson15;

public class MySuperExeption extends Throwable {
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public MySuperExeption(String message) {
        super(message);
    }
}
