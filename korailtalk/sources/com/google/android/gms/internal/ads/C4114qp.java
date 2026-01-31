package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.kakao.sdk.link.Constants;
import java.util.Set;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4114qp extends C4797wp {

    /* renamed from: u, reason: collision with root package name */
    static final Set f21991u = o2.g.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c, reason: collision with root package name */
    private String f21992c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21993d;

    /* renamed from: e, reason: collision with root package name */
    private int f21994e;

    /* renamed from: f, reason: collision with root package name */
    private int f21995f;

    /* renamed from: g, reason: collision with root package name */
    private int f21996g;

    /* renamed from: h, reason: collision with root package name */
    private int f21997h;

    /* renamed from: i, reason: collision with root package name */
    private int f21998i;

    /* renamed from: j, reason: collision with root package name */
    private int f21999j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f22000k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC2065Wv f22001l;

    /* renamed from: m, reason: collision with root package name */
    private final Activity f22002m;

    /* renamed from: n, reason: collision with root package name */
    private C1943Tw f22003n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f22004o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f22005p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC4911xp f22006q;

    /* renamed from: r, reason: collision with root package name */
    private PopupWindow f22007r;

    /* renamed from: s, reason: collision with root package name */
    private RelativeLayout f22008s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f22009t;

    public C4114qp(InterfaceC2065Wv interfaceC2065Wv, InterfaceC4911xp interfaceC4911xp) {
        super(interfaceC2065Wv, "resize");
        this.f21992c = "top-right";
        this.f21993d = true;
        this.f21994e = 0;
        this.f21995f = 0;
        this.f21996g = -1;
        this.f21997h = 0;
        this.f21998i = 0;
        this.f21999j = -1;
        this.f22000k = new Object();
        this.f22001l = interfaceC2065Wv;
        this.f22002m = interfaceC2065Wv.zzi();
        this.f22006q = interfaceC4911xp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(boolean z8) throws JSONException {
        this.f22007r.dismiss();
        this.f22008s.removeView((View) this.f22001l);
        ViewGroup viewGroup = this.f22009t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f22004o);
            this.f22009t.addView((View) this.f22001l);
            this.f22001l.zzaj(this.f22003n);
        }
        if (z8) {
            zzl(Constants.VALIDATION_DEFAULT);
            InterfaceC4911xp interfaceC4911xp = this.f22006q;
            if (interfaceC4911xp != null) {
                interfaceC4911xp.zzb();
            }
        }
        this.f22007r = null;
        this.f22008s = null;
        this.f22009t = null;
        this.f22005p = null;
    }

    public final void zza(final boolean z8) {
        synchronized (this.f22000k) {
            try {
                if (this.f22007r != null) {
                    if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkP)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        a(z8);
                    } else {
                        AbstractC4805wt.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.op
                            @Override // java.lang.Runnable
                            public final void run() throws JSONException {
                                this.zza.a(z8);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0260 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012c, B:63:0x0138, B:129:0x0260, B:130:0x0265, B:132:0x0267, B:134:0x0287, B:136:0x028b, B:138:0x0298, B:140:0x02d4, B:172:0x038d, B:179:0x03bc, B:180:0x03d4, B:181:0x03f5, B:183:0x03fd, B:184:0x0404, B:185:0x042a, B:188:0x042d, B:190:0x0452, B:191:0x0467, B:173:0x0394, B:174:0x039b, B:175:0x03a2, B:176:0x03a9, B:177:0x03af, B:178:0x03b6, B:139:0x02d1, B:193:0x0469, B:194:0x046e, B:65:0x0140, B:67:0x0144, B:95:0x0197, B:96:0x01a1, B:105:0x01f4, B:107:0x01f7, B:109:0x01fb, B:112:0x0202, B:97:0x01a5, B:98:0x01af, B:99:0x01b6, B:100:0x01c2, B:101:0x01ca, B:102:0x01de, B:103:0x01ea, B:113:0x0211, B:119:0x023b, B:125:0x024b, B:122:0x0241, B:124:0x0249, B:116:0x0233, B:118:0x0239, B:126:0x0250, B:127:0x0257, B:196:0x0470, B:197:0x0475, B:199:0x0477, B:200:0x047c), top: B:204:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0267 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012c, B:63:0x0138, B:129:0x0260, B:130:0x0265, B:132:0x0267, B:134:0x0287, B:136:0x028b, B:138:0x0298, B:140:0x02d4, B:172:0x038d, B:179:0x03bc, B:180:0x03d4, B:181:0x03f5, B:183:0x03fd, B:184:0x0404, B:185:0x042a, B:188:0x042d, B:190:0x0452, B:191:0x0467, B:173:0x0394, B:174:0x039b, B:175:0x03a2, B:176:0x03a9, B:177:0x03af, B:178:0x03b6, B:139:0x02d1, B:193:0x0469, B:194:0x046e, B:65:0x0140, B:67:0x0144, B:95:0x0197, B:96:0x01a1, B:105:0x01f4, B:107:0x01f7, B:109:0x01fb, B:112:0x0202, B:97:0x01a5, B:98:0x01af, B:99:0x01b6, B:100:0x01c2, B:101:0x01ca, B:102:0x01de, B:103:0x01ea, B:113:0x0211, B:119:0x023b, B:125:0x024b, B:122:0x0241, B:124:0x0249, B:116:0x0233, B:118:0x0239, B:126:0x0250, B:127:0x0257, B:196:0x0470, B:197:0x0475, B:199:0x0477, B:200:0x047c), top: B:204:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4114qp.zzb(java.util.Map):void");
    }

    public final void zzd(int i8, int i9, boolean z8) {
        synchronized (this.f22000k) {
            this.f21994e = i8;
            this.f21995f = i9;
        }
    }

    public final void zze(int i8, int i9) {
        this.f21994e = i8;
        this.f21995f = i9;
    }

    public final boolean zzf() {
        boolean z8;
        synchronized (this.f22000k) {
            z8 = this.f22007r != null;
        }
        return z8;
    }
}
