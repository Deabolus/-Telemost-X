package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class fsc {
    public final lfg a;
    public final poq b;
    public final t8n c;
    public final g2e d;
    public final tin e;
    public final qsa f;
    public final pze g;

    public fsc(lfg lfgVar, poq poqVar, t8n t8nVar, ro6 ro6Var, g2e g2eVar, tin tinVar, qsa qsaVar, pze pzeVar) {
        mqd.z(lfgVar, "environment");
        mqd.z(poqVar, "apiHostHandler");
        mqd.z(t8nVar, "filesHostHandler");
        mqd.z(ro6Var, "balancerHostHandler");
        mqd.z(g2eVar, "reactionsHostHandler");
        mqd.z(tinVar, "toolsHostHandler");
        mqd.z(qsaVar, "telemostCloudApiHostHandler");
        mqd.z(pzeVar, "configPathHandler");
        this.a = lfgVar;
        this.b = poqVar;
        this.c = t8nVar;
        this.d = g2eVar;
        this.e = tinVar;
        this.f = qsaVar;
        this.g = pzeVar;
    }

    public final String a() {
        return (String) this.a.d(this.e);
    }
}
