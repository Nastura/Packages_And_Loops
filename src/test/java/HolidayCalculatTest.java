import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.HolidayCalculationService;


public class HolidayCalculatTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/dano.csv")

    public void HolidayTest(int income, int expenses, int threshold) {

        HolidayCalculationService service = new HolidayCalculationService();
        int count = service.calculate(income, expenses, threshold);
        System.out.println(count);
        System.out.println();


    }

}