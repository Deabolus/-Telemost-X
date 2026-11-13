package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class w4s extends x4s {
    public final String a;
    public final String b;
    public final long c;

    public w4s(String str, String str2, long j) {
        mqd.z(str2, "sign");
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.x4s
    public final void a(l0d l0dVar) {
        l0dVar.d("user", this.a);
        l0dVar.d("sign", this.b);
        l0dVar.d("ts", String.valueOf(this.c));
    }

    @Override // defpackage.x4s
    public final void b(g5l g5lVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4s)) {
            return false;
        }
        w4s w4sVar = (w4s) obj;
        return mqd.s(this.a, w4sVar.a) && mqd.s(this.b, w4sVar.b) && this.c == w4sVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + okn.d(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return fde.o(this.c, ")", wq1.o("Secret(user=", this.a, ", sign=", this.b, ", ts="));
    }
}
