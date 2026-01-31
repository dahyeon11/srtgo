package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.B;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class r {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static class b {
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;

        /* renamed from: a, reason: collision with root package name */
        final Bundle f8757a;
        public PendingIntent actionIntent;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f8758b;

        /* renamed from: c, reason: collision with root package name */
        private final D[] f8759c;

        /* renamed from: d, reason: collision with root package name */
        private final D[] f8760d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8761e;

        /* renamed from: f, reason: collision with root package name */
        boolean f8762f;

        /* renamed from: g, reason: collision with root package name */
        private final int f8763g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f8764h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f8765i;

        @Deprecated
        public int icon;
        public CharSequence title;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f8766a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f8767b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f8768c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f8769d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f8770e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList f8771f;

            /* renamed from: g, reason: collision with root package name */
            private int f8772g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f8773h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f8774i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f8775j;

            /* renamed from: androidx.core.app.r$b$a$a, reason: collision with other inner class name */
            static class C0129a {
                static Bundle a(Notification.Action action) {
                    return action.getExtras();
                }

                static RemoteInput[] b(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* renamed from: androidx.core.app.r$b$a$b, reason: collision with other inner class name */
            static class C0130b {
                static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            static class c {
                static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            static class d {
                static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            static class e {
                static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            static class f {
                static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void a() {
                if (this.f8774i && this.f8768c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public static a fromAndroidAction(Notification.Action action) {
                a aVar = C0130b.a(action) != null ? new a(IconCompat.createFromIconOrNullIfZeroResId(C0130b.a(action)), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputArrB = C0129a.b(action);
                if (remoteInputArrB != null && remoteInputArrB.length != 0) {
                    for (RemoteInput remoteInput : remoteInputArrB) {
                        aVar.addRemoteInput(D.c(remoteInput));
                    }
                }
                int i8 = Build.VERSION.SDK_INT;
                aVar.f8769d = c.a(action);
                if (i8 >= 28) {
                    aVar.setSemanticAction(d.a(action));
                }
                if (i8 >= 29) {
                    aVar.setContextual(e.a(action));
                }
                if (i8 >= 31) {
                    aVar.setAuthenticationRequired(f.a(action));
                }
                aVar.addExtras(C0129a.a(action));
                return aVar;
            }

            public a addExtras(Bundle bundle) {
                if (bundle != null) {
                    this.f8770e.putAll(bundle);
                }
                return this;
            }

            public a addRemoteInput(D d9) {
                if (this.f8771f == null) {
                    this.f8771f = new ArrayList();
                }
                if (d9 != null) {
                    this.f8771f.add(d9);
                }
                return this;
            }

            public b build() {
                a();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f8771f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        D d9 = (D) it.next();
                        if (d9.isDataOnly()) {
                            arrayList.add(d9);
                        } else {
                            arrayList2.add(d9);
                        }
                    }
                }
                return new b(this.f8766a, this.f8767b, this.f8768c, this.f8770e, arrayList2.isEmpty() ? null : (D[]) arrayList2.toArray(new D[arrayList2.size()]), arrayList.isEmpty() ? null : (D[]) arrayList.toArray(new D[arrayList.size()]), this.f8769d, this.f8772g, this.f8773h, this.f8774i, this.f8775j);
            }

            public a extend(InterfaceC0131b interfaceC0131b) {
                interfaceC0131b.a(this);
                return this;
            }

            public Bundle getExtras() {
                return this.f8770e;
            }

            public a setAllowGeneratedReplies(boolean z8) {
                this.f8769d = z8;
                return this;
            }

            public a setAuthenticationRequired(boolean z8) {
                this.f8775j = z8;
                return this;
            }

            public a setContextual(boolean z8) {
                this.f8774i = z8;
                return this;
            }

            public a setSemanticAction(int i8) {
                this.f8772g = i8;
                return this;
            }

            public a setShowsUserInterface(boolean z8) {
                this.f8773h = z8;
                return this;
            }

            public a(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i8 != 0 ? IconCompat.createWithResource(null, "", i8) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(b bVar) {
                this(bVar.getIconCompat(), bVar.title, bVar.actionIntent, new Bundle(bVar.f8757a), bVar.getRemoteInputs(), bVar.getAllowGeneratedReplies(), bVar.getSemanticAction(), bVar.f8762f, bVar.isContextual(), bVar.isAuthenticationRequired());
            }

            private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, D[] dArr, boolean z8, int i8, boolean z9, boolean z10, boolean z11) {
                this.f8769d = true;
                this.f8773h = true;
                this.f8766a = iconCompat;
                this.f8767b = m.b(charSequence);
                this.f8768c = pendingIntent;
                this.f8770e = bundle;
                this.f8771f = dArr == null ? null : new ArrayList(Arrays.asList(dArr));
                this.f8769d = z8;
                this.f8772g = i8;
                this.f8773h = z9;
                this.f8774i = z10;
                this.f8775j = z11;
            }
        }

        /* renamed from: androidx.core.app.r$b$b, reason: collision with other inner class name */
        public interface InterfaceC0131b {
            a a(a aVar);
        }

        public b(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i8 != 0 ? IconCompat.createWithResource(null, "", i8) : null, charSequence, pendingIntent);
        }

        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.f8761e;
        }

        public D[] getDataOnlyRemoteInputs() {
            return this.f8760d;
        }

        public Bundle getExtras() {
            return this.f8757a;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        public IconCompat getIconCompat() {
            int i8;
            if (this.f8758b == null && (i8 = this.icon) != 0) {
                this.f8758b = IconCompat.createWithResource(null, "", i8);
            }
            return this.f8758b;
        }

        public D[] getRemoteInputs() {
            return this.f8759c;
        }

        public int getSemanticAction() {
            return this.f8763g;
        }

        public boolean getShowsUserInterface() {
            return this.f8762f;
        }

        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.f8765i;
        }

        public boolean isContextual() {
            return this.f8764h;
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (D[]) null, (D[]) null, true, 0, true, false, false);
        }

        b(int i8, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, D[] dArr, D[] dArr2, boolean z8, int i9, boolean z9, boolean z10, boolean z11) {
            this(i8 != 0 ? IconCompat.createWithResource(null, "", i8) : null, charSequence, pendingIntent, bundle, dArr, dArr2, z8, i9, z9, z10, z11);
        }

        b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, D[] dArr, D[] dArr2, boolean z8, int i8, boolean z9, boolean z10, boolean z11) {
            this.f8762f = true;
            this.f8758b = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = m.b(charSequence);
            this.actionIntent = pendingIntent;
            this.f8757a = bundle == null ? new Bundle() : bundle;
            this.f8759c = dArr;
            this.f8760d = dArr2;
            this.f8761e = z8;
            this.f8763g = i8;
            this.f8762f = z9;
            this.f8764h = z10;
            this.f8765i = z11;
        }
    }

    static class c {
        static boolean a(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        static CharSequence[] b(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        static Bundle d(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static CharSequence f(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        static RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        static String h(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    static class d {
        static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    static class e {
        static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    static class f {
        static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        static String b(Notification notification) {
            return notification.getChannelId();
        }

        static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        static String e(Notification notification) {
            return notification.getShortcutId();
        }

        static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    static class g {
        static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    static class h {
        static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    static class i {
        static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    public static class j extends s {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f8776e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f8777f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8778g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f8779h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f8780i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z8) {
                bigPictureStyle.showBigPictureWhenCollapsed(z8);
            }
        }

        public j() {
        }

        public static IconCompat getPictureIcon(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(r.EXTRA_PICTURE);
            return parcelable != null ? o(parcelable) : o(bundle.getParcelable(r.EXTRA_PICTURE_ICON));
        }

        private static IconCompat o(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.createFromIcon((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        @Override // androidx.core.app.r.s
        public void apply(androidx.core.app.m mVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(mVar.getBuilder()).setBigContentTitle(this.f8865b);
            IconCompat iconCompat = this.f8776e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f8776e.toIcon(mVar instanceof t ? ((t) mVar).d() : null));
                } else if (iconCompat.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f8776e.getBitmap());
                }
            }
            if (this.f8778g) {
                if (this.f8777f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f8777f.toIcon(mVar instanceof t ? ((t) mVar).d() : null));
                }
            }
            if (this.f8867d) {
                bigContentTitle.setSummaryText(this.f8866c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f8780i);
                b.b(bigContentTitle, this.f8779h);
            }
        }

        @Override // androidx.core.app.r.s
        protected void b(Bundle bundle) {
            super.b(bundle);
            bundle.remove(r.EXTRA_LARGE_ICON_BIG);
            bundle.remove(r.EXTRA_PICTURE);
            bundle.remove(r.EXTRA_PICTURE_ICON);
            bundle.remove(r.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public j bigLargeIcon(Bitmap bitmap) {
            this.f8777f = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            this.f8778g = true;
            return this;
        }

        public j bigPicture(Bitmap bitmap) {
            this.f8776e = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        @Override // androidx.core.app.r.s
        protected String l() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.r.s
        protected void n(Bundle bundle) {
            super.n(bundle);
            if (bundle.containsKey(r.EXTRA_LARGE_ICON_BIG)) {
                this.f8777f = o(bundle.getParcelable(r.EXTRA_LARGE_ICON_BIG));
                this.f8778g = true;
            }
            this.f8776e = getPictureIcon(bundle);
            this.f8780i = bundle.getBoolean(r.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public j setBigContentTitle(CharSequence charSequence) {
            this.f8865b = m.b(charSequence);
            return this;
        }

        public j setContentDescription(CharSequence charSequence) {
            this.f8779h = charSequence;
            return this;
        }

        public j setSummaryText(CharSequence charSequence) {
            this.f8866c = m.b(charSequence);
            this.f8867d = true;
            return this;
        }

        public j showBigPictureWhenCollapsed(boolean z8) {
            this.f8780i = z8;
            return this;
        }

        public j(m mVar) {
            setBuilder(mVar);
        }

        public j bigPicture(Icon icon) {
            this.f8776e = IconCompat.createFromIcon(icon);
            return this;
        }

        public j bigLargeIcon(Icon icon) {
            this.f8777f = icon == null ? null : IconCompat.createFromIcon(icon);
            this.f8778g = true;
            return this;
        }
    }

    public static class k extends s {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f8781e;

        public k() {
        }

        @Override // androidx.core.app.r.s
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.r.s
        public void apply(androidx.core.app.m mVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(mVar.getBuilder()).setBigContentTitle(this.f8865b).bigText(this.f8781e);
            if (this.f8867d) {
                bigTextStyleBigText.setSummaryText(this.f8866c);
            }
        }

        @Override // androidx.core.app.r.s
        protected void b(Bundle bundle) {
            super.b(bundle);
            bundle.remove(r.EXTRA_BIG_TEXT);
        }

        public k bigText(CharSequence charSequence) {
            this.f8781e = m.b(charSequence);
            return this;
        }

        @Override // androidx.core.app.r.s
        protected String l() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.r.s
        protected void n(Bundle bundle) {
            super.n(bundle);
            this.f8781e = bundle.getCharSequence(r.EXTRA_BIG_TEXT);
        }

        public k setBigContentTitle(CharSequence charSequence) {
            this.f8865b = m.b(charSequence);
            return this;
        }

        public k setSummaryText(CharSequence charSequence) {
            this.f8866c = m.b(charSequence);
            this.f8867d = true;
            return this;
        }

        public k(m mVar) {
            setBuilder(mVar);
        }
    }

    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        private PendingIntent f8782a;

        /* renamed from: b, reason: collision with root package name */
        private PendingIntent f8783b;

        /* renamed from: c, reason: collision with root package name */
        private IconCompat f8784c;

        /* renamed from: d, reason: collision with root package name */
        private int f8785d;

        /* renamed from: e, reason: collision with root package name */
        private int f8786e;

        /* renamed from: f, reason: collision with root package name */
        private int f8787f;

        /* renamed from: g, reason: collision with root package name */
        private String f8788g;

        private static class a {
            static l a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c suppressNotification = new c(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            static Notification.BubbleMetadata b(l lVar) {
                if (lVar == null || lVar.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(lVar.getIcon().toIcon()).setIntent(lVar.getIntent()).setDeleteIntent(lVar.getDeleteIntent()).setAutoExpandBubble(lVar.getAutoExpandBubble()).setSuppressNotification(lVar.isNotificationSuppressed());
                if (lVar.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(lVar.getDesiredHeight());
                }
                if (lVar.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(lVar.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        private static class b {
            static l a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                cVar.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.build();
            }

            static Notification.BubbleMetadata b(l lVar) {
                if (lVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = lVar.getShortcutId() != null ? new Notification.BubbleMetadata.Builder(lVar.getShortcutId()) : new Notification.BubbleMetadata.Builder(lVar.getIntent(), lVar.getIcon().toIcon());
                builder.setDeleteIntent(lVar.getDeleteIntent()).setAutoExpandBubble(lVar.getAutoExpandBubble()).setSuppressNotification(lVar.isNotificationSuppressed());
                if (lVar.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(lVar.getDesiredHeight());
                }
                if (lVar.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(lVar.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            private PendingIntent f8789a;

            /* renamed from: b, reason: collision with root package name */
            private IconCompat f8790b;

            /* renamed from: c, reason: collision with root package name */
            private int f8791c;

            /* renamed from: d, reason: collision with root package name */
            private int f8792d;

            /* renamed from: e, reason: collision with root package name */
            private int f8793e;

            /* renamed from: f, reason: collision with root package name */
            private PendingIntent f8794f;

            /* renamed from: g, reason: collision with root package name */
            private String f8795g;

            @Deprecated
            public c() {
            }

            private c a(int i8, boolean z8) {
                if (z8) {
                    this.f8793e = i8 | this.f8793e;
                } else {
                    this.f8793e = (~i8) & this.f8793e;
                }
                return this;
            }

            public l build() {
                String str = this.f8795g;
                if (str == null && this.f8789a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f8790b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                l lVar = new l(this.f8789a, this.f8794f, this.f8790b, this.f8791c, this.f8792d, this.f8793e, str);
                lVar.setFlags(this.f8793e);
                return lVar;
            }

            public c setAutoExpandBubble(boolean z8) {
                a(1, z8);
                return this;
            }

            public c setDeleteIntent(PendingIntent pendingIntent) {
                this.f8794f = pendingIntent;
                return this;
            }

            public c setDesiredHeight(int i8) {
                this.f8791c = Math.max(i8, 0);
                this.f8792d = 0;
                return this;
            }

            public c setDesiredHeightResId(int i8) {
                this.f8792d = i8;
                this.f8791c = 0;
                return this;
            }

            public c setIcon(IconCompat iconCompat) {
                if (this.f8795g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f8790b = iconCompat;
                return this;
            }

            public c setIntent(PendingIntent pendingIntent) {
                if (this.f8795g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f8789a = pendingIntent;
                return this;
            }

            public c setSuppressNotification(boolean z8) {
                a(2, z8);
                return this;
            }

            public c(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f8795g = str;
            }

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f8789a = pendingIntent;
                    this.f8790b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        public static l fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i8 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        public static Notification.BubbleMetadata toPlatform(l lVar) {
            if (lVar == null) {
                return null;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                return b.b(lVar);
            }
            if (i8 == 29) {
                return a.b(lVar);
            }
            return null;
        }

        public boolean getAutoExpandBubble() {
            return (this.f8787f & 1) != 0;
        }

        public PendingIntent getDeleteIntent() {
            return this.f8783b;
        }

        public int getDesiredHeight() {
            return this.f8785d;
        }

        public int getDesiredHeightResId() {
            return this.f8786e;
        }

        public IconCompat getIcon() {
            return this.f8784c;
        }

        public PendingIntent getIntent() {
            return this.f8782a;
        }

        public String getShortcutId() {
            return this.f8788g;
        }

        public boolean isNotificationSuppressed() {
            return (this.f8787f & 2) != 0;
        }

        public void setFlags(int i8) {
            this.f8787f = i8;
        }

        private l(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i8, int i9, int i10, String str) {
            this.f8782a = pendingIntent;
            this.f8784c = iconCompat;
            this.f8785d = i8;
            this.f8786e = i9;
            this.f8783b = pendingIntent2;
            this.f8787f = i10;
            this.f8788g = str;
        }
    }

    public static class m {

        /* renamed from: A, reason: collision with root package name */
        String f8796A;

        /* renamed from: B, reason: collision with root package name */
        Bundle f8797B;

        /* renamed from: C, reason: collision with root package name */
        int f8798C;

        /* renamed from: D, reason: collision with root package name */
        int f8799D;

        /* renamed from: E, reason: collision with root package name */
        Notification f8800E;

        /* renamed from: F, reason: collision with root package name */
        RemoteViews f8801F;

        /* renamed from: G, reason: collision with root package name */
        RemoteViews f8802G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f8803H;

        /* renamed from: I, reason: collision with root package name */
        String f8804I;

        /* renamed from: J, reason: collision with root package name */
        int f8805J;

        /* renamed from: K, reason: collision with root package name */
        String f8806K;

        /* renamed from: L, reason: collision with root package name */
        androidx.core.content.b f8807L;

        /* renamed from: M, reason: collision with root package name */
        long f8808M;

        /* renamed from: N, reason: collision with root package name */
        int f8809N;

        /* renamed from: O, reason: collision with root package name */
        int f8810O;

        /* renamed from: P, reason: collision with root package name */
        boolean f8811P;

        /* renamed from: Q, reason: collision with root package name */
        l f8812Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f8813R;

        /* renamed from: S, reason: collision with root package name */
        boolean f8814S;

        /* renamed from: T, reason: collision with root package name */
        Object f8815T;

        /* renamed from: a, reason: collision with root package name */
        ArrayList f8816a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f8817b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f8818c;

        /* renamed from: d, reason: collision with root package name */
        PendingIntent f8819d;

        /* renamed from: e, reason: collision with root package name */
        PendingIntent f8820e;

        /* renamed from: f, reason: collision with root package name */
        RemoteViews f8821f;

        /* renamed from: g, reason: collision with root package name */
        IconCompat f8822g;

        /* renamed from: h, reason: collision with root package name */
        CharSequence f8823h;

        /* renamed from: i, reason: collision with root package name */
        int f8824i;

        /* renamed from: j, reason: collision with root package name */
        int f8825j;

        /* renamed from: k, reason: collision with root package name */
        boolean f8826k;

        /* renamed from: l, reason: collision with root package name */
        boolean f8827l;

        /* renamed from: m, reason: collision with root package name */
        boolean f8828m;
        public ArrayList<b> mActions;
        public Context mContext;

        @Deprecated
        public ArrayList<String> mPeople;
        public ArrayList<B> mPersonList;

        /* renamed from: n, reason: collision with root package name */
        s f8829n;

        /* renamed from: o, reason: collision with root package name */
        CharSequence f8830o;

        /* renamed from: p, reason: collision with root package name */
        CharSequence f8831p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence[] f8832q;

        /* renamed from: r, reason: collision with root package name */
        int f8833r;

        /* renamed from: s, reason: collision with root package name */
        int f8834s;

        /* renamed from: t, reason: collision with root package name */
        boolean f8835t;

        /* renamed from: u, reason: collision with root package name */
        String f8836u;

        /* renamed from: v, reason: collision with root package name */
        boolean f8837v;

        /* renamed from: w, reason: collision with root package name */
        String f8838w;

        /* renamed from: x, reason: collision with root package name */
        boolean f8839x;

        /* renamed from: y, reason: collision with root package name */
        boolean f8840y;

        /* renamed from: z, reason: collision with root package name */
        boolean f8841z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i8) {
                return builder.setContentType(i8);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i8) {
                return builder.setLegacyStreamType(i8);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i8) {
                return builder.setUsage(i8);
            }
        }

        static class b {
            static Icon a(Notification notification) {
                return notification.getLargeIcon();
            }

            static Icon b(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        static class c {
            static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public m(Context context, Notification notification) {
            ArrayList parcelableArrayList;
            this(context, r.getChannelId(notification));
            Bundle bundle = notification.extras;
            s sVarExtractStyleFromNotification = s.extractStyleFromNotification(notification);
            setContentTitle(r.getContentTitle(notification)).setContentText(r.getContentText(notification)).setContentInfo(r.getContentInfo(notification)).setSubText(r.getSubText(notification)).setSettingsText(r.getSettingsText(notification)).setStyle(sVarExtractStyleFromNotification).setGroup(r.getGroup(notification)).setGroupSummary(r.isGroupSummary(notification)).setLocusId(r.getLocusId(notification)).setWhen(notification.when).setShowWhen(r.getShowWhen(notification)).setUsesChronometer(r.getUsesChronometer(notification)).setAutoCancel(r.getAutoCancel(notification)).setOnlyAlertOnce(r.getOnlyAlertOnce(notification)).setOngoing(r.getOngoing(notification)).setLocalOnly(r.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(r.getBadgeIconType(notification)).setCategory(r.getCategory(notification)).setBubbleMetadata(r.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, r.b(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(r.getColor(notification)).setVisibility(r.getVisibility(notification)).setPublicVersion(r.getPublicVersion(notification)).setSortKey(r.getSortKey(notification)).setTimeoutAfter(r.getTimeoutAfter(notification)).setShortcutId(r.getShortcutId(notification)).setProgress(bundle.getInt(r.EXTRA_PROGRESS_MAX), bundle.getInt(r.EXTRA_PROGRESS), bundle.getBoolean(r.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(r.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(a(notification, sVarExtractStyleFromNotification));
            this.f8815T = b.b(notification);
            Icon iconA = b.a(notification);
            if (iconA != null) {
                this.f8822g = IconCompat.createFromIcon(iconA);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    addAction(b.a.fromAndroidAction(action).build());
                }
            }
            List<b> invisibleActions = r.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                Iterator<b> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(r.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(r.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    addPerson(B.fromAndroidPerson(androidx.core.app.q.a(it2.next())));
                }
            }
            int i8 = Build.VERSION.SDK_INT;
            if (bundle.containsKey(r.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(r.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i8 < 26 || !bundle.containsKey(r.EXTRA_COLORIZED)) {
                return;
            }
            setColorized(bundle.getBoolean(r.EXTRA_COLORIZED));
        }

        private static Bundle a(Notification notification, s sVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(r.EXTRA_TITLE);
            bundle.remove(r.EXTRA_TEXT);
            bundle.remove(r.EXTRA_INFO_TEXT);
            bundle.remove(r.EXTRA_SUB_TEXT);
            bundle.remove(r.EXTRA_CHANNEL_ID);
            bundle.remove(r.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(r.EXTRA_SHOW_WHEN);
            bundle.remove(r.EXTRA_PROGRESS);
            bundle.remove(r.EXTRA_PROGRESS_MAX);
            bundle.remove(r.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(r.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(r.EXTRA_COLORIZED);
            bundle.remove(r.EXTRA_PEOPLE_LIST);
            bundle.remove(r.EXTRA_PEOPLE);
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (sVar != null) {
                sVar.b(bundle);
            }
            return bundle;
        }

        protected static CharSequence b(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void c(int i8, boolean z8) {
            if (z8) {
                Notification notification = this.f8813R;
                notification.flags = i8 | notification.flags;
            } else {
                Notification notification2 = this.f8813R;
                notification2.flags = (~i8) & notification2.flags;
            }
        }

        private boolean d() {
            s sVar = this.f8829n;
            return sVar == null || !sVar.displayCustomViewInline();
        }

        public m addAction(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mActions.add(new b(i8, charSequence, pendingIntent));
            return this;
        }

        public m addExtras(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f8797B;
                if (bundle2 == null) {
                    this.f8797B = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public m addInvisibleAction(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f8816a.add(new b(i8, charSequence, pendingIntent));
            return this;
        }

        @Deprecated
        public m addPerson(String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        public Notification build() {
            return new t(this).build();
        }

        public m clearActions() {
            this.mActions.clear();
            return this;
        }

        public m clearInvisibleActions() {
            this.f8816a.clear();
            Bundle bundle = this.f8797B.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.f8797B.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        public m clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        public RemoteViews createBigContentView() {
            RemoteViews remoteViewsMakeBigContentView;
            if (this.f8802G != null && d()) {
                return this.f8802G;
            }
            t tVar = new t(this);
            s sVar = this.f8829n;
            return (sVar == null || (remoteViewsMakeBigContentView = sVar.makeBigContentView(tVar)) == null) ? c.a(c.d(this.mContext, tVar.build())) : remoteViewsMakeBigContentView;
        }

        public RemoteViews createContentView() {
            RemoteViews remoteViewsMakeContentView;
            if (this.f8801F != null && d()) {
                return this.f8801F;
            }
            t tVar = new t(this);
            s sVar = this.f8829n;
            return (sVar == null || (remoteViewsMakeContentView = sVar.makeContentView(tVar)) == null) ? c.b(c.d(this.mContext, tVar.build())) : remoteViewsMakeContentView;
        }

        public RemoteViews createHeadsUpContentView() {
            RemoteViews remoteViewsMakeHeadsUpContentView;
            if (this.f8803H != null && d()) {
                return this.f8803H;
            }
            t tVar = new t(this);
            s sVar = this.f8829n;
            return (sVar == null || (remoteViewsMakeHeadsUpContentView = sVar.makeHeadsUpContentView(tVar)) == null) ? c.c(c.d(this.mContext, tVar.build())) : remoteViewsMakeHeadsUpContentView;
        }

        public m extend(p pVar) {
            pVar.a(this);
            return this;
        }

        public RemoteViews getBigContentView() {
            return this.f8802G;
        }

        public l getBubbleMetadata() {
            return this.f8812Q;
        }

        public int getColor() {
            return this.f8798C;
        }

        public RemoteViews getContentView() {
            return this.f8801F;
        }

        public Bundle getExtras() {
            if (this.f8797B == null) {
                this.f8797B = new Bundle();
            }
            return this.f8797B;
        }

        public int getForegroundServiceBehavior() {
            return this.f8810O;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.f8803H;
        }

        @Deprecated
        public Notification getNotification() {
            return build();
        }

        public int getPriority() {
            return this.f8825j;
        }

        public long getWhenIfShowing() {
            if (this.f8826k) {
                return this.f8813R.when;
            }
            return 0L;
        }

        public m setAllowSystemGeneratedContextualActions(boolean z8) {
            this.f8811P = z8;
            return this;
        }

        public m setAutoCancel(boolean z8) {
            c(16, z8);
            return this;
        }

        public m setBadgeIconType(int i8) {
            this.f8805J = i8;
            return this;
        }

        public m setBubbleMetadata(l lVar) {
            this.f8812Q = lVar;
            return this;
        }

        public m setCategory(String str) {
            this.f8796A = str;
            return this;
        }

        public m setChannelId(String str) {
            this.f8804I = str;
            return this;
        }

        public m setChronometerCountDown(boolean z8) {
            this.f8828m = z8;
            getExtras().putBoolean(r.EXTRA_CHRONOMETER_COUNT_DOWN, z8);
            return this;
        }

        public m setColor(int i8) {
            this.f8798C = i8;
            return this;
        }

        public m setColorized(boolean z8) {
            this.f8840y = z8;
            this.f8841z = true;
            return this;
        }

        public m setContent(RemoteViews remoteViews) {
            this.f8813R.contentView = remoteViews;
            return this;
        }

        public m setContentInfo(CharSequence charSequence) {
            this.f8823h = b(charSequence);
            return this;
        }

        public m setContentIntent(PendingIntent pendingIntent) {
            this.f8819d = pendingIntent;
            return this;
        }

        public m setContentText(CharSequence charSequence) {
            this.f8818c = b(charSequence);
            return this;
        }

        public m setContentTitle(CharSequence charSequence) {
            this.f8817b = b(charSequence);
            return this;
        }

        public m setCustomBigContentView(RemoteViews remoteViews) {
            this.f8802G = remoteViews;
            return this;
        }

        public m setCustomContentView(RemoteViews remoteViews) {
            this.f8801F = remoteViews;
            return this;
        }

        public m setCustomHeadsUpContentView(RemoteViews remoteViews) {
            this.f8803H = remoteViews;
            return this;
        }

        public m setDefaults(int i8) {
            Notification notification = this.f8813R;
            notification.defaults = i8;
            if ((i8 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public m setDeleteIntent(PendingIntent pendingIntent) {
            this.f8813R.deleteIntent = pendingIntent;
            return this;
        }

        public m setExtras(Bundle bundle) {
            this.f8797B = bundle;
            return this;
        }

        public m setForegroundServiceBehavior(int i8) {
            this.f8810O = i8;
            return this;
        }

        public m setFullScreenIntent(PendingIntent pendingIntent, boolean z8) {
            this.f8820e = pendingIntent;
            c(128, z8);
            return this;
        }

        public m setGroup(String str) {
            this.f8836u = str;
            return this;
        }

        public m setGroupAlertBehavior(int i8) {
            this.f8809N = i8;
            return this;
        }

        public m setGroupSummary(boolean z8) {
            this.f8837v = z8;
            return this;
        }

        public m setLargeIcon(Bitmap bitmap) {
            this.f8822g = bitmap == null ? null : IconCompat.createWithBitmap(r.reduceLargeIconSize(this.mContext, bitmap));
            return this;
        }

        public m setLights(int i8, int i9, int i10) {
            Notification notification = this.f8813R;
            notification.ledARGB = i8;
            notification.ledOnMS = i9;
            notification.ledOffMS = i10;
            notification.flags = ((i9 == 0 || i10 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public m setLocalOnly(boolean z8) {
            this.f8839x = z8;
            return this;
        }

        public m setLocusId(androidx.core.content.b bVar) {
            this.f8807L = bVar;
            return this;
        }

        @Deprecated
        public m setNotificationSilent() {
            this.f8814S = true;
            return this;
        }

        public m setNumber(int i8) {
            this.f8824i = i8;
            return this;
        }

        public m setOngoing(boolean z8) {
            c(2, z8);
            return this;
        }

        public m setOnlyAlertOnce(boolean z8) {
            c(8, z8);
            return this;
        }

        public m setPriority(int i8) {
            this.f8825j = i8;
            return this;
        }

        public m setProgress(int i8, int i9, boolean z8) {
            this.f8833r = i8;
            this.f8834s = i9;
            this.f8835t = z8;
            return this;
        }

        public m setPublicVersion(Notification notification) {
            this.f8800E = notification;
            return this;
        }

        public m setRemoteInputHistory(CharSequence[] charSequenceArr) {
            this.f8832q = charSequenceArr;
            return this;
        }

        public m setSettingsText(CharSequence charSequence) {
            this.f8831p = b(charSequence);
            return this;
        }

        public m setShortcutId(String str) {
            this.f8806K = str;
            return this;
        }

        public m setShowWhen(boolean z8) {
            this.f8826k = z8;
            return this;
        }

        public m setSilent(boolean z8) {
            this.f8814S = z8;
            return this;
        }

        public m setSmallIcon(IconCompat iconCompat) {
            this.f8815T = iconCompat.toIcon(this.mContext);
            return this;
        }

        public m setSortKey(String str) {
            this.f8838w = str;
            return this;
        }

        public m setSound(Uri uri) {
            Notification notification = this.f8813R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
            this.f8813R.audioAttributes = a.a(builderE);
            return this;
        }

        public m setStyle(s sVar) {
            if (this.f8829n != sVar) {
                this.f8829n = sVar;
                if (sVar != null) {
                    sVar.setBuilder(this);
                }
            }
            return this;
        }

        public m setSubText(CharSequence charSequence) {
            this.f8830o = b(charSequence);
            return this;
        }

        public m setTicker(CharSequence charSequence) {
            this.f8813R.tickerText = b(charSequence);
            return this;
        }

        public m setTimeoutAfter(long j8) {
            this.f8808M = j8;
            return this;
        }

        public m setUsesChronometer(boolean z8) {
            this.f8827l = z8;
            return this;
        }

        public m setVibrate(long[] jArr) {
            this.f8813R.vibrate = jArr;
            return this;
        }

        public m setVisibility(int i8) {
            this.f8799D = i8;
            return this;
        }

        public m setWhen(long j8) {
            this.f8813R.when = j8;
            return this;
        }

        public m addAction(b bVar) {
            if (bVar != null) {
                this.mActions.add(bVar);
            }
            return this;
        }

        public m addInvisibleAction(b bVar) {
            if (bVar != null) {
                this.f8816a.add(bVar);
            }
            return this;
        }

        public m setSmallIcon(int i8) {
            this.f8813R.icon = i8;
            return this;
        }

        @Deprecated
        public m setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            this.f8813R.tickerText = b(charSequence);
            this.f8821f = remoteViews;
            return this;
        }

        public m addPerson(B b9) {
            if (b9 != null) {
                this.mPersonList.add(b9);
            }
            return this;
        }

        public m setSmallIcon(int i8, int i9) {
            Notification notification = this.f8813R;
            notification.icon = i8;
            notification.iconLevel = i9;
            return this;
        }

        public m setLargeIcon(Icon icon) {
            this.f8822g = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public m setSound(Uri uri, int i8) {
            Notification notification = this.f8813R;
            notification.sound = uri;
            notification.audioStreamType = i8;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), i8);
            this.f8813R.audioAttributes = a.a(builderD);
            return this;
        }

        public m setShortcutInfo(V.a aVar) {
            return this;
        }

        public m(Context context, String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.f8816a = new ArrayList();
            this.f8826k = true;
            this.f8839x = false;
            this.f8798C = 0;
            this.f8799D = 0;
            this.f8805J = 0;
            this.f8809N = 0;
            this.f8810O = 0;
            Notification notification = new Notification();
            this.f8813R = notification;
            this.mContext = context;
            this.f8804I = str;
            notification.when = System.currentTimeMillis();
            this.f8813R.audioStreamType = -1;
            this.f8825j = 0;
            this.mPeople = new ArrayList<>();
            this.f8811P = true;
        }

        @Deprecated
        public m(Context context) {
            this(context, (String) null);
        }
    }

    public static class n extends s {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f8842e;

        /* renamed from: f, reason: collision with root package name */
        private B f8843f;

        /* renamed from: g, reason: collision with root package name */
        private PendingIntent f8844g;

        /* renamed from: h, reason: collision with root package name */
        private PendingIntent f8845h;

        /* renamed from: i, reason: collision with root package name */
        private PendingIntent f8846i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f8847j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f8848k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f8849l;

        /* renamed from: m, reason: collision with root package name */
        private IconCompat f8850m;

        /* renamed from: n, reason: collision with root package name */
        private CharSequence f8851n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i8) {
                return callStyle.setAnswerButtonColorHint(i8);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z8) {
                return builder.setAuthenticationRequired(z8);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int i8) {
                return callStyle.setDeclineButtonColorHint(i8);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z8) {
                return callStyle.setIsVideo(z8);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public n() {
        }

        public static n forIncomingCall(B b9, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new n(1, b9, null, pendingIntent, pendingIntent2);
        }

        public static n forOngoingCall(B b9, PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new n(2, b9, pendingIntent, null, null);
        }

        public static n forScreeningCall(B b9, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new n(3, b9, pendingIntent, null, pendingIntent2);
        }

        private String o() {
            int i8 = this.f8842e;
            if (i8 == 1) {
                return this.f8864a.mContext.getResources().getString(U.g.call_notification_incoming_text);
            }
            if (i8 == 2) {
                return this.f8864a.mContext.getResources().getString(U.g.call_notification_ongoing_text);
            }
            if (i8 != 3) {
                return null;
            }
            return this.f8864a.mContext.getResources().getString(U.g.call_notification_screening_text);
        }

        private boolean p(b bVar) {
            return bVar != null && bVar.getExtras().getBoolean("key_action_priority");
        }

        private b q(int i8, int i9, Integer num, int i10, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.getColor(this.f8864a.mContext, i10));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f8864a.mContext.getResources().getString(i9));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b bVarBuild = new b.a(IconCompat.createWithResource(this.f8864a.mContext, i8), spannableStringBuilder, pendingIntent).build();
            bVarBuild.getExtras().putBoolean("key_action_priority", true);
            return bVarBuild;
        }

        private b r() {
            int i8 = U.d.ic_call_answer_video;
            int i9 = U.d.ic_call_answer;
            PendingIntent pendingIntent = this.f8844g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z8 = this.f8847j;
            return q(z8 ? i8 : i9, z8 ? U.g.call_notification_answer_video_action : U.g.call_notification_answer_action, this.f8848k, U.b.call_notification_answer_color, pendingIntent);
        }

        private b s() {
            int i8 = U.d.ic_call_decline;
            PendingIntent pendingIntent = this.f8845h;
            return pendingIntent == null ? q(i8, U.g.call_notification_hang_up_action, this.f8849l, U.b.call_notification_decline_color, this.f8846i) : q(i8, U.g.call_notification_decline_action, this.f8849l, U.b.call_notification_decline_color, pendingIntent);
        }

        @Override // androidx.core.app.r.s
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(r.EXTRA_CALL_TYPE, this.f8842e);
            bundle.putBoolean(r.EXTRA_CALL_IS_VIDEO, this.f8847j);
            B b9 = this.f8843f;
            if (b9 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(r.EXTRA_CALL_PERSON, c.b(b9.toAndroidPerson()));
                } else {
                    bundle.putParcelable(r.EXTRA_CALL_PERSON_COMPAT, b9.toBundle());
                }
            }
            IconCompat iconCompat = this.f8850m;
            if (iconCompat != null) {
                bundle.putParcelable(r.EXTRA_VERIFICATION_ICON, b.a(iconCompat.toIcon(this.f8864a.mContext)));
            }
            bundle.putCharSequence(r.EXTRA_VERIFICATION_TEXT, this.f8851n);
            bundle.putParcelable(r.EXTRA_ANSWER_INTENT, this.f8844g);
            bundle.putParcelable(r.EXTRA_DECLINE_INTENT, this.f8845h);
            bundle.putParcelable(r.EXTRA_HANG_UP_INTENT, this.f8846i);
            Integer num = this.f8848k;
            if (num != null) {
                bundle.putInt(r.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.f8849l;
            if (num2 != null) {
                bundle.putInt(r.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.r.s
        public void apply(androidx.core.app.m mVar) {
            int i8 = Build.VERSION.SDK_INT;
            CharSequence charSequenceO = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceO = null;
            if (i8 < 31) {
                Notification.Builder builder = mVar.getBuilder();
                B b9 = this.f8843f;
                builder.setContentTitle(b9 != null ? b9.getName() : null);
                Bundle bundle = this.f8864a.f8797B;
                if (bundle != null && bundle.containsKey(r.EXTRA_TEXT)) {
                    charSequenceO = this.f8864a.f8797B.getCharSequence(r.EXTRA_TEXT);
                }
                if (charSequenceO == null) {
                    charSequenceO = o();
                }
                builder.setContentText(charSequenceO);
                B b10 = this.f8843f;
                if (b10 != null) {
                    if (b10.getIcon() != null) {
                        b.c(builder, this.f8843f.getIcon().toIcon(this.f8864a.mContext));
                    }
                    if (i8 >= 28) {
                        c.a(builder, this.f8843f.toAndroidPerson());
                    } else {
                        a.a(builder, this.f8843f.getUri());
                    }
                }
                a.b(builder, r.CATEGORY_CALL);
                return;
            }
            int i9 = this.f8842e;
            if (i9 == 1) {
                callStyleA = d.a(this.f8843f.toAndroidPerson(), this.f8845h, this.f8844g);
            } else if (i9 == 2) {
                callStyleA = d.b(this.f8843f.toAndroidPerson(), this.f8846i);
            } else if (i9 == 3) {
                callStyleA = d.c(this.f8843f.toAndroidPerson(), this.f8846i, this.f8844g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized call type in CallStyle: ");
                sb.append(String.valueOf(this.f8842e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(mVar.getBuilder());
                Integer num = this.f8848k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f8849l;
                if (num2 != null) {
                    d.f(callStyleA, num2.intValue());
                }
                d.i(callStyleA, this.f8851n);
                IconCompat iconCompat = this.f8850m;
                if (iconCompat != null) {
                    d.h(callStyleA, iconCompat.toIcon(this.f8864a.mContext));
                }
                d.g(callStyleA, this.f8847j);
            }
        }

        @Override // androidx.core.app.r.s
        public boolean displayCustomViewInline() {
            return true;
        }

        public ArrayList<b> getActionsListWithSystemActions() {
            b bVarS = s();
            b bVarR = r();
            ArrayList<b> arrayList = new ArrayList<>(3);
            arrayList.add(bVarS);
            ArrayList<b> arrayList2 = this.f8864a.mActions;
            int i8 = 2;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.isContextual()) {
                        arrayList.add(bVar);
                    } else if (!p(bVar) && i8 > 1) {
                        arrayList.add(bVar);
                        i8--;
                    }
                    if (bVarR != null && i8 == 1) {
                        arrayList.add(bVarR);
                        i8--;
                    }
                }
            }
            if (bVarR != null && i8 >= 1) {
                arrayList.add(bVarR);
            }
            return arrayList;
        }

        @Override // androidx.core.app.r.s
        protected String l() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.r.s
        protected void n(Bundle bundle) {
            super.n(bundle);
            this.f8842e = bundle.getInt(r.EXTRA_CALL_TYPE);
            this.f8847j = bundle.getBoolean(r.EXTRA_CALL_IS_VIDEO);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(r.EXTRA_CALL_PERSON)) {
                this.f8843f = B.fromAndroidPerson(androidx.core.app.q.a(bundle.getParcelable(r.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(r.EXTRA_CALL_PERSON_COMPAT)) {
                this.f8843f = B.fromBundle(bundle.getBundle(r.EXTRA_CALL_PERSON_COMPAT));
            }
            if (bundle.containsKey(r.EXTRA_VERIFICATION_ICON)) {
                this.f8850m = IconCompat.createFromIcon((Icon) bundle.getParcelable(r.EXTRA_VERIFICATION_ICON));
            } else if (bundle.containsKey(r.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.f8850m = IconCompat.createFromBundle(bundle.getBundle(r.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.f8851n = bundle.getCharSequence(r.EXTRA_VERIFICATION_TEXT);
            this.f8844g = (PendingIntent) bundle.getParcelable(r.EXTRA_ANSWER_INTENT);
            this.f8845h = (PendingIntent) bundle.getParcelable(r.EXTRA_DECLINE_INTENT);
            this.f8846i = (PendingIntent) bundle.getParcelable(r.EXTRA_HANG_UP_INTENT);
            this.f8848k = bundle.containsKey(r.EXTRA_ANSWER_COLOR) ? Integer.valueOf(bundle.getInt(r.EXTRA_ANSWER_COLOR)) : null;
            this.f8849l = bundle.containsKey(r.EXTRA_DECLINE_COLOR) ? Integer.valueOf(bundle.getInt(r.EXTRA_DECLINE_COLOR)) : null;
        }

        public n setAnswerButtonColorHint(int i8) {
            this.f8848k = Integer.valueOf(i8);
            return this;
        }

        public n setDeclineButtonColorHint(int i8) {
            this.f8849l = Integer.valueOf(i8);
            return this;
        }

        public n setIsVideo(boolean z8) {
            this.f8847j = z8;
            return this;
        }

        public n setVerificationIcon(Icon icon) {
            this.f8850m = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public n setVerificationText(CharSequence charSequence) {
            this.f8851n = charSequence;
            return this;
        }

        public n(m mVar) {
            setBuilder(mVar);
        }

        public n setVerificationIcon(Bitmap bitmap) {
            this.f8850m = IconCompat.createWithBitmap(bitmap);
            return this;
        }

        private n(int i8, B b9, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (b9 != null && !TextUtils.isEmpty(b9.getName())) {
                this.f8842e = i8;
                this.f8843f = b9;
                this.f8844g = pendingIntent3;
                this.f8845h = pendingIntent2;
                this.f8846i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    public static class o extends s {

        static class a {
            static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.r.s
        public void apply(androidx.core.app.m mVar) {
            mVar.getBuilder().setStyle(a.a());
        }

        @Override // androidx.core.app.r.s
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.r.s
        protected String l() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.r.s
        public RemoteViews makeBigContentView(androidx.core.app.m mVar) {
            return null;
        }

        @Override // androidx.core.app.r.s
        public RemoteViews makeContentView(androidx.core.app.m mVar) {
            return null;
        }

        @Override // androidx.core.app.r.s
        public RemoteViews makeHeadsUpContentView(androidx.core.app.m mVar) {
            return null;
        }
    }

    public interface p {
        m a(m mVar);
    }

    public static abstract class s {

        /* renamed from: a, reason: collision with root package name */
        protected m f8864a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f8865b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f8866c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8867d = false;

        static class a {
            static void a(RemoteViews remoteViews, int i8, boolean z8) {
                remoteViews.setChronometerCountDown(i8, z8);
            }
        }

        private int a() throws Resources.NotFoundException {
            Resources resources = this.f8864a.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(U.c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(U.c.notification_top_pad_large_text);
            float fC = (c(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fC) * dimensionPixelSize) + (fC * dimensionPixelSize2));
        }

        private static float c(float f8, float f9, float f10) {
            return f8 < f9 ? f9 : f8 > f10 ? f10 : f8;
        }

        static s d(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new o();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new j();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new n();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new q();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new k();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new C0132r();
                default:
                    return null;
            }
        }

        private static s e(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new j();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new k();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new q();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new C0132r();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new o();
            }
            return null;
        }

        public static s extractStyleFromNotification(Notification notification) {
            Bundle extras = r.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return g(extras);
        }

        static s f(Bundle bundle) {
            s sVarD = d(bundle.getString(r.EXTRA_COMPAT_TEMPLATE));
            return sVarD != null ? sVarD : (bundle.containsKey(r.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(r.EXTRA_MESSAGING_STYLE_USER)) ? new C0132r() : (bundle.containsKey(r.EXTRA_PICTURE) || bundle.containsKey(r.EXTRA_PICTURE_ICON)) ? new j() : bundle.containsKey(r.EXTRA_BIG_TEXT) ? new k() : bundle.containsKey(r.EXTRA_TEXT_LINES) ? new q() : bundle.containsKey(r.EXTRA_CALL_TYPE) ? new n() : e(bundle.getString(r.EXTRA_TEMPLATE));
        }

        static s g(Bundle bundle) {
            s sVarF = f(bundle);
            if (sVarF == null) {
                return null;
            }
            try {
                sVarF.n(bundle);
                return sVarF;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap h(int i8, int i9, int i10) {
            return j(IconCompat.createWithResource(this.f8864a.mContext, i8), i9, i10);
        }

        private Bitmap j(IconCompat iconCompat, int i8, int i9) {
            Drawable drawableLoadDrawable = iconCompat.loadDrawable(this.f8864a.mContext);
            int intrinsicWidth = i9 == 0 ? drawableLoadDrawable.getIntrinsicWidth() : i9;
            if (i9 == 0) {
                i9 = drawableLoadDrawable.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i9, Bitmap.Config.ARGB_8888);
            drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i9);
            if (i8 != 0) {
                drawableLoadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_IN));
            }
            drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private Bitmap k(int i8, int i9, int i10, int i11) {
            int i12 = U.d.notification_icon_background;
            if (i11 == 0) {
                i11 = 0;
            }
            Bitmap bitmapH = h(i12, i11, i9);
            Canvas canvas = new Canvas(bitmapH);
            Drawable drawableMutate = this.f8864a.mContext.getResources().getDrawable(i8).mutate();
            drawableMutate.setFilterBitmap(true);
            int i13 = (i9 - i10) / 2;
            int i14 = i10 + i13;
            drawableMutate.setBounds(i13, i13, i14, i14);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapH;
        }

        private void m(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(U.e.title, 8);
            remoteViews.setViewVisibility(U.e.text2, 8);
            remoteViews.setViewVisibility(U.e.text, 8);
        }

        public void addCompatExtras(Bundle bundle) {
            if (this.f8867d) {
                bundle.putCharSequence(r.EXTRA_SUMMARY_TEXT, this.f8866c);
            }
            CharSequence charSequence = this.f8865b;
            if (charSequence != null) {
                bundle.putCharSequence(r.EXTRA_TITLE_BIG, charSequence);
            }
            String strL = l();
            if (strL != null) {
                bundle.putString(r.EXTRA_COMPAT_TEMPLATE, strL);
            }
        }

        public void apply(androidx.core.app.m mVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r12, int r13, boolean r14) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.r.s.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        protected void b(Bundle bundle) {
            bundle.remove(r.EXTRA_SUMMARY_TEXT);
            bundle.remove(r.EXTRA_TITLE_BIG);
            bundle.remove(r.EXTRA_COMPAT_TEMPLATE);
        }

        public Notification build() {
            m mVar = this.f8864a;
            if (mVar != null) {
                return mVar.build();
            }
            return null;
        }

        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) throws Resources.NotFoundException {
            m(remoteViews);
            remoteViews.removeAllViews(U.e.notification_main_column);
            remoteViews.addView(U.e.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(U.e.notification_main_column, 0);
            remoteViews.setViewPadding(U.e.notification_main_column_container, 0, a(), 0, 0);
        }

        public Bitmap createColoredBitmap(int i8, int i9) {
            return h(i8, i9, 0);
        }

        public boolean displayCustomViewInline() {
            return false;
        }

        Bitmap i(IconCompat iconCompat, int i8) {
            return j(iconCompat, i8, 0);
        }

        protected String l() {
            return null;
        }

        public RemoteViews makeBigContentView(androidx.core.app.m mVar) {
            return null;
        }

        public RemoteViews makeContentView(androidx.core.app.m mVar) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(androidx.core.app.m mVar) {
            return null;
        }

        protected void n(Bundle bundle) {
            if (bundle.containsKey(r.EXTRA_SUMMARY_TEXT)) {
                this.f8866c = bundle.getCharSequence(r.EXTRA_SUMMARY_TEXT);
                this.f8867d = true;
            }
            this.f8865b = bundle.getCharSequence(r.EXTRA_TITLE_BIG);
        }

        public void setBuilder(m mVar) {
            if (this.f8864a != mVar) {
                this.f8864a = mVar;
                if (mVar != null) {
                    mVar.setStyle(this);
                }
            }
        }
    }

    @Deprecated
    public r() {
    }

    static b a(Notification.Action action) {
        D[] dArr;
        int i8;
        RemoteInput[] remoteInputArrG = c.g(action);
        if (remoteInputArrG == null) {
            dArr = null;
        } else {
            D[] dArr2 = new D[remoteInputArrG.length];
            for (int i9 = 0; i9 < remoteInputArrG.length; i9++) {
                RemoteInput remoteInput = remoteInputArrG[i9];
                dArr2[i9] = new D(c.h(remoteInput), c.f(remoteInput), c.b(remoteInput), c.a(remoteInput), Build.VERSION.SDK_INT >= 29 ? h.c(remoteInput) : 0, c.d(remoteInput), null);
            }
            dArr = dArr2;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z8 = c.c(action).getBoolean("android.support.allowGeneratedReplies") || e.a(action);
        boolean z9 = c.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int iA = i10 >= 28 ? g.a(action) : c.c(action).getInt("android.support.action.semanticAction", 0);
        boolean zE = i10 >= 29 ? h.e(action) : false;
        boolean zA = i10 >= 31 ? i.a(action) : false;
        if (d.a(action) != null || (i8 = action.icon) == 0) {
            return new b(d.a(action) != null ? IconCompat.createFromIconOrNullIfZeroResId(d.a(action)) : null, action.title, action.actionIntent, c.c(action), dArr, (D[]) null, z8, iA, z9, zE, zA);
        }
        return new b(i8, action.title, action.actionIntent, c.c(action), dArr, (D[]) null, z8, iA, z9, zE, zA);
    }

    static boolean b(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static b getAction(Notification notification, int i8) {
        return a(notification.actions[i8]);
    }

    public static int getActionCount(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.a(notification);
        }
        return 0;
    }

    public static l getBubbleMetadata(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return l.fromPlatform(h.b(notification));
        }
        return null;
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static String getChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.b(notification);
        }
        return null;
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static String getGroup(Notification notification) {
        return c.e(notification);
    }

    public static int getGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.c(notification);
        }
        return 0;
    }

    public static List<b> getInvisibleActions(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i8 = 0; i8 < bundle.size(); i8++) {
                arrayList.add(u.d(bundle.getBundle(Integer.toString(i8))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static androidx.core.content.b getLocusId(Notification notification) {
        LocusId locusIdD;
        if (Build.VERSION.SDK_INT < 29 || (locusIdD = h.d(notification)) == null) {
            return null;
        }
        return androidx.core.content.b.toLocusIdCompat(locusIdD);
    }

    public static boolean getOngoing(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static List<B> getPeople(Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(B.fromAndroidPerson(androidx.core.app.q.a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new B.c().setUri(str).build());
                }
            }
        }
        return arrayList;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence getSettingsText(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.d(notification);
        }
        return null;
    }

    public static String getShortcutId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.e(notification);
        }
        return null;
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static String getSortKey(Notification notification) {
        return c.i(notification);
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.f(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) throws Resources.NotFoundException {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(U.c.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(U.c.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }

    public static class q extends s {

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f8852e = new ArrayList();

        public q() {
        }

        public q addLine(CharSequence charSequence) {
            if (charSequence != null) {
                this.f8852e.add(m.b(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.r.s
        public void apply(androidx.core.app.m mVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(mVar.getBuilder()).setBigContentTitle(this.f8865b);
            if (this.f8867d) {
                bigContentTitle.setSummaryText(this.f8866c);
            }
            Iterator it = this.f8852e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.r.s
        protected void b(Bundle bundle) {
            super.b(bundle);
            bundle.remove(r.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.r.s
        protected String l() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.r.s
        protected void n(Bundle bundle) {
            super.n(bundle);
            this.f8852e.clear();
            if (bundle.containsKey(r.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.f8852e, bundle.getCharSequenceArray(r.EXTRA_TEXT_LINES));
            }
        }

        public q setBigContentTitle(CharSequence charSequence) {
            this.f8865b = m.b(charSequence);
            return this;
        }

        public q setSummaryText(CharSequence charSequence) {
            this.f8866c = m.b(charSequence);
            this.f8867d = true;
            return this;
        }

        public q(m mVar) {
            setBuilder(mVar);
        }
    }

    /* renamed from: androidx.core.app.r$r, reason: collision with other inner class name */
    public static class C0132r extends s {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;

        /* renamed from: e, reason: collision with root package name */
        private final List f8853e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List f8854f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private B f8855g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f8856h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f8857i;

        /* renamed from: androidx.core.app.r$r$a */
        static class a {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: androidx.core.app.r$r$b */
        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* renamed from: androidx.core.app.r$r$c */
        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z8) {
                return messagingStyle.setGroupConversation(z8);
            }
        }

        C0132r() {
        }

        public static C0132r extractMessagingStyleFromNotification(Notification notification) {
            s sVarExtractStyleFromNotification = s.extractStyleFromNotification(notification);
            if (sVarExtractStyleFromNotification instanceof C0132r) {
                return (C0132r) sVarExtractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.r.s
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(r.EXTRA_SELF_DISPLAY_NAME, this.f8855g.getName());
            bundle.putBundle(r.EXTRA_MESSAGING_STYLE_USER, this.f8855g.toBundle());
            bundle.putCharSequence(r.EXTRA_HIDDEN_CONVERSATION_TITLE, this.f8856h);
            if (this.f8856h != null && this.f8857i.booleanValue()) {
                bundle.putCharSequence(r.EXTRA_CONVERSATION_TITLE, this.f8856h);
            }
            if (!this.f8853e.isEmpty()) {
                bundle.putParcelableArray(r.EXTRA_MESSAGES, d.a(this.f8853e));
            }
            if (!this.f8854f.isEmpty()) {
                bundle.putParcelableArray(r.EXTRA_HISTORIC_MESSAGES, d.a(this.f8854f));
            }
            Boolean bool = this.f8857i;
            if (bool != null) {
                bundle.putBoolean(r.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        public C0132r addHistoricMessage(d dVar) {
            if (dVar != null) {
                this.f8854f.add(dVar);
                if (this.f8854f.size() > 25) {
                    this.f8854f.remove(0);
                }
            }
            return this;
        }

        @Deprecated
        public C0132r addMessage(CharSequence charSequence, long j8, CharSequence charSequence2) {
            this.f8853e.add(new d(charSequence, j8, new B.c().setName(charSequence2).build()));
            if (this.f8853e.size() > 25) {
                this.f8853e.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.r.s
        public void apply(androidx.core.app.m mVar) {
            setGroupConversation(isGroupConversation());
            Notification.MessagingStyle messagingStyleA = Build.VERSION.SDK_INT >= 28 ? c.a(this.f8855g.toAndroidPerson()) : a.b(this.f8855g.getName());
            Iterator it = this.f8853e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleA, ((d) it.next()).d());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f8854f.iterator();
                while (it2.hasNext()) {
                    b.a(messagingStyleA, ((d) it2.next()).d());
                }
            }
            if (this.f8857i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(messagingStyleA, this.f8856h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(messagingStyleA, this.f8857i.booleanValue());
            }
            messagingStyleA.setBuilder(mVar.getBuilder());
        }

        @Override // androidx.core.app.r.s
        protected void b(Bundle bundle) {
            super.b(bundle);
            bundle.remove(r.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(r.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(r.EXTRA_CONVERSATION_TITLE);
            bundle.remove(r.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(r.EXTRA_MESSAGES);
            bundle.remove(r.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(r.EXTRA_IS_GROUP_CONVERSATION);
        }

        public CharSequence getConversationTitle() {
            return this.f8856h;
        }

        public List<d> getHistoricMessages() {
            return this.f8854f;
        }

        public List<d> getMessages() {
            return this.f8853e;
        }

        public B getUser() {
            return this.f8855g;
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.f8855g.getName();
        }

        public boolean isGroupConversation() {
            m mVar = this.f8864a;
            if (mVar != null && mVar.mContext.getApplicationInfo().targetSdkVersion < 28 && this.f8857i == null) {
                return this.f8856h != null;
            }
            Boolean bool = this.f8857i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @Override // androidx.core.app.r.s
        protected String l() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.r.s
        protected void n(Bundle bundle) {
            super.n(bundle);
            this.f8853e.clear();
            if (bundle.containsKey(r.EXTRA_MESSAGING_STYLE_USER)) {
                this.f8855g = B.fromBundle(bundle.getBundle(r.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.f8855g = new B.c().setName(bundle.getString(r.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(r.EXTRA_CONVERSATION_TITLE);
            this.f8856h = charSequence;
            if (charSequence == null) {
                this.f8856h = bundle.getCharSequence(r.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(r.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.f8853e.addAll(d.c(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(r.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.f8854f.addAll(d.c(parcelableArray2));
            }
            if (bundle.containsKey(r.EXTRA_IS_GROUP_CONVERSATION)) {
                this.f8857i = Boolean.valueOf(bundle.getBoolean(r.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        public C0132r setConversationTitle(CharSequence charSequence) {
            this.f8856h = charSequence;
            return this;
        }

        public C0132r setGroupConversation(boolean z8) {
            this.f8857i = Boolean.valueOf(z8);
            return this;
        }

        @Deprecated
        public C0132r(CharSequence charSequence) {
            this.f8855g = new B.c().setName(charSequence).build();
        }

        /* renamed from: androidx.core.app.r$r$d */
        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            private final CharSequence f8858a;

            /* renamed from: b, reason: collision with root package name */
            private final long f8859b;

            /* renamed from: c, reason: collision with root package name */
            private final B f8860c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f8861d;

            /* renamed from: e, reason: collision with root package name */
            private String f8862e;

            /* renamed from: f, reason: collision with root package name */
            private Uri f8863f;

            /* renamed from: androidx.core.app.r$r$d$a */
            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j8, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j8, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* renamed from: androidx.core.app.r$r$d$b */
            static class b {
                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j8, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j8, person);
                }
            }

            public d(CharSequence charSequence, long j8, B b9) {
                this.f8861d = new Bundle();
                this.f8858a = charSequence;
                this.f8859b = j8;
                this.f8860c = b9;
            }

            static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    bundleArr[i8] = ((d) list.get(i8)).e();
                }
                return bundleArr;
            }

            static d b(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? B.fromBundle(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new B.c().setName(bundle.getCharSequence("sender")).build() : null : B.fromAndroidPerson(androidx.core.app.q.a(bundle.getParcelable("sender_person"))));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            dVar.setData(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.getExtras().putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List c(Parcelable[] parcelableArr) {
                d dVarB;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (dVarB = b((Bundle) parcelable)) != null) {
                        arrayList.add(dVarB);
                    }
                }
                return arrayList;
            }

            private Bundle e() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f8858a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f8859b);
                B b9 = this.f8860c;
                if (b9 != null) {
                    bundle.putCharSequence("sender", b9.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f8860c.toAndroidPerson()));
                    } else {
                        bundle.putBundle("person", this.f8860c.toBundle());
                    }
                }
                String str = this.f8862e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f8863f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f8861d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            Notification.MessagingStyle.Message d() {
                Notification.MessagingStyle.Message messageA;
                B person = getPerson();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageA = b.b(getText(), getTimestamp(), person != null ? person.toAndroidPerson() : null);
                } else {
                    messageA = a.a(getText(), getTimestamp(), person != null ? person.getName() : null);
                }
                if (getDataMimeType() != null) {
                    a.b(messageA, getDataMimeType(), getDataUri());
                }
                return messageA;
            }

            public String getDataMimeType() {
                return this.f8862e;
            }

            public Uri getDataUri() {
                return this.f8863f;
            }

            public Bundle getExtras() {
                return this.f8861d;
            }

            public B getPerson() {
                return this.f8860c;
            }

            @Deprecated
            public CharSequence getSender() {
                B b9 = this.f8860c;
                if (b9 == null) {
                    return null;
                }
                return b9.getName();
            }

            public CharSequence getText() {
                return this.f8858a;
            }

            public long getTimestamp() {
                return this.f8859b;
            }

            public d setData(String str, Uri uri) {
                this.f8862e = str;
                this.f8863f = uri;
                return this;
            }

            @Deprecated
            public d(CharSequence charSequence, long j8, CharSequence charSequence2) {
                this(charSequence, j8, new B.c().setName(charSequence2).build());
            }
        }

        public C0132r addMessage(CharSequence charSequence, long j8, B b9) {
            addMessage(new d(charSequence, j8, b9));
            return this;
        }

        public C0132r addMessage(d dVar) {
            if (dVar != null) {
                this.f8853e.add(dVar);
                if (this.f8853e.size() > 25) {
                    this.f8853e.remove(0);
                }
            }
            return this;
        }

        public C0132r(B b9) {
            if (!TextUtils.isEmpty(b9.getName())) {
                this.f8855g = b9;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }
}
