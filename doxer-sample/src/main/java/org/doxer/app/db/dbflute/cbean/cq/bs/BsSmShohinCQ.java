package org.doxer.app.db.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.doxer.app.db.dbflute.cbean.cq.ciq.*;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The base condition-query of SM_SHOHIN.
 * @author DBFlute(AutoGenerator)
 */
public class BsSmShohinCQ extends AbstractBsSmShohinCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SmShohinCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSmShohinCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SM_SHOHIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SmShohinCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SmShohinCIQ xcreateCIQ() {
        SmShohinCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SmShohinCIQ xnewCIQ() {
        return new SmShohinCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SM_SHOHIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SmShohinCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SmShohinCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _smShohinId;
    public ConditionValue xdfgetSmShohinId()
    { if (_smShohinId == null) { _smShohinId = nCV(); }
      return _smShohinId; }
    protected ConditionValue xgetCValueSmShohinId() { return xdfgetSmShohinId(); }

    public Map<String, StShhnKnyMsCQ> xdfgetSmShohinId_ExistsReferrer_StShhnKnyMsList() { return xgetSQueMap("smShohinId_ExistsReferrer_StShhnKnyMsList"); }
    public String keepSmShohinId_ExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("smShohinId_ExistsReferrer_StShhnKnyMsList", sq); }

    public Map<String, StShhnKnyMsCQ> xdfgetSmShohinId_NotExistsReferrer_StShhnKnyMsList() { return xgetSQueMap("smShohinId_NotExistsReferrer_StShhnKnyMsList"); }
    public String keepSmShohinId_NotExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("smShohinId_NotExistsReferrer_StShhnKnyMsList", sq); }

    public Map<String, StShhnKnyMsCQ> xdfgetSmShohinId_SpecifyDerivedReferrer_StShhnKnyMsList() { return xgetSQueMap("smShohinId_SpecifyDerivedReferrer_StShhnKnyMsList"); }
    public String keepSmShohinId_SpecifyDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("smShohinId_SpecifyDerivedReferrer_StShhnKnyMsList", sq); }

    public Map<String, StShhnKnyMsCQ> xdfgetSmShohinId_QueryDerivedReferrer_StShhnKnyMsList() { return xgetSQueMap("smShohinId_QueryDerivedReferrer_StShhnKnyMsList"); }
    public String keepSmShohinId_QueryDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("smShohinId_QueryDerivedReferrer_StShhnKnyMsList", sq); }
    public Map<String, Object> xdfgetSmShohinId_QueryDerivedReferrer_StShhnKnyMsListParameter() { return xgetSQuePmMap("smShohinId_QueryDerivedReferrer_StShhnKnyMsList"); }
    public String keepSmShohinId_QueryDerivedReferrer_StShhnKnyMsListParameter(Object pm) { return xkeepSQuePm("smShohinId_QueryDerivedReferrer_StShhnKnyMsList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_SmShohinId_Asc() { regOBA("SM_SHOHIN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_SmShohinId_Desc() { regOBD("SM_SHOHIN_ID"); return this; }

    protected ConditionValue _shohinNo;
    public ConditionValue xdfgetShohinNo()
    { if (_shohinNo == null) { _shohinNo = nCV(); }
      return _shohinNo; }
    protected ConditionValue xgetCValueShohinNo() { return xdfgetShohinNo(); }

    /** 
     * Add order-by as ascend. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinNo_Asc() { regOBA("SHOHIN_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinNo_Desc() { regOBD("SHOHIN_NO"); return this; }

    protected ConditionValue _shohinMei;
    public ConditionValue xdfgetShohinMei()
    { if (_shohinMei == null) { _shohinMei = nCV(); }
      return _shohinMei; }
    protected ConditionValue xgetCValueShohinMei() { return xdfgetShohinMei(); }

    /** 
     * Add order-by as ascend. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinMei_Asc() { regOBA("SHOHIN_MEI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinMei_Desc() { regOBD("SHOHIN_MEI"); return this; }

    protected ConditionValue _shohinMeiEn;
    public ConditionValue xdfgetShohinMeiEn()
    { if (_shohinMeiEn == null) { _shohinMeiEn = nCV(); }
      return _shohinMeiEn; }
    protected ConditionValue xgetCValueShohinMeiEn() { return xdfgetShohinMeiEn(); }

    /** 
     * Add order-by as ascend. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinMeiEn_Asc() { regOBA("SHOHIN_MEI_EN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinMeiEn_Desc() { regOBD("SHOHIN_MEI_EN"); return this; }

    protected ConditionValue _shohinPrice;
    public ConditionValue xdfgetShohinPrice()
    { if (_shohinPrice == null) { _shohinPrice = nCV(); }
      return _shohinPrice; }
    protected ConditionValue xgetCValueShohinPrice() { return xdfgetShohinPrice(); }

    /** 
     * Add order-by as ascend. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinPrice_Asc() { regOBA("SHOHIN_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_ShohinPrice_Desc() { regOBD("SHOHIN_PRICE"); return this; }

    protected ConditionValue _regUserId;
    public ConditionValue xdfgetRegUserId()
    { if (_regUserId == null) { _regUserId = nCV(); }
      return _regUserId; }
    protected ConditionValue xgetCValueRegUserId() { return xdfgetRegUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

    protected ConditionValue _regTm;
    public ConditionValue xdfgetRegTm()
    { if (_regTm == null) { _regTm = nCV(); }
      return _regTm; }
    protected ConditionValue xgetCValueRegTm() { return xdfgetRegTm(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

    protected ConditionValue _regFuncCd;
    public ConditionValue xdfgetRegFuncCd()
    { if (_regFuncCd == null) { _regFuncCd = nCV(); }
      return _regFuncCd; }
    protected ConditionValue xgetCValueRegFuncCd() { return xdfgetRegFuncCd(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

    protected ConditionValue _updUserId;
    public ConditionValue xdfgetUpdUserId()
    { if (_updUserId == null) { _updUserId = nCV(); }
      return _updUserId; }
    protected ConditionValue xgetCValueUpdUserId() { return xdfgetUpdUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

    protected ConditionValue _updTm;
    public ConditionValue xdfgetUpdTm()
    { if (_updTm == null) { _updTm = nCV(); }
      return _updTm; }
    protected ConditionValue xgetCValueUpdTm() { return xdfgetUpdTm(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

    protected ConditionValue _updFuncCd;
    public ConditionValue xdfgetUpdFuncCd()
    { if (_updFuncCd == null) { _updFuncCd = nCV(); }
      return _updFuncCd; }
    protected ConditionValue xgetCValueUpdFuncCd() { return xdfgetUpdFuncCd(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSmShohinCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SmShohinCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SmShohinCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SmShohinCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SmShohinCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SmShohinCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SmShohinCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SmShohinCQ> _myselfExistsMap;
    public Map<String, SmShohinCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SmShohinCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SmShohinCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SmShohinCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SmShohinCB.class.getName(); }
    protected String xCQ() { return SmShohinCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
