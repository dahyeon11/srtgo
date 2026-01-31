package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1012a extends J {

    /* renamed from: d, reason: collision with root package name */
    private final Application f10017d;

    public C1012a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f10017d = application;
    }

    public <T extends Application> T getApplication() {
        T t8 = (T) this.f10017d;
        Intrinsics.checkNotNull(t8, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t8;
    }
}
