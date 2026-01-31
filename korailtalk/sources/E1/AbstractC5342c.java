package e1;

import P7.f;
import P7.o;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5342c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f30220g = new String[128];

    /* renamed from: a, reason: collision with root package name */
    int f30221a;

    /* renamed from: b, reason: collision with root package name */
    int[] f30222b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f30223c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f30224d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    boolean f30225e;

    /* renamed from: f, reason: collision with root package name */
    boolean f30226f;

    /* renamed from: e1.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f30227a;

        /* renamed from: b, reason: collision with root package name */
        final o f30228b;

        private a(String[] strArr, o oVar) {
            this.f30227a = strArr;
            this.f30228b = oVar;
        }

        public static a of(String... strArr) {
            try {
                f[] fVarArr = new f[strArr.length];
                P7.c cVar = new P7.c();
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    AbstractC5342c.c(cVar, strArr[i8]);
                    cVar.readByte();
                    fVarArr[i8] = cVar.readByteString();
                }
                return new a((String[]) strArr.clone(), o.of(fVarArr));
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    /* renamed from: e1.c$b */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            f30220g[i8] = String.format("\\u%04x", Integer.valueOf(i8));
        }
        String[] strArr = f30220g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    AbstractC5342c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(P7.d r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = e1.AbstractC5342c.f30220g
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.AbstractC5342c.c(P7.d, java.lang.String):void");
    }

    public static AbstractC5342c of(P7.e eVar) {
        return new e(eVar);
    }

    final void b(int i8) {
        int i9 = this.f30221a;
        int[] iArr = this.f30222b;
        if (i9 == iArr.length) {
            if (i9 == 256) {
                throw new C5340a("Nesting too deep at " + getPath());
            }
            this.f30222b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f30223c;
            this.f30223c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f30224d;
            this.f30224d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f30222b;
        int i10 = this.f30221a;
        this.f30221a = i10 + 1;
        iArr3[i10] = i8;
    }

    public abstract void beginArray();

    public abstract void beginObject();

    final C5341b d(String str) throws C5341b {
        throw new C5341b(str + " at path " + getPath());
    }

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return AbstractC5343d.a(this.f30221a, this.f30222b, this.f30223c, this.f30224d);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract b peek();

    public abstract int selectName(a aVar);

    public abstract void skipName();

    public abstract void skipValue();
}
