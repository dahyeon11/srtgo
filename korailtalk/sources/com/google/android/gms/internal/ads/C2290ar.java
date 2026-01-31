package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import j2.InterfaceC5817d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2290ar extends AbstractC5814a {
    public static final Parcelable.Creator<C2290ar> CREATOR = new C2405br();

    /* renamed from: a, reason: collision with root package name */
    ParcelFileDescriptor f18037a;

    /* renamed from: b, reason: collision with root package name */
    private Parcelable f18038b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18039c = true;

    public C2290ar(ParcelFileDescriptor parcelFileDescriptor) {
        this.f18037a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f18037a == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f18038b.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        AbstractC4805wt.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Zq
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Parcelable.Creator<C2290ar> creator = C2290ar.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            o2.l.closeQuietly(dataOutputStream2);
                                        } catch (IOException e8) {
                                            e = e8;
                                            dataOutputStream = dataOutputStream2;
                                            L1.n.zzh("Error transporting the ad response", e);
                                            G1.u.zzo().zzw(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                o2.l.closeQuietly(outputStream);
                                            } else {
                                                o2.l.closeQuietly(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                o2.l.closeQuietly(outputStream);
                                            } else {
                                                o2.l.closeQuietly(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e9) {
                                    e = e9;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e8) {
                        e = e8;
                        L1.n.zzh("Error transporting the ad response", e);
                        G1.u.zzo().zzw(e, "LargeParcelTeleporter.pipeData.2");
                        o2.l.closeQuietly(autoCloseOutputStream);
                        this.f18037a = parcelFileDescriptor;
                        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
                        AbstractC5816c.writeParcelable(parcel, 2, this.f18037a, i8, false);
                        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
                    }
                } catch (IOException e9) {
                    e = e9;
                    autoCloseOutputStream = null;
                }
                this.f18037a = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iBeginObjectHeader2 = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 2, this.f18037a, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader2);
    }

    public final InterfaceC5817d zza(Parcelable.Creator creator) {
        if (this.f18039c) {
            if (this.f18037a == null) {
                L1.n.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f18037a));
            try {
                try {
                    int i8 = dataInputStream.readInt();
                    byte[] bArr = new byte[i8];
                    dataInputStream.readFully(bArr, 0, i8);
                    o2.l.closeQuietly(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i8);
                        parcelObtain.setDataPosition(0);
                        this.f18038b = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f18039c = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e8) {
                    L1.n.zzh("Could not read from parcel file descriptor", e8);
                    o2.l.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                o2.l.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (InterfaceC5817d) this.f18038b;
    }
}
