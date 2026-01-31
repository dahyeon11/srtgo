package kotlin.jvm.internal;

import S6.M;
import j7.l;

/* loaded from: classes3.dex */
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i8) {
        this.size = i8;
        this.spreads = (T[]) new Object[i8];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i8 = this.position;
        this.position = i8 + 1;
        tArr[i8] = spreadArgument;
    }

    protected final int getPosition() {
        return this.position;
    }

    protected abstract int getSize(T t8);

    protected final void setPosition(int i8) {
        this.position = i8;
    }

    protected final int size() {
        int size = 0;
        M it = new l(0, this.size - 1).iterator();
        while (it.hasNext()) {
            T t8 = this.spreads[it.nextInt()];
            size += t8 != null ? getSize(t8) : 1;
        }
        return size;
    }

    protected final T toArray(T values, T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        M it = new l(0, this.size - 1).iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t8 = this.spreads[iNextInt];
            if (t8 != null) {
                if (i8 < iNextInt) {
                    int i10 = iNextInt - i8;
                    System.arraycopy(values, i8, result, i9, i10);
                    i9 += i10;
                }
                int size = getSize(t8);
                System.arraycopy(t8, 0, result, i9, size);
                i9 += size;
                i8 = iNextInt + 1;
            }
        }
        int i11 = this.size;
        if (i8 < i11) {
            System.arraycopy(values, i8, result, i9, i11 - i8);
        }
        return result;
    }
}
