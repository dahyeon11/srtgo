package R1;

import K1.K0;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3302ji;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C2103Xs;
import com.google.android.gms.internal.ads.InterfaceC1319En0;
import com.google.android.gms.internal.ads.InterfaceC1816Qs;
import com.google.android.gms.internal.ads.InterfaceC3407kd0;
import com.google.android.gms.internal.ads.RunnableC4660vd0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: R1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0729h implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.C f4350a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2103Xs f4351b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1816Qs f4352c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f4353d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC0733l f4354e;

    C0729h(BinderC0733l binderC0733l, com.google.common.util.concurrent.C c9, C2103Xs c2103Xs, InterfaceC1816Qs interfaceC1816Qs, InterfaceC3407kd0 interfaceC3407kd0) {
        this.f4350a = c9;
        this.f4351b = c2103Xs;
        this.f4352c = interfaceC1816Qs;
        this.f4353d = interfaceC3407kd0;
        this.f4354e = binderC0733l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhP)).booleanValue()) {
            G1.u.zzo().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            G1.u.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        RunnableC4660vd0 runnableC4660vd0H = BinderC0733l.H(this.f4350a, this.f4351b);
        if (((Boolean) AbstractC3302ji.zze.zze()).booleanValue() && runnableC4660vd0H != null) {
            InterfaceC3407kd0 interfaceC3407kd0 = this.f4353d;
            interfaceC3407kd0.zzi(th);
            interfaceC3407kd0.zzh(false);
            runnableC4660vd0H.zza(interfaceC3407kd0);
            runnableC4660vd0H.zzi();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f4352c.zzb(message);
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C0746z c0746z = (C0746z) obj;
        RunnableC4660vd0 runnableC4660vd0H = BinderC0733l.H(this.f4350a, this.f4351b);
        this.f4354e.f4367B.set(true);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhK)).booleanValue()) {
            try {
                this.f4352c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e8) {
                L1.n.zzg("QueryInfo generation has been disabled.".concat(e8.toString()));
            }
            if (!((Boolean) AbstractC3302ji.zze.zze()).booleanValue() || runnableC4660vd0H == null) {
                return;
            }
            InterfaceC3407kd0 interfaceC3407kd0 = this.f4353d;
            interfaceC3407kd0.zzc("QueryInfo generation has been disabled.");
            interfaceC3407kd0.zzh(false);
            runnableC4660vd0H.zza(interfaceC3407kd0);
            runnableC4660vd0H.zzi();
            return;
        }
        try {
            try {
                if (c0746z == null) {
                    this.f4352c.zzc(null, null, null);
                    this.f4353d.zzh(true);
                    if (!((Boolean) AbstractC3302ji.zze.zze()).booleanValue() || runnableC4660vd0H == null) {
                        return;
                    }
                    runnableC4660vd0H.zza(this.f4353d);
                    runnableC4660vd0H.zzi();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(c0746z.zzb).optString("request_id", ""))) {
                        L1.n.zzj("The request ID is empty in request JSON.");
                        this.f4352c.zzb("Internal error: request ID is empty in request JSON.");
                        InterfaceC3407kd0 interfaceC3407kd02 = this.f4353d;
                        interfaceC3407kd02.zzc("Request ID empty");
                        interfaceC3407kd02.zzh(false);
                        if (!((Boolean) AbstractC3302ji.zze.zze()).booleanValue() || runnableC4660vd0H == null) {
                            return;
                        }
                        runnableC4660vd0H.zza(this.f4353d);
                        runnableC4660vd0H.zzi();
                        return;
                    }
                    Bundle bundle = c0746z.zzd;
                    BinderC0733l binderC0733l = this.f4354e;
                    if (binderC0733l.f4386p && bundle != null && bundle.getInt(binderC0733l.f4388r, -1) == -1) {
                        BinderC0733l binderC0733l2 = this.f4354e;
                        bundle.putInt(binderC0733l2.f4388r, binderC0733l2.f4389s.get());
                    }
                    BinderC0733l binderC0733l3 = this.f4354e;
                    if (binderC0733l3.f4385o && bundle != null && TextUtils.isEmpty(bundle.getString(binderC0733l3.f4387q))) {
                        if (TextUtils.isEmpty(this.f4354e.f4391u)) {
                            BinderC0733l binderC0733l4 = this.f4354e;
                            K0 k0Zzp = G1.u.zzp();
                            BinderC0733l binderC0733l5 = this.f4354e;
                            binderC0733l4.f4391u = k0Zzp.zzc(binderC0733l5.f4372b, binderC0733l5.f4390t.afmaVersion);
                        }
                        BinderC0733l binderC0733l6 = this.f4354e;
                        bundle.putString(binderC0733l6.f4387q, binderC0733l6.f4391u);
                    }
                    this.f4352c.zzc(c0746z.zza, c0746z.zzb, bundle);
                    this.f4353d.zzh(true);
                    if (!((Boolean) AbstractC3302ji.zze.zze()).booleanValue() || runnableC4660vd0H == null) {
                        return;
                    }
                    runnableC4660vd0H.zza(this.f4353d);
                    runnableC4660vd0H.zzi();
                } catch (JSONException e9) {
                    L1.n.zzj("Failed to create JSON object from the request string.");
                    this.f4352c.zzb("Internal error for request JSON: " + e9.toString());
                    InterfaceC3407kd0 interfaceC3407kd03 = this.f4353d;
                    interfaceC3407kd03.zzi(e9);
                    interfaceC3407kd03.zzh(false);
                    G1.u.zzo().zzw(e9, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) AbstractC3302ji.zze.zze()).booleanValue() || runnableC4660vd0H == null) {
                        return;
                    }
                    runnableC4660vd0H.zza(this.f4353d);
                    runnableC4660vd0H.zzi();
                }
            } catch (RemoteException e10) {
                InterfaceC3407kd0 interfaceC3407kd04 = this.f4353d;
                interfaceC3407kd04.zzi(e10);
                interfaceC3407kd04.zzh(false);
                L1.n.zzh("", e10);
                G1.u.zzo().zzw(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) AbstractC3302ji.zze.zze()).booleanValue() || runnableC4660vd0H == null) {
                    return;
                }
                runnableC4660vd0H.zza(this.f4353d);
                runnableC4660vd0H.zzi();
            }
        } catch (Throwable th) {
            if (((Boolean) AbstractC3302ji.zze.zze()).booleanValue() && runnableC4660vd0H != null) {
                runnableC4660vd0H.zza(this.f4353d);
                runnableC4660vd0H.zzi();
            }
            throw th;
        }
    }
}
