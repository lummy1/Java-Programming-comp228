public enum Day {
    SUNDAY("Weekends are best."),
    MONDAY("Mondays are bad."),
    TUESDAY("Midweek days are so-so."),
    WEDNESDAY("Midweek days are so-so."),
    THURSDAY("Midweek days are so-so."),
    FRIDAY("Fridays are better."),
    SATURDAY("Weekends are best.");

    private final String description;

    Day(String description) {
        this.description = description;
    }

    public void tellItLikeItIs() {
        System.out.println(description);
    }
}