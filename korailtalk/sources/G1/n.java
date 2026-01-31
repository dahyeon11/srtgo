package G1;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC4542ub0;

/* loaded from: classes.dex */
final class n extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f1413a;

    n(t tVar) {
        this.f1413a = tVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        t tVar = this.f1413a;
        if (tVar.f1429g != null) {
            try {
                tVar.f1429g.zzf(AbstractC4542ub0.zzd(1, null, null));
            } catch (RemoteException e8) {
                L1.n.zzl("#007 Could not call remote method.", e8);
            }
        }
        t tVar2 = this.f1413a;
        if (tVar2.f1429g != null) {
            try {
                tVar2.f1429g.zze(0);
            } catch (RemoteException e9) {
                L1.n.zzl("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f1413a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            t tVar = this.f1413a;
            if (tVar.f1429g != null) {
                try {
                    tVar.f1429g.zzf(AbstractC4542ub0.zzd(3, null, null));
                } catch (RemoteException e8) {
                    L1.n.zzl("#007 Could not call remote method.", e8);
                }
            }
            t tVar2 = this.f1413a;
            if (tVar2.f1429g != null) {
                try {
                    tVar2.f1429g.zze(3);
                } catch (RemoteException e9) {
                    L1.n.zzl("#007 Could not call remote method.", e9);
                }
            }
            this.f1413a.b(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            t tVar3 = this.f1413a;
            if (tVar3.f1429g != null) {
                try {
                    tVar3.f1429g.zzf(AbstractC4542ub0.zzd(1, null, null));
                } catch (RemoteException e10) {
                    L1.n.zzl("#007 Could not call remote method.", e10);
                }
            }
            t tVar4 = this.f1413a;
            if (tVar4.f1429g != null) {
                try {
                    tVar4.f1429g.zze(0);
                } catch (RemoteException e11) {
                    L1.n.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.f1413a.b(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            t tVar5 = this.f1413a;
            if (tVar5.f1429g != null) {
                try {
                    tVar5.f1429g.zzi();
                } catch (RemoteException e12) {
                    L1.n.zzl("#007 Could not call remote method.", e12);
                }
            }
            this.f1413a.b(this.f1413a.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        t tVar6 = this.f1413a;
        if (tVar6.f1429g != null) {
            try {
                tVar6.f1429g.zzc();
                this.f1413a.f1429g.zzh();
            } catch (RemoteException e13) {
                L1.n.zzl("#007 Could not call remote method.", e13);
            }
        }
        t.k(this.f1413a, t.h(this.f1413a, str));
        return true;
    }
}
