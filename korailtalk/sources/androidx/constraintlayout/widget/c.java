package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.kakao.sdk.user.Constants;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {
    public static final String TAG = "ConstraintLayoutStates";

    /* renamed from: a */
    private final ConstraintLayout f8578a;

    /* renamed from: b */
    d f8579b;

    /* renamed from: c */
    int f8580c = -1;

    /* renamed from: d */
    int f8581d = -1;

    /* renamed from: e */
    private SparseArray f8582e = new SparseArray();

    /* renamed from: f */
    private SparseArray f8583f = new SparseArray();

    /* renamed from: g */
    private f f8584g = null;

    static class a {

        /* renamed from: a */
        int f8585a;

        /* renamed from: b */
        ArrayList f8586b = new ArrayList();

        /* renamed from: c */
        int f8587c;

        /* renamed from: d */
        d f8588d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f8587c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.State_android_id) {
                    this.f8585a = typedArrayObtainStyledAttributes.getResourceId(index, this.f8585a);
                } else if (index == i.State_constraints) {
                    this.f8587c = typedArrayObtainStyledAttributes.getResourceId(index, this.f8587c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8587c);
                    context.getResources().getResourceName(this.f8587c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f8588d = dVar;
                        dVar.clone(context, this.f8587c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f8586b.add(bVar);
        }

        public int findMatch(float f8, float f9) {
            for (int i8 = 0; i8 < this.f8586b.size(); i8++) {
                if (((b) this.f8586b.get(i8)).a(f8, f9)) {
                    return i8;
                }
            }
            return -1;
        }
    }

    static class b {

        /* renamed from: a */
        float f8589a;

        /* renamed from: b */
        float f8590b;

        /* renamed from: c */
        float f8591c;

        /* renamed from: d */
        float f8592d;

        /* renamed from: e */
        int f8593e;

        /* renamed from: f */
        d f8594f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f8589a = Float.NaN;
            this.f8590b = Float.NaN;
            this.f8591c = Float.NaN;
            this.f8592d = Float.NaN;
            this.f8593e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.Variant_constraints) {
                    this.f8593e = typedArrayObtainStyledAttributes.getResourceId(index, this.f8593e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8593e);
                    context.getResources().getResourceName(this.f8593e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f8594f = dVar;
                        dVar.clone(context, this.f8593e);
                    }
                } else if (index == i.Variant_region_heightLessThan) {
                    this.f8592d = typedArrayObtainStyledAttributes.getDimension(index, this.f8592d);
                } else if (index == i.Variant_region_heightMoreThan) {
                    this.f8590b = typedArrayObtainStyledAttributes.getDimension(index, this.f8590b);
                } else if (index == i.Variant_region_widthLessThan) {
                    this.f8591c = typedArrayObtainStyledAttributes.getDimension(index, this.f8591c);
                } else if (index == i.Variant_region_widthMoreThan) {
                    this.f8589a = typedArrayObtainStyledAttributes.getDimension(index, this.f8589a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f8, float f9) {
            if (!Float.isNaN(this.f8589a) && f8 < this.f8589a) {
                return false;
            }
            if (!Float.isNaN(this.f8590b) && f9 < this.f8590b) {
                return false;
            }
            if (Float.isNaN(this.f8591c) || f8 <= this.f8591c) {
                return Float.isNaN(this.f8592d) || f9 <= this.f8592d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i8) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f8578a = constraintLayout;
        a(context, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r8, int r9) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto La2
            if (r0 == 0) goto L92
            r3 = 2
            if (r0 == r3) goto L17
            goto L95
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L53;
                case 80204913: goto L49;
                case 1382829617: goto L3f;
                case 1657696882: goto L35;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L24:
            goto L5d
        L25:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r6
            goto L5e
        L2f:
            r8 = move-exception
            goto L9b
        L32:
            r8 = move-exception
            goto L9f
        L35:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = 0
            goto L5e
        L3f:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r2
            goto L5e
        L49:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r3
            goto L5e
        L53:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r5
            goto L5e
        L5d:
            r4 = -1
        L5e:
            if (r4 == 0) goto L95
            if (r4 == r2) goto L95
            if (r4 == r3) goto L85
            if (r4 == r6) goto L7a
            if (r4 == r5) goto L76
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r2.<init>()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            java.lang.String r3 = "unknown tag "
            r2.append(r3)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r2.append(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L95
        L76:
            r7.b(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L95
        L7a:
            androidx.constraintlayout.widget.c$b r0 = new androidx.constraintlayout.widget.c$b     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r1 == 0) goto L95
            r1.a(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L95
        L85:
            androidx.constraintlayout.widget.c$a r1 = new androidx.constraintlayout.widget.c$a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            android.util.SparseArray r0 = r7.f8582e     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r2 = r1.f8585a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.put(r2, r1)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L95
        L92:
            r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L95:
            int r0 = r9.next()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto Ld
        L9b:
            r8.printStackTrace()
            goto La2
        L9f:
            r8.printStackTrace()
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            if (Constants.ID.equals(xmlPullParser.getAttributeName(i8))) {
                String attributeValue = xmlPullParser.getAttributeValue(i8);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), Constants.ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.load(context, xmlPullParser);
                this.f8583f.put(identifier, dVar);
                return;
            }
        }
    }

    public boolean needsToChange(int i8, float f8, float f9) {
        int i9 = this.f8580c;
        if (i9 != i8) {
            return true;
        }
        a aVar = (a) (i8 == -1 ? this.f8582e.valueAt(0) : this.f8582e.get(i9));
        int i10 = this.f8581d;
        return (i10 == -1 || !((b) aVar.f8586b.get(i10)).a(f8, f9)) && this.f8581d != aVar.findMatch(f8, f9);
    }

    public void setOnConstraintsChanged(f fVar) {
        this.f8584g = fVar;
    }

    public void updateConstraints(int i8, float f8, float f9) {
        int iFindMatch;
        int i9 = this.f8580c;
        if (i9 == i8) {
            a aVar = i8 == -1 ? (a) this.f8582e.valueAt(0) : (a) this.f8582e.get(i9);
            int i10 = this.f8581d;
            if ((i10 == -1 || !((b) aVar.f8586b.get(i10)).a(f8, f9)) && this.f8581d != (iFindMatch = aVar.findMatch(f8, f9))) {
                d dVar = iFindMatch == -1 ? this.f8579b : ((b) aVar.f8586b.get(iFindMatch)).f8594f;
                int i11 = iFindMatch == -1 ? aVar.f8587c : ((b) aVar.f8586b.get(iFindMatch)).f8593e;
                if (dVar == null) {
                    return;
                }
                this.f8581d = iFindMatch;
                f fVar = this.f8584g;
                if (fVar != null) {
                    fVar.preLayoutChange(-1, i11);
                }
                dVar.applyTo(this.f8578a);
                f fVar2 = this.f8584g;
                if (fVar2 != null) {
                    fVar2.postLayoutChange(-1, i11);
                    return;
                }
                return;
            }
            return;
        }
        this.f8580c = i8;
        a aVar2 = (a) this.f8582e.get(i8);
        int iFindMatch2 = aVar2.findMatch(f8, f9);
        d dVar2 = iFindMatch2 == -1 ? aVar2.f8588d : ((b) aVar2.f8586b.get(iFindMatch2)).f8594f;
        int i12 = iFindMatch2 == -1 ? aVar2.f8587c : ((b) aVar2.f8586b.get(iFindMatch2)).f8593e;
        if (dVar2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(i8);
            sb.append(", dim =");
            sb.append(f8);
            sb.append(", ");
            sb.append(f9);
            return;
        }
        this.f8581d = iFindMatch2;
        f fVar3 = this.f8584g;
        if (fVar3 != null) {
            fVar3.preLayoutChange(i8, i12);
        }
        dVar2.applyTo(this.f8578a);
        f fVar4 = this.f8584g;
        if (fVar4 != null) {
            fVar4.postLayoutChange(i8, i12);
        }
    }
}
