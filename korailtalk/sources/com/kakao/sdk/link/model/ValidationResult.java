package com.kakao.sdk.link.model;

import com.google.gson.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ValidationResult {
    private final l argumentMsg;
    private final l templateArgs;
    private final long templateId;
    private final l templateMsg;
    private final l warningMsg;

    public ValidationResult(long j8, l lVar, l templateMsg, l lVar2, l lVar3) {
        Intrinsics.checkParameterIsNotNull(templateMsg, "templateMsg");
        this.templateId = j8;
        this.templateArgs = lVar;
        this.templateMsg = templateMsg;
        this.warningMsg = lVar2;
        this.argumentMsg = lVar3;
    }

    public static /* synthetic */ ValidationResult copy$default(ValidationResult validationResult, long j8, l lVar, l lVar2, l lVar3, l lVar4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = validationResult.templateId;
        }
        long j9 = j8;
        if ((i8 & 2) != 0) {
            lVar = validationResult.templateArgs;
        }
        l lVar5 = lVar;
        if ((i8 & 4) != 0) {
            lVar2 = validationResult.templateMsg;
        }
        l lVar6 = lVar2;
        if ((i8 & 8) != 0) {
            lVar3 = validationResult.warningMsg;
        }
        l lVar7 = lVar3;
        if ((i8 & 16) != 0) {
            lVar4 = validationResult.argumentMsg;
        }
        return validationResult.copy(j9, lVar5, lVar6, lVar7, lVar4);
    }

    public final long component1() {
        return this.templateId;
    }

    public final l component2() {
        return this.templateArgs;
    }

    public final l component3() {
        return this.templateMsg;
    }

    public final l component4() {
        return this.warningMsg;
    }

    public final l component5() {
        return this.argumentMsg;
    }

    public final ValidationResult copy(long j8, l lVar, l templateMsg, l lVar2, l lVar3) {
        Intrinsics.checkParameterIsNotNull(templateMsg, "templateMsg");
        return new ValidationResult(j8, lVar, templateMsg, lVar2, lVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationResult)) {
            return false;
        }
        ValidationResult validationResult = (ValidationResult) obj;
        return this.templateId == validationResult.templateId && Intrinsics.areEqual(this.templateArgs, validationResult.templateArgs) && Intrinsics.areEqual(this.templateMsg, validationResult.templateMsg) && Intrinsics.areEqual(this.warningMsg, validationResult.warningMsg) && Intrinsics.areEqual(this.argumentMsg, validationResult.argumentMsg);
    }

    public final l getArgumentMsg() {
        return this.argumentMsg;
    }

    public final l getTemplateArgs() {
        return this.templateArgs;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public final l getTemplateMsg() {
        return this.templateMsg;
    }

    public final l getWarningMsg() {
        return this.warningMsg;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.templateId) * 31;
        l lVar = this.templateArgs;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l lVar2 = this.templateMsg;
        int iHashCode3 = (iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l lVar3 = this.warningMsg;
        int iHashCode4 = (iHashCode3 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l lVar4 = this.argumentMsg;
        return iHashCode4 + (lVar4 != null ? lVar4.hashCode() : 0);
    }

    public String toString() {
        return "ValidationResult(templateId=" + this.templateId + ", templateArgs=" + this.templateArgs + ", templateMsg=" + this.templateMsg + ", warningMsg=" + this.warningMsg + ", argumentMsg=" + this.argumentMsg + ")";
    }
}
