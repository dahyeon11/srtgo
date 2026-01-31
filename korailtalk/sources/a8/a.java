package a8;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class a extends b {
    public static final a[] EMPTY_ARRAY = new a[0];

    /* renamed from: a, reason: collision with root package name */
    private static final a f5985a = new a(null, null);
    public final Object left;
    public final Object right;

    public a(Object obj, Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static <L, R> a[] emptyArray() {
        return EMPTY_ARRAY;
    }

    public static <L, R> b left(L l8) {
        return of((Object) l8, (Object) null);
    }

    public static <L, R> a nullPair() {
        return f5985a;
    }

    public static <L, R> a of(L l8, R r8) {
        return (l8 == null && r8 == null) ? nullPair() : new a(l8, r8);
    }

    public static <L, R> a ofNonNull(L l8, R r8) {
        Objects.requireNonNull(l8, "left");
        Objects.requireNonNull(r8, "right");
        return of((Object) l8, (Object) r8);
    }

    public static <L, R> b right(R r8) {
        return of((Object) null, (Object) r8);
    }

    @Override // a8.b
    public Object getLeft() {
        return this.left;
    }

    @Override // a8.b
    public Object getRight() {
        return this.right;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <L, R> a of(Map.Entry<L, R> entry) {
        return entry != null ? new a(entry.getKey(), entry.getValue()) : nullPair();
    }
}
