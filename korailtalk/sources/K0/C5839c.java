package k0;

import androidx.lifecycle.J;
import androidx.lifecycle.K;
import e7.AbstractC5376a;
import f7.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5839c {

    /* renamed from: a, reason: collision with root package name */
    private final List f33531a = new ArrayList();

    public final <T extends J> void addInitializer(KClass<T> clazz, l initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f33531a.add(new C5842f(AbstractC5376a.getJavaClass((KClass) clazz), initializer));
    }

    public final K.b build() {
        C5842f[] c5842fArr = (C5842f[]) this.f33531a.toArray(new C5842f[0]);
        return new C5838b((C5842f[]) Arrays.copyOf(c5842fArr, c5842fArr.length));
    }
}
