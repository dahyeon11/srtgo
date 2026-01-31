package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class RL extends H1.U0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16083a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final H1.V0 f16084b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3087ho f16085c;

    public RL(H1.V0 v02, InterfaceC3087ho interfaceC3087ho) {
        this.f16084b = v02;
        this.f16085c = interfaceC3087ho;
    }

    @Override // H1.U0, H1.V0
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final float zzf() {
        InterfaceC3087ho interfaceC3087ho = this.f16085c;
        if (interfaceC3087ho != null) {
            return interfaceC3087ho.zzg();
        }
        return 0.0f;
    }

    @Override // H1.U0, H1.V0
    public final float zzg() {
        InterfaceC3087ho interfaceC3087ho = this.f16085c;
        if (interfaceC3087ho != null) {
            return interfaceC3087ho.zzh();
        }
        return 0.0f;
    }

    @Override // H1.U0, H1.V0
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final H1.Y0 zzi() {
        synchronized (this.f16083a) {
            try {
                H1.V0 v02 = this.f16084b;
                if (v02 == null) {
                    return null;
                }
                return v02.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H1.U0, H1.V0
    public final void zzj(boolean z8) throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final void zzm(H1.Y0 y02) {
        synchronized (this.f16083a) {
            try {
                H1.V0 v02 = this.f16084b;
                if (v02 != null) {
                    v02.zzm(y02);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H1.U0, H1.V0
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H1.U0, H1.V0
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
