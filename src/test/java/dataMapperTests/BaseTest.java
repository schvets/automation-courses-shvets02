package dataMapperTests;

import infrastusture.data.DataMapper;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class BaseTest {
    protected DataMapper mapper;
    @Rule
    public ExpectedException ex = ExpectedException.none();
}
