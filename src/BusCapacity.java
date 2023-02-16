public enum BusCapacity {
    ESPECIALLY_SMALL(0,10),
    SMALL(0,25),
    AVERAGE(40,50),
    LARGE(60,80),
    ESPECIALLY_LARGE(100,120);

    private final Integer lowerLimitsOfCapacity;
    private final Integer upperLimitsOfCapacity;

    BusCapacity(Integer lowerLimitsOfCapacity, Integer upperLimitsOfCapacity) {
        this.lowerLimitsOfCapacity = lowerLimitsOfCapacity;
        this.upperLimitsOfCapacity = upperLimitsOfCapacity;
    }

    public Integer getLowerLimitsOfCapacity() {
        return lowerLimitsOfCapacity;
    }

    public Integer getUpperLimitsOfCapacity() {
        return upperLimitsOfCapacity;
    }

    @Override
    public String toString() {
        if (lowerLimitsOfCapacity == 0 && upperLimitsOfCapacity <= 10) {
            return "Вместимость до " + upperLimitsOfCapacity + " мест." ;
        }
        if (lowerLimitsOfCapacity == 0 && upperLimitsOfCapacity <= 25) {
            return "Вместимость до " + upperLimitsOfCapacity + " мест.";
        } else {
            return "Вместимость: " + lowerLimitsOfCapacity + " - " + upperLimitsOfCapacity +" мест.";
        }
    }
}
