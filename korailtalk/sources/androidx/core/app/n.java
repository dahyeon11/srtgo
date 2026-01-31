package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public class n {
    public static final String DEFAULT_CHANNEL_ID = "miscellaneous";

    /* renamed from: a, reason: collision with root package name */
    final String f8732a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f8733b;

    /* renamed from: c, reason: collision with root package name */
    int f8734c;

    /* renamed from: d, reason: collision with root package name */
    String f8735d;

    /* renamed from: e, reason: collision with root package name */
    String f8736e;

    /* renamed from: f, reason: collision with root package name */
    boolean f8737f;

    /* renamed from: g, reason: collision with root package name */
    Uri f8738g;

    /* renamed from: h, reason: collision with root package name */
    AudioAttributes f8739h;

    /* renamed from: i, reason: collision with root package name */
    boolean f8740i;

    /* renamed from: j, reason: collision with root package name */
    int f8741j;

    /* renamed from: k, reason: collision with root package name */
    boolean f8742k;

    /* renamed from: l, reason: collision with root package name */
    long[] f8743l;

    /* renamed from: m, reason: collision with root package name */
    String f8744m;

    /* renamed from: n, reason: collision with root package name */
    String f8745n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8746o;

    /* renamed from: p, reason: collision with root package name */
    private int f8747p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8748q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8749r;

    static class a {
        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        static NotificationChannel c(String str, CharSequence charSequence, int i8) {
            return new NotificationChannel(str, charSequence, i8);
        }

        static void d(NotificationChannel notificationChannel, boolean z8) {
            notificationChannel.enableLights(z8);
        }

        static void e(NotificationChannel notificationChannel, boolean z8) {
            notificationChannel.enableVibration(z8);
        }

        static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        static void r(NotificationChannel notificationChannel, int i8) {
            notificationChannel.setLightColor(i8);
        }

        static void s(NotificationChannel notificationChannel, boolean z8) {
            notificationChannel.setShowBadge(z8);
        }

        static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    static class b {
        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    static class c {
        static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final n f8750a;

        public d(String str, int i8) {
            this.f8750a = new n(str, i8);
        }

        public n build() {
            return this.f8750a;
        }

        public d setConversationId(String str, String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                n nVar = this.f8750a;
                nVar.f8744m = str;
                nVar.f8745n = str2;
            }
            return this;
        }

        public d setDescription(String str) {
            this.f8750a.f8735d = str;
            return this;
        }

        public d setGroup(String str) {
            this.f8750a.f8736e = str;
            return this;
        }

        public d setImportance(int i8) {
            this.f8750a.f8734c = i8;
            return this;
        }

        public d setLightColor(int i8) {
            this.f8750a.f8741j = i8;
            return this;
        }

        public d setLightsEnabled(boolean z8) {
            this.f8750a.f8740i = z8;
            return this;
        }

        public d setName(CharSequence charSequence) {
            this.f8750a.f8733b = charSequence;
            return this;
        }

        public d setShowBadge(boolean z8) {
            this.f8750a.f8737f = z8;
            return this;
        }

        public d setSound(Uri uri, AudioAttributes audioAttributes) {
            n nVar = this.f8750a;
            nVar.f8738g = uri;
            nVar.f8739h = audioAttributes;
            return this;
        }

        public d setVibrationEnabled(boolean z8) {
            this.f8750a.f8742k = z8;
            return this;
        }

        public d setVibrationPattern(long[] jArr) {
            n nVar = this.f8750a;
            nVar.f8742k = jArr != null && jArr.length > 0;
            nVar.f8743l = jArr;
            return this;
        }
    }

    n(String str, int i8) {
        this.f8737f = true;
        this.f8738g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f8741j = 0;
        this.f8732a = (String) Z.h.checkNotNull(str);
        this.f8734c = i8;
        this.f8739h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    NotificationChannel a() {
        String str;
        String str2;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 26) {
            return null;
        }
        NotificationChannel notificationChannelC = a.c(this.f8732a, this.f8733b, this.f8734c);
        a.p(notificationChannelC, this.f8735d);
        a.q(notificationChannelC, this.f8736e);
        a.s(notificationChannelC, this.f8737f);
        a.t(notificationChannelC, this.f8738g, this.f8739h);
        a.d(notificationChannelC, this.f8740i);
        a.r(notificationChannelC, this.f8741j);
        a.u(notificationChannelC, this.f8743l);
        a.e(notificationChannelC, this.f8742k);
        if (i8 >= 30 && (str = this.f8744m) != null && (str2 = this.f8745n) != null) {
            c.d(notificationChannelC, str, str2);
        }
        return notificationChannelC;
    }

    public boolean canBubble() {
        return this.f8748q;
    }

    public boolean canBypassDnd() {
        return this.f8746o;
    }

    public boolean canShowBadge() {
        return this.f8737f;
    }

    public AudioAttributes getAudioAttributes() {
        return this.f8739h;
    }

    public String getConversationId() {
        return this.f8745n;
    }

    public String getDescription() {
        return this.f8735d;
    }

    public String getGroup() {
        return this.f8736e;
    }

    public String getId() {
        return this.f8732a;
    }

    public int getImportance() {
        return this.f8734c;
    }

    public int getLightColor() {
        return this.f8741j;
    }

    public int getLockscreenVisibility() {
        return this.f8747p;
    }

    public CharSequence getName() {
        return this.f8733b;
    }

    public String getParentChannelId() {
        return this.f8744m;
    }

    public Uri getSound() {
        return this.f8738g;
    }

    public long[] getVibrationPattern() {
        return this.f8743l;
    }

    public boolean isImportantConversation() {
        return this.f8749r;
    }

    public boolean shouldShowLights() {
        return this.f8740i;
    }

    public boolean shouldVibrate() {
        return this.f8742k;
    }

    public d toBuilder() {
        return new d(this.f8732a, this.f8734c).setName(this.f8733b).setDescription(this.f8735d).setGroup(this.f8736e).setShowBadge(this.f8737f).setSound(this.f8738g, this.f8739h).setLightsEnabled(this.f8740i).setLightColor(this.f8741j).setVibrationEnabled(this.f8742k).setVibrationPattern(this.f8743l).setConversationId(this.f8744m, this.f8745n);
    }

    n(NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f8733b = a.m(notificationChannel);
        this.f8735d = a.g(notificationChannel);
        this.f8736e = a.h(notificationChannel);
        this.f8737f = a.b(notificationChannel);
        this.f8738g = a.n(notificationChannel);
        this.f8739h = a.f(notificationChannel);
        this.f8740i = a.v(notificationChannel);
        this.f8741j = a.k(notificationChannel);
        this.f8742k = a.w(notificationChannel);
        this.f8743l = a.o(notificationChannel);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.f8744m = c.b(notificationChannel);
            this.f8745n = c.a(notificationChannel);
        }
        this.f8746o = a.a(notificationChannel);
        this.f8747p = a.l(notificationChannel);
        if (i8 >= 29) {
            this.f8748q = b.a(notificationChannel);
        }
        if (i8 >= 30) {
            this.f8749r = c.c(notificationChannel);
        }
    }
}
