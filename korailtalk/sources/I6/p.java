package I6;

import io.grpc.internal.W0;
import io.grpc.internal.X0;

/* loaded from: classes.dex */
class p implements X0 {
    p() {
    }

    @Override // io.grpc.internal.X0
    public W0 allocate(int i8) {
        return new o(new P7.c(), Math.min(1048576, Math.max(4096, i8)));
    }
}
