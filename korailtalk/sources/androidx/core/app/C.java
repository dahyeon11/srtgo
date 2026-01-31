package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8687a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f8688b;

    public C(boolean z8) {
        this.f8687a = z8;
    }

    public final Configuration getNewConfig() {
        Configuration configuration = this.f8688b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean isInPictureInPictureMode() {
        return this.f8687a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(boolean z8, Configuration newConfig) {
        this(z8);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f8688b = newConfig;
    }
}
