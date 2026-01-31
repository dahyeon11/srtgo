package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.rD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4163rD0 implements Iterator, Closeable, M8 {

    /* renamed from: g, reason: collision with root package name */
    private static final L8 f22395g = new C3936pD0("eof ");

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC4961yD0 f22396h = AbstractC4961yD0.zzb(C4163rD0.class);

    /* renamed from: a, reason: collision with root package name */
    protected I8 f22397a;

    /* renamed from: b, reason: collision with root package name */
    protected InterfaceC4277sD0 f22398b;

    /* renamed from: c, reason: collision with root package name */
    L8 f22399c = null;

    /* renamed from: d, reason: collision with root package name */
    long f22400d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f22401e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final List f22402f = new ArrayList();

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        L8 l8 = this.f22399c;
        if (l8 == f22395g) {
            return false;
        }
        if (l8 != null) {
            return true;
        }
        try {
            this.f22399c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f22399c = f22395g;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i8 = 0; i8 < this.f22402f.size(); i8++) {
            if (i8 > 0) {
                sb.append(";");
            }
            sb.append(((L8) this.f22402f.get(i8)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final L8 next() {
        L8 l8Zzb;
        L8 l8 = this.f22399c;
        if (l8 != null && l8 != f22395g) {
            this.f22399c = null;
            return l8;
        }
        InterfaceC4277sD0 interfaceC4277sD0 = this.f22398b;
        if (interfaceC4277sD0 == null || this.f22400d >= this.f22401e) {
            this.f22399c = f22395g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (interfaceC4277sD0) {
                this.f22398b.zze(this.f22400d);
                l8Zzb = this.f22397a.zzb(this.f22398b, this);
                this.f22400d = this.f22398b.zzb();
            }
            return l8Zzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.f22398b == null || this.f22399c == f22395g) ? this.f22402f : new C4847xD0(this.f22402f, this);
    }

    public final void zzf(InterfaceC4277sD0 interfaceC4277sD0, long j8, I8 i8) {
        this.f22398b = interfaceC4277sD0;
        this.f22400d = interfaceC4277sD0.zzb();
        interfaceC4277sD0.zze(interfaceC4277sD0.zzb() + j8);
        this.f22401e = interfaceC4277sD0.zzb();
        this.f22397a = i8;
    }
}
