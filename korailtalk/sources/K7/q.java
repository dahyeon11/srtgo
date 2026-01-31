package k7;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q {

    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f33707a;

        public a(f7.p pVar) {
            this.f33707a = pVar;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            return p.iterator(this.f33707a);
        }
    }

    public static <T> Iterator<T> iterator(f7.p block) {
        Intrinsics.checkNotNullParameter(block, "block");
        n nVar = new n();
        nVar.setNextStep(X6.b.createCoroutineUnintercepted(block, nVar, nVar));
        return nVar;
    }

    public static <T> m sequence(f7.p block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(block);
    }
}
