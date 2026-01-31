package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    final String f8751a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f8752b;

    /* renamed from: c, reason: collision with root package name */
    String f8753c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8754d;

    /* renamed from: e, reason: collision with root package name */
    private List f8755e;

    static class a {
        static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    static class b {
        static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final p f8756a;

        public c(String str) {
            this.f8756a = new p(str);
        }

        public p build() {
            return this.f8756a;
        }

        public c setDescription(String str) {
            this.f8756a.f8753c = str;
            return this;
        }

        public c setName(CharSequence charSequence) {
            this.f8756a.f8752b = charSequence;
            return this;
        }
    }

    p(String str) {
        this.f8755e = Collections.emptyList();
        this.f8751a = (String) Z.h.checkNotNull(str);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannelA = o.a(it.next());
            if (this.f8751a.equals(a.c(notificationChannelA))) {
                arrayList.add(new n(notificationChannelA));
            }
        }
        return arrayList;
    }

    NotificationChannelGroup b() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroupA = a.a(this.f8751a, this.f8752b);
        if (i8 >= 28) {
            b.c(notificationChannelGroupA, this.f8753c);
        }
        return notificationChannelGroupA;
    }

    public List<n> getChannels() {
        return this.f8755e;
    }

    public String getDescription() {
        return this.f8753c;
    }

    public String getId() {
        return this.f8751a;
    }

    public CharSequence getName() {
        return this.f8752b;
    }

    public boolean isBlocked() {
        return this.f8754d;
    }

    public c toBuilder() {
        return new c(this.f8751a).setName(this.f8752b).setDescription(this.f8753c);
    }

    p(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    p(NotificationChannelGroup notificationChannelGroup, List list) {
        this(a.d(notificationChannelGroup));
        this.f8752b = a.e(notificationChannelGroup);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            this.f8753c = b.a(notificationChannelGroup);
        }
        if (i8 >= 28) {
            this.f8754d = b.b(notificationChannelGroup);
            this.f8755e = a(a.b(notificationChannelGroup));
        } else {
            this.f8755e = a(list);
        }
    }
}
