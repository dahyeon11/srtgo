package Y1;

import a2.InterfaceC0828a;
import android.os.Bundle;
import b2.InterfaceC1072a;
import g2.C5539a;
import i2.AbstractC5681n;
import w2.i;

/* loaded from: classes.dex */
public abstract class a {
    public static final C5539a CREDENTIALS_API;
    public static final Z1.b CredentialsApi;
    public static final C5539a GOOGLE_SIGN_IN_API;
    public static final InterfaceC1072a GoogleSignInApi;

    @Deprecated
    public static final C5539a PROXY_API;

    @Deprecated
    public static final InterfaceC0828a ProxyApi;

    /* renamed from: a */
    private static final C5539a.AbstractC0301a f5584a;

    /* renamed from: b */
    private static final C5539a.AbstractC0301a f5585b;
    public static final C5539a.g zzg;
    public static final C5539a.g zzh;

    /* renamed from: Y1.a$a */
    public static class C0091a implements C5539a.d.InterfaceC0302a, C5539a.d {
        public static final C0091a zzk = new C0092a().zze();

        /* renamed from: a */
        private final String f5586a;

        /* renamed from: b */
        private final boolean f5587b;

        /* renamed from: c */
        private final String f5588c;

        public C0091a(C0092a c0092a) {
            this.f5586a = c0092a.f5589a;
            this.f5587b = c0092a.f5590b.booleanValue();
            this.f5588c = c0092a.f5591c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0091a)) {
                return false;
            }
            C0091a c0091a = (C0091a) obj;
            return AbstractC5681n.equal(this.f5586a, c0091a.f5586a) && this.f5587b == c0091a.f5587b && AbstractC5681n.equal(this.f5588c, c0091a.f5588c);
        }

        public final String getLogSessionId() {
            return this.f5588c;
        }

        public int hashCode() {
            return AbstractC5681n.hashCode(this.f5586a, Boolean.valueOf(this.f5587b), this.f5588c);
        }

        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f5586a);
            bundle.putBoolean("force_save_dialog", this.f5587b);
            bundle.putString("log_session_id", this.f5588c);
            return bundle;
        }

        public final String zzd() {
            return this.f5586a;
        }

        /* renamed from: Y1.a$a$a */
        public static class C0092a {

            /* renamed from: a */
            protected String f5589a;

            /* renamed from: b */
            protected Boolean f5590b;

            /* renamed from: c */
            protected String f5591c;

            public C0092a() {
                this.f5590b = Boolean.FALSE;
            }

            public C0092a forceEnableSaveDialog() {
                this.f5590b = Boolean.TRUE;
                return this;
            }

            public C0092a zzc(String str) {
                this.f5591c = str;
                return this;
            }

            public C0091a zze() {
                return new C0091a(this);
            }

            public C0092a(C0091a c0091a) {
                this.f5590b = Boolean.FALSE;
                this.f5589a = c0091a.f5586a;
                this.f5590b = Boolean.valueOf(c0091a.f5587b);
                this.f5591c = c0091a.f5588c;
            }
        }
    }

    static {
        C5539a.g gVar = new C5539a.g();
        zzg = gVar;
        C5539a.g gVar2 = new C5539a.g();
        zzh = gVar2;
        e eVar = new e();
        f5584a = eVar;
        f fVar = new f();
        f5585b = fVar;
        PROXY_API = b.API;
        CREDENTIALS_API = new C5539a("Auth.CREDENTIALS_API", eVar, gVar);
        GOOGLE_SIGN_IN_API = new C5539a("Auth.GOOGLE_SIGN_IN_API", fVar, gVar2);
        ProxyApi = b.ProxyApi;
        CredentialsApi = new i();
        GoogleSignInApi = new c2.i();
    }
}
