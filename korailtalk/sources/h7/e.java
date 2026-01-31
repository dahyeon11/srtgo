package h7;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    public static final Random asJavaRandom(f fVar) {
        Random impl;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        AbstractC5637a abstractC5637a = fVar instanceof AbstractC5637a ? (AbstractC5637a) fVar : null;
        return (abstractC5637a == null || (impl = abstractC5637a.getImpl()) == null) ? new c(fVar) : impl;
    }

    public static final f asKotlinRandom(Random random) {
        f impl;
        Intrinsics.checkNotNullParameter(random, "<this>");
        c cVar = random instanceof c ? (c) random : null;
        return (cVar == null || (impl = cVar.getImpl()) == null) ? new d(random) : impl;
    }

    public static final double doubleFromParts(int i8, int i9) {
        return ((i8 << 27) + i9) / 9.007199254740992E15d;
    }
}
