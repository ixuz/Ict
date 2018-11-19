package cfb.ict;

import java.io.FileInputStream;

public class Properties {

    private String host = "localhost";
    private int port = 14265;
    private int roundDuration = 60000; // In milliseconds
    private int minEchoDelay = 0, maxEchoDelay = 5000; // In milliseconds
    private long timestampLowerBoundDelta = 90, timestampUpperBoundDelta = 90; // In seconds
    private String neighborAHost = "1.1.1.1";
    private String neighborBHost = "2.2.2.2";
    private String neighborCHost = "3.3.3.3";
    private int neighborAPort = 14265;
    private int neighborBPort = 14265;
    private int neighborCPort = 14265;

    public Properties() {
    }

    public Properties(final String fileName) {

        final java.util.Properties properties = new java.util.Properties();

        try (final FileInputStream propertiesInputStream = new FileInputStream(fileName)) {

            properties.load(propertiesInputStream);

        } catch (final Exception e) {

            throw new RuntimeException(e);
        }

        host = properties.getProperty("host", host).trim ();
        port = Integer.parseInt(properties.getProperty("port", Integer.valueOf(port).toString()).trim ());
        roundDuration = Integer.parseInt(properties.getProperty("roundDuration", Integer.valueOf(roundDuration).toString()).trim ());
        minEchoDelay = Integer.parseInt(properties.getProperty("minEchoDelay", Integer.valueOf(minEchoDelay).toString()).trim ());
        maxEchoDelay = Integer.parseInt(properties.getProperty("maxEchoDelay", Integer.valueOf(maxEchoDelay).toString()).trim ());

        timestampLowerBoundDelta = Long.parseLong(properties.getProperty("timestampLowerBoundDelta", Long.valueOf(timestampLowerBoundDelta).toString()).trim ());
        timestampUpperBoundDelta = Long.parseLong(properties.getProperty("timestampUpperBoundDelta", Long.valueOf(timestampUpperBoundDelta).toString()).trim ());

        neighborAHost = properties.getProperty("neighborAHost").trim ();
        neighborAPort = Integer.parseInt(properties.getProperty("neighborAPort").trim ());
        neighborBHost = properties.getProperty("neighborBHost").trim ();
        neighborBPort = Integer.parseInt(properties.getProperty("neighborBPort").trim ());
        neighborCHost = properties.getProperty("neighborCHost").trim ();
        neighborCPort = Integer.parseInt(properties.getProperty("neighborCPort").trim ());
    }

    public String getHost() {

        return host;
    }

    public int getPort() {

        return port;
    }

    public int getRoundDuration() {

        return roundDuration;
    }

    public int getMinEchoDelay() {

        return minEchoDelay;
    }

    public int getMaxEchoDelay() {

        return maxEchoDelay;
    }

    public long getTimestampLowerBoundDelta() {

        return timestampLowerBoundDelta;
    }

    public long getTimestampUpperBoundDelta() {

        return timestampUpperBoundDelta;
    }

    public String getNeighborAHost() {

        return neighborAHost;
    }

    public String getNeighborBHost() {

        return neighborBHost;
    }

    public String getNeighborCHost() {

        return neighborCHost;
    }

    public int getNeighborAPort() {

        return neighborAPort;
    }

    public int getNeighborBPort() {

        return neighborBPort;
    }

    public int getNeighborCPort() {

        return neighborCPort;
    }
}
