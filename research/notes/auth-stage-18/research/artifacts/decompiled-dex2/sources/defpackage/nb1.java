package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class nb1 {
    public final g91 a;
    public final long b;

    public nb1(g91 g91Var, long j) {
        mqd.z(g91Var, "environment");
        this.a = g91Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        return this.a == nb1Var.a && this.b == nb1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthUid(environment=" + this.a + ", value=" + this.b + ")";
    }
}
