package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.uE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4507uE0 extends Dv0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f22994e;

    /* renamed from: f, reason: collision with root package name */
    private final DatagramPacket f22995f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f22996g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramSocket f22997h;

    /* renamed from: i, reason: collision with root package name */
    private MulticastSocket f22998i;

    /* renamed from: j, reason: collision with root package name */
    private InetAddress f22999j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23000k;

    /* renamed from: l, reason: collision with root package name */
    private int f23001l;

    public C4507uE0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        if (this.f23001l == 0) {
            try {
                DatagramSocket datagramSocket = this.f22997h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f22995f);
                int length = this.f22995f.getLength();
                this.f23001l = length;
                zzg(length);
            } catch (SocketTimeoutException e8) {
                throw new C4393tE0(e8, 2002);
            } catch (IOException e9) {
                throw new C4393tE0(e9, 2001);
            }
        }
        int length2 = this.f22995f.getLength();
        int i10 = this.f23001l;
        int iMin = Math.min(i10, i9);
        System.arraycopy(this.f22994e, length2 - i10, bArr, i8, iMin);
        this.f23001l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws IOException {
        Uri uri = nb0.zza;
        this.f22996g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f22996g.getPort();
        b(nb0);
        try {
            this.f22999j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f22999j, port);
            if (this.f22999j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f22998i = multicastSocket;
                multicastSocket.joinGroup(this.f22999j);
                this.f22997h = this.f22998i;
            } else {
                this.f22997h = new DatagramSocket(inetSocketAddress);
            }
            this.f22997h.setSoTimeout(8000);
            this.f23000k = true;
            c(nb0);
            return -1L;
        } catch (IOException e8) {
            throw new C4393tE0(e8, 2001);
        } catch (SecurityException e9) {
            throw new C4393tE0(e9, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f22996g;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() throws IOException {
        InetAddress inetAddress;
        this.f22996g = null;
        MulticastSocket multicastSocket = this.f22998i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f22999j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f22998i = null;
        }
        DatagramSocket datagramSocket = this.f22997h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f22997h = null;
        }
        this.f22999j = null;
        this.f23001l = 0;
        if (this.f23000k) {
            this.f23000k = false;
            a();
        }
    }

    public C4507uE0(int i8) {
        super(true);
        byte[] bArr = new byte[Z1.b.CREDENTIAL_PICKER_REQUEST_CODE];
        this.f22994e = bArr;
        this.f22995f = new DatagramPacket(bArr, 0, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
    }
}
