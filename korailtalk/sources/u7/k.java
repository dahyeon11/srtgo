package u7;

import n7.P;

/* loaded from: classes3.dex */
public final class k extends h {
    public final Runnable block;

    public k(Runnable runnable, long j8, i iVar) {
        super(j8, iVar);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.afterTask();
        }
    }

    public String toString() {
        return "Task[" + P.getClassSimpleName(this.block) + '@' + P.getHexAddress(this.block) + ", " + this.submissionTime + ", " + this.taskContext + ']';
    }
}
