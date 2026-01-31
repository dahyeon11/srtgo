package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Yt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC2145Yt extends AbstractC2296au implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: s, reason: collision with root package name */
    private static final Map f17441s;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4579uu f17442c;

    /* renamed from: d, reason: collision with root package name */
    private final C4693vu f17443d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17444e;

    /* renamed from: f, reason: collision with root package name */
    private int f17445f;

    /* renamed from: g, reason: collision with root package name */
    private int f17446g;

    /* renamed from: h, reason: collision with root package name */
    private MediaPlayer f17447h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f17448i;

    /* renamed from: j, reason: collision with root package name */
    private int f17449j;

    /* renamed from: k, reason: collision with root package name */
    private int f17450k;

    /* renamed from: l, reason: collision with root package name */
    private int f17451l;

    /* renamed from: m, reason: collision with root package name */
    private C4351su f17452m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f17453n;

    /* renamed from: o, reason: collision with root package name */
    private int f17454o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC2186Zt f17455p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17456q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f17457r;

    static {
        HashMap map = new HashMap();
        f17441s = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC2145Yt(Context context, InterfaceC4579uu interfaceC4579uu, boolean z8, boolean z9, C4465tu c4465tu, C4693vu c4693vu) {
        super(context);
        this.f17445f = 0;
        this.f17446g = 0;
        this.f17456q = false;
        this.f17457r = null;
        setSurfaceTextureListener(this);
        this.f17442c = interfaceC4579uu;
        this.f17443d = c4693vu;
        this.f17453n = z8;
        this.f17444e = z9;
        c4693vu.zza(this);
    }

    private final void a() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        AbstractC0667v0.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f17448i == null || surfaceTexture == null) {
            return;
        }
        b(false);
        try {
            G1.u.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f17447h = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f17447h.setOnCompletionListener(this);
            this.f17447h.setOnErrorListener(this);
            this.f17447h.setOnInfoListener(this);
            this.f17447h.setOnPreparedListener(this);
            this.f17447h.setOnVideoSizeChangedListener(this);
            this.f17451l = 0;
            if (this.f17453n) {
                C4351su c4351su = new C4351su(getContext());
                this.f17452m = c4351su;
                c4351su.zzd(surfaceTexture, getWidth(), getHeight());
                this.f17452m.start();
                SurfaceTexture surfaceTextureZzb = this.f17452m.zzb();
                if (surfaceTextureZzb != null) {
                    surfaceTexture = surfaceTextureZzb;
                } else {
                    this.f17452m.zze();
                    this.f17452m = null;
                }
            }
            this.f17447h.setDataSource(getContext(), this.f17448i);
            G1.u.zzl();
            this.f17447h.setSurface(new Surface(surfaceTexture));
            this.f17447h.setAudioStreamType(3);
            this.f17447h.setScreenOnWhilePlaying(true);
            this.f17447h.prepareAsync();
            c(1);
        } catch (IOException e8) {
            e = e8;
            L1.n.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f17448i)), e);
            onError(this.f17447h, 1, 0);
        } catch (IllegalArgumentException e9) {
            e = e9;
            L1.n.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f17448i)), e);
            onError(this.f17447h, 1, 0);
        } catch (IllegalStateException e10) {
            e = e10;
            L1.n.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f17448i)), e);
            onError(this.f17447h, 1, 0);
        }
    }

    private final void b(boolean z8) {
        AbstractC0667v0.zza("AdMediaPlayerView release");
        C4351su c4351su = this.f17452m;
        if (c4351su != null) {
            c4351su.zze();
            this.f17452m = null;
        }
        MediaPlayer mediaPlayer = this.f17447h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f17447h.release();
            this.f17447h = null;
            c(0);
            if (z8) {
                this.f17446g = 0;
            }
        }
    }

    private final void c(int i8) {
        if (i8 == 3) {
            this.f17443d.zzc();
            this.f18048b.zzb();
        } else if (this.f17445f == 3) {
            this.f17443d.zze();
            this.f18048b.zzc();
        }
        this.f17445f = i8;
    }

    private final void d(float f8) {
        MediaPlayer mediaPlayer = this.f17447h;
        if (mediaPlayer == null) {
            L1.n.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f8, f8);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean e() {
        int i8;
        return (this.f17447h == null || (i8 = this.f17445f) == -1 || i8 == 0 || i8 == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void h(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt, MediaPlayer mediaPlayer) throws IllegalStateException {
        MediaFormat format;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue() || textureViewSurfaceTextureListenerC2145Yt.f17442c == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    textureViewSurfaceTextureListenerC2145Yt.f17457r = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                textureViewSurfaceTextureListenerC2145Yt.f17442c.zzd("onMetadataEvent", map);
            }
        } catch (RuntimeException e8) {
            G1.u.zzo().zzw(e8, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i8) {
        this.f17451l = i8;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC0667v0.zza("AdMediaPlayerView completion");
        c(5);
        this.f17446g = 5;
        K1.K0.zza.post(new RunnableC1817Qt(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
        Map map = f17441s;
        String str = (String) map.get(Integer.valueOf(i8));
        String str2 = (String) map.get(Integer.valueOf(i9));
        L1.n.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        c(-1);
        this.f17446g = -1;
        K1.K0.zza.post(new RunnableC1858Rt(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i8, int i9) {
        Map map = f17441s;
        AbstractC0667v0.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i8))) + ":" + ((String) map.get(Integer.valueOf(i9))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f17449j
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f17450k
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f17449j
            if (r2 <= 0) goto L7a
            int r2 = r5.f17450k
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.su r2 = r5.f17452m
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f17449j
            int r1 = r0 * r7
            int r2 = r5.f17450k
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.f17450k
            int r0 = r0 * r6
            int r2 = r5.f17449j
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f17449j
            int r1 = r1 * r7
            int r2 = r5.f17450k
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f17449j
            int r4 = r5.f17450k
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.su r6 = r5.f17452m
            if (r6 == 0) goto L84
            r6.zzc(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2145Yt.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC0667v0.zza("AdMediaPlayerView prepared");
        c(2);
        this.f17443d.zzb();
        K1.K0.zza.post(new RunnableC1776Pt(this, mediaPlayer));
        this.f17449j = mediaPlayer.getVideoWidth();
        this.f17450k = mediaPlayer.getVideoHeight();
        int i8 = this.f17454o;
        if (i8 != 0) {
            zzq(i8);
        }
        if (this.f17444e && e() && this.f17447h.getCurrentPosition() > 0 && this.f17446g != 3) {
            AbstractC0667v0.zza("AdMediaPlayerView nudging MediaPlayer");
            d(0.0f);
            this.f17447h.start();
            int currentPosition = this.f17447h.getCurrentPosition();
            long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
            while (e() && this.f17447h.getCurrentPosition() == currentPosition && G1.u.zzB().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.f17447h.pause();
            zzn();
        }
        L1.n.zzi("AdMediaPlayerView stream dimensions: " + this.f17449j + " x " + this.f17450k);
        if (this.f17446g == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        AbstractC0667v0.zza("AdMediaPlayerView surface created");
        a();
        K1.K0.zza.post(new RunnableC1899St(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC0667v0.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f17447h;
        if (mediaPlayer != null && this.f17454o == 0) {
            this.f17454o = mediaPlayer.getCurrentPosition();
        }
        C4351su c4351su = this.f17452m;
        if (c4351su != null) {
            c4351su.zze();
        }
        K1.K0.zza.post(new RunnableC1981Ut(this));
        b(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) throws IllegalStateException {
        AbstractC0667v0.zza("AdMediaPlayerView surface changed");
        int i10 = this.f17446g;
        boolean z8 = false;
        if (this.f17449j == i8 && this.f17450k == i9) {
            z8 = true;
        }
        if (this.f17447h != null && i10 == 3 && z8) {
            int i11 = this.f17454o;
            if (i11 != 0) {
                zzq(i11);
            }
            zzp();
        }
        C4351su c4351su = this.f17452m;
        if (c4351su != null) {
            c4351su.zzc(i8, i9);
        }
        K1.K0.zza.post(new RunnableC1940Tt(this, i8, i9));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f17443d.zzf(this);
        this.f18047a.zza(surfaceTexture, this.f17455p);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i8, int i9) {
        AbstractC0667v0.zza("AdMediaPlayerView size changed: " + i8 + " x " + i9);
        this.f17449j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f17450k = videoHeight;
        if (this.f17449j == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i8) {
        AbstractC0667v0.zza("AdMediaPlayerView window visibility changed to " + i8);
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Nt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(i8);
            }
        });
        super.onWindowVisibilityChanged(i8);
    }

    @Override // android.view.View
    public final String toString() {
        return TextureViewSurfaceTextureListenerC2145Yt.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zza() {
        if (e()) {
            return this.f17447h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !e()) {
            return -1;
        }
        return this.f17447h.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zzc() {
        if (e()) {
            return this.f17447h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zzd() {
        MediaPlayer mediaPlayer = this.f17447h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final int zze() {
        MediaPlayer mediaPlayer = this.f17447h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final long zzg() {
        if (this.f17457r != null) {
            return (zzh() * this.f17451l) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final long zzh() {
        if (this.f17457r != null) {
            return zzc() * this.f17457r.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final String zzj() {
        return "MediaPlayer".concat(true != this.f17453n ? "" : " spherical");
    }

    final /* synthetic */ void zzm(int i8) {
        InterfaceC2186Zt interfaceC2186Zt = this.f17455p;
        if (interfaceC2186Zt != null) {
            interfaceC2186Zt.onWindowVisibilityChanged(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au, com.google.android.gms.internal.ads.InterfaceC4921xu
    public final void zzn() {
        d(this.f18048b.zza());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzo() throws IllegalStateException {
        AbstractC0667v0.zza("AdMediaPlayerView pause");
        if (e() && this.f17447h.isPlaying()) {
            this.f17447h.pause();
            c(4);
            K1.K0.zza.post(new RunnableC2063Wt(this));
        }
        this.f17446g = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzp() throws IllegalStateException {
        AbstractC0667v0.zza("AdMediaPlayerView play");
        if (e()) {
            this.f17447h.start();
            c(3);
            this.f18047a.zzb();
            K1.K0.zza.post(new RunnableC2022Vt(this));
        }
        this.f17446g = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzq(int i8) throws IllegalStateException {
        AbstractC0667v0.zza("AdMediaPlayerView seek " + i8);
        if (!e()) {
            this.f17454o = i8;
        } else {
            this.f17447h.seekTo(i8);
            this.f17454o = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzr(InterfaceC2186Zt interfaceC2186Zt) {
        this.f17455p = interfaceC2186Zt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzs(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        C3067he c3067heZza = C3067he.zza(uri);
        if (c3067heZza == null || c3067heZza.zza != null) {
            if (c3067heZza != null) {
                uri = Uri.parse(c3067heZza.zza);
            }
            this.f17448i = uri;
            this.f17454o = 0;
            a();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzt() throws IllegalStateException {
        AbstractC0667v0.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f17447h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f17447h.release();
            this.f17447h = null;
            c(0);
            this.f17446g = 0;
        }
        this.f17443d.zzd();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2296au
    public final void zzu(float f8, float f9) {
        C4351su c4351su = this.f17452m;
        if (c4351su != null) {
            c4351su.zzf(f8, f9);
        }
    }
}
