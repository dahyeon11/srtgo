package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {
    public static final a Companion = new a(null);
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;

    /* renamed from: a, reason: collision with root package name */
    private final float f6219a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6220b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6221c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6222d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(float f8, float f9, float f10, int i8) {
        this.f6219a = f8;
        this.f6220b = f9;
        this.f6221c = f10;
        this.f6222d = i8;
    }

    public final float getProgress() {
        return this.f6221c;
    }

    public final int getSwipeEdge() {
        return this.f6222d;
    }

    public final float getTouchX() {
        return this.f6219a;
    }

    public final float getTouchY() {
        return this.f6220b;
    }

    public final BackEvent toBackEvent() {
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.activity.a.INSTANCE.createOnBackEvent(this.f6219a, this.f6220b, this.f6221c, this.f6222d);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 34+");
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f6219a + ", touchY=" + this.f6220b + ", progress=" + this.f6221c + ", swipeEdge=" + this.f6222d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        androidx.activity.a aVar = androidx.activity.a.INSTANCE;
        this(aVar.touchX(backEvent), aVar.touchY(backEvent), aVar.progress(backEvent), aVar.swipeEdge(backEvent));
    }
}
