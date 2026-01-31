package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class j {
    public static final String TAG = "ConstraintLayoutStates";

    /* renamed from: a, reason: collision with root package name */
    int f8609a = -1;

    /* renamed from: b, reason: collision with root package name */
    int f8610b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f8611c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray f8612d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray f8613e = new SparseArray();

    /* renamed from: f, reason: collision with root package name */
    private f f8614f = null;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f8615a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f8616b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        int f8617c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8618d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f8617c = -1;
            this.f8618d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.State_android_id) {
                    this.f8615a = typedArrayObtainStyledAttributes.getResourceId(index, this.f8615a);
                } else if (index == i.State_constraints) {
                    this.f8617c = typedArrayObtainStyledAttributes.getResourceId(index, this.f8617c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8617c);
                    context.getResources().getResourceName(this.f8617c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8618d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f8616b.add(bVar);
        }

        public int findMatch(float f8, float f9) {
            for (int i8 = 0; i8 < this.f8616b.size(); i8++) {
                if (((b) this.f8616b.get(i8)).a(f8, f9)) {
                    return i8;
                }
            }
            return -1;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f8619a;

        /* renamed from: b, reason: collision with root package name */
        float f8620b;

        /* renamed from: c, reason: collision with root package name */
        float f8621c;

        /* renamed from: d, reason: collision with root package name */
        float f8622d;

        /* renamed from: e, reason: collision with root package name */
        int f8623e;

        /* renamed from: f, reason: collision with root package name */
        boolean f8624f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f8619a = Float.NaN;
            this.f8620b = Float.NaN;
            this.f8621c = Float.NaN;
            this.f8622d = Float.NaN;
            this.f8623e = -1;
            this.f8624f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.Variant_constraints) {
                    this.f8623e = typedArrayObtainStyledAttributes.getResourceId(index, this.f8623e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8623e);
                    context.getResources().getResourceName(this.f8623e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8624f = true;
                    }
                } else if (index == i.Variant_region_heightLessThan) {
                    this.f8622d = typedArrayObtainStyledAttributes.getDimension(index, this.f8622d);
                } else if (index == i.Variant_region_heightMoreThan) {
                    this.f8620b = typedArrayObtainStyledAttributes.getDimension(index, this.f8620b);
                } else if (index == i.Variant_region_widthLessThan) {
                    this.f8621c = typedArrayObtainStyledAttributes.getDimension(index, this.f8621c);
                } else if (index == i.Variant_region_widthMoreThan) {
                    this.f8619a = typedArrayObtainStyledAttributes.getDimension(index, this.f8619a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f8, float f9) {
            if (!Float.isNaN(this.f8619a) && f8 < this.f8619a) {
                return false;
            }
            if (!Float.isNaN(this.f8620b) && f9 < this.f8620b) {
                return false;
            }
            if (Float.isNaN(this.f8621c) || f8 <= this.f8621c) {
                return Float.isNaN(this.f8622d) || f9 <= this.f8622d;
            }
            return false;
        }
    }

    public j(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        a(context, xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.i.StateSet
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.i.StateSet_defaultState
            if (r4 != r5) goto L22
            int r5 = r8.f8609a
            int r4 = r0.getResourceId(r4, r5)
            r8.f8609a = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r1 = 0
        L2d:
            r3 = 1
            if (r0 == r3) goto Lbe
            if (r0 == 0) goto Lae
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L4d
            if (r0 == r5) goto L3c
            goto Lb1
        L3c:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto Lb1
            return
        L47:
            r9 = move-exception
            goto Lb7
        L4a:
            r9 = move-exception
            goto Lbb
        L4d:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            switch(r7) {
                case 80204913: goto L75;
                case 1301459538: goto L6b;
                case 1382829617: goto L63;
                case 1901439077: goto L59;
                default: goto L58;
            }     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
        L58:
            goto L7f
        L59:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r5
            goto L80
        L63:
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r3
            goto L80
        L6b:
            java.lang.String r4 = "LayoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r2
            goto L80
        L75:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r6
            goto L80
        L7f:
            r4 = -1
        L80:
            if (r4 == 0) goto Lb1
            if (r4 == r3) goto Lb1
            if (r4 == r6) goto La1
            if (r4 == r5) goto L96
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r3.<init>()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r3.append(r0)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto Lb1
        L96:
            androidx.constraintlayout.widget.j$b r0 = new androidx.constraintlayout.widget.j$b     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r1 == 0) goto Lb1
            r1.a(r0)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto Lb1
        La1:
            androidx.constraintlayout.widget.j$a r1 = new androidx.constraintlayout.widget.j$a     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            android.util.SparseArray r0 = r8.f8612d     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            int r3 = r1.f8615a     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.put(r3, r1)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto Lb1
        Lae:
            r10.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
        Lb1:
            int r0 = r10.next()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L2d
        Lb7:
            r9.printStackTrace()
            goto Lbe
        Lbb:
            r9.printStackTrace()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.j.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int convertToConstraintSet(int i8, int i9, float f8, float f9) {
        a aVar = (a) this.f8612d.get(i9);
        if (aVar == null) {
            return i9;
        }
        if (f8 == -1.0f || f9 == -1.0f) {
            if (aVar.f8617c == i8) {
                return i8;
            }
            Iterator it = aVar.f8616b.iterator();
            while (it.hasNext()) {
                if (i8 == ((b) it.next()).f8623e) {
                    return i8;
                }
            }
            return aVar.f8617c;
        }
        Iterator it2 = aVar.f8616b.iterator();
        b bVar = null;
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            if (bVar2.a(f8, f9)) {
                if (i8 == bVar2.f8623e) {
                    return i8;
                }
                bVar = bVar2;
            }
        }
        return bVar != null ? bVar.f8623e : aVar.f8617c;
    }

    public boolean needsToChange(int i8, float f8, float f9) {
        int i9 = this.f8610b;
        if (i9 != i8) {
            return true;
        }
        a aVar = (a) (i8 == -1 ? this.f8612d.valueAt(0) : this.f8612d.get(i9));
        int i10 = this.f8611c;
        return (i10 == -1 || !((b) aVar.f8616b.get(i10)).a(f8, f9)) && this.f8611c != aVar.findMatch(f8, f9);
    }

    public void setOnConstraintsChanged(f fVar) {
        this.f8614f = fVar;
    }

    public int stateGetConstraintID(int i8, int i9, int i10) {
        return updateConstraints(-1, i8, i9, i10);
    }

    public int updateConstraints(int i8, int i9, float f8, float f9) {
        int iFindMatch;
        if (i8 == i9) {
            a aVar = i9 == -1 ? (a) this.f8612d.valueAt(0) : (a) this.f8612d.get(this.f8610b);
            if (aVar == null) {
                return -1;
            }
            return ((this.f8611c == -1 || !((b) aVar.f8616b.get(i8)).a(f8, f9)) && i8 != (iFindMatch = aVar.findMatch(f8, f9))) ? iFindMatch == -1 ? aVar.f8617c : ((b) aVar.f8616b.get(iFindMatch)).f8623e : i8;
        }
        a aVar2 = (a) this.f8612d.get(i9);
        if (aVar2 == null) {
            return -1;
        }
        int iFindMatch2 = aVar2.findMatch(f8, f9);
        return iFindMatch2 == -1 ? aVar2.f8617c : ((b) aVar2.f8616b.get(iFindMatch2)).f8623e;
    }
}
