package j1;

import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5812b {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f33403a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f33404b;

    /* renamed from: c, reason: collision with root package name */
    private int f33405c;

    public C5812b() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5812b copy$default(C5812b c5812b, HashMap map, HashMap map2, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            map = c5812b.f33403a;
        }
        if ((i9 & 2) != 0) {
            map2 = c5812b.f33404b;
        }
        if ((i9 & 4) != 0) {
            i8 = c5812b.f33405c;
        }
        return c5812b.copy(map, map2, i8);
    }

    public final void clear() {
        this.f33403a = new HashMap();
        this.f33404b = new HashMap();
        this.f33405c = 0;
    }

    public final HashMap<String, Integer> component1() {
        return this.f33403a;
    }

    public final HashMap<String, Integer> component2() {
        return this.f33404b;
    }

    public final int component3() {
        return this.f33405c;
    }

    public final C5812b copy(HashMap<String, Integer> date, HashMap<String, Integer> cardNumber, int i8) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        return new C5812b(date, cardNumber, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5812b)) {
            return false;
        }
        C5812b c5812b = (C5812b) obj;
        return Intrinsics.areEqual(this.f33403a, c5812b.f33403a) && Intrinsics.areEqual(this.f33404b, c5812b.f33404b) && this.f33405c == c5812b.f33405c;
    }

    public final HashMap<String, Integer> getCardNumber() {
        return this.f33404b;
    }

    public final int getCount() {
        return this.f33405c;
    }

    public final HashMap<String, Integer> getDate() {
        return this.f33403a;
    }

    public int hashCode() {
        return (((this.f33403a.hashCode() * 31) + this.f33404b.hashCode()) * 31) + Integer.hashCode(this.f33405c);
    }

    public final void setCardNumber(HashMap<String, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f33404b = map;
    }

    public final void setCount(int i8) {
        this.f33405c = i8;
    }

    public final void setDate(HashMap<String, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f33403a = map;
    }

    public String toString() {
        return "CheckSum(date=" + this.f33403a + ", cardNumber=" + this.f33404b + ", count=" + this.f33405c + ')';
    }

    public C5812b(HashMap<String, Integer> date, HashMap<String, Integer> cardNumber, int i8) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        this.f33403a = date;
        this.f33404b = cardNumber;
        this.f33405c = i8;
    }

    public /* synthetic */ C5812b(HashMap map, HashMap map2, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? new HashMap() : map, (i9 & 2) != 0 ? new HashMap() : map2, (i9 & 4) != 0 ? 0 : i8);
    }
}
