package R6;

import f7.InterfaceC5519a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class k {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static <T> InterfaceC0755i lazy(InterfaceC5519a initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new t(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final <T> InterfaceC0755i lazy(m mode, InterfaceC5519a initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i8 = a.$EnumSwitchMapping$0[mode.ordinal()];
        int i9 = 2;
        if (i8 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new t(initializer, defaultConstructorMarker, i9, defaultConstructorMarker);
        }
        if (i8 == 2) {
            return new s(initializer);
        }
        if (i8 == 3) {
            return new H(initializer);
        }
        throw new n();
    }

    public static final <T> InterfaceC0755i lazy(Object obj, InterfaceC5519a initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new t(initializer, obj);
    }
}
