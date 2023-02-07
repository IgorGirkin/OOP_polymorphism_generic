public enum TruckLoadCapacity {
    N1(0.0f, 3.5f),
    N2(3.5f, 12.0f),
    N3(12.0f, 0);
    private final float lowerBound;
    private final float upperBound;

    TruckLoadCapacity(float lowerBound, float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public float getLowerBound() {
        return lowerBound;
    }

    public float getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (upperBound == 0) {
            return "Грузоподъемность с полной массой свыше: " + lowerBound + " тонн." ;
        } else {
            return "Грузопоъемность: от " + lowerBound + " тонн, до " + upperBound + " тонн." ;

        }
    }
}
