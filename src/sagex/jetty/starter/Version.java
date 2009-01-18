package sagex.jetty.starter;

public enum Version
{
    VERSION_1_0        ("1.0"),
    VERSION_1_0_01     ("1.0.01"),
    VERSION_1_0_02     ("1.0.02"),
    VERSION_1_1        ("1.1"),
    VERSION_1_2        ("1.2"),
    VERSION_1_3        ("1.3"),
    VERSION_1_4        ("1.4"),
    VERSION_1_5        ("1.5"),

    CURRENT_VERSION    (VERSION_1_5.version);
    
    private String version = null;

    private Version(String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return version;
    }
}