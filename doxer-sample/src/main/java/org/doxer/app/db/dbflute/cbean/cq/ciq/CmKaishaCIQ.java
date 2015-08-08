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
 * The condition-query for in-line of CM_KAISHA.
 * @author DBFlute(AutoGenerator)
 */
public class CmKaishaCIQ extends AbstractBsCmKaishaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCmKaishaCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CmKaishaCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCmKaishaCQ myCQ) {
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
    protected ConditionValue xgetCValueCmKaishaId() { return _myCQ.xdfgetCmKaishaId(); }
    public String keepCmKaishaId_ExistsReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCmKaishaId_ExistsReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCmKaishaId_ExistsReferrer_CmShainList(CmShainCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCmKaishaId_NotExistsReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCmKaishaId_NotExistsReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCmKaishaId_NotExistsReferrer_CmShainList(CmShainCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCmKaishaId_SpecifyDerivedReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCmKaishaId_SpecifyDerivedReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCmKaishaId_SpecifyDerivedReferrer_CmShainList(CmShainCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoList(CmKishTesuryoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishTesuryoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiList(CmKishRenrakusakiCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCmKaishaId_QueryDerivedReferrer_CmKishRenrakusakiListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCmKaishaId_QueryDerivedReferrer_CmShainList(CmShainCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCmKaishaId_QueryDerivedReferrer_CmShainListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueKaishaMei() { return _myCQ.xdfgetKaishaMei(); }
    protected ConditionValue xgetCValueKaishaMeiEn() { return _myCQ.xdfgetKaishaMeiEn(); }
    protected ConditionValue xgetCValueRegUserId() { return _myCQ.xdfgetRegUserId(); }
    protected ConditionValue xgetCValueRegTm() { return _myCQ.xdfgetRegTm(); }
    protected ConditionValue xgetCValueRegFuncCd() { return _myCQ.xdfgetRegFuncCd(); }
    protected ConditionValue xgetCValueUpdUserId() { return _myCQ.xdfgetUpdUserId(); }
    protected ConditionValue xgetCValueUpdTm() { return _myCQ.xdfgetUpdTm(); }
    protected ConditionValue xgetCValueUpdFuncCd() { return _myCQ.xdfgetUpdFuncCd(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CmKaishaCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CmKaishaCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CmKaishaCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CmKaishaCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CmKaishaCB.class.getName(); }
    protected String xinCQ() { return CmKaishaCQ.class.getName(); }
}
