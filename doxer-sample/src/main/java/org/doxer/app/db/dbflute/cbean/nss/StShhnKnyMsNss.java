package org.doxer.app.db.dbflute.cbean.nss;

import org.doxer.app.db.dbflute.cbean.cq.StShhnKnyMsCQ;

/**
 * The nest select set-upper of ST_SHHN_KNY_MS.
 * @author DBFlute(AutoGenerator)
 */
public class StShhnKnyMsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final StShhnKnyMsCQ _query;
    public StShhnKnyMsNss(StShhnKnyMsCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public StShohinKonyuNss withStShohinKonyu() {
        _query.xdoNss(() -> _query.queryStShohinKonyu());
        return new StShohinKonyuNss(_query.queryStShohinKonyu());
    }
    /**
     * With nested relation columns to select clause. <br>
     * SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'.
     */
    public void withSmShohin() {
        _query.xdoNss(() -> _query.querySmShohin());
    }
}
