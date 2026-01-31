package ai.maum.m2u.cdk;

/* loaded from: classes.dex */
public class EtcDTO {

    public static class Timestamp {
        public long seconds = 0;
        public int nanos = 0;

        public int getNanos() {
            return this.nanos;
        }

        public long getSeconds() {
            return this.seconds;
        }

        public void setNanos(int i8) {
            this.nanos = i8;
        }

        public void setSeconds(long j8) {
            this.seconds = j8;
        }
    }
}
