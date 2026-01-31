package a3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f5864a;

    /* renamed from: b, reason: collision with root package name */
    private final float f5865b;

    public b(float f8, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f5864a;
            f8 += ((b) cVar).f5865b;
        }
        this.f5864a = cVar;
        this.f5865b = f8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5864a.equals(bVar.f5864a) && this.f5865b == bVar.f5865b;
    }

    @Override // a3.c
    public float getCornerSize(RectF rectF) {
        return Math.max(0.0f, this.f5864a.getCornerSize(rectF) + this.f5865b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5864a, Float.valueOf(this.f5865b)});
    }
}
