package I0;

import P0.r;

/* loaded from: classes.dex */
public interface e {
    public static final int MAX_GREEDY_SCHEDULER_LIMIT = 200;
    public static final int MAX_SCHEDULER_LIMIT = 50;

    void cancel(String str);

    boolean hasLimitedSchedulingSlots();

    void schedule(r... rVarArr);
}
