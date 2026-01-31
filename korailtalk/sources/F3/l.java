package F3;

import W3.B;
import W3.C0817b;
import f4.C5503b;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements u {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1148a;

        static {
            int[] iArr = new int[F3.a.values().length];
            f1148a = iArr;
            try {
                iArr[F3.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1148a[F3.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1148a[F3.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1148a[F3.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1148a[F3.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1148a[F3.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1148a[F3.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1148a[F3.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1148a[F3.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1148a[F3.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1148a[F3.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1148a[F3.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1148a[F3.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9) {
        return encode(str, aVar, i8, i9, null);
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<g, ?> map) {
        u lVar;
        switch (a.f1148a[aVar.ordinal()]) {
            case 1:
                lVar = new W3.l();
                break;
            case 2:
                lVar = new B();
                break;
            case 3:
                lVar = new W3.j();
                break;
            case 4:
                lVar = new W3.u();
                break;
            case 5:
                lVar = new C5503b();
                break;
            case 6:
                lVar = new W3.f();
                break;
            case 7:
                lVar = new W3.h();
                break;
            case 8:
                lVar = new W3.d();
                break;
            case 9:
                lVar = new W3.o();
                break;
            case 10:
                lVar = new a4.d();
                break;
            case 11:
                lVar = new C0817b();
                break;
            case 12:
                lVar = new P3.b();
                break;
            case 13:
                lVar = new G3.c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return lVar.encode(str, aVar, i8, i9, map);
    }
}
