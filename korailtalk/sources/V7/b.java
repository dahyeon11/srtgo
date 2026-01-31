package V7;

/* loaded from: classes3.dex */
public class b extends Number implements Comparable, a {

    /* renamed from: a, reason: collision with root package name */
    private int f5237a;

    public b() {
    }

    public void add(int i8) {
        this.f5237a += i8;
    }

    public int addAndGet(int i8) {
        int i9 = this.f5237a + i8;
        this.f5237a = i9;
        return i9;
    }

    public void decrement() {
        this.f5237a--;
    }

    public int decrementAndGet() {
        int i8 = this.f5237a - 1;
        this.f5237a = i8;
        return i8;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f5237a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.f5237a == ((b) obj).intValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f5237a;
    }

    public int getAndAdd(int i8) {
        int i9 = this.f5237a;
        this.f5237a = i8 + i9;
        return i9;
    }

    public int getAndDecrement() {
        int i8 = this.f5237a;
        this.f5237a = i8 - 1;
        return i8;
    }

    public int getAndIncrement() {
        int i8 = this.f5237a;
        this.f5237a = i8 + 1;
        return i8;
    }

    public int hashCode() {
        return this.f5237a;
    }

    public void increment() {
        this.f5237a++;
    }

    public int incrementAndGet() {
        int i8 = this.f5237a + 1;
        this.f5237a = i8;
        return i8;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f5237a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f5237a;
    }

    public void subtract(int i8) {
        this.f5237a -= i8;
    }

    public Integer toInteger() {
        return Integer.valueOf(intValue());
    }

    public String toString() {
        return String.valueOf(this.f5237a);
    }

    public b(int i8) {
        this.f5237a = i8;
    }

    public void add(Number number) {
        this.f5237a += number.intValue();
    }

    public int addAndGet(Number number) {
        int iIntValue = this.f5237a + number.intValue();
        this.f5237a = iIntValue;
        return iIntValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        return U7.a.compare(this.f5237a, bVar.f5237a);
    }

    @Override // V7.a
    public Integer getValue() {
        return Integer.valueOf(this.f5237a);
    }

    public void setValue(int i8) {
        this.f5237a = i8;
    }

    public void subtract(Number number) {
        this.f5237a -= number.intValue();
    }

    public int getAndAdd(Number number) {
        int i8 = this.f5237a;
        this.f5237a = number.intValue() + i8;
        return i8;
    }

    @Override // V7.a
    public void setValue(Number number) {
        this.f5237a = number.intValue();
    }

    public b(Number number) {
        this.f5237a = number.intValue();
    }

    public b(String str) {
        this.f5237a = Integer.parseInt(str);
    }
}
