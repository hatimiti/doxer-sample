package org.doxer.app.db.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.bs.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of ST_SHOHIN_KONYU.
 * @author DBFlute(AutoGenerator)
 */
public class StShohinKonyuCIQ extends AbstractBsStShohinKonyuCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsStShohinKonyuCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public StShohinKonyuCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsStShohinKonyuCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueStShohinKonyuId() { return _myCQ.xdfgetStShohinKonyuId(); }
    public String keepStShohinKonyuId_ExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStShohinKonyuId_NotExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStShohinKonyuId_SpecifyDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueKonyuCmShainId() { return _myCQ.xdfgetKonyuCmShainId(); }
    protected ConditionValue xgetCValueKonyuYmd() { return _myCQ.xdfgetKonyuYmd(); }
    protected ConditionValue xgetCValueKonyuTm() { return _myCQ.xdfgetKonyuTm(); }
    protected ConditionValue xgetCValueKonyuPrice() { return _myCQ.xdfgetKonyuPrice(); }
    protected ConditionValue xgetCValueKonyuTax() { return _myCQ.xdfgetKonyuTax(); }
    protected ConditionValue xgetCValueRegUserId() { return _myCQ.xdfgetRegUserId(); }
    protected ConditionValue xgetCValueRegTm() { return _myCQ.xdfgetRegTm(); }
    protected ConditionValue xgetCValueRegFuncCd() { return _myCQ.xdfgetRegFuncCd(); }
    protected ConditionValue xgetCValueUpdUserId() { return _myCQ.xdfgetUpdUserId(); }
    protected ConditionValue xgetCValueUpdTm() { return _myCQ.xdfgetUpdTm(); }
    protected ConditionValue xgetCValueUpdFuncCd() { return _myCQ.xdfgetUpdFuncCd(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(StShohinKonyuCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(StShohinKonyuCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(StShohinKonyuCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(StShohinKonyuCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return StShohinKonyuCB.class.getName(); }
    protected String xinCQ() { return StShohinKonyuCQ.class.getName(); }
}
