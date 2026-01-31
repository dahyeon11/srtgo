package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.r;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class t implements m {

    /* renamed from: a */
    private final Context f8868a;

    /* renamed from: b */
    private final Notification.Builder f8869b;

    /* renamed from: c */
    private final r.m f8870c;

    /* renamed from: d */
    private RemoteViews f8871d;

    /* renamed from: e */
    private RemoteViews f8872e;

    /* renamed from: f */
    private final List f8873f = new ArrayList();

    /* renamed from: g */
    private final Bundle f8874g = new Bundle();

    /* renamed from: h */
    private int f8875h;

    /* renamed from: i */
    private RemoteViews f8876i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i8, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z8) {
            return builder.setGroupSummary(z8);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z8) {
            return builder.setLocalOnly(z8);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i8) {
            return builder.setColor(i8);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i8) {
            return builder.setVisibility(i8);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z8) {
            return builder.setAllowGeneratedReplies(z8);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setBadgeIconType(i8);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z8) {
            return builder.setColorized(z8);
        }

        static Notification.Builder d(Notification.Builder builder, int i8) {
            return builder.setGroupAlertBehavior(i8);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j8) {
            return builder.setTimeoutAfter(j8);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i8) {
            return builder.setSemanticAction(i8);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z8) {
            return builder.setAllowSystemGeneratedContextualActions(z8);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z8) {
            return builder.setContextual(z8);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z8) {
            return builder.setAuthenticationRequired(z8);
        }

        static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setForegroundServiceBehavior(i8);
        }
    }

    t(r.m mVar) {
        int i8;
        this.f8870c = mVar;
        Context context = mVar.mContext;
        this.f8868a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8869b = e.a(context, mVar.f8804I);
        } else {
            this.f8869b = new Notification.Builder(mVar.mContext);
        }
        Notification notification = mVar.f8813R;
        this.f8869b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, mVar.f8821f).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mVar.f8817b).setContentText(mVar.f8818c).setContentInfo(mVar.f8823h).setContentIntent(mVar.f8819d).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(mVar.f8820e, (notification.flags & 128) != 0).setNumber(mVar.f8824i).setProgress(mVar.f8833r, mVar.f8834s, mVar.f8835t);
        Notification.Builder builder = this.f8869b;
        IconCompat iconCompat = mVar.f8822g;
        c.b(builder, iconCompat == null ? null : iconCompat.toIcon(context));
        this.f8869b.setSubText(mVar.f8830o).setUsesChronometer(mVar.f8827l).setPriority(mVar.f8825j);
        r.s sVar = mVar.f8829n;
        if (sVar instanceof r.n) {
            Iterator<r.b> it = ((r.n) sVar).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        } else {
            Iterator<r.b> it2 = mVar.mActions.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
        }
        Bundle bundle = mVar.f8797B;
        if (bundle != null) {
            this.f8874g.putAll(bundle);
        }
        int i9 = Build.VERSION.SDK_INT;
        this.f8871d = mVar.f8801F;
        this.f8872e = mVar.f8802G;
        this.f8869b.setShowWhen(mVar.f8826k);
        a.i(this.f8869b, mVar.f8839x);
        a.g(this.f8869b, mVar.f8836u);
        a.j(this.f8869b, mVar.f8838w);
        a.h(this.f8869b, mVar.f8837v);
        this.f8875h = mVar.f8809N;
        b.b(this.f8869b, mVar.f8796A);
        b.c(this.f8869b, mVar.f8798C);
        b.f(this.f8869b, mVar.f8799D);
        b.d(this.f8869b, mVar.f8800E);
        b.e(this.f8869b, notification.sound, notification.audioAttributes);
        List listC = i9 < 28 ? c(e(mVar.mPersonList), mVar.mPeople) : mVar.mPeople;
        if (listC != null && !listC.isEmpty()) {
            Iterator it3 = listC.iterator();
            while (it3.hasNext()) {
                b.a(this.f8869b, (String) it3.next());
            }
        }
        this.f8876i = mVar.f8803H;
        if (mVar.f8816a.size() > 0) {
            Bundle bundle2 = mVar.getExtras().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i10 = 0; i10 < mVar.f8816a.size(); i10++) {
                bundle4.putBundle(Integer.toString(i10), u.g((r.b) mVar.f8816a.get(i10)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            mVar.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.f8874g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = mVar.f8815T;
        if (obj != null) {
            c.c(this.f8869b, obj);
        }
        this.f8869b.setExtras(mVar.f8797B);
        d.e(this.f8869b, mVar.f8832q);
        RemoteViews remoteViews = mVar.f8801F;
        if (remoteViews != null) {
            d.c(this.f8869b, remoteViews);
        }
        RemoteViews remoteViews2 = mVar.f8802G;
        if (remoteViews2 != null) {
            d.b(this.f8869b, remoteViews2);
        }
        RemoteViews remoteViews3 = mVar.f8803H;
        if (remoteViews3 != null) {
            d.d(this.f8869b, remoteViews3);
        }
        if (i11 >= 26) {
            e.b(this.f8869b, mVar.f8805J);
            e.e(this.f8869b, mVar.f8831p);
            e.f(this.f8869b, mVar.f8806K);
            e.g(this.f8869b, mVar.f8808M);
            e.d(this.f8869b, mVar.f8809N);
            if (mVar.f8841z) {
                e.c(this.f8869b, mVar.f8840y);
            }
            if (!TextUtils.isEmpty(mVar.f8804I)) {
                this.f8869b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator<B> it4 = mVar.mPersonList.iterator();
            while (it4.hasNext()) {
                f.a(this.f8869b, it4.next().toAndroidPerson());
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            g.a(this.f8869b, mVar.f8811P);
            g.b(this.f8869b, r.l.toPlatform(mVar.f8812Q));
            androidx.core.content.b bVar = mVar.f8807L;
            if (bVar != null) {
                g.d(this.f8869b, bVar.toLocusId());
            }
        }
        if (i12 >= 31 && (i8 = mVar.f8810O) != 0) {
            h.b(this.f8869b, i8);
        }
        if (mVar.f8814S) {
            if (this.f8870c.f8837v) {
                this.f8875h = 2;
            } else {
                this.f8875h = 1;
            }
            this.f8869b.setVibrate(null);
            this.f8869b.setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            this.f8869b.setDefaults(i13);
            if (i12 >= 26) {
                if (TextUtils.isEmpty(this.f8870c.f8836u)) {
                    a.g(this.f8869b, r.GROUP_KEY_SILENT);
                }
                e.d(this.f8869b, this.f8875h);
            }
        }
    }

    private void a(r.b bVar) {
        IconCompat iconCompat = bVar.getIconCompat();
        Notification.Action.Builder builderA = c.a(iconCompat != null ? iconCompat.toIcon() : null, bVar.getTitle(), bVar.getActionIntent());
        if (bVar.getRemoteInputs() != null) {
            for (RemoteInput remoteInput : D.b(bVar.getRemoteInputs())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = bVar.getExtras() != null ? new Bundle(bVar.getExtras()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.getAllowGeneratedReplies());
        int i8 = Build.VERSION.SDK_INT;
        d.a(builderA, bVar.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", bVar.getSemanticAction());
        if (i8 >= 28) {
            f.b(builderA, bVar.getSemanticAction());
        }
        if (i8 >= 29) {
            g.c(builderA, bVar.isContextual());
        }
        if (i8 >= 31) {
            h.a(builderA, bVar.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.getShowsUserInterface());
        a.b(builderA, bundle);
        a.a(this.f8869b, a.d(builderA));
    }

    private static List c(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        O.b bVar = new O.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List e(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((B) it.next()).resolveToLegacyUri());
        }
        return arrayList;
    }

    private void f(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    protected Notification b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f8869b.build();
        }
        Notification notificationBuild = this.f8869b.build();
        if (this.f8875h != 0) {
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f8875h == 2) {
                f(notificationBuild);
            }
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f8875h == 1) {
                f(notificationBuild);
            }
        }
        return notificationBuild;
    }

    public Notification build() {
        Bundle extras;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        r.s sVar = this.f8870c.f8829n;
        if (sVar != null) {
            sVar.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = sVar != null ? sVar.makeContentView(this) : null;
        Notification notificationB = b();
        if (remoteViewsMakeContentView != null) {
            notificationB.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = this.f8870c.f8801F;
            if (remoteViews != null) {
                notificationB.contentView = remoteViews;
            }
        }
        if (sVar != null && (remoteViewsMakeBigContentView = sVar.makeBigContentView(this)) != null) {
            notificationB.bigContentView = remoteViewsMakeBigContentView;
        }
        if (sVar != null && (remoteViewsMakeHeadsUpContentView = this.f8870c.f8829n.makeHeadsUpContentView(this)) != null) {
            notificationB.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (sVar != null && (extras = r.getExtras(notificationB)) != null) {
            sVar.addCompatExtras(extras);
        }
        return notificationB;
    }

    Context d() {
        return this.f8868a;
    }

    @Override // androidx.core.app.m
    public Notification.Builder getBuilder() {
        return this.f8869b;
    }
}
