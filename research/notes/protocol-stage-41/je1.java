package defpackage;

import com.yandex.messaging.core.net.entities.StickerPacksData;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class je1 extends bff {
    public final /* synthetic */ qe1 i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ qd1 k;

    public je1(qe1 qe1Var, ArrayList arrayList, qd1 qd1Var) {
        this.i = qe1Var;
        this.j = arrayList;
        this.k = qd1Var;
    }

    public final void E(Object obj) {
        StickerPacksData.PackData[] packDataArr = (StickerPacksData.PackData[]) obj;
        mqd.z(packDataArr, "response");
        this.k.c0(packDataArr);
    }

    public final g5l I() {
        return this.i.c.a("stickers/packs", this.j);
    }

    public final znc s(ocl oclVar) {
        return fde.j(this.i.b, "stickers/packs", StickerPacksData.PackData[].class, oclVar);
    }
}
