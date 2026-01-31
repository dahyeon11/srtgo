package androidx.constraintlayout.widget;

import Q7.X;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.e;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.kakao.sdk.user.Constants;
import io.grpc.internal.U;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;
import s4.z;
import s7.x;
import y1.C6521b;

/* loaded from: classes.dex */
public class d {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int END = 7;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_GUIDELINE = 0;
    public static final int INVISIBLE = 4;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GUIDELINE = 1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: e */
    private static final int[] f8595e = {0, 4, 8};

    /* renamed from: f */
    private static SparseIntArray f8596f;

    /* renamed from: a */
    private boolean f8597a;

    /* renamed from: b */
    private HashMap f8598b = new HashMap();

    /* renamed from: c */
    private boolean f8599c = true;

    /* renamed from: d */
    private HashMap f8600d = new HashMap();

    public static class a {

        /* renamed from: a */
        int f8601a;
        public final C0126d propertySet = new C0126d();
        public final c motion = new c();
        public final b layout = new b();
        public final e transform = new e();
        public HashMap<String, androidx.constraintlayout.widget.a> mCustomConstraints = new HashMap<>();

        public void h(int i8, ConstraintLayout.b bVar) {
            this.f8601a = i8;
            b bVar2 = this.layout;
            bVar2.leftToLeft = bVar.leftToLeft;
            bVar2.leftToRight = bVar.leftToRight;
            bVar2.rightToLeft = bVar.rightToLeft;
            bVar2.rightToRight = bVar.rightToRight;
            bVar2.topToTop = bVar.topToTop;
            bVar2.topToBottom = bVar.topToBottom;
            bVar2.bottomToTop = bVar.bottomToTop;
            bVar2.bottomToBottom = bVar.bottomToBottom;
            bVar2.baselineToBaseline = bVar.baselineToBaseline;
            bVar2.startToEnd = bVar.startToEnd;
            bVar2.startToStart = bVar.startToStart;
            bVar2.endToStart = bVar.endToStart;
            bVar2.endToEnd = bVar.endToEnd;
            bVar2.horizontalBias = bVar.horizontalBias;
            bVar2.verticalBias = bVar.verticalBias;
            bVar2.dimensionRatio = bVar.dimensionRatio;
            bVar2.circleConstraint = bVar.circleConstraint;
            bVar2.circleRadius = bVar.circleRadius;
            bVar2.circleAngle = bVar.circleAngle;
            bVar2.editorAbsoluteX = bVar.editorAbsoluteX;
            bVar2.editorAbsoluteY = bVar.editorAbsoluteY;
            bVar2.orientation = bVar.orientation;
            bVar2.guidePercent = bVar.guidePercent;
            bVar2.guideBegin = bVar.guideBegin;
            bVar2.guideEnd = bVar.guideEnd;
            bVar2.mWidth = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.mHeight = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.leftMargin = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.rightMargin = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.topMargin = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.bottomMargin = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.verticalWeight = bVar.verticalWeight;
            bVar2.horizontalWeight = bVar.horizontalWeight;
            bVar2.verticalChainStyle = bVar.verticalChainStyle;
            bVar2.horizontalChainStyle = bVar.horizontalChainStyle;
            bVar2.constrainedWidth = bVar.constrainedWidth;
            bVar2.constrainedHeight = bVar.constrainedHeight;
            bVar2.widthDefault = bVar.matchConstraintDefaultWidth;
            bVar2.heightDefault = bVar.matchConstraintDefaultHeight;
            bVar2.widthMax = bVar.matchConstraintMaxWidth;
            bVar2.heightMax = bVar.matchConstraintMaxHeight;
            bVar2.widthMin = bVar.matchConstraintMinWidth;
            bVar2.heightMin = bVar.matchConstraintMinHeight;
            bVar2.widthPercent = bVar.matchConstraintPercentWidth;
            bVar2.heightPercent = bVar.matchConstraintPercentHeight;
            bVar2.mConstraintTag = bVar.constraintTag;
            bVar2.goneTopMargin = bVar.goneTopMargin;
            bVar2.goneBottomMargin = bVar.goneBottomMargin;
            bVar2.goneLeftMargin = bVar.goneLeftMargin;
            bVar2.goneRightMargin = bVar.goneRightMargin;
            bVar2.goneStartMargin = bVar.goneStartMargin;
            bVar2.goneEndMargin = bVar.goneEndMargin;
            bVar2.endMargin = bVar.getMarginEnd();
            this.layout.startMargin = bVar.getMarginStart();
        }

        public void i(int i8, e.a aVar) {
            h(i8, aVar);
            this.propertySet.alpha = aVar.alpha;
            e eVar = this.transform;
            eVar.rotation = aVar.rotation;
            eVar.rotationX = aVar.rotationX;
            eVar.rotationY = aVar.rotationY;
            eVar.scaleX = aVar.scaleX;
            eVar.scaleY = aVar.scaleY;
            eVar.transformPivotX = aVar.transformPivotX;
            eVar.transformPivotY = aVar.transformPivotY;
            eVar.translationX = aVar.translationX;
            eVar.translationY = aVar.translationY;
            eVar.translationZ = aVar.translationZ;
            eVar.elevation = aVar.elevation;
            eVar.applyElevation = aVar.applyElevation;
        }

