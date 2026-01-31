package a3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0833a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f5863a;

    public C0833a(float f8) {
        this.f5863a = f8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0833a) && this.f5863a == ((C0833a) obj).f5863a;
    }

    @Override // a3.c
    public float getCornerSize(RectF rectF) {
        return this.f5863a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5863a)});
    }

    public float getCornerSize() {
        return this.f5863a;
    }
}
