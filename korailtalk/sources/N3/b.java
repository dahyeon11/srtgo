package N3;

import F3.m;
import F3.s;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f3227a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3228b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3229c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3230d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3231e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3232f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3233g;

    public b(M3.b bVar) {
        this(bVar, 10, bVar.getWidth() / 2, bVar.getHeight() / 2);
    }

    private s[] a(s sVar, s sVar2, s sVar3, s sVar4) {
        float x8 = sVar.getX();
        float y8 = sVar.getY();
        float x9 = sVar2.getX();
        float y9 = sVar2.getY();
        float x10 = sVar3.getX();
        float y10 = sVar3.getY();
        float x11 = sVar4.getX();
        float y11 = sVar4.getY();
        return x8 < ((float) this.f3229c) / 2.0f ? new s[]{new s(x11 - 1.0f, y11 + 1.0f), new s(x9 + 1.0f, y9 + 1.0f), new s(x10 - 1.0f, y10 - 1.0f), new s(x8 + 1.0f, y8 - 1.0f)} : new s[]{new s(x11 + 1.0f, y11 + 1.0f), new s(x9 + 1.0f, y9 - 1.0f), new s(x10 - 1.0f, y10 + 1.0f), new s(x8 - 1.0f, y8 - 1.0f)};
    }

    private boolean b(int i8, int i9, int i10, boolean z8) {
        if (z8) {
            while (i8 <= i9) {
                if (this.f3227a.get(i8, i10)) {
                    return true;
                }
                i8++;
            }
            return false;
        }
        while (i8 <= i9) {
            if (this.f3227a.get(i10, i8)) {
                return true;
            }
            i8++;
        }
        return false;
    }

    private s c(float f8, float f9, float f10, float f11) {
        int iRound = a.round(a.distance(f8, f9, f10, f11));
        float f12 = iRound;
        float f13 = (f10 - f8) / f12;
        float f14 = (f11 - f9) / f12;
        for (int i8 = 0; i8 < iRound; i8++) {
            float f15 = i8;
            int iRound2 = a.round((f15 * f13) + f8);
            int iRound3 = a.round((f15 * f14) + f9);
            if (this.f3227a.get(iRound2, iRound3)) {
                return new s(iRound2, iRound3);
            }
        }
        return null;
    }

    public s[] detect() throws m {
        int i8 = this.f3230d;
        int i9 = this.f3231e;
        int i10 = this.f3233g;
        int i11 = this.f3232f;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        while (z14) {
            boolean z15 = false;
            boolean zB = true;
            while (true) {
                if ((!zB && z9) || i9 >= this.f3229c) {
                    break;
                }
                zB = b(i10, i11, i9, false);
                if (zB) {
                    i9++;
                    z9 = true;
                    z15 = true;
                } else if (!z9) {
                    i9++;
                }
            }
            if (i9 < this.f3229c) {
                boolean zB2 = true;
                while (true) {
                    if ((!zB2 && z10) || i11 >= this.f3228b) {
                        break;
                    }
                    zB2 = b(i8, i9, i11, true);
                    if (zB2) {
                        i11++;
                        z10 = true;
                        z15 = true;
                    } else if (!z10) {
                        i11++;
                    }
                }
                if (i11 < this.f3228b) {
                    boolean zB3 = true;
                    while (true) {
                        if ((!zB3 && z11) || i8 < 0) {
                            break;
                        }
                        zB3 = b(i10, i11, i8, false);
                        if (zB3) {
                            i8--;
                            z11 = true;
                            z15 = true;
                        } else if (!z11) {
                            i8--;
                        }
                    }
                    if (i8 >= 0) {
                        z14 = z15;
                        boolean zB4 = true;
                        while (true) {
                            if ((!zB4 && z13) || i10 < 0) {
                                break;
                            }
                            zB4 = b(i8, i9, i10, true);
                            if (zB4) {
                                i10--;
                                z14 = true;
                                z13 = true;
                            } else if (!z13) {
                                i10--;
                            }
                        }
                        if (i10 >= 0) {
                            if (z14) {
                                z12 = true;
                            }
                        }
                    }
                }
            }
            z8 = true;
            break;
        }
        if (z8 || !z12) {
            throw m.getNotFoundInstance();
        }
        int i12 = i9 - i8;
        s sVarC = null;
        s sVarC2 = null;
        for (int i13 = 1; sVarC2 == null && i13 < i12; i13++) {
            sVarC2 = c(i8, i11 - i13, i8 + i13, i11);
        }
        if (sVarC2 == null) {
            throw m.getNotFoundInstance();
        }
        s sVarC3 = null;
        for (int i14 = 1; sVarC3 == null && i14 < i12; i14++) {
            sVarC3 = c(i8, i10 + i14, i8 + i14, i10);
        }
        if (sVarC3 == null) {
            throw m.getNotFoundInstance();
        }
        s sVarC4 = null;
        for (int i15 = 1; sVarC4 == null && i15 < i12; i15++) {
            sVarC4 = c(i9, i10 + i15, i9 - i15, i10);
        }
        if (sVarC4 == null) {
            throw m.getNotFoundInstance();
        }
        for (int i16 = 1; sVarC == null && i16 < i12; i16++) {
            sVarC = c(i9, i11 - i16, i9 - i16, i11);
        }
        if (sVarC != null) {
            return a(sVarC, sVarC2, sVarC4, sVarC3);
        }
        throw m.getNotFoundInstance();
    }

    public b(M3.b bVar, int i8, int i9, int i10) throws m {
        this.f3227a = bVar;
        int height = bVar.getHeight();
        this.f3228b = height;
        int width = bVar.getWidth();
        this.f3229c = width;
        int i11 = i8 / 2;
        int i12 = i9 - i11;
        this.f3230d = i12;
        int i13 = i9 + i11;
        this.f3231e = i13;
        int i14 = i10 - i11;
        this.f3233g = i14;
        int i15 = i10 + i11;
        this.f3232f = i15;
        if (i14 < 0 || i12 < 0 || i15 >= height || i13 >= width) {
            throw m.getNotFoundInstance();
        }
    }
}
