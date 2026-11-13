package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class hqq {
    public final String a;
    public boolean b;

    public hqq(String str) {
        mqd.z(str, "personalGuid");
        this.a = str;
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqq) && mqd.s(this.a, ((hqq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return una.c("UserCredentials(personalGuid=", this.a, ")");
    }
}
