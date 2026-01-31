package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7671a;

    public d() {
        this(false);
    }

    public d(boolean z8) {
        this.f7671a = z8;
    }

    @Override // java.util.Comparator
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f7671a ? iSignum * (-1) : iSignum;
    }
}
