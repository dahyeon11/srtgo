package a3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f5894a;

    public i(float f8) {
        this.f5894a = f8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f5894a == ((i) obj).f5894a;
    }

    @Override // a3.c
    public float getCornerSize(RectF rectF) {
        return this.f5894a * rectF.height();
    }

    public float getRelativePercent() {
        return this.f5894a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5894a)});
    }
}
