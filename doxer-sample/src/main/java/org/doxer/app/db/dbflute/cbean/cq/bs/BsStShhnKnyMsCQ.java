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
 * The base condition-query of ST_SHHN_KNY_MS.
 * @author DBFlute(AutoGenerator)
 */
public class BsStShhnKnyMsCQ extends AbstractBsStShhnKnyMsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected StShhnKnyMsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsStShhnKnyMsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ST_SHHN_KNY_MS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public StShhnKnyMsCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected StShhnKnyMsCIQ xcreateCIQ() {
        StShhnKnyMsCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected StShhnKnyMsCIQ xnewCIQ() {
        return new StShhnKnyMsCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ST_SHHN_KNY_MS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public StShhnKnyMsCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        StShhnKnyMsCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stShhnKnyMsId;
    public ConditionValue xdfgetStShhnKnyMsId()
    { if (_stShhnKnyMsId == null) { _stShhnKnyMsId = nCV(); }
      return _stShhnKnyMsId; }
    protected ConditionValue xgetCValueStShhnKnyMsId() { return xdfgetStShhnKnyMsId(); }

    /** 
     * Add order-by as ascend. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_StShhnKnyMsId_Asc() { regOBA("ST_SHHN_KNY_MS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_StShhnKnyMsId_Desc() { regOBD("ST_SHHN_KNY_MS_ID"); return this; }

    protected ConditionValue _stShohinKonyuId;
    public ConditionValue xdfgetStShohinKonyuId()
    { if (_stShohinKonyuId == null) { _stShohinKonyuId = nCV(); }
      return _stShohinKonyuId; }
    protected ConditionValue xgetCValueStShohinKonyuId() { return xdfgetStShohinKonyuId(); }

    /** 
     * Add order-by as ascend. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_StShohinKonyuId_Asc() { regOBA("ST_SHOHIN_KONYU_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_StShohinKonyuId_Desc() { regOBD("ST_SHOHIN_KONYU_ID"); return this; }

    protected ConditionValue _smShohinId;
    public ConditionValue xdfgetSmShohinId()
    { if (_smShohinId == null) { _smShohinId = nCV(); }
      return _smShohinId; }
    protected ConditionValue xgetCValueSmShohinId() { return xdfgetSmShohinId(); }

    /** 
     * Add order-by as ascend. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_SmShohinId_Asc() { regOBA("SM_SHOHIN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_SmShohinId_Desc() { regOBD("SM_SHOHIN_ID"); return this; }

    protected ConditionValue _konyuSu;
    public ConditionValue xdfgetKonyuSu()
    { if (_konyuSu == null) { _konyuSu = nCV(); }
      return _konyuSu; }
    protected ConditionValue xgetCValueKonyuSu() { return xdfgetKonyuSu(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_KonyuSu_Asc() { regOBA("KONYU_SU"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_KonyuSu_Desc() { regOBD("KONYU_SU"); return this; }

    protected ConditionValue _konyuUnitPrice;
    public ConditionValue xdfgetKonyuUnitPrice()
    { if (_konyuUnitPrice == null) { _konyuUnitPrice = nCV(); }
      return _konyuUnitPrice; }
    protected ConditionValue xgetCValueKonyuUnitPrice() { return xdfgetKonyuUnitPrice(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_KonyuUnitPrice_Asc() { regOBA("KONYU_UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_KonyuUnitPrice_Desc() { regOBD("KONYU_UNIT_PRICE"); return this; }

    protected ConditionValue _konyuTax;
    public ConditionValue xdfgetKonyuTax()
    { if (_konyuTax == null) { _konyuTax = nCV(); }
      return _konyuTax; }
    protected ConditionValue xgetCValueKonyuTax() { return xdfgetKonyuTax(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_KonyuTax_Asc() { regOBA("KONYU_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_KonyuTax_Desc() { regOBD("KONYU_TAX"); return this; }

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
    public BsStShhnKnyMsCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

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
    public BsStShhnKnyMsCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

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
    public BsStShhnKnyMsCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

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
    public BsStShhnKnyMsCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

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
    public BsStShhnKnyMsCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

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
    public BsStShhnKnyMsCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

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
    public BsStShhnKnyMsCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShhnKnyMsCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsStShhnKnyMsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsStShhnKnyMsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        StShhnKnyMsCQ bq = (StShhnKnyMsCQ)bqs;
        StShhnKnyMsCQ uq = (StShhnKnyMsCQ)uqs;
        if (bq.hasConditionQueryStShohinKonyu()) {
            uq.queryStShohinKonyu().reflectRelationOnUnionQuery(bq.queryStShohinKonyu(), uq.queryStShohinKonyu());
        }
        if (bq.hasConditionQuerySmShohin()) {
            uq.querySmShohin().reflectRelationOnUnionQuery(bq.querySmShohin(), uq.querySmShohin());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'.
     * @return The instance of condition-query. (NotNull)
     */
    public StShohinKonyuCQ queryStShohinKonyu() {
        return xdfgetConditionQueryStShohinKonyu();
    }
    public StShohinKonyuCQ xdfgetConditionQueryStShohinKonyu() {
        String prop = "stShohinKonyu";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryStShohinKonyu()); xsetupOuterJoinStShohinKonyu(); }
        return xgetQueRlMap(prop);
    }
    protected StShohinKonyuCQ xcreateQueryStShohinKonyu() {
        String nrp = xresolveNRP("ST_SHHN_KNY_MS", "stShohinKonyu"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new StShohinKonyuCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "stShohinKonyu", nrp);
    }
    protected void xsetupOuterJoinStShohinKonyu() { xregOutJo("stShohinKonyu"); }
    public boolean hasConditionQueryStShohinKonyu() { return xhasQueRlMap("stShohinKonyu"); }

    /**
     * Get the condition-query for relation table. <br>
     * SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'.
     * @return The instance of condition-query. (NotNull)
     */
    public SmShohinCQ querySmShohin() {
        return xdfgetConditionQuerySmShohin();
    }
    public SmShohinCQ xdfgetConditionQuerySmShohin() {
        String prop = "smShohin";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySmShohin()); xsetupOuterJoinSmShohin(); }
        return xgetQueRlMap(prop);
    }
    protected SmShohinCQ xcreateQuerySmShohin() {
        String nrp = xresolveNRP("ST_SHHN_KNY_MS", "smShohin"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SmShohinCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "smShohin", nrp);
    }
    protected void xsetupOuterJoinSmShohin() { xregOutJo("smShohin"); }
    public boolean hasConditionQuerySmShohin() { return xhasQueRlMap("smShohin"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, StShhnKnyMsCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(StShhnKnyMsCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, StShhnKnyMsCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(StShhnKnyMsCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, StShhnKnyMsCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(StShhnKnyMsCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, StShhnKnyMsCQ> _myselfExistsMap;
    public Map<String, StShhnKnyMsCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(StShhnKnyMsCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, StShhnKnyMsCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(StShhnKnyMsCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return StShhnKnyMsCB.class.getName(); }
    protected String xCQ() { return StShhnKnyMsCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
