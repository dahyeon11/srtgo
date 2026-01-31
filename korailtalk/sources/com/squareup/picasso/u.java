package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.D;
import com.squareup.picasso.s;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class u extends ThreadPoolExecutor {

    private static final class a extends FutureTask implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final RunnableC5295c f29878a;

        a(RunnableC5295c runnableC5295c) {
            super(runnableC5295c, null);
            this.f29878a = runnableC5295c;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            s.f fVarR = this.f29878a.r();
            s.f fVarR2 = aVar.f29878a.r();
            return fVarR == fVarR2 ? this.f29878a.f29762a - aVar.f29878a.f29762a : fVarR2.ordinal() - fVarR.ordinal();
        }
    }

    u() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new D.c());
    }

    private void b(int i8) {
        setCorePoolSize(i8);
        setMaximumPoolSize(i8);
    }

    void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                b(4);
                return;
            } else {
                b(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        b(3);
                        break;
                    default:
                        b(3);
                        break;
                }
                return;
        }
        b(2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((RunnableC5295c) runnable);
        execute(aVar);
        return aVar;
    }
}
