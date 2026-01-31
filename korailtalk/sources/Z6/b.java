package Z6;

import f7.InterfaceC5519a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public static final /* synthetic */ <T extends Enum<T>> a enumEntries() {
        Intrinsics.reifiedOperationMarker(5, "T");
        return enumEntries(new Enum[0]);
    }

    public static final <E extends Enum<E>> a enumEntries(InterfaceC5519a entriesProvider) {
        Intrinsics.checkNotNullParameter(entriesProvider, "entriesProvider");
        return new c((Enum[]) entriesProvider.invoke());
    }

    public static final <E extends Enum<E>> a enumEntries(E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new c(entries);
    }
}
