package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public class taa {
    public Long a;
    public long b;

    public taa(long j, int i) {
        j = (i & 1) != 0 ? 2000L : j;
        Long l = (i & 4) != 0 ? null : 0L;
        this.b = j;
        this.a = l;
    }

    public taa a() {
        return this;
    }

    public long b(int i) {
        return this.b * ((long) 2);
    }

    public long c(int i, i9h i9hVar) {
        long jB;
        u9f u9fVar;
        u9f u9fVar2;
        Long l;
        int iH = xkc.H(i, 0, 3);
        long jLongValue = ((i9hVar == null || (l = (Long) i9hVar.b) == null) ? this.b : l.longValue()) * (1 << iH);
        long j = (i9hVar == null || (u9fVar2 = (u9f) i9hVar.c) == null) ? 0L : ((s9f) u9fVar2).a;
        if (i9hVar == null || (u9fVar = (u9f) i9hVar.c) == null) {
            Long l2 = this.a;
            if (l2 != null) {
                jB = l2.longValue();
            } else {
                jB = b(iH) - 1;
                if (jB < j) {
                    jB = j;
                }
            }
        } else {
            jB = ((s9f) u9fVar).b;
        }
        return wjk.b.k(j, jB + 1) + jLongValue;
    }
}
