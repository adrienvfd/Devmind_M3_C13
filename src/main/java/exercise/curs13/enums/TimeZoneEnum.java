package exercise.curs13.enums;

public enum TimeZoneEnum {
    UTC("UTC"),
    CET("CET"),
    EET("EET"),
    GMT("GMT"),
    EAT("EAT");

    private final String timeZone;

    TimeZoneEnum(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTimeZone() {
        return timeZone.replace(EAT.toString(), "Africa/Nairobi");
    }
}
