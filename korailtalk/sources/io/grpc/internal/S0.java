package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface S0 {
    public static final S0 SYSTEM_TIME_PROVIDER = new a();

    class a implements S0 {
        a() {
        }

        @Override // io.grpc.internal.S0
        public long currentTimeNanos() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long currentTimeNanos();
}
