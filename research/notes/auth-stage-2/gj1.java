package defpackage;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class gj1 {
    public final old a;
    public final old b;
    public final List c;

    public gj1(old oldVar, old oldVar2, List list) {
        mqd.z(oldVar, "start");
        mqd.z(oldVar2, "end");
        mqd.z(list, "eventIds");
        this.a = oldVar;
        this.b = oldVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        return mqd.s(this.a, gj1Var.a) && mqd.s(this.b, gj1Var.b) && mqd.s(this.c, gj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qq3.c(this.b.a, this.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailabilityInterval(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", eventIds=");
        return qq3.r(sb, this.c, ")");
    }
}
