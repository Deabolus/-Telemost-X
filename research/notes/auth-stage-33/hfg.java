package defpackage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class hfg extends lfg {
    public hfg() {
        super("PRODUCTION", 2);
    }

    @Override // defpackage.lfg
    public final g91 b() {
        return g91.d;
    }

    @Override // defpackage.lfg
    public final Object d(gfg gfgVar) {
        mqd.z(gfgVar, "handler");
        return gfgVar.I();
    }

    @Override // defpackage.lfg
    public final boolean e() {
        return true;
    }

    @Override // defpackage.lfg
    public final String h() {
        return "https://pay.yandex.ru/transaction/%s";
    }
}
