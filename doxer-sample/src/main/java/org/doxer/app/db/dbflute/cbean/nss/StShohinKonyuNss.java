package org.doxer.app.db.dbflute.cbean.nss;

import org.doxer.app.db.dbflute.cbean.cq.StShohinKonyuCQ;

/**
 * The nest select set-upper of ST_SHOHIN_KONYU.
 * @author DBFlute(AutoGenerator)
 */
public class StShohinKonyuNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final StShohinKonyuCQ _query;
    public StShohinKonyuNss(StShohinKonyuCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * CM_SHAIN by my KONYU_CM_SHAIN_ID, named 'cmShain'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CmShainNss withCmShain() {
        _query.xdoNss(() -> _query.queryCmShain());
        return new CmShainNss(_query.queryCmShain());
    }
}
