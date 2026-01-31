package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.kakao.sdk.user.Constants;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a */
    protected int[] f8569a;

    /* renamed from: b */
    protected int f8570b;

    /* renamed from: c */
    protected Context f8571c;

    /* renamed from: d */
    protected R.i f8572d;

    /* renamed from: e */
    protected boolean f8573e;

    /* renamed from: f */
    protected String f8574f;

    /* renamed from: g */
    protected String f8575g;

    /* renamed from: h */
    private View[] f8576h;

    /* renamed from: i */
    private HashMap f8577i;

    public b(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f8569a = new int[32];
        this.f8573e = false;
        this.f8576h = null;
        this.f8577i = new HashMap();
        this.f8571c = context;
        j(null);
    }

    private void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f8571c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iH = h(strTrim);
        if (iH != 0) {
            this.f8577i.put(Integer.valueOf(iH), strTrim);
            b(iH);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i8) {
        if (i8 == getId()) {
            return;
        }
        int i9 = this.f8570b + 1;
        int[] iArr = this.f8569a;
        if (i9 > iArr.length) {
            this.f8569a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8569a;
        int i10 = this.f8570b;
        iArr2[i10] = i8;
        this.f8570b = i10 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f8571c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).constraintTag)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int[] f(View view, String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i8 = 0;
        for (String str2 : strArrSplit) {
            int iH = h(str2.trim());
            if (iH != 0) {
                iArr[i8] = iH;
                i8++;
            }
        }
        return i8 != strArrSplit.length ? Arrays.copyOf(iArr, i8) : iArr;
    }

    private int g(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f8571c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iG = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iG = ((Integer) designInformation).intValue();
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iG == 0 ? this.f8571c.getResources().getIdentifier(str, Constants.ID, this.f8571c.getPackageName()) : iG;
    }

    public void addView(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f8574f = null;
            b(view.getId());
            requestLayout();
        }
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i8 = 0; i8 < this.f8570b; i8++) {
            View viewById = constraintLayout.getViewById(this.f8569a[i8]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8569a, this.f8570b);
    }

    protected View[] i(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f8576h;
        if (viewArr == null || viewArr.length != this.f8570b) {
            this.f8576h = new View[this.f8570b];
        }
        for (int i8 = 0; i8 < this.f8570b; i8++) {
            this.f8576h[i8] = constraintLayout.getViewById(this.f8569a[i8]);
        }
        return this.f8576h;
    }

    protected void j(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8574f = string;
                    setIds(string);
                } else if (index == i.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f8575g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void loadParameters(d.a aVar, R.j jVar, ConstraintLayout.b bVar, SparseArray<R.e> sparseArray) {
        d.b bVar2 = aVar.layout;
        int[] iArr = bVar2.mReferenceIds;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.mReferenceIdString;
            if (str != null && str.length() > 0) {
                d.b bVar3 = aVar.layout;
                bVar3.mReferenceIds = f(this, bVar3.mReferenceIdString);
            }
        }
        jVar.removeAllIds();
        if (aVar.layout.mReferenceIds == null) {
            return;
        }
        int i8 = 0;
        while (true) {
            int[] iArr2 = aVar.layout.mReferenceIds;
            if (i8 >= iArr2.length) {
                return;
            }
            R.e eVar = sparseArray.get(iArr2[i8]);
            if (eVar != null) {
                jVar.add(eVar);
            }
            i8++;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f8574f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f8575g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f8573e) {
            super.onMeasure(i8, i9);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void removeView(View view) {
        int i8;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.f8574f = null;
        int i9 = 0;
        while (true) {
            if (i9 >= this.f8570b) {
                break;
            }
            if (this.f8569a[i9] == id) {
                while (true) {
                    i8 = this.f8570b;
                    if (i9 >= i8 - 1) {
                        break;
                    }
                    int[] iArr = this.f8569a;
                    int i10 = i9 + 1;
                    iArr[i9] = iArr[i10];
                    i9 = i10;
                }
                this.f8569a[i8 - 1] = 0;
                this.f8570b = i8 - 1;
            } else {
                i9++;
            }
        }
        requestLayout();
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f8574f = str;
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.f8570b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i8);
            if (iIndexOf == -1) {
                a(str.substring(i8));
                return;
            } else {
                a(str.substring(i8, iIndexOf));
                i8 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f8575g = str;
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.f8570b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i8);
            if (iIndexOf == -1) {
                c(str.substring(i8));
                return;
            } else {
                c(str.substring(i8, iIndexOf));
                i8 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8574f = null;
        this.f8570b = 0;
        for (int i8 : iArr) {
            b(i8);
        }
    }

    @Override // android.view.View
    public void setTag(int i8, Object obj) {
        super.setTag(i8, obj);
        if (obj == null && this.f8574f == null) {
            b(i8);
        }
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iG;
        if (isInEditMode()) {
            setIds(this.f8574f);
        }
        R.i iVar = this.f8572d;
        if (iVar == null) {
            return;
        }
        iVar.removeAllIds();
        for (int i8 = 0; i8 < this.f8570b; i8++) {
            int i9 = this.f8569a[i8];
            View viewById = constraintLayout.getViewById(i9);
            if (viewById == null && (iG = g(constraintLayout, (str = (String) this.f8577i.get(Integer.valueOf(i9))))) != 0) {
                this.f8569a[i8] = iG;
                this.f8577i.put(Integer.valueOf(iG), str);
                viewById = constraintLayout.getViewById(iG);
            }
            if (viewById != null) {
                this.f8572d.add(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f8572d.updateConstraints(constraintLayout.f8508c);
    }

    public void validateParams() {
        if (this.f8572d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f8551t = (R.e) this.f8572d;
        }
    }

    public b(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f8569a = new int[32];
        this.f8573e = false;
        this.f8576h = null;
        this.f8577i = new HashMap();
        this.f8571c = context;
        j(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i8) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i8);
        this.f8569a = new int[32];
        this.f8573e = false;
        this.f8576h = null;
        this.f8577i = new HashMap();
        this.f8571c = context;
        j(attributeSet);
    }

    public void updatePreLayout(R.f fVar, R.i iVar, SparseArray<R.e> sparseArray) {
        iVar.removeAllIds();
        for (int i8 = 0; i8 < this.f8570b; i8++) {
            iVar.add(sparseArray.get(this.f8569a[i8]));
        }
    }

    public void resolveRtl(R.e eVar, boolean z8) {
    }
}
