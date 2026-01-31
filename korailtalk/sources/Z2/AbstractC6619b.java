package z2;

import java.util.Arrays;

/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC6619b extends c {

    /* renamed from: a, reason: collision with root package name */
    Object[] f37859a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f37860b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f37861c;

    AbstractC6619b(int i8) {
    }

    public final AbstractC6619b zza(Object obj) {
        obj.getClass();
        int i8 = this.f37860b;
        int i9 = i8 + 1;
        Object[] objArr = this.f37859a;
        int length = objArr.length;
        if (length < i9) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int iHighestOneBit = Integer.highestOneBit(i8);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.f37859a = Arrays.copyOf(objArr, i10);
            this.f37861c = false;
        } else if (this.f37861c) {
            this.f37859a = (Object[]) objArr.clone();
            this.f37861c = false;
        }
        Object[] objArr2 = this.f37859a;
        int i11 = this.f37860b;
        this.f37860b = i11 + 1;
        objArr2[i11] = obj;
        return this;
    }
}
