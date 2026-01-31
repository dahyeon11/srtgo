package com.google.android.gms.ads;

import H1.C0591z;
import L1.n;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC1895Sp;
import r2.b;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1895Sp f11744a;

    private final void a() {
        InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
        if (interfaceC1895Sp != null) {
            try {
                interfaceC1895Sp.zzx();
            } catch (RemoteException e8) {
                n.zzl("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i8, int i9, Intent intent) {
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzh(i8, i9, intent);
            }
        } catch (Exception e8) {
            n.zzl("#007 Could not call remote method.", e8);
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                if (!interfaceC1895Sp.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
        }
        super.onBackPressed();
        try {
            InterfaceC1895Sp interfaceC1895Sp2 = this.f11744a;
            if (interfaceC1895Sp2 != null) {
                interfaceC1895Sp2.zzi();
            }
        } catch (RemoteException e9) {
            n.zzl("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzk(b.wrap(configuration));
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC1895Sp interfaceC1895SpZzo = C0591z.zza().zzo(this);
        this.f11744a = interfaceC1895SpZzo;
        if (interfaceC1895SpZzo == null) {
            n.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC1895SpZzo.zzl(bundle);
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzm();
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzo();
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzp(i8, strArr, iArr);
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzq();
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzr();
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzs(bundle);
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzt();
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzu();
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC1895Sp interfaceC1895Sp = this.f11744a;
            if (interfaceC1895Sp != null) {
                interfaceC1895Sp.zzv();
            }
        } catch (RemoteException e8) {
            n.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i8) {
        super.setContentView(i8);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
