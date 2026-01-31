package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import h.AbstractC5563a;

/* loaded from: classes.dex */
public class d extends k implements DialogInterface {

    /* renamed from: c, reason: collision with root package name */
    final AlertController f6314c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f6315a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6316b;

        public a(Context context) {
            this(context, d.c(context, 0));
        }

        public d create() {
            d dVar = new d(this.f6315a.mContext, this.f6316b);
            this.f6315a.apply(dVar.f6314c);
            dVar.setCancelable(this.f6315a.mCancelable);
            if (this.f6315a.mCancelable) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f6315a.mOnCancelListener);
            dVar.setOnDismissListener(this.f6315a.mOnDismissListener);
            DialogInterface.OnKeyListener onKeyListener = this.f6315a.mOnKeyListener;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        public Context getContext() {
            return this.f6315a.mContext;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mAdapter = listAdapter;
            bVar.mOnClickListener = onClickListener;
            return this;
        }

        public a setCancelable(boolean z8) {
            this.f6315a.mCancelable = z8;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.f6315a;
            bVar.mCursor = cursor;
            bVar.mLabelColumn = str;
            bVar.mOnClickListener = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.f6315a.mCustomTitleView = view;
            return this;
        }

        public a setIcon(int i8) {
            this.f6315a.mIconId = i8;
            return this;
        }

        public a setIconAttribute(int i8) {
            TypedValue typedValue = new TypedValue();
            this.f6315a.mContext.getTheme().resolveAttribute(i8, typedValue, true);
            this.f6315a.mIconId = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z8) {
            this.f6315a.mForceInverseBackground = z8;
            return this;
        }

        public a setItems(int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mItems = bVar.mContext.getResources().getTextArray(i8);
            this.f6315a.mOnClickListener = onClickListener;
            return this;
        }

        public a setMessage(int i8) {
            AlertController.b bVar = this.f6315a;
            bVar.mMessage = bVar.mContext.getText(i8);
            return this;
        }

        public a setMultiChoiceItems(int i8, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mItems = bVar.mContext.getResources().getTextArray(i8);
            AlertController.b bVar2 = this.f6315a;
            bVar2.mOnCheckboxClickListener = onMultiChoiceClickListener;
            bVar2.mCheckedItems = zArr;
            bVar2.mIsMultiChoice = true;
            return this;
        }

        public a setNegativeButton(int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mNegativeButtonText = bVar.mContext.getText(i8);
            this.f6315a.mNegativeButtonListener = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.f6315a.mNegativeButtonIcon = drawable;
            return this;
        }

        public a setNeutralButton(int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mNeutralButtonText = bVar.mContext.getText(i8);
            this.f6315a.mNeutralButtonListener = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.f6315a.mNeutralButtonIcon = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f6315a.mOnCancelListener = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f6315a.mOnDismissListener = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f6315a.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f6315a.mOnKeyListener = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mPositiveButtonText = bVar.mContext.getText(i8);
            this.f6315a.mPositiveButtonListener = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.f6315a.mPositiveButtonIcon = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z8) {
            this.f6315a.mRecycleOnMeasure = z8;
            return this;
        }

        public a setSingleChoiceItems(int i8, int i9, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mItems = bVar.mContext.getResources().getTextArray(i8);
            AlertController.b bVar2 = this.f6315a;
            bVar2.mOnClickListener = onClickListener;
            bVar2.mCheckedItem = i9;
            bVar2.mIsSingleChoice = true;
            return this;
        }

        public a setTitle(int i8) {
            AlertController.b bVar = this.f6315a;
            bVar.mTitle = bVar.mContext.getText(i8);
            return this;
        }

        public a setView(int i8) {
            AlertController.b bVar = this.f6315a;
            bVar.mView = null;
            bVar.mViewLayoutResId = i8;
            bVar.mViewSpacingSpecified = false;
            return this;
        }

        public d show() {
            d dVarCreate = create();
            dVarCreate.show();
            return dVarCreate;
        }

        public a(Context context, int i8) {
            this.f6315a = new AlertController.b(new ContextThemeWrapper(context, d.c(context, i8)));
            this.f6316b = i8;
        }

        public a setIcon(Drawable drawable) {
            this.f6315a.mIcon = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.f6315a.mMessage = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f6315a.mTitle = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mItems = charSequenceArr;
            bVar.mOnClickListener = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mNegativeButtonText = charSequence;
            bVar.mNegativeButtonListener = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mNeutralButtonText = charSequence;
            bVar.mNeutralButtonListener = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mPositiveButtonText = charSequence;
            bVar.mPositiveButtonListener = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f6315a;
            bVar.mView = view;
            bVar.mViewLayoutResId = 0;
            bVar.mViewSpacingSpecified = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mItems = charSequenceArr;
            bVar.mOnCheckboxClickListener = onMultiChoiceClickListener;
            bVar.mCheckedItems = zArr;
            bVar.mIsMultiChoice = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i8, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mCursor = cursor;
            bVar.mOnClickListener = onClickListener;
            bVar.mCheckedItem = i8;
            bVar.mLabelColumn = str;
            bVar.mIsSingleChoice = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i8, int i9, int i10, int i11) {
            AlertController.b bVar = this.f6315a;
            bVar.mView = view;
            bVar.mViewLayoutResId = 0;
            bVar.mViewSpacingSpecified = true;
            bVar.mViewSpacingLeft = i8;
            bVar.mViewSpacingTop = i9;
            bVar.mViewSpacingRight = i10;
            bVar.mViewSpacingBottom = i11;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mCursor = cursor;
            bVar.mOnCheckboxClickListener = onMultiChoiceClickListener;
            bVar.mIsCheckedColumn = str;
            bVar.mLabelColumn = str2;
            bVar.mIsMultiChoice = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mItems = charSequenceArr;
            bVar.mOnClickListener = onClickListener;
            bVar.mCheckedItem = i8;
            bVar.mIsSingleChoice = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f6315a;
            bVar.mAdapter = listAdapter;
            bVar.mOnClickListener = onClickListener;
            bVar.mCheckedItem = i8;
            bVar.mIsSingleChoice = true;
            return this;
        }
    }

    protected d(Context context, int i8) {
        super(context, c(context, i8));
        this.f6314c = new AlertController(getContext(), this, getWindow());
    }

    static int c(Context context, int i8) {
        if (((i8 >>> 24) & 255) >= 1) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5563a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i8) {
        return this.f6314c.getButton(i8);
    }

    public ListView getListView() {
        return this.f6314c.getListView();
    }

    @Override // androidx.appcompat.app.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6314c.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (this.f6314c.onKeyDown(i8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (this.f6314c.onKeyUp(i8, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i8, keyEvent);
    }

    public void setButton(int i8, CharSequence charSequence, Message message) {
        this.f6314c.setButton(i8, charSequence, null, message, null);
    }

    public void setCustomTitle(View view) {
        this.f6314c.setCustomTitle(view);
    }

    public void setIcon(int i8) {
        this.f6314c.setIcon(i8);
    }

    public void setIconAttribute(int i8) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i8, typedValue, true);
        this.f6314c.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.f6314c.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.k, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f6314c.setTitle(charSequence);
    }

    public void setView(View view) {
        this.f6314c.setView(view);
    }

    public void setButton(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f6314c.setButton(i8, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        this.f6314c.setIcon(drawable);
    }

    public void setView(View view, int i8, int i9, int i10, int i11) {
        this.f6314c.setView(view, i8, i9, i10, i11);
    }

    public void setButton(int i8, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f6314c.setButton(i8, charSequence, onClickListener, null, drawable);
    }
}
