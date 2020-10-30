package infrastusture.data;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class FileDataMapper implements DataMapper {
    private final String DELMITER = ";";
    private final int MIN_USER_ARG_LENGTH = 3;
    private final static String USER_FILE_PATH = "users.txt";
    private List<User> users = new ArrayList();

    public FileDataMapper() {
        this(USER_FILE_PATH);
    }

    public FileDataMapper(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            reader.lines().filter(line -> getUserConstructorArgs(line).length > MIN_USER_ARG_LENGTH)
                    .forEach(filteredLine -> users.add(new User(getUserConstructorArgs(filteredLine))));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("unable to read data from file");
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to work with I/O streams");
        }
    }

    private String[] getUserConstructorArgs(String line) {
        return line.split(DELMITER);
    }

    @Override
    public User findUserByEmail(String email) {
        return users.stream().filter(user -> user.getUserEmail().equals(email)).findFirst()
                .orElseThrow(() -> new UserNotFoundException(format("can't find user with %s", email)));
    }

    @Override
    public User findUserByUserName(String name) {
        return users.stream().filter(user -> user.getUserName().equals(name)).findFirst()
                .orElseThrow(() -> new UserNotFoundException(format("can't find user with %s", name)));
    }

    public List<User> getAll() {
        return users;
    }

}
