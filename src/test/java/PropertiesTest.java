import cfb.ict.Properties;
import cfb.ict.Utils;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertiesTest {

  @Test
  public void defaultProperties() {

    Properties properties = new Properties();
    assertEquals(properties.getHost(), "localhost");
    assertEquals(properties.getPort(), 14265);
    assertEquals(properties.getRoundDuration(), 60000);
    assertEquals(properties.getMinEchoDelay(), 0);
    assertEquals(properties.getMaxEchoDelay(), 5000);
    assertEquals(properties.getTimestampLowerBoundDelta(), 90);
    assertEquals(properties.getTimestampUpperBoundDelta(), 90);
    assertEquals(properties.getNeighborAHost(), "1.1.1.1");
    assertEquals(properties.getNeighborAPort(), 14265);
    assertEquals(properties.getNeighborBHost(), "2.2.2.2");
    assertEquals(properties.getNeighborBPort(), 14265);
    assertEquals(properties.getNeighborCHost(), "3.3.3.3");
    assertEquals(properties.getNeighborCPort(), 14265);
  }

  @Test
  public void inputProperties() {

    Properties properties = new Properties("target/test-classes/ict.properties");
    assertEquals(properties.getHost(), "0.0.0.0");
    assertEquals(properties.getPort(), 14266);
    assertEquals(properties.getRoundDuration(), 30000);
    assertEquals(properties.getMinEchoDelay(), 100);
    assertEquals(properties.getMaxEchoDelay(), 4800);
    assertEquals(properties.getTimestampLowerBoundDelta(), 120);
    assertEquals(properties.getTimestampUpperBoundDelta(), 120);
    assertEquals(properties.getNeighborAHost(), "10.10.10.10");
    assertEquals(properties.getNeighborAPort(), 14266);
    assertEquals(properties.getNeighborBHost(), "20.20.20.20");
    assertEquals(properties.getNeighborBPort(), 14266);
    assertEquals(properties.getNeighborCHost(), "30.30.30.30");
    assertEquals(properties.getNeighborCPort(), 14266);
  }
}
