package u1;

import r4.C6174a;
import u1.C6405a;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6408d {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC6408d f37075a = a().e(C6174a.MIN_STORAGE_SIZE).d(200).b(10000).c(604800000).a();

    /* renamed from: u1.d$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC6408d a();

        abstract a b(int i8);

        abstract a c(long j8);

        abstract a d(int i8);

        abstract a e(long j8);
    }

    AbstractC6408d() {
    }

    static a a() {
        return new C6405a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract long e();
}
