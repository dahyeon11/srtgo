package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: androidx.core.view.e */
/* loaded from: classes.dex */
public final class C0951e {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;

    /* renamed from: a */
    private final g f9217a;

    /* renamed from: androidx.core.view.e$a */
    private static final class a {
        public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair pairC = C0951e.c(clip, new Z.n() { // from class: androidx.core.view.d
                    @Override // Z.n
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return pairC.first == null ? Pair.create(null, contentInfo) : pairC.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairC.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairC.second).build());
            }
            boolean zTest = predicate.test(clip.getItemAt(0));
            ContentInfo contentInfo2 = zTest ? contentInfo : null;
            if (zTest) {
                contentInfo = null;
            }
            return Pair.create(contentInfo2, contentInfo);
        }
    }

    /* renamed from: androidx.core.view.e$d */
    private interface d {
        C0951e build();

        void setClip(ClipData clipData);

        void setExtras(Bundle bundle);

        void setFlags(int i8);

        void setLinkUri(Uri uri);

        void setSource(int i8);
    }

    /* renamed from: androidx.core.view.e$f */
    private static final class f implements g {

        /* renamed from: a */
        private final ContentInfo f9225a;

        f(ContentInfo contentInfo) {
            this.f9225a = AbstractC0945c.a(Z.h.checkNotNull(contentInfo));
        }

        @Override // androidx.core.view.C0951e.g
        public ClipData getClip() {
            return this.f9225a.getClip();
        }

        @Override // androidx.core.view.C0951e.g
        public Bundle getExtras() {
            return this.f9225a.getExtras();
        }

        @Override // androidx.core.view.C0951e.g
        public int getFlags() {
            return this.f9225a.getFlags();
        }

        @Override // androidx.core.view.C0951e.g
        public Uri getLinkUri() {
            return this.f9225a.getLinkUri();
        }

        @Override // androidx.core.view.C0951e.g
        public int getSource() {
            return this.f9225a.getSource();
        }

        @Override // androidx.core.view.C0951e.g
        public ContentInfo getWrapped() {
            return this.f9225a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f9225a + "}";
        }
    }

    /* renamed from: androidx.core.view.e$g */
    private interface g {
        ClipData getClip();

        Bundle getExtras();

        int getFlags();

        Uri getLinkUri();

        int getSource();

        ContentInfo getWrapped();
    }

    /* renamed from: androidx.core.view.e$h */
    private static final class h implements g {

        /* renamed from: a */
        private final ClipData f9226a;

        /* renamed from: b */
        private final int f9227b;

        /* renamed from: c */
        private final int f9228c;

        /* renamed from: d */
        private final Uri f9229d;

        /* renamed from: e */
        private final Bundle f9230e;

        h(C0146e c0146e) {
            this.f9226a = (ClipData) Z.h.checkNotNull(c0146e.f9220a);
            this.f9227b = Z.h.checkArgumentInRange(c0146e.f9221b, 0, 5, "source");
            this.f9228c = Z.h.checkFlagsArgument(c0146e.f9222c, 1);
            this.f9229d = c0146e.f9223d;
            this.f9230e = c0146e.f9224e;
        }

        @Override // androidx.core.view.C0951e.g
        public ClipData getClip() {
            return this.f9226a;
        }

        @Override // androidx.core.view.C0951e.g
        public Bundle getExtras() {
            return this.f9230e;
        }

        @Override // androidx.core.view.C0951e.g
        public int getFlags() {
            return this.f9228c;
        }

        @Override // androidx.core.view.C0951e.g
        public Uri getLinkUri() {
            return this.f9229d;
        }

        @Override // androidx.core.view.C0951e.g
        public int getSource() {
            return this.f9227b;
        }

        @Override // androidx.core.view.C0951e.g
        public ContentInfo getWrapped() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f9226a.getDescription());
            sb.append(", source=");
            sb.append(C0951e.d(this.f9227b));
            sb.append(", flags=");
            sb.append(C0951e.b(this.f9228c));
            if (this.f9229d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f9229d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f9230e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C0951e(g gVar) {
        this.f9217a = gVar;
    }

    static ClipData a(ClipDescription clipDescription, List list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) list.get(0));
        for (int i8 = 1; i8 < list.size(); i8++) {
            clipData.addItem((ClipData.Item) list.get(i8));
        }
        return clipData;
    }

    static String b(int i8) {
        return (i8 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i8);
    }

    static Pair c(ClipData clipData, Z.n nVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i8 = 0; i8 < clipData.getItemCount(); i8++) {
            ClipData.Item itemAt = clipData.getItemAt(i8);
            if (nVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    static String d(int i8) {
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? String.valueOf(i8) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C0951e toContentInfoCompat(ContentInfo contentInfo) {
        return new C0951e(new f(contentInfo));
    }

    public ClipData getClip() {
        return this.f9217a.getClip();
    }

    public Bundle getExtras() {
        return this.f9217a.getExtras();
    }

    public int getFlags() {
        return this.f9217a.getFlags();
    }

    public Uri getLinkUri() {
        return this.f9217a.getLinkUri();
    }

    public int getSource() {
        return this.f9217a.getSource();
    }

    public Pair<C0951e, C0951e> partition(Z.n nVar) {
        ClipData clip = this.f9217a.getClip();
        if (clip.getItemCount() == 1) {
            boolean zTest = nVar.test(clip.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair pairC = c(clip, nVar);
        return pairC.first == null ? Pair.create(null, this) : pairC.second == null ? Pair.create(this, null) : Pair.create(new b(this).setClip((ClipData) pairC.first).build(), new b(this).setClip((ClipData) pairC.second).build());
    }

    public ContentInfo toContentInfo() {
        ContentInfo wrapped = this.f9217a.getWrapped();
        Objects.requireNonNull(wrapped);
        return AbstractC0945c.a(wrapped);
    }

    public String toString() {
        return this.f9217a.toString();
    }

    /* renamed from: androidx.core.view.e$c */
    private static final class c implements d {

        /* renamed from: a */
        private final ContentInfo.Builder f9219a;

        c(ClipData clipData, int i8) {
            this.f9219a = AbstractC0972l.a(clipData, i8);
        }

        @Override // androidx.core.view.C0951e.d
        public C0951e build() {
            return new C0951e(new f(this.f9219a.build()));
        }

        @Override // androidx.core.view.C0951e.d
        public void setClip(ClipData clipData) {
            this.f9219a.setClip(clipData);
        }

        @Override // androidx.core.view.C0951e.d
        public void setExtras(Bundle bundle) {
            this.f9219a.setExtras(bundle);
        }

        @Override // androidx.core.view.C0951e.d
        public void setFlags(int i8) {
            this.f9219a.setFlags(i8);
        }

        @Override // androidx.core.view.C0951e.d
        public void setLinkUri(Uri uri) {
            this.f9219a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C0951e.d
        public void setSource(int i8) {
            this.f9219a.setSource(i8);
        }

        c(C0951e c0951e) {
            AbstractC0978n.a();
            this.f9219a = AbstractC0975m.a(c0951e.toContentInfo());
        }
    }

    /* renamed from: androidx.core.view.e$e */
    private static final class C0146e implements d {

        /* renamed from: a */
        ClipData f9220a;

        /* renamed from: b */
        int f9221b;

        /* renamed from: c */
        int f9222c;

        /* renamed from: d */
        Uri f9223d;

        /* renamed from: e */
        Bundle f9224e;

        C0146e(ClipData clipData, int i8) {
            this.f9220a = clipData;
            this.f9221b = i8;
        }

        @Override // androidx.core.view.C0951e.d
        public C0951e build() {
            return new C0951e(new h(this));
        }

        @Override // androidx.core.view.C0951e.d
        public void setClip(ClipData clipData) {
            this.f9220a = clipData;
        }

        @Override // androidx.core.view.C0951e.d
        public void setExtras(Bundle bundle) {
            this.f9224e = bundle;
        }

        @Override // androidx.core.view.C0951e.d
        public void setFlags(int i8) {
            this.f9222c = i8;
        }

        @Override // androidx.core.view.C0951e.d
        public void setLinkUri(Uri uri) {
            this.f9223d = uri;
        }

        @Override // androidx.core.view.C0951e.d
        public void setSource(int i8) {
            this.f9221b = i8;
        }

        C0146e(C0951e c0951e) {
            this.f9220a = c0951e.getClip();
            this.f9221b = c0951e.getSource();
            this.f9222c = c0951e.getFlags();
            this.f9223d = c0951e.getLinkUri();
            this.f9224e = c0951e.getExtras();
        }
    }

    /* renamed from: androidx.core.view.e$b */
    public static final class b {

        /* renamed from: a */
        private final d f9218a;

        public b(C0951e c0951e) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f9218a = new c(c0951e);
            } else {
                this.f9218a = new C0146e(c0951e);
            }
        }

        public C0951e build() {
            return this.f9218a.build();
        }

        public b setClip(ClipData clipData) {
            this.f9218a.setClip(clipData);
            return this;
        }

        public b setExtras(Bundle bundle) {
            this.f9218a.setExtras(bundle);
            return this;
        }

        public b setFlags(int i8) {
            this.f9218a.setFlags(i8);
            return this;
        }

        public b setLinkUri(Uri uri) {
            this.f9218a.setLinkUri(uri);
            return this;
        }

        public b setSource(int i8) {
            this.f9218a.setSource(i8);
            return this;
        }

        public b(ClipData clipData, int i8) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f9218a = new c(clipData, i8);
            } else {
                this.f9218a = new C0146e(clipData, i8);
            }
        }
    }

    public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, Predicate<ClipData.Item> predicate) {
        return a.partition(contentInfo, predicate);
    }
}
