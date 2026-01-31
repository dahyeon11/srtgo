package h7;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class h extends f implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    private static final a f31662h = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private int f31663b;

    /* renamed from: c, reason: collision with root package name */
    private int f31664c;

    /* renamed from: d, reason: collision with root package name */
    private int f31665d;

    /* renamed from: e, reason: collision with root package name */
    private int f31666e;

    /* renamed from: f, reason: collision with root package name */
    private int f31667f;

    /* renamed from: g, reason: collision with root package name */
    private int f31668g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f31663b = i8;
        this.f31664c = i9;
        this.f31665d = i10;
        this.f31666e = i11;
        this.f31667f = i12;
        this.f31668g = i13;
        if ((i8 | i9 | i10 | i11 | i12) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i14 = 0; i14 < 64; i14++) {
            nextInt();
        }
    }

    @Override // h7.f
    public int nextBits(int i8) {
        return g.takeUpperBits(nextInt(), i8);
    }

    @Override // h7.f
    public int nextInt() {
        int i8 = this.f31663b;
        int i9 = i8 ^ (i8 >>> 2);
        this.f31663b = this.f31664c;
        this.f31664c = this.f31665d;
        this.f31665d = this.f31666e;
        int i10 = this.f31667f;
        this.f31666e = i10;
        int i11 = ((i9 ^ (i9 << 1)) ^ i10) ^ (i10 << 4);
        this.f31667f = i11;
        int i12 = this.f31668g + 362437;
        this.f31668g = i12;
        return i11 + i12;
    }

    public h(int i8, int i9) {
        this(i8, i9, 0, 0, ~i8, (i8 << 10) ^ (i9 >>> 4));
    }
}
