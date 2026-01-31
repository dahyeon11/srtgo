package y1;

import H1.Q1;
import H1.V0;
import android.os.RemoteException;

/* renamed from: y1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6514A {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Object f37559a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private V0 f37560b;

    /* renamed from: c, reason: collision with root package name */
    private a f37561c;

    public int getPlaybackState() {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return 0;
            }
            try {
                return v02.zzh();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call getPlaybackState on video controller.", e8);
                return 0;
            }
        }
    }

    public a getVideoLifecycleCallbacks() {
        a aVar;
        synchronized (this.f37559a) {
            aVar = this.f37561c;
        }
        return aVar;
    }

    public boolean hasVideoContent() {
        boolean z8;
        synchronized (this.f37559a) {
            z8 = this.f37560b != null;
        }
        return z8;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return false;
            }
            try {
                return v02.zzo();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call isClickToExpandEnabled.", e8);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return false;
            }
            try {
                return v02.zzp();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call isUsingCustomPlayerControls.", e8);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return true;
            }
            try {
                return v02.zzq();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call isMuted on video controller.", e8);
                return true;
            }
        }
    }

    public void mute(boolean z8) {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return;
            }
            try {
                v02.zzj(z8);
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call mute on video controller.", e8);
            }
        }
    }

    public void pause() {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return;
            }
            try {
                v02.zzk();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call pause on video controller.", e8);
            }
        }
    }

    public void play() {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return;
            }
            try {
                v02.zzl();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call play on video controller.", e8);
            }
        }
    }

    public void setVideoLifecycleCallbacks(a aVar) {
        Q1 q12;
        synchronized (this.f37559a) {
            this.f37561c = aVar;
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return;
            }
            if (aVar == null) {
                q12 = null;
            } else {
                try {
                    q12 = new Q1(aVar);
                } catch (RemoteException e8) {
                    L1.n.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e8);
                }
            }
            v02.zzm(q12);
        }
    }

    public void stop() {
        synchronized (this.f37559a) {
            V0 v02 = this.f37560b;
            if (v02 == null) {
                return;
            }
            try {
                v02.zzn();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to call stop on video controller.", e8);
            }
        }
    }

    public final V0 zza() {
        V0 v02;
        synchronized (this.f37559a) {
            v02 = this.f37560b;
        }
        return v02;
    }

    public final void zzb(V0 v02) {
        synchronized (this.f37559a) {
            try {
                this.f37560b = v02;
                a aVar = this.f37561c;
                if (aVar != null) {
                    setVideoLifecycleCallbacks(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y1.A$a */
    public static abstract class a {
        public void onVideoEnd() {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }

        public void onVideoMute(boolean z8) {
        }
    }
}
