package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class YF0 extends RuntimeException {
    public YF0(int i8) {
        super(i8 != 1 ? i8 != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
