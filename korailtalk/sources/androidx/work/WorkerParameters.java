package androidx.work;

import H0.h;
import H0.r;
import H0.z;
import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    private UUID f11100a;

    /* renamed from: b */
    private b f11101b;

    /* renamed from: c */
    private Set f11102c;

    /* renamed from: d */
    private a f11103d;

    /* renamed from: e */
    private int f11104e;

    /* renamed from: f */
    private Executor f11105f;

    /* renamed from: g */
    private R0.a f11106g;

    /* renamed from: h */
    private z f11107h;

    /* renamed from: i */
    private r f11108i;

    /* renamed from: j */
    private h f11109j;

    public static class a {
        public Network network;
        public List<String> triggeredContentAuthorities = Collections.emptyList();
        public List<Uri> triggeredContentUris = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i8, Executor executor, R0.a aVar2, z zVar, r rVar, h hVar) {
        this.f11100a = uuid;
        this.f11101b = bVar;
        this.f11102c = new HashSet(collection);
        this.f11103d = aVar;
        this.f11104e = i8;
        this.f11105f = executor;
        this.f11106g = aVar2;
        this.f11107h = zVar;
        this.f11108i = rVar;
        this.f11109j = hVar;
    }

    public Executor getBackgroundExecutor() {
        return this.f11105f;
    }

    public h getForegroundUpdater() {
        return this.f11109j;
    }

    public UUID getId() {
        return this.f11100a;
    }

    public b getInputData() {
        return this.f11101b;
    }

    public Network getNetwork() {
        return this.f11103d.network;
    }

    public r getProgressUpdater() {
        return this.f11108i;
    }

    public int getRunAttemptCount() {
        return this.f11104e;
    }

    public a getRuntimeExtras() {
        return this.f11103d;
    }

    public Set<String> getTags() {
        return this.f11102c;
    }

    public R0.a getTaskExecutor() {
        return this.f11106g;
    }

    public List<String> getTriggeredContentAuthorities() {
        return this.f11103d.triggeredContentAuthorities;
    }

    public List<Uri> getTriggeredContentUris() {
        return this.f11103d.triggeredContentUris;
    }

    public z getWorkerFactory() {
        return this.f11107h;
    }
}
