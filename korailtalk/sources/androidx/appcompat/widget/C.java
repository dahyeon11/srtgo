package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    private TextView f6785a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f6786b;

    C(TextView textView) {
        this.f6785a = (TextView) Z.h.checkNotNull(textView);
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.f6786b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerA = AbstractC0865z.a(this.f6785a.getContext().getSystemService(AbstractC0864y.a()));
        return textClassificationManagerA != null ? textClassificationManagerA.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.f6786b = textClassifier;
    }
}
