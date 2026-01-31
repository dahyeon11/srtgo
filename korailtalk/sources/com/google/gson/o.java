package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26085a;

    public o(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f26085a = bool;
    }

    private static boolean a(o oVar) {
        Object obj = oVar.f26085a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.i
    public o deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f26085a == null) {
            return oVar.f26085a == null;
        }
        if (a(this) && a(oVar)) {
            return getAsNumber().longValue() == oVar.getAsNumber().longValue();
        }
        Object obj2 = this.f26085a;
        if (!(obj2 instanceof Number) || !(oVar.f26085a instanceof Number)) {
            return obj2.equals(oVar.f26085a);
        }
        double dDoubleValue = getAsNumber().doubleValue();
        double dDoubleValue2 = oVar.getAsNumber().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.i
    public BigDecimal getAsBigDecimal() {
        Object obj = this.f26085a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(getAsString());
    }

    @Override // com.google.gson.i
    public BigInteger getAsBigInteger() {
        Object obj = this.f26085a;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(getAsString());
    }

    @Override // com.google.gson.i
    public boolean getAsBoolean() {
        return isBoolean() ? ((Boolean) this.f26085a).booleanValue() : Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.i
    public byte getAsByte() {
        return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.i
    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (asString.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return asString.charAt(0);
    }

    @Override // com.google.gson.i
    public double getAsDouble() {
        return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.i
    public float getAsFloat() {
        return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.i
    public int getAsInt() {
        return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.i
    public long getAsLong() {
        return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    @Override // com.google.gson.i
    public Number getAsNumber() {
        Object obj = this.f26085a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.gson.internal.f((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.i
    public short getAsShort() {
        return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    @Override // com.google.gson.i
    public String getAsString() {
        Object obj = this.f26085a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return ((Boolean) this.f26085a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f26085a.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f26085a == null) {
            return 31;
        }
        if (a(this)) {
            jDoubleToLongBits = getAsNumber().longValue();
        } else {
            Object obj = this.f26085a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean isBoolean() {
        return this.f26085a instanceof Boolean;
    }

    public boolean isNumber() {
        return this.f26085a instanceof Number;
    }

    public boolean isString() {
        return this.f26085a instanceof String;
    }

    public o(Number number) {
        Objects.requireNonNull(number);
        this.f26085a = number;
    }

    public o(String str) {
        Objects.requireNonNull(str);
        this.f26085a = str;
    }

    public o(Character ch) {
        Objects.requireNonNull(ch);
        this.f26085a = ch.toString();
    }
}
