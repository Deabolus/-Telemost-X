package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class v4s extends x4s {
    public final String a;
    public final String b;

    public v4s(String str, String str2) {
        mqd.z(str, "user");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.x4s
    public final void a(l0d l0dVar) {
        l0dVar.d("user", this.a);
    }

    @Override // defpackage.x4s
    public final void b(g5l g5lVar) {
        g5lVar.a("Authorization", "OAuth ".concat(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4s)) {
            return false;
        }
        v4s v4sVar = (v4s) obj;
        return mqd.s(this.a, v4sVar.a) && mqd.s(this.b, v4sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return wq1.j("OAuth(user=", this.a, ", token=", this.b, ")");
    }
}
