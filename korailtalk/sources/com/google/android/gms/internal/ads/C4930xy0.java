package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4930xy0 implements InterfaceC2444cA0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4816wy0 f23815a;

    /* renamed from: b, reason: collision with root package name */
    private int f23816b;

    /* renamed from: c, reason: collision with root package name */
    private int f23817c;

    /* renamed from: d, reason: collision with root package name */
    private int f23818d = 0;

    private C4930xy0(AbstractC4816wy0 abstractC4816wy0) {
        AbstractC3793nz0.b(abstractC4816wy0, "input");
        this.f23815a = abstractC4816wy0;
        abstractC4816wy0.f23573c = this;
    }

    private final Object a(InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) {
        Object objZze = interfaceC3360kA0.zze();
        c(objZze, interfaceC3360kA0, iy0);
        interfaceC3360kA0.zzf(objZze);
        return objZze;
    }

    private final Object b(InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) throws C4021pz0 {
        Object objZze = interfaceC3360kA0.zze();
        d(objZze, interfaceC3360kA0, iy0);
        interfaceC3360kA0.zzf(objZze);
        return objZze;
    }

    private final void c(Object obj, InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) {
        int i8 = this.f23817c;
        this.f23817c = ((this.f23816b >>> 3) << 3) | 4;
        try {
            interfaceC3360kA0.zzh(obj, this, iy0);
            if (this.f23816b == this.f23817c) {
            } else {
                throw C4021pz0.g();
            }
        } finally {
            this.f23817c = i8;
        }
    }

    private final void d(Object obj, InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) throws C4021pz0 {
        AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
        int iZzn = abstractC4816wy0.zzn();
        if (abstractC4816wy0.f23571a >= abstractC4816wy0.f23572b) {
            throw new C4021pz0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = this.f23815a.zze(iZzn);
        this.f23815a.f23571a++;
        interfaceC3360kA0.zzh(obj, this, iy0);
        this.f23815a.zzz(0);
        r4.f23571a--;
        this.f23815a.zzA(iZze);
    }

    private final void e(int i8) throws C4021pz0 {
        if (this.f23815a.zzd() != i8) {
            throw C4021pz0.i();
        }
    }

    private final void f(int i8) throws C3907oz0 {
        if ((this.f23816b & 7) != i8) {
            throw C4021pz0.a();
        }
    }

    private static final void g(int i8) throws C4021pz0 {
        if ((i8 & 3) != 0) {
            throw C4021pz0.g();
        }
    }

    private static final void h(int i8) throws C4021pz0 {
        if ((i8 & 7) != 0) {
            throw C4021pz0.g();
        }
    }

    public static C4930xy0 zzq(AbstractC4816wy0 abstractC4816wy0) {
        C4930xy0 c4930xy0 = abstractC4816wy0.f23573c;
        return c4930xy0 != null ? c4930xy0 : new C4930xy0(abstractC4816wy0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzA(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    c2307az0.zzi(this.f23815a.zzf());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                c2307az0.zzi(this.f23815a.zzf());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Integer.valueOf(this.f23815a.zzf()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f23815a.zzf()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzB(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            int i8 = this.f23816b & 7;
            if (i8 == 2) {
                int iZzn = this.f23815a.zzn();
                g(iZzn);
                int iZzd = this.f23815a.zzd() + iZzn;
                do {
                    c2307az0.zzi(this.f23815a.zzg());
                } while (this.f23815a.zzd() < iZzd);
                return;
            }
            if (i8 != 5) {
                throw C4021pz0.a();
            }
            do {
                c2307az0.zzi(this.f23815a.zzg());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 == 2) {
                int iZzn2 = this.f23815a.zzn();
                g(iZzn2);
                int iZzd2 = this.f23815a.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.f23815a.zzg()));
                } while (this.f23815a.zzd() < iZzd2);
                return;
            }
            if (i9 != 5) {
                throw C4021pz0.a();
            }
            do {
                list.add(Integer.valueOf(this.f23815a.zzg()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzC(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                int iZzn = this.f23815a.zzn();
                h(iZzn);
                int iZzd = this.f23815a.zzd() + iZzn;
                do {
                    ez0.zzg(this.f23815a.zzo());
                } while (this.f23815a.zzd() < iZzd);
                return;
            }
            do {
                ez0.zzg(this.f23815a.zzo());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                int iZzn2 = this.f23815a.zzn();
                h(iZzn2);
                int iZzd2 = this.f23815a.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.f23815a.zzo()));
                } while (this.f23815a.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f23815a.zzo()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzD(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Qy0) {
            Qy0 qy0 = (Qy0) list;
            int i8 = this.f23816b & 7;
            if (i8 == 2) {
                int iZzn = this.f23815a.zzn();
                g(iZzn);
                int iZzd = this.f23815a.zzd() + iZzn;
                do {
                    qy0.zzh(this.f23815a.zzc());
                } while (this.f23815a.zzd() < iZzd);
                return;
            }
            if (i8 != 5) {
                throw C4021pz0.a();
            }
            do {
                qy0.zzh(this.f23815a.zzc());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 == 2) {
                int iZzn2 = this.f23815a.zzn();
                g(iZzn2);
                int iZzd2 = this.f23815a.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.f23815a.zzc()));
                } while (this.f23815a.zzd() < iZzd2);
                return;
            }
            if (i9 != 5) {
                throw C4021pz0.a();
            }
            do {
                list.add(Float.valueOf(this.f23815a.zzc()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    @Deprecated
    public final void zzE(List list, InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) throws C3907oz0 {
        int iZzm;
        int i8 = this.f23816b;
        if ((i8 & 7) != 3) {
            throw C4021pz0.a();
        }
        do {
            list.add(a(interfaceC3360kA0, iy0));
            if (this.f23815a.zzC() || this.f23818d != 0) {
                return;
            } else {
                iZzm = this.f23815a.zzm();
            }
        } while (iZzm == i8);
        this.f23818d = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzF(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    c2307az0.zzi(this.f23815a.zzh());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                c2307az0.zzi(this.f23815a.zzh());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Integer.valueOf(this.f23815a.zzh()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f23815a.zzh()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzG(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    ez0.zzg(this.f23815a.zzp());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                ez0.zzg(this.f23815a.zzp());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Long.valueOf(this.f23815a.zzp()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f23815a.zzp()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzH(List list, InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) throws C3907oz0 {
        int iZzm;
        int i8 = this.f23816b;
        if ((i8 & 7) != 2) {
            throw C4021pz0.a();
        }
        do {
            list.add(b(interfaceC3360kA0, iy0));
            if (this.f23815a.zzC() || this.f23818d != 0) {
                return;
            } else {
                iZzm = this.f23815a.zzm();
            }
        } while (iZzm == i8);
        this.f23818d = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzI(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            int i8 = this.f23816b & 7;
            if (i8 == 2) {
                int iZzn = this.f23815a.zzn();
                g(iZzn);
                int iZzd = this.f23815a.zzd() + iZzn;
                do {
                    c2307az0.zzi(this.f23815a.zzk());
                } while (this.f23815a.zzd() < iZzd);
                return;
            }
            if (i8 != 5) {
                throw C4021pz0.a();
            }
            do {
                c2307az0.zzi(this.f23815a.zzk());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 == 2) {
                int iZzn2 = this.f23815a.zzn();
                g(iZzn2);
                int iZzd2 = this.f23815a.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.f23815a.zzk()));
                } while (this.f23815a.zzd() < iZzd2);
                return;
            }
            if (i9 != 5) {
                throw C4021pz0.a();
            }
            do {
                list.add(Integer.valueOf(this.f23815a.zzk()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzJ(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                int iZzn = this.f23815a.zzn();
                h(iZzn);
                int iZzd = this.f23815a.zzd() + iZzn;
                do {
                    ez0.zzg(this.f23815a.zzt());
                } while (this.f23815a.zzd() < iZzd);
                return;
            }
            do {
                ez0.zzg(this.f23815a.zzt());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                int iZzn2 = this.f23815a.zzn();
                h(iZzn2);
                int iZzd2 = this.f23815a.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.f23815a.zzt()));
                } while (this.f23815a.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f23815a.zzt()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzK(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    c2307az0.zzi(this.f23815a.zzl());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                c2307az0.zzi(this.f23815a.zzl());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Integer.valueOf(this.f23815a.zzl()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f23815a.zzl()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzL(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    ez0.zzg(this.f23815a.zzu());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                ez0.zzg(this.f23815a.zzu());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Long.valueOf(this.f23815a.zzu()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f23815a.zzu()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    public final void zzM(List list, boolean z8) throws C3907oz0 {
        int iZzm;
        int iZzm2;
        if ((this.f23816b & 7) != 2) {
            throw C4021pz0.a();
        }
        if ((list instanceof InterfaceC4932xz0) && !z8) {
            InterfaceC4932xz0 interfaceC4932xz0 = (InterfaceC4932xz0) list;
            do {
                interfaceC4932xz0.zzi(zzp());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            do {
                list.add(z8 ? zzu() : zzt());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzN(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    c2307az0.zzi(this.f23815a.zzn());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                c2307az0.zzi(this.f23815a.zzn());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Integer.valueOf(this.f23815a.zzn()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f23815a.zzn()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzO(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    ez0.zzg(this.f23815a.zzv());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                ez0.zzg(this.f23815a.zzv());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Long.valueOf(this.f23815a.zzv()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f23815a.zzv()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final boolean zzP() throws C3907oz0 {
        f(0);
        return this.f23815a.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final boolean zzQ() {
        int i8;
        if (this.f23815a.zzC() || (i8 = this.f23816b) == this.f23817c) {
            return false;
        }
        return this.f23815a.zzE(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final double zza() throws C3907oz0 {
        f(1);
        return this.f23815a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final float zzb() throws C3907oz0 {
        f(5);
        return this.f23815a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zzc() {
        int iZzm = this.f23818d;
        if (iZzm != 0) {
            this.f23816b = iZzm;
            this.f23818d = 0;
        } else {
            iZzm = this.f23815a.zzm();
            this.f23816b = iZzm;
        }
        if (iZzm == 0 || iZzm == this.f23817c) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zzd() {
        return this.f23816b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zze() throws C3907oz0 {
        f(0);
        return this.f23815a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zzf() throws C3907oz0 {
        f(5);
        return this.f23815a.zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zzg() throws C3907oz0 {
        f(0);
        return this.f23815a.zzh();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zzh() throws C3907oz0 {
        f(5);
        return this.f23815a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zzi() throws C3907oz0 {
        f(0);
        return this.f23815a.zzl();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final int zzj() throws C3907oz0 {
        f(0);
        return this.f23815a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final long zzk() throws C3907oz0 {
        f(1);
        return this.f23815a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final long zzl() throws C3907oz0 {
        f(0);
        return this.f23815a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final long zzm() throws C3907oz0 {
        f(1);
        return this.f23815a.zzt();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final long zzn() throws C3907oz0 {
        f(0);
        return this.f23815a.zzu();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final long zzo() throws C3907oz0 {
        f(0);
        return this.f23815a.zzv();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final AbstractC3677my0 zzp() throws C3907oz0 {
        f(2);
        return this.f23815a.zzw();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    @Deprecated
    public final Object zzr(Class cls, Iy0 iy0) throws C3907oz0 {
        f(3);
        return a(Zz0.zza().zzb(cls), iy0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final Object zzs(Class cls, Iy0 iy0) throws C3907oz0 {
        f(2);
        return b(Zz0.zza().zzb(cls), iy0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final String zzt() throws C3907oz0 {
        f(2);
        return this.f23815a.zzx();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final String zzu() throws C3907oz0 {
        f(2);
        return this.f23815a.zzy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzv(Object obj, InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) throws C3907oz0 {
        f(3);
        c(obj, interfaceC3360kA0, iy0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzw(Object obj, InterfaceC3360kA0 interfaceC3360kA0, Iy0 iy0) throws C4021pz0 {
        f(2);
        d(obj, interfaceC3360kA0, iy0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzx(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Xx0) {
            Xx0 xx0 = (Xx0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy0 = this.f23815a;
                int iZzd = abstractC4816wy0.zzd() + abstractC4816wy0.zzn();
                do {
                    xx0.zzg(this.f23815a.zzD());
                } while (this.f23815a.zzd() < iZzd);
                e(iZzd);
                return;
            }
            do {
                xx0.zzg(this.f23815a.zzD());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                AbstractC4816wy0 abstractC4816wy02 = this.f23815a;
                int iZzd2 = abstractC4816wy02.zzd() + abstractC4816wy02.zzn();
                do {
                    list.add(Boolean.valueOf(this.f23815a.zzD()));
                } while (this.f23815a.zzd() < iZzd2);
                e(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.f23815a.zzD()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzy(List list) throws C3907oz0 {
        int iZzm;
        if ((this.f23816b & 7) != 2) {
            throw C4021pz0.a();
        }
        do {
            list.add(zzp());
            if (this.f23815a.zzC()) {
                return;
            } else {
                iZzm = this.f23815a.zzm();
            }
        } while (iZzm == this.f23816b);
        this.f23818d = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2444cA0
    public final void zzz(List list) throws C4021pz0 {
        int iZzm;
        int iZzm2;
        if (list instanceof Fy0) {
            Fy0 fy0 = (Fy0) list;
            int i8 = this.f23816b & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw C4021pz0.a();
                }
                int iZzn = this.f23815a.zzn();
                h(iZzn);
                int iZzd = this.f23815a.zzd() + iZzn;
                do {
                    fy0.zzh(this.f23815a.zzb());
                } while (this.f23815a.zzd() < iZzd);
                return;
            }
            do {
                fy0.zzh(this.f23815a.zzb());
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm2 = this.f23815a.zzm();
                }
            } while (iZzm2 == this.f23816b);
        } else {
            int i9 = this.f23816b & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw C4021pz0.a();
                }
                int iZzn2 = this.f23815a.zzn();
                h(iZzn2);
                int iZzd2 = this.f23815a.zzd() + iZzn2;
                do {
                    list.add(Double.valueOf(this.f23815a.zzb()));
                } while (this.f23815a.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.f23815a.zzb()));
                if (this.f23815a.zzC()) {
                    return;
                } else {
                    iZzm = this.f23815a.zzm();
                }
            } while (iZzm == this.f23816b);
            iZzm2 = iZzm;
        }
        this.f23818d = iZzm2;
    }
}
