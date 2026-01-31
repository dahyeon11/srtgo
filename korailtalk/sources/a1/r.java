package a1;

import V0.t;
import android.graphics.Paint;
import b1.AbstractC1064b;
import java.util.List;

/* loaded from: classes.dex */
public class r implements InterfaceC0826c {

    /* renamed from: a */
    private final String f5838a;

    /* renamed from: b */
    private final Z0.b f5839b;

    /* renamed from: c */
    private final List f5840c;

    /* renamed from: d */
    private final Z0.a f5841d;

    /* renamed from: e */
    private final Z0.d f5842e;

    /* renamed from: f */
    private final Z0.b f5843f;

    /* renamed from: g */
    private final b f5844g;

    /* renamed from: h */
    private final c f5845h;

    /* renamed from: i */
    private final float f5846i;

    /* renamed from: j */
    private final boolean f5847j;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5848a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5849b;

        static {
            int[] iArr = new int[c.values().length];
            f5849b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5849b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5849b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f5848a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5848a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5848a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i8 = a.f5848a[ordinal()];
            return i8 != 1 ? i8 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i8 = a.f5849b[ordinal()];
            if (i8 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i8 == 2) {
                return Paint.Join.MITER;
            }
            if (i8 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public r(String str, Z0.b bVar, List<Z0.b> list, Z0.a aVar, Z0.d dVar, Z0.b bVar2, b bVar3, c cVar, float f8, boolean z8) {
        this.f5838a = str;
        this.f5839b = bVar;
        this.f5840c = list;
        this.f5841d = aVar;
        this.f5842e = dVar;
        this.f5843f = bVar2;
        this.f5844g = bVar3;
        this.f5845h = cVar;
        this.f5846i = f8;
        this.f5847j = z8;
    }

    public b getCapType() {
        return this.f5844g;
    }

    public Z0.a getColor() {
        return this.f5841d;
    }

    public Z0.b getDashOffset() {
        return this.f5839b;
    }

    public c getJoinType() {
        return this.f5845h;
    }

    public List<Z0.b> getLineDashPattern() {
        return this.f5840c;
    }

    public float getMiterLimit() {
        return this.f5846i;
    }

    public String getName() {
        return this.f5838a;
    }

    public Z0.d getOpacity() {
        return this.f5842e;
    }

    public Z0.b getWidth() {
        return this.f5843f;
    }

    public boolean isHidden() {
        return this.f5847j;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new t(pVar, abstractC1064b, this);
    }
}
