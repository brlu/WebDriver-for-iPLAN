
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//Notes: Not works in FireFox 47. 46.0.1 is okay 


@RunWith(Suite.class)
//@SuiteClasses({Login.class})
@SuiteClasses({Login.class, SetupStandardForecast.class, ExecStandardForecast.class, ViewStandardForecast.class})
//@SuiteClasses({Login.class, StandardForecastNavigate.class})
public class StandardForecastQASuite {

}
