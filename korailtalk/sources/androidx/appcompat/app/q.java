package androidx.appcompat.app;

/* loaded from: classes.dex */
class q {
    public static final int DAY = 0;
    public static final int NIGHT = 1;

    /* renamed from: a, reason: collision with root package name */
    private static q f6451a;
    public int state;
    public long sunrise;
    public long sunset;

    q() {
    }

    static q a() {
        if (f6451a == null) {
            f6451a = new q();
        }
        return f6451a;
    }

    public void calculateTwilight(long j8, double d9, double d10) {
        double d11 = (0.01720197f * ((j8 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d11) * 0.03341960161924362d) + d11 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d10) / 360.0d) + (Math.sin(d11) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d12 = 0.01745329238474369d * d9;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d12) * Math.sin(dAsin))) / (Math.cos(d12) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.state = 1;
            this.sunset = -1L;
            this.sunrise = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.state = 0;
                this.sunset = -1L;
                this.sunrise = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.sunset = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.sunrise = jRound;
            if (jRound >= j8 || this.sunset <= j8) {
                this.state = 1;
            } else {
                this.state = 0;
            }
        }
    }
}
