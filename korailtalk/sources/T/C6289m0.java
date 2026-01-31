package t;

import android.content.Context;
import z.C0;
import z.C6562K;
import z.InterfaceC6565N;
import z.InterfaceC6577e0;
import z.O0;

/* renamed from: t.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6289m0 implements z.O0 {

    /* renamed from: a, reason: collision with root package name */
    final E0 f36725a;

    /* renamed from: t.m0$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36726a;

        static {
            int[] iArr = new int[O0.b.values().length];
            f36726a = iArr;
            try {
                iArr[O0.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36726a[O0.b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36726a[O0.b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36726a[O0.b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C6289m0(Context context) {
        this.f36725a = E0.b(context);
    }

    @Override // z.O0
    public InterfaceC6565N getConfig(O0.b bVar) {
        z.r0 r0VarCreate = z.r0.create();
        C0.b bVar2 = new C0.b();
        int[] iArr = a.f36726a;
        int i8 = iArr[bVar.ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            bVar2.setTemplateType(1);
        } else if (i8 == 4) {
            bVar2.setTemplateType(3);
        }
        O0.b bVar3 = O0.b.PREVIEW;
        if (bVar == bVar3) {
            x.k.setHDRnet(bVar2);
        }
        r0VarCreate.insertOption(z.N0.OPTION_DEFAULT_SESSION_CONFIG, bVar2.build());
        r0VarCreate.insertOption(z.N0.OPTION_SESSION_CONFIG_UNPACKER, C6287l0.f36721a);
        C6562K.a aVar = new C6562K.a();
        int i9 = iArr[bVar.ordinal()];
        if (i9 == 1) {
            aVar.setTemplateType(2);
        } else if (i9 == 2 || i9 == 3) {
            aVar.setTemplateType(1);
        } else if (i9 == 4) {
            aVar.setTemplateType(3);
        }
        r0VarCreate.insertOption(z.N0.OPTION_DEFAULT_CAPTURE_CONFIG, aVar.build());
        r0VarCreate.insertOption(z.N0.OPTION_CAPTURE_CONFIG_UNPACKER, bVar == O0.b.IMAGE_CAPTURE ? Q0.f36525c : U.f36552a);
        if (bVar == bVar3) {
            r0VarCreate.insertOption(InterfaceC6577e0.OPTION_MAX_RESOLUTION, this.f36725a.d());
        }
        r0VarCreate.insertOption(InterfaceC6577e0.OPTION_TARGET_ROTATION, Integer.valueOf(this.f36725a.c().getRotation()));
        return z.v0.from(r0VarCreate);
    }
}
