package entities;

/**
 * Created by ${ibuktshin} on 20/03/2016.
 */
public enum Score {
    BAD(0), NOOT_GOOD(1), GOOD(2), VERY_GOOD(3), EXCELLENT(4);

    public final int Value;
    private Score (int value) {
        Value = value;
    }
}
