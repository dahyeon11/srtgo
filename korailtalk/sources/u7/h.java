package u7;

/* loaded from: classes3.dex */
public abstract class h implements Runnable {
    public long submissionTime;
    public i taskContext;

    public h(long j8, i iVar) {
        this.submissionTime = j8;
        this.taskContext = iVar;
    }

    public final int getMode() {
        return this.taskContext.getTaskMode();
    }

    public h() {
        this(0L, l.NonBlockingContext);
    }
}
