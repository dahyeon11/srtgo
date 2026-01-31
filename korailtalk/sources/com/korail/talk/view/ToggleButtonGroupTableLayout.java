package com.korail.talk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class ToggleButtonGroupTableLayout extends TableLayout implements View.OnClickListener {
    public static final int SINGLE_SELECTION = 0;
    public static final int TOGGLE_SELECTION = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f29340a;

    /* renamed from: b, reason: collision with root package name */
    private RadioButton f29341b;

    public interface a {
    }

    public ToggleButtonGroupTableLayout(Context context) {
        super(context);
        this.f29340a = 0;
    }

    private void setChildrenOnClickListener(TableRow tableRow) {
        int childCount = tableRow.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = tableRow.getChildAt(i8);
            if (childAt instanceof RadioButton) {
                childAt.setOnClickListener(this);
            }
        }
    }

    @Override // android.widget.TableLayout, android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        setChildrenOnClickListener((TableRow) view);
    }

    public void disableSelect(int i8) {
        t.d("+ select(): radioIdx=" + i8);
        RadioButton radioButtonFindRadioButton = findRadioButton(i8);
        if (C6630d.isNull(radioButtonFindRadioButton)) {
            return;
        }
        radioButtonFindRadioButton.setEnabled(false);
    }

    public RadioButton findRadioButton(int i8) {
        t.d("+ findRadioButton(): radioIdx=" + i8);
        int childCount = getChildCount();
        int i9 = -1;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i10);
                int childCount2 = tableRow.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    if (tableRow.getChildAt(i11) instanceof RadioButton) {
                        RadioButton radioButton = (RadioButton) tableRow.getChildAt(i11);
                        i9++;
                        if (i9 == i8) {
                            return radioButton;
                        }
                    }
                }
            }
        }
        return null;
    }

    public RadioButton getCheckedRadioButton() {
        t.d("+ getCheckedRadioButton(): selRadio=" + this.f29341b);
        return this.f29341b;
    }

    public int getCheckedRadioButtonIndex() {
        int iFindRadioButton = findRadioButton(this.f29341b);
        t.d("+ getCheckedRadioButtonIndex(): selIdx=" + iFindRadioButton);
        return iFindRadioButton;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        RadioButton radioButton = (RadioButton) view;
        int i8 = this.f29340a;
        if (i8 == 0) {
            RadioButton radioButton2 = this.f29341b;
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
            }
            radioButton.setChecked(true);
            this.f29341b = radioButton;
            return;
        }
        if (i8 == 1) {
            RadioButton radioButton3 = this.f29341b;
            if (radioButton3 == null) {
                radioButton.setChecked(true);
                this.f29341b = radioButton;
            } else if (radioButton3 == radioButton) {
                radioButton3.setChecked(false);
                this.f29341b = null;
            } else {
                radioButton3.setChecked(false);
                radioButton.setChecked(true);
                this.f29341b = radioButton;
            }
        }
    }

    public void removeRadioButton(int i8) {
        t.d("+ removeRadioButton(): radioIdx=" + i8);
        int childCount = getChildCount();
        int i9 = -1;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i10);
                int childCount2 = tableRow.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    if (tableRow.getChildAt(i11) instanceof RadioButton) {
                        RadioButton radioButton = (RadioButton) tableRow.getChildAt(i11);
                        i9++;
                        if (i9 == i8) {
                            tableRow.removeView(radioButton);
                        }
                    }
                }
            }
        }
    }

    public void select(int i8) {
        t.d("+ select(): radioIdx=" + i8);
        RadioButton radioButtonFindRadioButton = findRadioButton(i8);
        if (radioButtonFindRadioButton != null) {
            onClick(radioButtonFindRadioButton);
        }
    }

    public void setOnSelectChangeListener(a aVar) {
    }

    public void setSelectMode(int i8) {
        this.f29340a = i8;
    }

    public void unSelect(int i8) {
        t.d("+ unSelect(): radioIdx=" + i8);
        RadioButton radioButtonFindRadioButton = findRadioButton(i8);
        if (radioButtonFindRadioButton != null) {
            radioButtonFindRadioButton.setChecked(false);
            if (this.f29341b == radioButtonFindRadioButton) {
                this.f29341b = null;
            }
        }
    }

    public void unSelectAll() {
        int childCount = getChildCount();
        this.f29341b = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            if (getChildAt(i8) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i8);
                int childCount2 = tableRow.getChildCount();
                for (int i9 = 0; i9 < childCount2; i9++) {
                    if (tableRow.getChildAt(i9) instanceof RadioButton) {
                        ((RadioButton) tableRow.getChildAt(i9)).setChecked(false);
                    }
                }
            }
        }
    }

    public ToggleButtonGroupTableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29340a = 0;
    }

    @Override // android.widget.TableLayout, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        setChildrenOnClickListener((TableRow) view);
    }

    public int findRadioButton(RadioButton radioButton) {
        if (radioButton == null) {
            return -1;
        }
        int childCount = getChildCount();
        int i8 = -1;
        for (int i9 = 0; i9 < childCount; i9++) {
            if (getChildAt(i9) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i9);
                int childCount2 = tableRow.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    if (tableRow.getChildAt(i10) instanceof RadioButton) {
                        i8++;
                        if (radioButton == ((RadioButton) tableRow.getChildAt(i10))) {
                            return i8;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
