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
 * The condition-query for in-line of ST_SHHN_KNY_MS.
 * @author DBFlute(AutoGenerator)
 */
public class StShhnKnyMsCIQ extends AbstractBsStShhnKnyMsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsStShhnKnyMsCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public StShhnKnyMsCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsStShhnKnyMsCQ myCQ) {
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
    protected ConditionValue xgetCValueStShhnKnyMsId() { return _myCQ.xdfgetStShhnKnyMsId(); }
    protected ConditionValue xgetCValueStShohinKonyuId() { return _myCQ.xdfgetStShohinKonyuId(); }
    protected ConditionValue xgetCValueSmShohinId() { return _myCQ.xdfgetSmShohinId(); }
    protected ConditionValue xgetCValueKonyuSu() { return _myCQ.xdfgetKonyuSu(); }
    protected ConditionValue xgetCValueKonyuUnitPrice() { return _myCQ.xdfgetKonyuUnitPrice(); }
    protected ConditionValue xgetCValueKonyuTax() { return _myCQ.xdfgetKonyuTax(); }
    protected ConditionValue xgetCValueRegUserId() { return _myCQ.xdfgetRegUserId(); }
    protected ConditionValue xgetCValueRegTm() { return _myCQ.xdfgetRegTm(); }
    protected ConditionValue xgetCValueRegFuncCd() { return _myCQ.xdfgetRegFuncCd(); }
    protected ConditionValue xgetCValueUpdUserId() { return _myCQ.xdfgetUpdUserId(); }
    protected ConditionValue xgetCValueUpdTm() { return _myCQ.xdfgetUpdTm(); }
    protected ConditionValue xgetCValueUpdFuncCd() { return _myCQ.xdfgetUpdFuncCd(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(StShhnKnyMsCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(StShhnKnyMsCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(StShhnKnyMsCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(StShhnKnyMsCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return StShhnKnyMsCB.class.getName(); }
    protected String xinCQ() { return StShhnKnyMsCQ.class.getName(); }
}