        public void j(androidx.constraintlayout.widget.b bVar, int i8, e.a aVar) {
            i(i8, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.layout;
                bVar2.mHelperType = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        private androidx.constraintlayout.widget.a k(String str, a.b bVar) {
            if (!this.mCustomConstraints.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(str, bVar);
                this.mCustomConstraints.put(str, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.mCustomConstraints.get(str);
            if (aVar2.getType() == bVar) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.getType().name());
        }

        public void l(String str, int i8) {
            k(str, a.b.COLOR_TYPE).setColorValue(i8);
        }

        public void m(String str, float f8) {
            k(str, a.b.FLOAT_TYPE).setFloatValue(f8);
        }

        public void n(String str, int i8) {
            k(str, a.b.INT_TYPE).setIntValue(i8);
        }

        public void o(String str, String str2) {
            k(str, a.b.STRING_TYPE).setStringValue(str2);
        }

        public void applyTo(ConstraintLayout.b bVar) {
            b bVar2 = this.layout;
            bVar.leftToLeft = bVar2.leftToLeft;
            bVar.leftToRight = bVar2.leftToRight;
            bVar.rightToLeft = bVar2.rightToLeft;
            bVar.rightToRight = bVar2.rightToRight;
            bVar.topToTop = bVar2.topToTop;
            bVar.topToBottom = bVar2.topToBottom;
            bVar.bottomToTop = bVar2.bottomToTop;
            bVar.bottomToBottom = bVar2.bottomToBottom;
            bVar.baselineToBaseline = bVar2.baselineToBaseline;
            bVar.startToEnd = bVar2.startToEnd;
            bVar.startToStart = bVar2.startToStart;
            bVar.endToStart = bVar2.endToStart;
            bVar.endToEnd = bVar2.endToEnd;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.leftMargin;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.rightMargin;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.topMargin;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.bottomMargin;
            bVar.goneStartMargin = bVar2.goneStartMargin;
            bVar.goneEndMargin = bVar2.goneEndMargin;
            bVar.goneTopMargin = bVar2.goneTopMargin;
            bVar.goneBottomMargin = bVar2.goneBottomMargin;
            bVar.horizontalBias = bVar2.horizontalBias;
            bVar.verticalBias = bVar2.verticalBias;
            bVar.circleConstraint = bVar2.circleConstraint;
            bVar.circleRadius = bVar2.circleRadius;
            bVar.circleAngle = bVar2.circleAngle;
            bVar.dimensionRatio = bVar2.dimensionRatio;
            bVar.editorAbsoluteX = bVar2.editorAbsoluteX;
            bVar.editorAbsoluteY = bVar2.editorAbsoluteY;
            bVar.verticalWeight = bVar2.verticalWeight;
            bVar.horizontalWeight = bVar2.horizontalWeight;
            bVar.verticalChainStyle = bVar2.verticalChainStyle;
            bVar.horizontalChainStyle = bVar2.horizontalChainStyle;
            bVar.constrainedWidth = bVar2.constrainedWidth;
            bVar.constrainedHeight = bVar2.constrainedHeight;
            bVar.matchConstraintDefaultWidth = bVar2.widthDefault;
            bVar.matchConstraintDefaultHeight = bVar2.heightDefault;
            bVar.matchConstraintMaxWidth = bVar2.widthMax;
            bVar.matchConstraintMaxHeight = bVar2.heightMax;
            bVar.matchConstraintMinWidth = bVar2.widthMin;
            bVar.matchConstraintMinHeight = bVar2.heightMin;
            bVar.matchConstraintPercentWidth = bVar2.widthPercent;
            bVar.matchConstraintPercentHeight = bVar2.heightPercent;
            bVar.orientation = bVar2.orientation;
            bVar.guidePercent = bVar2.guidePercent;
            bVar.guideBegin = bVar2.guideBegin;
            bVar.guideEnd = bVar2.guideEnd;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.mWidth;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.mHeight;
            String str = bVar2.mConstraintTag;
            if (str != null) {
                bVar.constraintTag = str;
            }
            bVar.setMarginStart(bVar2.startMargin);
            bVar.setMarginEnd(this.layout.endMargin);
            bVar.validate();
        }

        /* renamed from: clone */
        public a m389clone() {
            a aVar = new a();
            aVar.layout.copyFrom(this.layout);
            aVar.motion.copyFrom(this.motion);
            aVar.propertySet.copyFrom(this.propertySet);
            aVar.transform.copyFrom(this.transform);
            aVar.f8601a = this.f8601a;
            return aVar;
        }
    }

    public static class b {
        public static final int UNSET = -1;

        /* renamed from: a */
        private static SparseIntArray f8602a;
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = -1;
        public int rightMargin = -1;
        public int topMargin = -1;
        public int bottomMargin = -1;
        public int endMargin = -1;
        public int startMargin = -1;
        public int goneLeftMargin = -1;
        public int goneTopMargin = -1;
        public int goneRightMargin = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneStartMargin = -1;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = -1;
        public int heightMax = -1;
        public int widthMin = -1;
        public int heightMin = -1;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8602a = sparseIntArray;
            sparseIntArray.append(i.Layout_layout_constraintLeft_toLeftOf, 24);
            f8602a.append(i.Layout_layout_constraintLeft_toRightOf, 25);
            f8602a.append(i.Layout_layout_constraintRight_toLeftOf, 28);
            f8602a.append(i.Layout_layout_constraintRight_toRightOf, 29);
            f8602a.append(i.Layout_layout_constraintTop_toTopOf, 35);
            f8602a.append(i.Layout_layout_constraintTop_toBottomOf, 34);
            f8602a.append(i.Layout_layout_constraintBottom_toTopOf, 4);
            f8602a.append(i.Layout_layout_constraintBottom_toBottomOf, 3);
            f8602a.append(i.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f8602a.append(i.Layout_layout_editor_absoluteX, 6);
            f8602a.append(i.Layout_layout_editor_absoluteY, 7);
            f8602a.append(i.Layout_layout_constraintGuide_begin, 17);
            f8602a.append(i.Layout_layout_constraintGuide_end, 18);
            f8602a.append(i.Layout_layout_constraintGuide_percent, 19);
            f8602a.append(i.Layout_android_orientation, 26);
            f8602a.append(i.Layout_layout_constraintStart_toEndOf, 31);
            f8602a.append(i.Layout_layout_constraintStart_toStartOf, 32);
            f8602a.append(i.Layout_layout_constraintEnd_toStartOf, 10);
            f8602a.append(i.Layout_layout_constraintEnd_toEndOf, 9);
            f8602a.append(i.Layout_layout_goneMarginLeft, 13);
            f8602a.append(i.Layout_layout_goneMarginTop, 16);
            f8602a.append(i.Layout_layout_goneMarginRight, 14);
            f8602a.append(i.Layout_layout_goneMarginBottom, 11);
            f8602a.append(i.Layout_layout_goneMarginStart, 15);
            f8602a.append(i.Layout_layout_goneMarginEnd, 12);
            f8602a.append(i.Layout_layout_constraintVertical_weight, 38);
            f8602a.append(i.Layout_layout_constraintHorizontal_weight, 37);
            f8602a.append(i.Layout_layout_constraintHorizontal_chainStyle, 39);
            f8602a.append(i.Layout_layout_constraintVertical_chainStyle, 40);
            f8602a.append(i.Layout_layout_constraintHorizontal_bias, 20);
            f8602a.append(i.Layout_layout_constraintVertical_bias, 36);
            f8602a.append(i.Layout_layout_constraintDimensionRatio, 5);
            f8602a.append(i.Layout_layout_constraintLeft_creator, 76);
            f8602a.append(i.Layout_layout_constraintTop_creator, 76);
            f8602a.append(i.Layout_layout_constraintRight_creator, 76);
            f8602a.append(i.Layout_layout_constraintBottom_creator, 76);
            f8602a.append(i.Layout_layout_constraintBaseline_creator, 76);
            f8602a.append(i.Layout_android_layout_marginLeft, 23);
            f8602a.append(i.Layout_android_layout_marginRight, 27);
            f8602a.append(i.Layout_android_layout_marginStart, 30);
            f8602a.append(i.Layout_android_layout_marginEnd, 8);
            f8602a.append(i.Layout_android_layout_marginTop, 33);
            f8602a.append(i.Layout_android_layout_marginBottom, 2);
            f8602a.append(i.Layout_android_layout_width, 22);
            f8602a.append(i.Layout_android_layout_height, 21);
            f8602a.append(i.Layout_layout_constraintCircle, 61);
            f8602a.append(i.Layout_layout_constraintCircleRadius, 62);
            f8602a.append(i.Layout_layout_constraintCircleAngle, 63);
            f8602a.append(i.Layout_layout_constraintWidth_percent, 69);
            f8602a.append(i.Layout_layout_constraintHeight_percent, 70);
            f8602a.append(i.Layout_chainUseRtl, 71);
            f8602a.append(i.Layout_barrierDirection, 72);
            f8602a.append(i.Layout_barrierMargin, 73);
            f8602a.append(i.Layout_constraint_referenced_ids, 74);
            f8602a.append(i.Layout_barrierAllowsGoneWidgets, 75);
        }

        void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Layout);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                int i9 = f8602a.get(index);
                if (i9 == 80) {
                    this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                } else if (i9 != 81) {
                    switch (i9) {
                        case 1:
                            this.baselineToBaseline = d.i(typedArrayObtainStyledAttributes, index, this.baselineToBaseline);
                            break;
                        case 2:
                            this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                            break;
                        case 3:
                            this.bottomToBottom = d.i(typedArrayObtainStyledAttributes, index, this.bottomToBottom);
                            break;
                        case 4:
                            this.bottomToTop = d.i(typedArrayObtainStyledAttributes, index, this.bottomToTop);
                            break;
                        case 5:
                            this.dimensionRatio = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                            break;
                        case 7:
                            this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                            break;
                        case 8:
                            this.endMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                            break;
                        case 9:
                            this.endToEnd = d.i(typedArrayObtainStyledAttributes, index, this.endToEnd);
                            break;
                        case 10:
                            this.endToStart = d.i(typedArrayObtainStyledAttributes, index, this.endToStart);
                            break;
                        case 11:
                            this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                            break;
                        case 12:
                            this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                            break;
                        case 13:
                            this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                            break;
                        case 14:
                            this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                            break;
                        case 15:
                            this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                            break;
                        case 16:
                            this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                            break;
                        case 17:
                            this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                            break;
                        case 18:
                            this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                            break;
                        case 19:
                            this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                            break;
                        case 20:
                            this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                            break;
                        case 21:
                            this.mHeight = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                            break;
                        case 22:
                            this.mWidth = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                            break;
                        case 23:
                            this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                            break;
                        case 24:
                            this.leftToLeft = d.i(typedArrayObtainStyledAttributes, index, this.leftToLeft);
                            break;
                        case 25:
                            this.leftToRight = d.i(typedArrayObtainStyledAttributes, index, this.leftToRight);
                            break;
                        case 26:
                            this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                            break;
                        case 27:
                            this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                            break;
                        case 28:
                            this.rightToLeft = d.i(typedArrayObtainStyledAttributes, index, this.rightToLeft);
                            break;
                        case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            this.rightToRight = d.i(typedArrayObtainStyledAttributes, index, this.rightToRight);
                            break;
                        case 30:
                            this.startMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                            break;
                        case 31:
                            this.startToEnd = d.i(typedArrayObtainStyledAttributes, index, this.startToEnd);
                            break;
                        case 32:
                            this.startToStart = d.i(typedArrayObtainStyledAttributes, index, this.startToStart);
                            break;
                        case 33:
                            this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                            break;
                        case 34:
                            this.topToBottom = d.i(typedArrayObtainStyledAttributes, index, this.topToBottom);
                            break;
                        case 35:
                            this.topToTop = d.i(typedArrayObtainStyledAttributes, index, this.topToTop);
                            break;
                        case 36:
                            this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                            break;
                        case 37:
                            this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                            break;
                        case 38:
                            this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                            break;
                        case 39:
                            this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                            break;
                        case 40:
                            this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.verticalChainStyle);
                            break;
                        default:
                            switch (i9) {
                                case 54:
                                    this.widthDefault = typedArrayObtainStyledAttributes.getInt(index, this.widthDefault);
                                    break;
                                case z.PUSH_TYPE_DEPARTURE /* 55 */:
                                    this.heightDefault = typedArrayObtainStyledAttributes.getInt(index, this.heightDefault);
                                    break;
                                case 56:
                                    this.widthMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                    break;
                                case 57:
                                    this.heightMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                    break;
                                case 58:
                                    this.widthMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                    break;
                                case 59:
                                    this.heightMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                    break;
                                default:
                                    switch (i9) {
                                        case x.CLOSED_SHIFT /* 61 */:
                                            this.circleConstraint = d.i(typedArrayObtainStyledAttributes, index, this.circleConstraint);
                                            break;
                                        case 62:
                                            this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                            break;
                                        case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                                            this.circleAngle = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle);
                                            break;
                                        default:
                                            switch (i9) {
                                                case 69:
                                                    this.widthPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.heightPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.mBarrierDirection = typedArrayObtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                                    break;
                                                case 73:
                                                    this.mBarrierMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                                    break;
                                                case 74:
                                                    this.mReferenceIdString = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.mBarrierAllowsGoneWidgets = typedArrayObtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8602a.get(index));
                                                    break;
                                                case 77:
                                                    this.mConstraintTag = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8602a.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(b bVar) {
            this.mIsGuideline = bVar.mIsGuideline;
            this.mWidth = bVar.mWidth;
            this.mApply = bVar.mApply;
            this.mHeight = bVar.mHeight;
            this.guideBegin = bVar.guideBegin;
            this.guideEnd = bVar.guideEnd;
            this.guidePercent = bVar.guidePercent;
            this.leftToLeft = bVar.leftToLeft;
            this.leftToRight = bVar.leftToRight;
            this.rightToLeft = bVar.rightToLeft;
            this.rightToRight = bVar.rightToRight;
            this.topToTop = bVar.topToTop;
            this.topToBottom = bVar.topToBottom;
            this.bottomToTop = bVar.bottomToTop;
            this.bottomToBottom = bVar.bottomToBottom;
            this.baselineToBaseline = bVar.baselineToBaseline;
            this.startToEnd = bVar.startToEnd;
            this.startToStart = bVar.startToStart;
            this.endToStart = bVar.endToStart;
            this.endToEnd = bVar.endToEnd;
            this.horizontalBias = bVar.horizontalBias;
            this.verticalBias = bVar.verticalBias;
            this.dimensionRatio = bVar.dimensionRatio;
            this.circleConstraint = bVar.circleConstraint;
            this.circleRadius = bVar.circleRadius;
            this.circleAngle = bVar.circleAngle;
            this.editorAbsoluteX = bVar.editorAbsoluteX;
            this.editorAbsoluteY = bVar.editorAbsoluteY;
            this.orientation = bVar.orientation;
            this.leftMargin = bVar.leftMargin;
            this.rightMargin = bVar.rightMargin;
            this.topMargin = bVar.topMargin;
            this.bottomMargin = bVar.bottomMargin;
            this.endMargin = bVar.endMargin;
            this.startMargin = bVar.startMargin;
            this.goneLeftMargin = bVar.goneLeftMargin;
            this.goneTopMargin = bVar.goneTopMargin;
            this.goneRightMargin = bVar.goneRightMargin;
            this.goneBottomMargin = bVar.goneBottomMargin;
            this.goneEndMargin = bVar.goneEndMargin;
            this.goneStartMargin = bVar.goneStartMargin;
            this.verticalWeight = bVar.verticalWeight;
            this.horizontalWeight = bVar.horizontalWeight;
            this.horizontalChainStyle = bVar.horizontalChainStyle;
            this.verticalChainStyle = bVar.verticalChainStyle;
            this.widthDefault = bVar.widthDefault;
            this.heightDefault = bVar.heightDefault;
            this.widthMax = bVar.widthMax;
            this.heightMax = bVar.heightMax;
            this.widthMin = bVar.widthMin;
            this.heightMin = bVar.heightMin;
            this.widthPercent = bVar.widthPercent;
            this.heightPercent = bVar.heightPercent;
            this.mBarrierDirection = bVar.mBarrierDirection;
            this.mBarrierMargin = bVar.mBarrierMargin;
            this.mHelperType = bVar.mHelperType;
            this.mConstraintTag = bVar.mConstraintTag;
            int[] iArr = bVar.mReferenceIds;
            if (iArr != null) {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.mReferenceIds = null;
            }
            this.mReferenceIdString = bVar.mReferenceIdString;
            this.constrainedWidth = bVar.constrainedWidth;
            this.constrainedHeight = bVar.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = bVar.mBarrierAllowsGoneWidgets;
        }

        public void dump(t tVar, StringBuilder sb) throws IllegalAccessException, IllegalArgumentException {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append(X.LF);
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objLookUpConstraintName = tVar.lookUpConstraintName(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(objLookUpConstraintName == null ? num : objLookUpConstraintName);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f8 = (Float) obj;
                            if (f8.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f8);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }

    public static class c {

        /* renamed from: a */
        private static SparseIntArray f8603a;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public float mPathRotate = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8603a = sparseIntArray;
            sparseIntArray.append(i.Motion_motionPathRotate, 1);
            f8603a.append(i.Motion_pathMotionArc, 2);
            f8603a.append(i.Motion_transitionEasing, 3);
            f8603a.append(i.Motion_drawPath, 4);
            f8603a.append(i.Motion_animate_relativeTo, 5);
            f8603a.append(i.Motion_motionStagger, 6);
        }

        void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Motion);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                switch (f8603a.get(index)) {
                    case 1:
                        this.mPathRotate = typedArrayObtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.mTransitionEasing = P.c.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.mDrawPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = d.i(typedArrayObtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mMotionStagger = typedArrayObtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(c cVar) {
            this.mApply = cVar.mApply;
            this.mAnimateRelativeTo = cVar.mAnimateRelativeTo;
            this.mTransitionEasing = cVar.mTransitionEasing;
            this.mPathMotionArc = cVar.mPathMotionArc;
            this.mDrawPath = cVar.mDrawPath;
            this.mPathRotate = cVar.mPathRotate;
            this.mMotionStagger = cVar.mMotionStagger;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    public static class C0126d {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.PropertySet);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.PropertySet_android_alpha) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == i.PropertySet_android_visibility) {
                    this.visibility = typedArrayObtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = d.f8595e[this.visibility];
                } else if (index == i.PropertySet_visibilityMode) {
                    this.mVisibilityMode = typedArrayObtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == i.PropertySet_motionProgress) {
                    this.mProgress = typedArrayObtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(C0126d c0126d) {
            this.mApply = c0126d.mApply;
            this.visibility = c0126d.visibility;
            this.alpha = c0126d.alpha;
            this.mProgress = c0126d.mProgress;
            this.mVisibilityMode = c0126d.mVisibilityMode;
        }
    }

    public static class e {

        /* renamed from: a */
        private static SparseIntArray f8604a;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8604a = sparseIntArray;
            sparseIntArray.append(i.Transform_android_rotation, 1);
            f8604a.append(i.Transform_android_rotationX, 2);
            f8604a.append(i.Transform_android_rotationY, 3);
            f8604a.append(i.Transform_android_scaleX, 4);
            f8604a.append(i.Transform_android_scaleY, 5);
            f8604a.append(i.Transform_android_transformPivotX, 6);
            f8604a.append(i.Transform_android_transformPivotY, 7);
            f8604a.append(i.Transform_android_translationX, 8);
            f8604a.append(i.Transform_android_translationY, 9);
            f8604a.append(i.Transform_android_translationZ, 10);
            f8604a.append(i.Transform_android_elevation, 11);
        }

        void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Transform);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                switch (f8604a.get(index)) {
                    case 1:
                        this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = typedArrayObtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = typedArrayObtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = typedArrayObtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = typedArrayObtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(e eVar) {
            this.mApply = eVar.mApply;
            this.rotation = eVar.rotation;
            this.rotationX = eVar.rotationX;
            this.rotationY = eVar.rotationY;
            this.scaleX = eVar.scaleX;
            this.scaleY = eVar.scaleY;
            this.transformPivotX = eVar.transformPivotX;
            this.transformPivotY = eVar.transformPivotY;
            this.translationX = eVar.translationX;
            this.translationY = eVar.translationY;
            this.translationZ = eVar.translationZ;
            this.applyElevation = eVar.applyElevation;
            this.elevation = eVar.elevation;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8596f = sparseIntArray;
        sparseIntArray.append(i.Constraint_layout_constraintLeft_toLeftOf, 25);
        f8596f.append(i.Constraint_layout_constraintLeft_toRightOf, 26);
        f8596f.append(i.Constraint_layout_constraintRight_toLeftOf, 29);
        f8596f.append(i.Constraint_layout_constraintRight_toRightOf, 30);
        f8596f.append(i.Constraint_layout_constraintTop_toTopOf, 36);
        f8596f.append(i.Constraint_layout_constraintTop_toBottomOf, 35);
        f8596f.append(i.Constraint_layout_constraintBottom_toTopOf, 4);
        f8596f.append(i.Constraint_layout_constraintBottom_toBottomOf, 3);
        f8596f.append(i.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f8596f.append(i.Constraint_layout_editor_absoluteX, 6);
        f8596f.append(i.Constraint_layout_editor_absoluteY, 7);
        f8596f.append(i.Constraint_layout_constraintGuide_begin, 17);
        f8596f.append(i.Constraint_layout_constraintGuide_end, 18);
        f8596f.append(i.Constraint_layout_constraintGuide_percent, 19);
        f8596f.append(i.Constraint_android_orientation, 27);
        f8596f.append(i.Constraint_layout_constraintStart_toEndOf, 32);
        f8596f.append(i.Constraint_layout_constraintStart_toStartOf, 33);
        f8596f.append(i.Constraint_layout_constraintEnd_toStartOf, 10);
        f8596f.append(i.Constraint_layout_constraintEnd_toEndOf, 9);
        f8596f.append(i.Constraint_layout_goneMarginLeft, 13);
        f8596f.append(i.Constraint_layout_goneMarginTop, 16);
        f8596f.append(i.Constraint_layout_goneMarginRight, 14);
        f8596f.append(i.Constraint_layout_goneMarginBottom, 11);
        f8596f.append(i.Constraint_layout_goneMarginStart, 15);
        f8596f.append(i.Constraint_layout_goneMarginEnd, 12);
        f8596f.append(i.Constraint_layout_constraintVertical_weight, 40);
        f8596f.append(i.Constraint_layout_constraintHorizontal_weight, 39);
        f8596f.append(i.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f8596f.append(i.Constraint_layout_constraintVertical_chainStyle, 42);
        f8596f.append(i.Constraint_layout_constraintHorizontal_bias, 20);
        f8596f.append(i.Constraint_layout_constraintVertical_bias, 37);
        f8596f.append(i.Constraint_layout_constraintDimensionRatio, 5);
        f8596f.append(i.Constraint_layout_constraintLeft_creator, 82);
        f8596f.append(i.Constraint_layout_constraintTop_creator, 82);
        f8596f.append(i.Constraint_layout_constraintRight_creator, 82);
        f8596f.append(i.Constraint_layout_constraintBottom_creator, 82);
        f8596f.append(i.Constraint_layout_constraintBaseline_creator, 82);
        f8596f.append(i.Constraint_android_layout_marginLeft, 24);
        f8596f.append(i.Constraint_android_layout_marginRight, 28);
        f8596f.append(i.Constraint_android_layout_marginStart, 31);
        f8596f.append(i.Constraint_android_layout_marginEnd, 8);
        f8596f.append(i.Constraint_android_layout_marginTop, 34);
        f8596f.append(i.Constraint_android_layout_marginBottom, 2);
        f8596f.append(i.Constraint_android_layout_width, 23);
        f8596f.append(i.Constraint_android_layout_height, 21);
        f8596f.append(i.Constraint_android_visibility, 22);
        f8596f.append(i.Constraint_android_alpha, 43);
        f8596f.append(i.Constraint_android_elevation, 44);
        f8596f.append(i.Constraint_android_rotationX, 45);
        f8596f.append(i.Constraint_android_rotationY, 46);
        f8596f.append(i.Constraint_android_rotation, 60);
        f8596f.append(i.Constraint_android_scaleX, 47);
        f8596f.append(i.Constraint_android_scaleY, 48);
        f8596f.append(i.Constraint_android_transformPivotX, 49);
        f8596f.append(i.Constraint_android_transformPivotY, 50);
        f8596f.append(i.Constraint_android_translationX, 51);
        f8596f.append(i.Constraint_android_translationY, 52);
        f8596f.append(i.Constraint_android_translationZ, 53);
        f8596f.append(i.Constraint_layout_constraintWidth_default, 54);
        f8596f.append(i.Constraint_layout_constraintHeight_default, 55);
        f8596f.append(i.Constraint_layout_constraintWidth_max, 56);
        f8596f.append(i.Constraint_layout_constraintHeight_max, 57);
        f8596f.append(i.Constraint_layout_constraintWidth_min, 58);
        f8596f.append(i.Constraint_layout_constraintHeight_min, 59);
        f8596f.append(i.Constraint_layout_constraintCircle, 61);
        f8596f.append(i.Constraint_layout_constraintCircleRadius, 62);
        f8596f.append(i.Constraint_layout_constraintCircleAngle, 63);
        f8596f.append(i.Constraint_animate_relativeTo, 64);
        f8596f.append(i.Constraint_transitionEasing, 65);
        f8596f.append(i.Constraint_drawPath, 66);
        f8596f.append(i.Constraint_transitionPathRotate, 67);
        f8596f.append(i.Constraint_motionStagger, 79);
        f8596f.append(i.Constraint_android_id, 38);
        f8596f.append(i.Constraint_motionProgress, 68);
        f8596f.append(i.Constraint_layout_constraintWidth_percent, 69);
        f8596f.append(i.Constraint_layout_constraintHeight_percent, 70);
        f8596f.append(i.Constraint_chainUseRtl, 71);
        f8596f.append(i.Constraint_barrierDirection, 72);
        f8596f.append(i.Constraint_barrierMargin, 73);
        f8596f.append(i.Constraint_constraint_referenced_ids, 74);
        f8596f.append(i.Constraint_barrierAllowsGoneWidgets, 75);
        f8596f.append(i.Constraint_pathMotionArc, 76);
        f8596f.append(i.Constraint_layout_constraintTag, 77);
        f8596f.append(i.Constraint_visibilityMode, 78);
        f8596f.append(i.Constraint_layout_constrainedWidth, 80);
        f8596f.append(i.Constraint_layout_constrainedHeight, 81);
    }

    private void c(a.b bVar, String... strArr) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (this.f8598b.containsKey(strArr[i8])) {
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8598b.get(strArr[i8]);
                if (aVar.getType() != bVar) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.getType().name());
                }
            } else {
                this.f8598b.put(strArr[i8], new androidx.constraintlayout.widget.a(strArr[i8], bVar));
            }
        }
    }

    private int[] e(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < strArrSplit.length) {
            String strTrim = strArrSplit[i8].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, Constants.ID, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i9] = iIntValue;
            i8++;
            i9++;
        }
        return i9 != strArrSplit.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    private void f(int i8, int i9, int i10, int i11, int[] iArr, float[] fArr, int i12, int i13, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            h(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        h(iArr[0]).layout.horizontalChainStyle = i12;
        connect(iArr[0], i13, i8, i9, -1);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            connect(iArr[i15], i13, iArr[i16], i14, -1);
            connect(iArr[i16], i14, iArr[i15], i13, -1);
            if (fArr != null) {
                h(iArr[i15]).layout.horizontalWeight = fArr[i15];
            }
        }
        connect(iArr[iArr.length - 1], i14, i10, i11, -1);
    }

    private a g(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Constraint);
        j(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a h(int i8) {
        if (!this.f8600d.containsKey(Integer.valueOf(i8))) {
            this.f8600d.put(Integer.valueOf(i8), new a());
        }
        return (a) this.f8600d.get(Integer.valueOf(i8));
    }

    public static int i(TypedArray typedArray, int i8, int i9) {
        int resourceId = typedArray.getResourceId(i8, i9);
        return resourceId == -1 ? typedArray.getInt(i8, -1) : resourceId;
    }

    private void j(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArray.getIndex(i8);
            if (index != i.Constraint_android_id && i.Constraint_android_layout_marginStart != index && i.Constraint_android_layout_marginEnd != index) {
                aVar.motion.mApply = true;
                aVar.layout.mApply = true;
                aVar.propertySet.mApply = true;
                aVar.transform.mApply = true;
            }
            switch (f8596f.get(index)) {
                case 1:
                    b bVar = aVar.layout;
                    bVar.baselineToBaseline = i(typedArray, index, bVar.baselineToBaseline);
                    break;
                case 2:
                    b bVar2 = aVar.layout;
                    bVar2.bottomMargin = typedArray.getDimensionPixelSize(index, bVar2.bottomMargin);
                    break;
                case 3:
                    b bVar3 = aVar.layout;
                    bVar3.bottomToBottom = i(typedArray, index, bVar3.bottomToBottom);
                    break;
                case 4:
                    b bVar4 = aVar.layout;
                    bVar4.bottomToTop = i(typedArray, index, bVar4.bottomToTop);
                    break;
                case 5:
                    aVar.layout.dimensionRatio = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.layout;
                    bVar5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, bVar5.editorAbsoluteX);
                    break;
                case 7:
                    b bVar6 = aVar.layout;
                    bVar6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, bVar6.editorAbsoluteY);
                    break;
                case 8:
                    b bVar7 = aVar.layout;
                    bVar7.endMargin = typedArray.getDimensionPixelSize(index, bVar7.endMargin);
                    break;
                case 9:
                    b bVar8 = aVar.layout;
                    bVar8.endToEnd = i(typedArray, index, bVar8.endToEnd);
                    break;
                case 10:
                    b bVar9 = aVar.layout;
                    bVar9.endToStart = i(typedArray, index, bVar9.endToStart);
                    break;
                case 11:
                    b bVar10 = aVar.layout;
                    bVar10.goneBottomMargin = typedArray.getDimensionPixelSize(index, bVar10.goneBottomMargin);
                    break;
                case 12:
                    b bVar11 = aVar.layout;
                    bVar11.goneEndMargin = typedArray.getDimensionPixelSize(index, bVar11.goneEndMargin);
                    break;
                case 13:
                    b bVar12 = aVar.layout;
                    bVar12.goneLeftMargin = typedArray.getDimensionPixelSize(index, bVar12.goneLeftMargin);
                    break;
                case 14:
                    b bVar13 = aVar.layout;
                    bVar13.goneRightMargin = typedArray.getDimensionPixelSize(index, bVar13.goneRightMargin);
                    break;
                case 15:
                    b bVar14 = aVar.layout;
                    bVar14.goneStartMargin = typedArray.getDimensionPixelSize(index, bVar14.goneStartMargin);
                    break;
                case 16:
                    b bVar15 = aVar.layout;
                    bVar15.goneTopMargin = typedArray.getDimensionPixelSize(index, bVar15.goneTopMargin);
                    break;
                case 17:
                    b bVar16 = aVar.layout;
                    bVar16.guideBegin = typedArray.getDimensionPixelOffset(index, bVar16.guideBegin);
                    break;
                case 18:
                    b bVar17 = aVar.layout;
                    bVar17.guideEnd = typedArray.getDimensionPixelOffset(index, bVar17.guideEnd);
                    break;
                case 19:
                    b bVar18 = aVar.layout;
                    bVar18.guidePercent = typedArray.getFloat(index, bVar18.guidePercent);
                    break;
                case 20:
                    b bVar19 = aVar.layout;
                    bVar19.horizontalBias = typedArray.getFloat(index, bVar19.horizontalBias);
                    break;
                case 21:
                    b bVar20 = aVar.layout;
                    bVar20.mHeight = typedArray.getLayoutDimension(index, bVar20.mHeight);
                    break;
                case 22:
                    C0126d c0126d = aVar.propertySet;
                    c0126d.visibility = typedArray.getInt(index, c0126d.visibility);
                    C0126d c0126d2 = aVar.propertySet;
                    c0126d2.visibility = f8595e[c0126d2.visibility];
                    break;
                case 23:
                    b bVar21 = aVar.layout;
                    bVar21.mWidth = typedArray.getLayoutDimension(index, bVar21.mWidth);
                    break;
                case 24:
                    b bVar22 = aVar.layout;
                    bVar22.leftMargin = typedArray.getDimensionPixelSize(index, bVar22.leftMargin);
                    break;
                case 25:
                    b bVar23 = aVar.layout;
                    bVar23.leftToLeft = i(typedArray, index, bVar23.leftToLeft);
                    break;
                case 26:
                    b bVar24 = aVar.layout;
                    bVar24.leftToRight = i(typedArray, index, bVar24.leftToRight);
                    break;
                case 27:
                    b bVar25 = aVar.layout;
                    bVar25.orientation = typedArray.getInt(index, bVar25.orientation);
                    break;
                case 28:
                    b bVar26 = aVar.layout;
                    bVar26.rightMargin = typedArray.getDimensionPixelSize(index, bVar26.rightMargin);
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    b bVar27 = aVar.layout;
                    bVar27.rightToLeft = i(typedArray, index, bVar27.rightToLeft);
                    break;
                case 30:
                    b bVar28 = aVar.layout;
                    bVar28.rightToRight = i(typedArray, index, bVar28.rightToRight);
                    break;
                case 31:
                    b bVar29 = aVar.layout;
                    bVar29.startMargin = typedArray.getDimensionPixelSize(index, bVar29.startMargin);
                    break;
                case 32:
                    b bVar30 = aVar.layout;
                    bVar30.startToEnd = i(typedArray, index, bVar30.startToEnd);
                    break;
                case 33:
                    b bVar31 = aVar.layout;
                    bVar31.startToStart = i(typedArray, index, bVar31.startToStart);
                    break;
                case 34:
                    b bVar32 = aVar.layout;
                    bVar32.topMargin = typedArray.getDimensionPixelSize(index, bVar32.topMargin);
                    break;
                case 35:
                    b bVar33 = aVar.layout;
                    bVar33.topToBottom = i(typedArray, index, bVar33.topToBottom);
                    break;
                case 36:
                    b bVar34 = aVar.layout;
                    bVar34.topToTop = i(typedArray, index, bVar34.topToTop);
                    break;
                case 37:
                    b bVar35 = aVar.layout;
                    bVar35.verticalBias = typedArray.getFloat(index, bVar35.verticalBias);
                    break;
                case 38:
                    aVar.f8601a = typedArray.getResourceId(index, aVar.f8601a);
                    break;
                case 39:
                    b bVar36 = aVar.layout;
                    bVar36.horizontalWeight = typedArray.getFloat(index, bVar36.horizontalWeight);
                    break;
                case 40:
                    b bVar37 = aVar.layout;
                    bVar37.verticalWeight = typedArray.getFloat(index, bVar37.verticalWeight);
                    break;
                case 41:
                    b bVar38 = aVar.layout;
                    bVar38.horizontalChainStyle = typedArray.getInt(index, bVar38.horizontalChainStyle);
                    break;
                case 42:
                    b bVar39 = aVar.layout;
                    bVar39.verticalChainStyle = typedArray.getInt(index, bVar39.verticalChainStyle);
                    break;
                case 43:
                    C0126d c0126d3 = aVar.propertySet;
                    c0126d3.alpha = typedArray.getFloat(index, c0126d3.alpha);
                    break;
                case 44:
                    e eVar = aVar.transform;
                    eVar.applyElevation = true;
                    eVar.elevation = typedArray.getDimension(index, eVar.elevation);
                    break;
                case 45:
                    e eVar2 = aVar.transform;
                    eVar2.rotationX = typedArray.getFloat(index, eVar2.rotationX);
                    break;
                case 46:
                    e eVar3 = aVar.transform;
                    eVar3.rotationY = typedArray.getFloat(index, eVar3.rotationY);
                    break;
                case 47:
                    e eVar4 = aVar.transform;
                    eVar4.scaleX = typedArray.getFloat(index, eVar4.scaleX);
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    e eVar5 = aVar.transform;
                    eVar5.scaleY = typedArray.getFloat(index, eVar5.scaleY);
                    break;
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    e eVar6 = aVar.transform;
                    eVar6.transformPivotX = typedArray.getDimension(index, eVar6.transformPivotX);
                    break;
                case 50:
                    e eVar7 = aVar.transform;
                    eVar7.transformPivotY = typedArray.getDimension(index, eVar7.transformPivotY);
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    e eVar8 = aVar.transform;
                    eVar8.translationX = typedArray.getDimension(index, eVar8.translationX);
                    break;
                case 52:
                    e eVar9 = aVar.transform;
                    eVar9.translationY = typedArray.getDimension(index, eVar9.translationY);
                    break;
                case 53:
                    e eVar10 = aVar.transform;
                    eVar10.translationZ = typedArray.getDimension(index, eVar10.translationZ);
                    break;
                case 54:
                    b bVar40 = aVar.layout;
                    bVar40.widthDefault = typedArray.getInt(index, bVar40.widthDefault);
                    break;
                case z.PUSH_TYPE_DEPARTURE /* 55 */:
                    b bVar41 = aVar.layout;
                    bVar41.heightDefault = typedArray.getInt(index, bVar41.heightDefault);
                    break;
                case 56:
                    b bVar42 = aVar.layout;
                    bVar42.widthMax = typedArray.getDimensionPixelSize(index, bVar42.widthMax);
                    break;
                case 57:
                    b bVar43 = aVar.layout;
                    bVar43.heightMax = typedArray.getDimensionPixelSize(index, bVar43.heightMax);
                    break;
                case 58:
                    b bVar44 = aVar.layout;
                    bVar44.widthMin = typedArray.getDimensionPixelSize(index, bVar44.widthMin);
                    break;
                case 59:
                    b bVar45 = aVar.layout;
                    bVar45.heightMin = typedArray.getDimensionPixelSize(index, bVar45.heightMin);
                    break;
                case x.FROZEN_SHIFT /* 60 */:
                    e eVar11 = aVar.transform;
                    eVar11.rotation = typedArray.getFloat(index, eVar11.rotation);
                    break;
                case x.CLOSED_SHIFT /* 61 */:
                    b bVar46 = aVar.layout;
                    bVar46.circleConstraint = i(typedArray, index, bVar46.circleConstraint);
                    break;
                case 62:
                    b bVar47 = aVar.layout;
                    bVar47.circleRadius = typedArray.getDimensionPixelSize(index, bVar47.circleRadius);
                    break;
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                    b bVar48 = aVar.layout;
                    bVar48.circleAngle = typedArray.getFloat(index, bVar48.circleAngle);
                    break;
                case 64:
                    c cVar = aVar.motion;
                    cVar.mAnimateRelativeTo = i(typedArray, index, cVar.mAnimateRelativeTo);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.motion.mTransitionEasing = typedArray.getString(index);
                        break;
                    } else {
                        aVar.motion.mTransitionEasing = P.c.NAMED_EASING[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.motion.mDrawPath = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.motion;
                    cVar2.mPathRotate = typedArray.getFloat(index, cVar2.mPathRotate);
                    break;
                case 68:
                    C0126d c0126d4 = aVar.propertySet;
                    c0126d4.mProgress = typedArray.getFloat(index, c0126d4.mProgress);
                    break;
                case 69:
                    aVar.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.layout;
                    bVar49.mBarrierDirection = typedArray.getInt(index, bVar49.mBarrierDirection);
                    break;
                case 73:
                    b bVar50 = aVar.layout;
                    bVar50.mBarrierMargin = typedArray.getDimensionPixelSize(index, bVar50.mBarrierMargin);
                    break;
                case 74:
                    aVar.layout.mReferenceIdString = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.layout;
                    bVar51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, bVar51.mBarrierAllowsGoneWidgets);
                    break;
                case 76:
                    c cVar3 = aVar.motion;
                    cVar3.mPathMotionArc = typedArray.getInt(index, cVar3.mPathMotionArc);
                    break;
                case 77:
                    aVar.layout.mConstraintTag = typedArray.getString(index);
                    break;
                case 78:
                    C0126d c0126d5 = aVar.propertySet;
                    c0126d5.mVisibilityMode = typedArray.getInt(index, c0126d5.mVisibilityMode);
                    break;
                case 79:
                    c cVar4 = aVar.motion;
                    cVar4.mMotionStagger = typedArray.getFloat(index, cVar4.mMotionStagger);
                    break;
                case U.DEFAULT_PORT_PLAINTEXT /* 80 */:
                    b bVar52 = aVar.layout;
                    bVar52.constrainedWidth = typedArray.getBoolean(index, bVar52.constrainedWidth);
                    break;
                case 81:
                    b bVar53 = aVar.layout;
                    bVar53.constrainedHeight = typedArray.getBoolean(index, bVar53.constrainedHeight);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8596f.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8596f.get(index));
                    break;
            }
        }
    }

