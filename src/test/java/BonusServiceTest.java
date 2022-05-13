import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/date.csv"})
    public void test(int amount, boolean registered, int expected) {
        BonusService service = new BonusService();

        int actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}