    private String k(int i8) {
        switch (i8) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return C6521b.UNDEFINED_DOMAIN;
        }
    }

    private static String[] l(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        boolean z8 = false;
        for (int i9 = 0; i9 < charArray.length; i9++) {
            char c9 = charArray[i9];
            if (c9 == ',' && !z8) {
                arrayList.add(new String(charArray, i8, i9 - i8));
                i8 = i9 + 1;
            } else if (c9 == '\"') {
                z8 = !z8;
            }
        }
        arrayList.add(new String(charArray, i8, charArray.length - i8));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void addColorAttributes(String... strArr) {
        c(a.b.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        c(a.b.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        c(a.b.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        c(a.b.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i8, int i9, int i10) {
        connect(i8, 1, i9, i9 == 0 ? 1 : 2, 0);
        connect(i8, 2, i10, i10 == 0 ? 2 : 1, 0);
        if (i9 != 0) {
            connect(i9, 2, i8, 1, 0);
        }
        if (i10 != 0) {
            connect(i10, 1, i8, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i8, int i9, int i10) {
        connect(i8, 6, i9, i9 == 0 ? 6 : 7, 0);
        connect(i8, 7, i10, i10 == 0 ? 7 : 6, 0);
        if (i9 != 0) {
            connect(i9, 7, i8, 6, 0);
        }
        if (i10 != 0) {
            connect(i10, 6, i8, 7, 0);
        }
    }

    public void addToVerticalChain(int i8, int i9, int i10) {
        connect(i8, 3, i9, i9 == 0 ? 3 : 4, 0);
        connect(i8, 4, i10, i10 == 0 ? 4 : 3, 0);
        if (i9 != 0) {
            connect(i9, 4, i8, 3, 0);
        }
        if (i10 != 0) {
            connect(i10, 3, i8, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            int id = childAt.getId();
            if (!this.f8600d.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(androidx.constraintlayout.motion.widget.b.getName(childAt));
            } else {
                if (this.f8599c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f8600d.containsKey(Integer.valueOf(id))) {
                    androidx.constraintlayout.widget.a.setAttributes(childAt, ((a) this.f8600d.get(Integer.valueOf(id))).mCustomConstraints);
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(androidx.constraintlayout.widget.b bVar, R.e eVar, ConstraintLayout.b bVar2, SparseArray<R.e> sparseArray) {
        int id = bVar.getId();
        if (this.f8600d.containsKey(Integer.valueOf(id))) {
            a aVar = (a) this.f8600d.get(Integer.valueOf(id));
            if (eVar instanceof R.j) {
                bVar.loadParameters(aVar, (R.j) eVar, bVar2, sparseArray);
            }
        }
    }

    public void applyToLayoutParams(int i8, ConstraintLayout.b bVar) {
        if (this.f8600d.containsKey(Integer.valueOf(i8))) {
            ((a) this.f8600d.get(Integer.valueOf(i8))).applyTo(bVar);
        }
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        d(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void center(int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f8) {
        if (i11 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f8 <= 0.0f || f8 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i10 == 1 || i10 == 2) {
            connect(i8, 1, i9, i10, i11);
            connect(i8, 2, i12, i13, i14);
            ((a) this.f8600d.get(Integer.valueOf(i8))).layout.horizontalBias = f8;
        } else if (i10 == 6 || i10 == 7) {
            connect(i8, 6, i9, i10, i11);
            connect(i8, 7, i12, i13, i14);
            ((a) this.f8600d.get(Integer.valueOf(i8))).layout.horizontalBias = f8;
        } else {
            connect(i8, 3, i9, i10, i11);
            connect(i8, 4, i12, i13, i14);
            ((a) this.f8600d.get(Integer.valueOf(i8))).layout.verticalBias = f8;
        }
    }

    public void centerHorizontally(int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f8) {
        connect(i8, 1, i9, i10, i11);
        connect(i8, 2, i12, i13, i14);
        ((a) this.f8600d.get(Integer.valueOf(i8))).layout.horizontalBias = f8;
    }

    public void centerHorizontallyRtl(int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f8) {
        connect(i8, 6, i9, i10, i11);
        connect(i8, 7, i12, i13, i14);
        ((a) this.f8600d.get(Integer.valueOf(i8))).layout.horizontalBias = f8;
    }

    public void centerVertically(int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f8) {
        connect(i8, 3, i9, i10, i11);
        connect(i8, 4, i12, i13, i14);
        ((a) this.f8600d.get(Integer.valueOf(i8))).layout.verticalBias = f8;
    }

    public void clear(int i8) {
        this.f8600d.remove(Integer.valueOf(i8));
    }

    public void clone(Context context, int i8) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i8, (ViewGroup) null));
    }

    public void connect(int i8, int i9, int i10, int i11, int i12) {
        if (!this.f8600d.containsKey(Integer.valueOf(i8))) {
            this.f8600d.put(Integer.valueOf(i8), new a());
        }
        a aVar = (a) this.f8600d.get(Integer.valueOf(i8));
        switch (i9) {
            case 1:
                if (i11 == 1) {
                    b bVar = aVar.layout;
                    bVar.leftToLeft = i10;
                    bVar.leftToRight = -1;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException("Left to " + k(i11) + " undefined");
                    }
                    b bVar2 = aVar.layout;
                    bVar2.leftToRight = i10;
                    bVar2.leftToLeft = -1;
                }
                aVar.layout.leftMargin = i12;
                return;
            case 2:
                if (i11 == 1) {
                    b bVar3 = aVar.layout;
                    bVar3.rightToLeft = i10;
                    bVar3.rightToRight = -1;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar4 = aVar.layout;
                    bVar4.rightToRight = i10;
                    bVar4.rightToLeft = -1;
                }
                aVar.layout.rightMargin = i12;
                return;
            case 3:
                if (i11 == 3) {
                    b bVar5 = aVar.layout;
                    bVar5.topToTop = i10;
                    bVar5.topToBottom = -1;
                    bVar5.baselineToBaseline = -1;
                } else {
                    if (i11 != 4) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar6 = aVar.layout;
                    bVar6.topToBottom = i10;
                    bVar6.topToTop = -1;
                    bVar6.baselineToBaseline = -1;
                }
                aVar.layout.topMargin = i12;
                return;
            case 4:
                if (i11 == 4) {
                    b bVar7 = aVar.layout;
                    bVar7.bottomToBottom = i10;
                    bVar7.bottomToTop = -1;
                    bVar7.baselineToBaseline = -1;
                } else {
                    if (i11 != 3) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar8 = aVar.layout;
                    bVar8.bottomToTop = i10;
                    bVar8.bottomToBottom = -1;
                    bVar8.baselineToBaseline = -1;
                }
                aVar.layout.bottomMargin = i12;
                return;
            case 5:
                if (i11 != 5) {
                    throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                }
                b bVar9 = aVar.layout;
                bVar9.baselineToBaseline = i10;
                bVar9.bottomToBottom = -1;
                bVar9.bottomToTop = -1;
                bVar9.topToTop = -1;
                bVar9.topToBottom = -1;
                return;
            case 6:
                if (i11 == 6) {
                    b bVar10 = aVar.layout;
                    bVar10.startToStart = i10;
                    bVar10.startToEnd = -1;
                } else {
                    if (i11 != 7) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar11 = aVar.layout;
                    bVar11.startToEnd = i10;
                    bVar11.startToStart = -1;
                }
                aVar.layout.startMargin = i12;
                return;
            case 7:
                if (i11 == 7) {
                    b bVar12 = aVar.layout;
                    bVar12.endToEnd = i10;
                    bVar12.endToStart = -1;
                } else {
                    if (i11 != 6) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar13 = aVar.layout;
                    bVar13.endToStart = i10;
                    bVar13.endToEnd = -1;
                }
                aVar.layout.endMargin = i12;
                return;
            default:
                throw new IllegalArgumentException(k(i9) + " to " + k(i11) + " unknown");
        }
    }

    public void constrainCircle(int i8, int i9, int i10, float f8) {
        b bVar = h(i8).layout;
        bVar.circleConstraint = i9;
        bVar.circleRadius = i10;
        bVar.circleAngle = f8;
    }

    public void constrainDefaultHeight(int i8, int i9) {
        h(i8).layout.heightDefault = i9;
    }

    public void constrainDefaultWidth(int i8, int i9) {
        h(i8).layout.widthDefault = i9;
    }

    public void constrainHeight(int i8, int i9) {
        h(i8).layout.mHeight = i9;
    }

    public void constrainMaxHeight(int i8, int i9) {
        h(i8).layout.heightMax = i9;
    }

    public void constrainMaxWidth(int i8, int i9) {
        h(i8).layout.widthMax = i9;
    }

    public void constrainMinHeight(int i8, int i9) {
        h(i8).layout.heightMin = i9;
    }

    public void constrainMinWidth(int i8, int i9) {
        h(i8).layout.widthMin = i9;
    }

    public void constrainPercentHeight(int i8, float f8) {
        h(i8).layout.heightPercent = f8;
    }

    public void constrainPercentWidth(int i8, float f8) {
        h(i8).layout.widthPercent = f8;
    }

    public void constrainWidth(int i8, int i9) {
        h(i8).layout.mWidth = i9;
    }

    public void constrainedHeight(int i8, boolean z8) {
        h(i8).layout.constrainedHeight = z8;
    }

    public void constrainedWidth(int i8, boolean z8) {
        h(i8).layout.constrainedWidth = z8;
    }

    public void create(int i8, int i9) {
        b bVar = h(i8).layout;
        bVar.mIsGuideline = true;
        bVar.orientation = i9;
    }

    public void createBarrier(int i8, int i9, int i10, int... iArr) {
        b bVar = h(i8).layout;
        bVar.mHelperType = 1;
        bVar.mBarrierDirection = i9;
        bVar.mBarrierMargin = i10;
        bVar.mIsGuideline = false;
        bVar.mReferenceIds = iArr;
    }

    public void createHorizontalChain(int i8, int i9, int i10, int i11, int[] iArr, float[] fArr, int i12) {
        f(i8, i9, i10, i11, iArr, fArr, i12, 1, 2);
    }

    public void createHorizontalChainRtl(int i8, int i9, int i10, int i11, int[] iArr, float[] fArr, int i12) {
        f(i8, i9, i10, i11, iArr, fArr, i12, 6, 7);
    }

    public void createVerticalChain(int i8, int i9, int i10, int i11, int[] iArr, float[] fArr, int i12) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            h(iArr[0]).layout.verticalWeight = fArr[0];
        }
        h(iArr[0]).layout.verticalChainStyle = i12;
        connect(iArr[0], 3, i8, i9, 0);
        for (int i13 = 1; i13 < iArr.length; i13++) {
            int i14 = i13 - 1;
            connect(iArr[i13], 3, iArr[i14], 4, 0);
            connect(iArr[i14], 4, iArr[i13], 3, 0);
            if (fArr != null) {
                h(iArr[i13]).layout.verticalWeight = fArr[i13];
            }
        }
        connect(iArr[iArr.length - 1], 4, i10, i11, 0);
    }

    void d(ConstraintLayout constraintLayout, boolean z8) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f8600d.keySet());
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            int id = childAt.getId();
            if (!this.f8600d.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.b.getName(childAt));
            } else {
                if (this.f8599c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f8600d.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f8600d.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.layout.mHelperType = 1;
                        }
                        int i9 = aVar.layout.mHelperType;
                        if (i9 != -1 && i9 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.layout.mBarrierDirection);
                            barrier.setMargin(aVar.layout.mBarrierMargin);
                            barrier.setAllowsGoneWidget(aVar.layout.mBarrierAllowsGoneWidgets);
                            b bVar = aVar.layout;
                            int[] iArr = bVar.mReferenceIds;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.mReferenceIdString;
                                if (str != null) {
                                    bVar.mReferenceIds = e(barrier, str);
                                    barrier.setReferencedIds(aVar.layout.mReferenceIds);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.validate();
                        aVar.applyTo(bVar2);
                        if (z8) {
                            androidx.constraintlayout.widget.a.setAttributes(childAt, aVar.mCustomConstraints);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0126d c0126d = aVar.propertySet;
                        if (c0126d.mVisibilityMode == 0) {
                            childAt.setVisibility(c0126d.visibility);
                        }
                        childAt.setAlpha(aVar.propertySet.alpha);
                        childAt.setRotation(aVar.transform.rotation);
                        childAt.setRotationX(aVar.transform.rotationX);
                        childAt.setRotationY(aVar.transform.rotationY);
                        childAt.setScaleX(aVar.transform.scaleX);
                        childAt.setScaleY(aVar.transform.scaleY);
                        if (!Float.isNaN(aVar.transform.transformPivotX)) {
                            childAt.setPivotX(aVar.transform.transformPivotX);
                        }
                        if (!Float.isNaN(aVar.transform.transformPivotY)) {
                            childAt.setPivotY(aVar.transform.transformPivotY);
                        }
                        childAt.setTranslationX(aVar.transform.translationX);
                        childAt.setTranslationY(aVar.transform.translationY);
                        childAt.setTranslationZ(aVar.transform.translationZ);
                        e eVar = aVar.transform;
                        if (eVar.applyElevation) {
                            childAt.setElevation(eVar.elevation);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WARNING NO CONSTRAINTS for view ");
                        sb.append(id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f8600d.get(num);
            int i10 = aVar2.layout.mHelperType;
            if (i10 != -1 && i10 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.layout;
                int[] iArr2 = bVar3.mReferenceIds;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.mReferenceIdString;
                    if (str2 != null) {
                        bVar3.mReferenceIds = e(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.layout.mReferenceIds);
                    }
                }
                barrier2.setType(aVar2.layout.mBarrierDirection);
                barrier2.setMargin(aVar2.layout.mBarrierMargin);
                ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.validateParams();
                aVar2.applyTo(bVarGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
            }
            if (aVar2.layout.mIsGuideline) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.applyTo(bVarGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
            }
        }
    }

    public void dump(t tVar, int... iArr) throws IllegalAccessException, IllegalArgumentException {
        HashSet hashSet;
        Set setKeySet = this.f8600d.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i8 : iArr) {
                hashSet.add(Integer.valueOf(i8));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = (a) this.f8600d.get(num);
            sb.append("<Constraint id=");
            sb.append(num);
            sb.append(" \n");
            aVar.layout.dump(tVar, sb);
            sb.append("/>\n");
        }
        System.out.println(sb.toString());
    }

    public boolean getApplyElevation(int i8) {
        return h(i8).transform.applyElevation;
    }

    public a getConstraint(int i8) {
        if (this.f8600d.containsKey(Integer.valueOf(i8))) {
            return (a) this.f8600d.get(Integer.valueOf(i8));
        }
        return null;
    }

    public HashMap<String, androidx.constraintlayout.widget.a> getCustomAttributeSet() {
        return this.f8598b;
    }

    public int getHeight(int i8) {
        return h(i8).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.f8600d.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = numArr[i8].intValue();
        }
        return iArr;
    }

    public a getParameters(int i8) {
        return h(i8);
    }

    public int[] getReferencedIds(int i8) {
        int[] iArr = h(i8).layout.mReferenceIds;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public int getVisibility(int i8) {
        return h(i8).propertySet.visibility;
    }

    public int getVisibilityMode(int i8) {
        return h(i8).propertySet.mVisibilityMode;
    }

    public int getWidth(int i8) {
        return h(i8).layout.mWidth;
    }

    public boolean isForceId() {
        return this.f8599c;
    }

    public void load(Context context, int i8) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i8);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarG = g(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarG.layout.mIsGuideline = true;
                    }
                    this.f8600d.put(Integer.valueOf(aVarG.f8601a), aVarG);
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }

    public void parseColorAttributes(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String[] strArrSplit2 = strArrSplit[i8].split(SimpleComparison.EQUAL_TO_OPERATION);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i8]);
            } else {
                aVar.l(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void parseFloatAttributes(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String[] strArrSplit2 = strArrSplit[i8].split(SimpleComparison.EQUAL_TO_OPERATION);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i8]);
            } else {
                aVar.m(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void parseIntAttributes(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String[] strArrSplit2 = strArrSplit[i8].split(SimpleComparison.EQUAL_TO_OPERATION);
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i8]);
            } else {
                aVar.m(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(a aVar, String str) {
        String[] strArrL = l(str);
        for (int i8 = 0; i8 < strArrL.length; i8++) {
            String[] strArrSplit = strArrL[i8].split(SimpleComparison.EQUAL_TO_OPERATION);
            Log.w("ConstraintSet", " Unable to parse " + strArrL[i8]);
            aVar.o(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void readFallback(d dVar) {
        for (Integer num : dVar.f8600d.keySet()) {
            num.intValue();
            a aVar = (a) dVar.f8600d.get(num);
            if (!this.f8600d.containsKey(num)) {
                this.f8600d.put(num, new a());
            }
            a aVar2 = (a) this.f8600d.get(num);
            b bVar = aVar2.layout;
            if (!bVar.mApply) {
                bVar.copyFrom(aVar.layout);
            }
            C0126d c0126d = aVar2.propertySet;
            if (!c0126d.mApply) {
                c0126d.copyFrom(aVar.propertySet);
            }
            e eVar = aVar2.transform;
            if (!eVar.mApply) {
                eVar.copyFrom(aVar.transform);
            }
            c cVar = aVar2.motion;
            if (!cVar.mApply) {
                cVar.copyFrom(aVar.motion);
            }
            for (String str : aVar.mCustomConstraints.keySet()) {
                if (!aVar2.mCustomConstraints.containsKey(str)) {
                    aVar2.mCustomConstraints.put(str, aVar.mCustomConstraints.get(str));
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.f8598b.remove(str);
    }

    public void removeFromHorizontalChain(int i8) {
        if (this.f8600d.containsKey(Integer.valueOf(i8))) {
            b bVar = ((a) this.f8600d.get(Integer.valueOf(i8))).layout;
            int i9 = bVar.leftToRight;
            int i10 = bVar.rightToLeft;
            if (i9 != -1 || i10 != -1) {
                if (i9 != -1 && i10 != -1) {
                    connect(i9, 2, i10, 1, 0);
                    connect(i10, 1, i9, 2, 0);
                } else if (i9 != -1 || i10 != -1) {
                    int i11 = bVar.rightToRight;
                    if (i11 != -1) {
                        connect(i9, 2, i11, 2, 0);
                    } else {
                        int i12 = bVar.leftToLeft;
                        if (i12 != -1) {
                            connect(i10, 1, i12, 1, 0);
                        }
                    }
                }
                clear(i8, 1);
                clear(i8, 2);
                return;
            }
            int i13 = bVar.startToEnd;
            int i14 = bVar.endToStart;
            if (i13 != -1 || i14 != -1) {
                if (i13 != -1 && i14 != -1) {
                    connect(i13, 7, i14, 6, 0);
                    connect(i14, 6, i9, 7, 0);
                } else if (i9 != -1 || i14 != -1) {
                    int i15 = bVar.rightToRight;
                    if (i15 != -1) {
                        connect(i9, 7, i15, 7, 0);
                    } else {
                        int i16 = bVar.leftToLeft;
                        if (i16 != -1) {
                            connect(i14, 6, i16, 6, 0);
                        }
                    }
                }
            }
            clear(i8, 6);
            clear(i8, 7);
        }
    }

    public void removeFromVerticalChain(int i8) {
        if (this.f8600d.containsKey(Integer.valueOf(i8))) {
            b bVar = ((a) this.f8600d.get(Integer.valueOf(i8))).layout;
            int i9 = bVar.topToBottom;
            int i10 = bVar.bottomToTop;
            if (i9 != -1 || i10 != -1) {
                if (i9 != -1 && i10 != -1) {
                    connect(i9, 4, i10, 3, 0);
                    connect(i10, 3, i9, 4, 0);
                } else if (i9 != -1 || i10 != -1) {
                    int i11 = bVar.bottomToBottom;
                    if (i11 != -1) {
                        connect(i9, 4, i11, 4, 0);
                    } else {
                        int i12 = bVar.topToTop;
                        if (i12 != -1) {
                            connect(i10, 3, i12, 3, 0);
                        }
                    }
                }
            }
        }
        clear(i8, 3);
        clear(i8, 4);
    }

    public void setAlpha(int i8, float f8) {
        h(i8).propertySet.alpha = f8;
    }

    public void setApplyElevation(int i8, boolean z8) {
        h(i8).transform.applyElevation = z8;
    }

    public void setBarrierType(int i8, int i9) {
        h(i8).layout.mHelperType = i9;
    }

    public void setColorValue(int i8, String str, int i9) {
        h(i8).l(str, i9);
    }

    public void setDimensionRatio(int i8, String str) {
        h(i8).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i8, int i9) {
        h(i8).layout.editorAbsoluteX = i9;
    }

    public void setEditorAbsoluteY(int i8, int i9) {
        h(i8).layout.editorAbsoluteY = i9;
    }

    public void setElevation(int i8, float f8) {
        h(i8).transform.elevation = f8;
        h(i8).transform.applyElevation = true;
    }

    public void setFloatValue(int i8, String str, float f8) {
        h(i8).m(str, f8);
    }

    public void setForceId(boolean z8) {
        this.f8599c = z8;
    }

    public void setGoneMargin(int i8, int i9, int i10) {
        a aVarH = h(i8);
        switch (i9) {
            case 1:
                aVarH.layout.goneLeftMargin = i10;
                return;
            case 2:
                aVarH.layout.goneRightMargin = i10;
                return;
            case 3:
                aVarH.layout.goneTopMargin = i10;
                return;
            case 4:
                aVarH.layout.goneBottomMargin = i10;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                aVarH.layout.goneStartMargin = i10;
                return;
            case 7:
                aVarH.layout.goneEndMargin = i10;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i8, int i9) {
        h(i8).layout.guideBegin = i9;
        h(i8).layout.guideEnd = -1;
        h(i8).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i8, int i9) {
        h(i8).layout.guideEnd = i9;
        h(i8).layout.guideBegin = -1;
        h(i8).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i8, float f8) {
        h(i8).layout.guidePercent = f8;
        h(i8).layout.guideEnd = -1;
        h(i8).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i8, float f8) {
        h(i8).layout.horizontalBias = f8;
    }

    public void setHorizontalChainStyle(int i8, int i9) {
        h(i8).layout.horizontalChainStyle = i9;
    }

    public void setHorizontalWeight(int i8, float f8) {
        h(i8).layout.horizontalWeight = f8;
    }

    public void setIntValue(int i8, String str, int i9) {
        h(i8).n(str, i9);
    }

    public void setMargin(int i8, int i9, int i10) {
        a aVarH = h(i8);
        switch (i9) {
            case 1:
                aVarH.layout.leftMargin = i10;
                return;
            case 2:
                aVarH.layout.rightMargin = i10;
                return;
            case 3:
                aVarH.layout.topMargin = i10;
                return;
            case 4:
                aVarH.layout.bottomMargin = i10;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                aVarH.layout.startMargin = i10;
                return;
            case 7:
                aVarH.layout.endMargin = i10;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i8, int... iArr) {
        h(i8).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i8, float f8) {
        h(i8).transform.rotation = f8;
    }

    public void setRotationX(int i8, float f8) {
        h(i8).transform.rotationX = f8;
    }

    public void setRotationY(int i8, float f8) {
        h(i8).transform.rotationY = f8;
    }

    public void setScaleX(int i8, float f8) {
        h(i8).transform.scaleX = f8;
    }

    public void setScaleY(int i8, float f8) {
        h(i8).transform.scaleY = f8;
    }

    public void setStringValue(int i8, String str, String str2) {
        h(i8).o(str, str2);
    }

    public void setTransformPivot(int i8, float f8, float f9) {
        e eVar = h(i8).transform;
        eVar.transformPivotY = f9;
        eVar.transformPivotX = f8;
    }

    public void setTransformPivotX(int i8, float f8) {
        h(i8).transform.transformPivotX = f8;
    }

    public void setTransformPivotY(int i8, float f8) {
        h(i8).transform.transformPivotY = f8;
    }

    public void setTranslation(int i8, float f8, float f9) {
        e eVar = h(i8).transform;
        eVar.translationX = f8;
        eVar.translationY = f9;
    }

    public void setTranslationX(int i8, float f8) {
        h(i8).transform.translationX = f8;
    }

    public void setTranslationY(int i8, float f8) {
        h(i8).transform.translationY = f8;
    }

    public void setTranslationZ(int i8, float f8) {
        h(i8).transform.translationZ = f8;
    }

    public void setValidateOnParse(boolean z8) {
        this.f8597a = z8;
    }

    public void setVerticalBias(int i8, float f8) {
        h(i8).layout.verticalBias = f8;
    }

    public void setVerticalChainStyle(int i8, int i9) {
        h(i8).layout.verticalChainStyle = i9;
    }

    public void setVerticalWeight(int i8, float f8) {
        h(i8).layout.verticalWeight = f8;
    }

    public void setVisibility(int i8, int i9) {
        h(i8).propertySet.visibility = i9;
    }

    public void setVisibilityMode(int i8, int i9) {
        h(i8).propertySet.mVisibilityMode = i9;
    }

    public void clear(int i8, int i9) {
        if (this.f8600d.containsKey(Integer.valueOf(i8))) {
            a aVar = (a) this.f8600d.get(Integer.valueOf(i8));
            switch (i9) {
                case 1:
                    b bVar = aVar.layout;
                    bVar.leftToRight = -1;
                    bVar.leftToLeft = -1;
                    bVar.leftMargin = -1;
                    bVar.goneLeftMargin = -1;
                    return;
                case 2:
                    b bVar2 = aVar.layout;
                    bVar2.rightToRight = -1;
                    bVar2.rightToLeft = -1;
                    bVar2.rightMargin = -1;
                    bVar2.goneRightMargin = -1;
                    return;
                case 3:
                    b bVar3 = aVar.layout;
                    bVar3.topToBottom = -1;
                    bVar3.topToTop = -1;
                    bVar3.topMargin = -1;
                    bVar3.goneTopMargin = -1;
                    return;
                case 4:
                    b bVar4 = aVar.layout;
                    bVar4.bottomToTop = -1;
                    bVar4.bottomToBottom = -1;
                    bVar4.bottomMargin = -1;
                    bVar4.goneBottomMargin = -1;
                    return;
                case 5:
                    aVar.layout.baselineToBaseline = -1;
                    return;
                case 6:
                    b bVar5 = aVar.layout;
                    bVar5.startToEnd = -1;
                    bVar5.startToStart = -1;
                    bVar5.startMargin = -1;
                    bVar5.goneStartMargin = -1;
                    return;
                case 7:
                    b bVar6 = aVar.layout;
                    bVar6.endToStart = -1;
                    bVar6.endToEnd = -1;
                    bVar6.endMargin = -1;
                    bVar6.goneEndMargin = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void clone(d dVar) {
        this.f8600d.clear();
        for (Integer num : dVar.f8600d.keySet()) {
            this.f8600d.put(num, ((a) dVar.f8600d.get(num)).m389clone());
        }
    }

    public void centerHorizontally(int i8, int i9) {
        if (i9 == 0) {
            center(i8, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i8, i9, 2, 0, i9, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i8, int i9) {
        if (i9 == 0) {
            center(i8, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i8, i9, 7, 0, i9, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i8, int i9) {
        if (i9 == 0) {
            center(i8, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i8, i9, 4, 0, i9, 3, 0, 0.5f);
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8600d.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8599c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8600d.containsKey(Integer.valueOf(id))) {
                this.f8600d.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f8600d.get(Integer.valueOf(id));
            aVar.mCustomConstraints = androidx.constraintlayout.widget.a.extractAttributes(this.f8598b, childAt);
            aVar.h(id, bVar);
            aVar.propertySet.visibility = childAt.getVisibility();
            aVar.propertySet.alpha = childAt.getAlpha();
            aVar.transform.rotation = childAt.getRotation();
            aVar.transform.rotationX = childAt.getRotationX();
            aVar.transform.rotationY = childAt.getRotationY();
            aVar.transform.scaleX = childAt.getScaleX();
            aVar.transform.scaleY = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.transform;
                eVar.transformPivotX = pivotX;
                eVar.transformPivotY = pivotY;
            }
            aVar.transform.translationX = childAt.getTranslationX();
            aVar.transform.translationY = childAt.getTranslationY();
            aVar.transform.translationZ = childAt.getTranslationZ();
            e eVar2 = aVar.transform;
            if (eVar2.applyElevation) {
                eVar2.elevation = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                aVar.layout.mReferenceIds = barrier.getReferencedIds();
                aVar.layout.mBarrierDirection = barrier.getType();
                aVar.layout.mBarrierMargin = barrier.getMargin();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x017d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void load(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8599c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8600d.containsKey(Integer.valueOf(id))) {
                this.f8600d.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f8600d.get(Integer.valueOf(id));
            if (!aVar.layout.mApply) {
                aVar.h(id, bVar);
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar.layout.mReferenceIds = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                        aVar.layout.mBarrierDirection = barrier.getType();
                        aVar.layout.mBarrierMargin = barrier.getMargin();
                    }
                }
                aVar.layout.mApply = true;
            }
            C0126d c0126d = aVar.propertySet;
            if (!c0126d.mApply) {
                c0126d.visibility = childAt.getVisibility();
                aVar.propertySet.alpha = childAt.getAlpha();
                aVar.propertySet.mApply = true;
            }
            e eVar = aVar.transform;
            if (!eVar.mApply) {
                eVar.mApply = true;
                eVar.rotation = childAt.getRotation();
                aVar.transform.rotationX = childAt.getRotationX();
                aVar.transform.rotationY = childAt.getRotationY();
                aVar.transform.scaleX = childAt.getScaleX();
                aVar.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar2 = aVar.transform;
                    eVar2.transformPivotX = pivotX;
                    eVar2.transformPivotY = pivotY;
                }
                aVar.transform.translationX = childAt.getTranslationX();
                aVar.transform.translationY = childAt.getTranslationY();
                aVar.transform.translationZ = childAt.getTranslationZ();
                e eVar3 = aVar.transform;
                if (eVar3.applyElevation) {
                    eVar3.elevation = childAt.getElevation();
                }
            }
        }
    }

    public void clone(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f8600d.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = eVar.getChildAt(i8);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8599c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8600d.containsKey(Integer.valueOf(id))) {
                this.f8600d.put(Integer.valueOf(id), new a());
            }
            a aVar2 = (a) this.f8600d.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.b) {
                aVar2.j((androidx.constraintlayout.widget.b) childAt, id, aVar);
            }
            aVar2.i(id, aVar);
        }
    }

    public void connect(int i8, int i9, int i10, int i11) {
        if (!this.f8600d.containsKey(Integer.valueOf(i8))) {
            this.f8600d.put(Integer.valueOf(i8), new a());
        }
        a aVar = (a) this.f8600d.get(Integer.valueOf(i8));
        switch (i9) {
            case 1:
                if (i11 == 1) {
                    b bVar = aVar.layout;
                    bVar.leftToLeft = i10;
                    bVar.leftToRight = -1;
                    return;
                } else if (i11 == 2) {
                    b bVar2 = aVar.layout;
                    bVar2.leftToRight = i10;
                    bVar2.leftToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + k(i11) + " undefined");
                }
            case 2:
                if (i11 == 1) {
                    b bVar3 = aVar.layout;
                    bVar3.rightToLeft = i10;
                    bVar3.rightToRight = -1;
                    return;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar4 = aVar.layout;
                    bVar4.rightToRight = i10;
                    bVar4.rightToLeft = -1;
                    return;
                }
            case 3:
                if (i11 == 3) {
                    b bVar5 = aVar.layout;
                    bVar5.topToTop = i10;
                    bVar5.topToBottom = -1;
                    bVar5.baselineToBaseline = -1;
                    return;
                }
                if (i11 != 4) {
                    throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                }
                b bVar6 = aVar.layout;
                bVar6.topToBottom = i10;
                bVar6.topToTop = -1;
                bVar6.baselineToBaseline = -1;
                return;
            case 4:
                if (i11 == 4) {
                    b bVar7 = aVar.layout;
                    bVar7.bottomToBottom = i10;
                    bVar7.bottomToTop = -1;
                    bVar7.baselineToBaseline = -1;
                    return;
                }
                if (i11 != 3) {
                    throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                }
                b bVar8 = aVar.layout;
                bVar8.bottomToTop = i10;
                bVar8.bottomToBottom = -1;
                bVar8.baselineToBaseline = -1;
                return;
            case 5:
                if (i11 != 5) {
                    throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                }
                b bVar9 = aVar.layout;
                bVar9.baselineToBaseline = i10;
                bVar9.bottomToBottom = -1;
                bVar9.bottomToTop = -1;
                bVar9.topToTop = -1;
                bVar9.topToBottom = -1;
                return;
            case 6:
                if (i11 == 6) {
                    b bVar10 = aVar.layout;
                    bVar10.startToStart = i10;
                    bVar10.startToEnd = -1;
                    return;
                } else {
                    if (i11 != 7) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar11 = aVar.layout;
                    bVar11.startToEnd = i10;
                    bVar11.startToStart = -1;
                    return;
                }
            case 7:
                if (i11 == 7) {
                    b bVar12 = aVar.layout;
                    bVar12.endToEnd = i10;
                    bVar12.endToStart = -1;
                    return;
                } else {
                    if (i11 != 6) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    b bVar13 = aVar.layout;
                    bVar13.endToStart = i10;
                    bVar13.endToEnd = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(k(i9) + " to " + k(i11) + " unknown");
        }
    }
}
