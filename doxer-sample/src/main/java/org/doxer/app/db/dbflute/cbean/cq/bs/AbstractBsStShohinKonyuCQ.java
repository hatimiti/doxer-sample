package org.doxer.app.db.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of ST_SHOHIN_KONYU.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsStShohinKonyuCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsStShohinKonyuCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "ST_SHOHIN_KONYU";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuId The value of stShohinKonyuId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_Equal(Long stShohinKonyuId) {
        doSetStShohinKonyuId_Equal(stShohinKonyuId);
    }

    protected void doSetStShohinKonyuId_Equal(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_EQ, stShohinKonyuId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuId The value of stShohinKonyuId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_NotEqual(Long stShohinKonyuId) {
        doSetStShohinKonyuId_NotEqual(stShohinKonyuId);
    }

    protected void doSetStShohinKonyuId_NotEqual(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_NES, stShohinKonyuId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuId The value of stShohinKonyuId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_GreaterThan(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_GT, stShohinKonyuId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuId The value of stShohinKonyuId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_LessThan(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_LT, stShohinKonyuId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuId The value of stShohinKonyuId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_GreaterEqual(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_GE, stShohinKonyuId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuId The value of stShohinKonyuId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_LessEqual(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_LE, stShohinKonyuId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of stShohinKonyuId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stShohinKonyuId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStShohinKonyuId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStShohinKonyuId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of stShohinKonyuId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stShohinKonyuId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStShohinKonyuId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStShohinKonyuId(), "ST_SHOHIN_KONYU_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuIdList The collection of stShohinKonyuId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStShohinKonyuId_InScope(Collection<Long> stShohinKonyuIdList) {
        doSetStShohinKonyuId_InScope(stShohinKonyuIdList);
    }

    protected void doSetStShohinKonyuId_InScope(Collection<Long> stShohinKonyuIdList) {
        regINS(CK_INS, cTL(stShohinKonyuIdList), xgetCValueStShohinKonyuId(), "ST_SHOHIN_KONYU_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShohinKonyuIdList The collection of stShohinKonyuId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStShohinKonyuId_NotInScope(Collection<Long> stShohinKonyuIdList) {
        doSetStShohinKonyuId_NotInScope(stShohinKonyuIdList);
    }

    protected void doSetStShohinKonyuId_NotInScope(Collection<Long> stShohinKonyuIdList) {
        regINS(CK_NINS, cTL(stShohinKonyuIdList), xgetCValueStShohinKonyuId(), "ST_SHOHIN_KONYU_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select st_shohin_konyu_id from ST_SHHN_KNY_MS where ...)} <br>
     * ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsStShhnKnyMs</span>(msCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     msCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StShhnKnyMsList for 'exists'. (NotNull)
     */
    public void existsStShhnKnyMs(SubQuery<StShhnKnyMsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStShohinKonyuId_ExistsReferrer_StShhnKnyMsList(cb.query());
        registerExistsReferrer(cb.query(), "ST_SHOHIN_KONYU_ID", "st_shohin_konyu_id", pp, "stShhnKnyMsList");
    }
    public abstract String keepStShohinKonyuId_ExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select st_shohin_konyu_id from ST_SHHN_KNY_MS where ...)} <br>
     * ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsStShhnKnyMs</span>(msCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     msCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StShohinKonyuId_NotExistsReferrer_StShhnKnyMsList for 'not exists'. (NotNull)
     */
    public void notExistsStShhnKnyMs(SubQuery<StShhnKnyMsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStShohinKonyuId_NotExistsReferrer_StShhnKnyMsList(cb.query());
        registerNotExistsReferrer(cb.query(), "ST_SHOHIN_KONYU_ID", "st_shohin_konyu_id", pp, "stShhnKnyMsList");
    }
    public abstract String keepStShohinKonyuId_NotExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);

    public void xsderiveStShhnKnyMsList(String fn, SubQuery<StShhnKnyMsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStShohinKonyuId_SpecifyDerivedReferrer_StShhnKnyMsList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ST_SHOHIN_KONYU_ID", "st_shohin_konyu_id", pp, "stShhnKnyMsList", al, op);
    }
    public abstract String keepStShohinKonyuId_SpecifyDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ST_SHHN_KNY_MS where ...)} <br>
     * ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedStShhnKnyMs()</span>.<span style="color: #CC4747">max</span>(msCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     msCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     msCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<StShhnKnyMsCB> derivedStShhnKnyMs() {
        return xcreateQDRFunctionStShhnKnyMsList();
    }
    protected HpQDRFunction<StShhnKnyMsCB> xcreateQDRFunctionStShhnKnyMsList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveStShhnKnyMsList(fn, sq, rd, vl, op));
    }
    public void xqderiveStShhnKnyMsList(String fn, SubQuery<StShhnKnyMsCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList(cb.query()); String prpp = keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ST_SHOHIN_KONYU_ID", "st_shohin_konyu_id", sqpp, "stShhnKnyMsList", rd, vl, prpp, op);
    }
    public abstract String keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);
    public abstract String keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStShohinKonyuId_IsNull() { regStShohinKonyuId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStShohinKonyuId_IsNotNull() { regStShohinKonyuId(CK_ISNN, DOBJ); }

    protected void regStShohinKonyuId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStShohinKonyuId(), "ST_SHOHIN_KONYU_ID"); }
    protected abstract ConditionValue xgetCValueStShohinKonyuId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainId The value of konyuCmShainId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuCmShainId_Equal(Long konyuCmShainId) {
        doSetKonyuCmShainId_Equal(konyuCmShainId);
    }

    protected void doSetKonyuCmShainId_Equal(Long konyuCmShainId) {
        regKonyuCmShainId(CK_EQ, konyuCmShainId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainId The value of konyuCmShainId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuCmShainId_NotEqual(Long konyuCmShainId) {
        doSetKonyuCmShainId_NotEqual(konyuCmShainId);
    }

    protected void doSetKonyuCmShainId_NotEqual(Long konyuCmShainId) {
        regKonyuCmShainId(CK_NES, konyuCmShainId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainId The value of konyuCmShainId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuCmShainId_GreaterThan(Long konyuCmShainId) {
        regKonyuCmShainId(CK_GT, konyuCmShainId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainId The value of konyuCmShainId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuCmShainId_LessThan(Long konyuCmShainId) {
        regKonyuCmShainId(CK_LT, konyuCmShainId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainId The value of konyuCmShainId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuCmShainId_GreaterEqual(Long konyuCmShainId) {
        regKonyuCmShainId(CK_GE, konyuCmShainId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainId The value of konyuCmShainId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuCmShainId_LessEqual(Long konyuCmShainId) {
        regKonyuCmShainId(CK_LE, konyuCmShainId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param minNumber The min number of konyuCmShainId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuCmShainId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setKonyuCmShainId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setKonyuCmShainId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param minNumber The min number of konyuCmShainId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuCmShainId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setKonyuCmShainId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKonyuCmShainId(), "KONYU_CM_SHAIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainIdList The collection of konyuCmShainId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuCmShainId_InScope(Collection<Long> konyuCmShainIdList) {
        doSetKonyuCmShainId_InScope(konyuCmShainIdList);
    }

    protected void doSetKonyuCmShainId_InScope(Collection<Long> konyuCmShainIdList) {
        regINS(CK_INS, cTL(konyuCmShainIdList), xgetCValueKonyuCmShainId(), "KONYU_CM_SHAIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @param konyuCmShainIdList The collection of konyuCmShainId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuCmShainId_NotInScope(Collection<Long> konyuCmShainIdList) {
        doSetKonyuCmShainId_NotInScope(konyuCmShainIdList);
    }

    protected void doSetKonyuCmShainId_NotInScope(Collection<Long> konyuCmShainIdList) {
        regINS(CK_NINS, cTL(konyuCmShainIdList), xgetCValueKonyuCmShainId(), "KONYU_CM_SHAIN_ID");
    }

    protected void regKonyuCmShainId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKonyuCmShainId(), "KONYU_CM_SHAIN_ID"); }
    protected abstract ConditionValue xgetCValueKonyuCmShainId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_Equal(String konyuYmd) {
        doSetKonyuYmd_Equal(fRES(konyuYmd));
    }

    protected void doSetKonyuYmd_Equal(String konyuYmd) {
        regKonyuYmd(CK_EQ, konyuYmd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_NotEqual(String konyuYmd) {
        doSetKonyuYmd_NotEqual(fRES(konyuYmd));
    }

    protected void doSetKonyuYmd_NotEqual(String konyuYmd) {
        regKonyuYmd(CK_NES, konyuYmd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_GreaterThan(String konyuYmd) {
        regKonyuYmd(CK_GT, fRES(konyuYmd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_LessThan(String konyuYmd) {
        regKonyuYmd(CK_LT, fRES(konyuYmd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_GreaterEqual(String konyuYmd) {
        regKonyuYmd(CK_GE, fRES(konyuYmd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_LessEqual(String konyuYmd) {
        regKonyuYmd(CK_LE, fRES(konyuYmd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmdList The collection of konyuYmd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_InScope(Collection<String> konyuYmdList) {
        doSetKonyuYmd_InScope(konyuYmdList);
    }

    protected void doSetKonyuYmd_InScope(Collection<String> konyuYmdList) {
        regINS(CK_INS, cTL(konyuYmdList), xgetCValueKonyuYmd(), "KONYU_YMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmdList The collection of konyuYmd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuYmd_NotInScope(Collection<String> konyuYmdList) {
        doSetKonyuYmd_NotInScope(konyuYmdList);
    }

    protected void doSetKonyuYmd_NotInScope(Collection<String> konyuYmdList) {
        regINS(CK_NINS, cTL(konyuYmdList), xgetCValueKonyuYmd(), "KONYU_YMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_YMD: {CHAR(8)} <br>
     * <pre>e.g. setKonyuYmd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param konyuYmd The value of konyuYmd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKonyuYmd_LikeSearch(String konyuYmd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKonyuYmd_LikeSearch(konyuYmd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_YMD: {CHAR(8)} <br>
     * <pre>e.g. setKonyuYmd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param konyuYmd The value of konyuYmd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKonyuYmd_LikeSearch(String konyuYmd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(konyuYmd), xgetCValueKonyuYmd(), "KONYU_YMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKonyuYmd_NotLikeSearch(String konyuYmd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKonyuYmd_NotLikeSearch(konyuYmd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     * @param konyuYmd The value of konyuYmd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKonyuYmd_NotLikeSearch(String konyuYmd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(konyuYmd), xgetCValueKonyuYmd(), "KONYU_YMD", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     */
    public void setKonyuYmd_IsNull() { regKonyuYmd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     */
    public void setKonyuYmd_IsNullOrEmpty() { regKonyuYmd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KONYU_YMD: {CHAR(8)}
     */
    public void setKonyuYmd_IsNotNull() { regKonyuYmd(CK_ISNN, DOBJ); }

    protected void regKonyuYmd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKonyuYmd(), "KONYU_YMD"); }
    protected abstract ConditionValue xgetCValueKonyuYmd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_Equal(String konyuTm) {
        doSetKonyuTm_Equal(fRES(konyuTm));
    }

    protected void doSetKonyuTm_Equal(String konyuTm) {
        regKonyuTm(CK_EQ, konyuTm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_NotEqual(String konyuTm) {
        doSetKonyuTm_NotEqual(fRES(konyuTm));
    }

    protected void doSetKonyuTm_NotEqual(String konyuTm) {
        regKonyuTm(CK_NES, konyuTm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_GreaterThan(String konyuTm) {
        regKonyuTm(CK_GT, fRES(konyuTm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_LessThan(String konyuTm) {
        regKonyuTm(CK_LT, fRES(konyuTm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_GreaterEqual(String konyuTm) {
        regKonyuTm(CK_GE, fRES(konyuTm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_LessEqual(String konyuTm) {
        regKonyuTm(CK_LE, fRES(konyuTm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTmList The collection of konyuTm as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_InScope(Collection<String> konyuTmList) {
        doSetKonyuTm_InScope(konyuTmList);
    }

    protected void doSetKonyuTm_InScope(Collection<String> konyuTmList) {
        regINS(CK_INS, cTL(konyuTmList), xgetCValueKonyuTm(), "KONYU_TM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTmList The collection of konyuTm as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTm_NotInScope(Collection<String> konyuTmList) {
        doSetKonyuTm_NotInScope(konyuTmList);
    }

    protected void doSetKonyuTm_NotInScope(Collection<String> konyuTmList) {
        regINS(CK_NINS, cTL(konyuTmList), xgetCValueKonyuTm(), "KONYU_TM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_TM: {CHAR(4)} <br>
     * <pre>e.g. setKonyuTm_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param konyuTm The value of konyuTm as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKonyuTm_LikeSearch(String konyuTm, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKonyuTm_LikeSearch(konyuTm, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_TM: {CHAR(4)} <br>
     * <pre>e.g. setKonyuTm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param konyuTm The value of konyuTm as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKonyuTm_LikeSearch(String konyuTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(konyuTm), xgetCValueKonyuTm(), "KONYU_TM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKonyuTm_NotLikeSearch(String konyuTm, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKonyuTm_NotLikeSearch(konyuTm, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     * @param konyuTm The value of konyuTm as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKonyuTm_NotLikeSearch(String konyuTm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(konyuTm), xgetCValueKonyuTm(), "KONYU_TM", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     */
    public void setKonyuTm_IsNull() { regKonyuTm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     */
    public void setKonyuTm_IsNullOrEmpty() { regKonyuTm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KONYU_TM: {CHAR(4)}
     */
    public void setKonyuTm_IsNotNull() { regKonyuTm(CK_ISNN, DOBJ); }

    protected void regKonyuTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKonyuTm(), "KONYU_TM"); }
    protected abstract ConditionValue xgetCValueKonyuTm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPrice The value of konyuPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuPrice_Equal(Integer konyuPrice) {
        doSetKonyuPrice_Equal(konyuPrice);
    }

    protected void doSetKonyuPrice_Equal(Integer konyuPrice) {
        regKonyuPrice(CK_EQ, konyuPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPrice The value of konyuPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuPrice_NotEqual(Integer konyuPrice) {
        doSetKonyuPrice_NotEqual(konyuPrice);
    }

    protected void doSetKonyuPrice_NotEqual(Integer konyuPrice) {
        regKonyuPrice(CK_NES, konyuPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPrice The value of konyuPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuPrice_GreaterThan(Integer konyuPrice) {
        regKonyuPrice(CK_GT, konyuPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPrice The value of konyuPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuPrice_LessThan(Integer konyuPrice) {
        regKonyuPrice(CK_LT, konyuPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPrice The value of konyuPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuPrice_GreaterEqual(Integer konyuPrice) {
        regKonyuPrice(CK_GE, konyuPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPrice The value of konyuPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuPrice_LessEqual(Integer konyuPrice) {
        regKonyuPrice(CK_LE, konyuPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of konyuPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuPrice. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setKonyuPrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setKonyuPrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of konyuPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuPrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setKonyuPrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKonyuPrice(), "KONYU_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPriceList The collection of konyuPrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuPrice_InScope(Collection<Integer> konyuPriceList) {
        doSetKonyuPrice_InScope(konyuPriceList);
    }

    protected void doSetKonyuPrice_InScope(Collection<Integer> konyuPriceList) {
        regINS(CK_INS, cTL(konyuPriceList), xgetCValueKonyuPrice(), "KONYU_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuPriceList The collection of konyuPrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuPrice_NotInScope(Collection<Integer> konyuPriceList) {
        doSetKonyuPrice_NotInScope(konyuPriceList);
    }

    protected void doSetKonyuPrice_NotInScope(Collection<Integer> konyuPriceList) {
        regINS(CK_NINS, cTL(konyuPriceList), xgetCValueKonyuPrice(), "KONYU_PRICE");
    }

    protected void regKonyuPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKonyuPrice(), "KONYU_PRICE"); }
    protected abstract ConditionValue xgetCValueKonyuPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTax The value of konyuTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuTax_Equal(Integer konyuTax) {
        doSetKonyuTax_Equal(konyuTax);
    }

    protected void doSetKonyuTax_Equal(Integer konyuTax) {
        regKonyuTax(CK_EQ, konyuTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTax The value of konyuTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuTax_NotEqual(Integer konyuTax) {
        doSetKonyuTax_NotEqual(konyuTax);
    }

    protected void doSetKonyuTax_NotEqual(Integer konyuTax) {
        regKonyuTax(CK_NES, konyuTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTax The value of konyuTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuTax_GreaterThan(Integer konyuTax) {
        regKonyuTax(CK_GT, konyuTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTax The value of konyuTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuTax_LessThan(Integer konyuTax) {
        regKonyuTax(CK_LT, konyuTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTax The value of konyuTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuTax_GreaterEqual(Integer konyuTax) {
        regKonyuTax(CK_GE, konyuTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTax The value of konyuTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuTax_LessEqual(Integer konyuTax) {
        regKonyuTax(CK_LE, konyuTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of konyuTax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuTax. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setKonyuTax_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setKonyuTax_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of konyuTax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuTax. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setKonyuTax_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKonyuTax(), "KONYU_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTaxList The collection of konyuTax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTax_InScope(Collection<Integer> konyuTaxList) {
        doSetKonyuTax_InScope(konyuTaxList);
    }

    protected void doSetKonyuTax_InScope(Collection<Integer> konyuTaxList) {
        regINS(CK_INS, cTL(konyuTaxList), xgetCValueKonyuTax(), "KONYU_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @param konyuTaxList The collection of konyuTax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuTax_NotInScope(Collection<Integer> konyuTaxList) {
        doSetKonyuTax_NotInScope(konyuTaxList);
    }

    protected void doSetKonyuTax_NotInScope(Collection<Integer> konyuTaxList) {
        regINS(CK_NINS, cTL(konyuTaxList), xgetCValueKonyuTax(), "KONYU_TAX");
    }

    protected void regKonyuTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKonyuTax(), "KONYU_TAX"); }
    protected abstract ConditionValue xgetCValueKonyuTax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_Equal(String regUserId) {
        doSetRegUserId_Equal(fRES(regUserId));
    }

    protected void doSetRegUserId_Equal(String regUserId) {
        regRegUserId(CK_EQ, regUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_NotEqual(String regUserId) {
        doSetRegUserId_NotEqual(fRES(regUserId));
    }

    protected void doSetRegUserId_NotEqual(String regUserId) {
        regRegUserId(CK_NES, regUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_GreaterThan(String regUserId) {
        regRegUserId(CK_GT, fRES(regUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_LessThan(String regUserId) {
        regRegUserId(CK_LT, fRES(regUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_GreaterEqual(String regUserId) {
        regRegUserId(CK_GE, fRES(regUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_LessEqual(String regUserId) {
        regRegUserId(CK_LE, fRES(regUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_InScope(Collection<String> regUserIdList) {
        doSetRegUserId_InScope(regUserIdList);
    }

    protected void doSetRegUserId_InScope(Collection<String> regUserIdList) {
        regINS(CK_INS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_NotInScope(Collection<String> regUserIdList) {
        doSetRegUserId_NotInScope(regUserIdList);
    }

    protected void doSetRegUserId_NotInScope(Collection<String> regUserIdList) {
        regINS(CK_NINS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regUserId The value of regUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_LikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_LikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regUserId The value of regUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegUserId_LikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_NotLikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_NotLikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegUserId_NotLikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    protected void regRegUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegUserId(), "REG_USER_ID"); }
    protected abstract ConditionValue xgetCValueRegUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_Equal(java.time.LocalDateTime regTm) {
        regRegTm(CK_EQ,  regTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_GreaterThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_GT,  regTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_LessThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_LT,  regTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_GreaterEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_GE,  regTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_LessEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_LE, regTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REG_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegTm(), nm, op);
    }

    protected void regRegTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegTm(), "REG_TM"); }
    protected abstract ConditionValue xgetCValueRegTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_Equal(String regFuncCd) {
        doSetRegFuncCd_Equal(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_Equal(String regFuncCd) {
        regRegFuncCd(CK_EQ, regFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_NotEqual(String regFuncCd) {
        doSetRegFuncCd_NotEqual(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_NotEqual(String regFuncCd) {
        regRegFuncCd(CK_NES, regFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_GreaterThan(String regFuncCd) {
        regRegFuncCd(CK_GT, fRES(regFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_LessThan(String regFuncCd) {
        regRegFuncCd(CK_LT, fRES(regFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_GreaterEqual(String regFuncCd) {
        regRegFuncCd(CK_GE, fRES(regFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_LessEqual(String regFuncCd) {
        regRegFuncCd(CK_LE, fRES(regFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_InScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_InScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_InScope(Collection<String> regFuncCdList) {
        regINS(CK_INS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_NotInScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        regINS(CK_NINS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_LikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_LikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegFuncCd_LikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_NotLikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_NotLikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegFuncCd_NotLikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    protected void regRegFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegFuncCd(), "REG_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueRegFuncCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_Equal(String updUserId) {
        doSetUpdUserId_Equal(fRES(updUserId));
    }

    protected void doSetUpdUserId_Equal(String updUserId) {
        regUpdUserId(CK_EQ, updUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_NotEqual(String updUserId) {
        doSetUpdUserId_NotEqual(fRES(updUserId));
    }

    protected void doSetUpdUserId_NotEqual(String updUserId) {
        regUpdUserId(CK_NES, updUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_GreaterThan(String updUserId) {
        regUpdUserId(CK_GT, fRES(updUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_LessThan(String updUserId) {
        regUpdUserId(CK_LT, fRES(updUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_GreaterEqual(String updUserId) {
        regUpdUserId(CK_GE, fRES(updUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_LessEqual(String updUserId) {
        regUpdUserId(CK_LE, fRES(updUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_InScope(Collection<String> updUserIdList) {
        doSetUpdUserId_InScope(updUserIdList);
    }

    protected void doSetUpdUserId_InScope(Collection<String> updUserIdList) {
        regINS(CK_INS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_NotInScope(Collection<String> updUserIdList) {
        doSetUpdUserId_NotInScope(updUserIdList);
    }

    protected void doSetUpdUserId_NotInScope(Collection<String> updUserIdList) {
        regINS(CK_NINS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updUserId The value of updUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_LikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_LikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updUserId The value of updUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdUserId_LikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_NotLikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_NotLikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdUserId_NotLikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    protected void regUpdUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUserId(), "UPD_USER_ID"); }
    protected abstract ConditionValue xgetCValueUpdUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_Equal(java.time.LocalDateTime updTm) {
        regUpdTm(CK_EQ,  updTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_GreaterThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GT,  updTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_LessThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LT,  updTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_GreaterEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GE,  updTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_LessEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LE, updTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPD_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdTm(), nm, op);
    }

    protected void regUpdTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdTm(), "UPD_TM"); }
    protected abstract ConditionValue xgetCValueUpdTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_Equal(String updFuncCd) {
        doSetUpdFuncCd_Equal(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_Equal(String updFuncCd) {
        regUpdFuncCd(CK_EQ, updFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_NotEqual(String updFuncCd) {
        doSetUpdFuncCd_NotEqual(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_NotEqual(String updFuncCd) {
        regUpdFuncCd(CK_NES, updFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_GreaterThan(String updFuncCd) {
        regUpdFuncCd(CK_GT, fRES(updFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_LessThan(String updFuncCd) {
        regUpdFuncCd(CK_LT, fRES(updFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_GreaterEqual(String updFuncCd) {
        regUpdFuncCd(CK_GE, fRES(updFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_LessEqual(String updFuncCd) {
        regUpdFuncCd(CK_LE, fRES(updFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_InScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        regINS(CK_INS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_NotInScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        regINS(CK_NINS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_LikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_LikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdFuncCd_LikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_NotLikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_NotLikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdFuncCd_NotLikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    protected void regUpdFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdFuncCd(), "UPD_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueUpdFuncCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StShohinKonyuCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, StShohinKonyuCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StShohinKonyuCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, StShohinKonyuCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StShohinKonyuCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, StShohinKonyuCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StShohinKonyuCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, StShohinKonyuCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StShohinKonyuCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, StShohinKonyuCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;StShohinKonyuCB&gt;() {
     *     public void query(StShohinKonyuCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StShohinKonyuCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, StShohinKonyuCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        StShohinKonyuCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(StShohinKonyuCQ sq);

    protected StShohinKonyuCB xcreateScalarConditionCB() {
        StShohinKonyuCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected StShohinKonyuCB xcreateScalarConditionPartitionByCB() {
        StShohinKonyuCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<StShohinKonyuCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShohinKonyuCB cb = new StShohinKonyuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ST_SHOHIN_KONYU_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(StShohinKonyuCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<StShohinKonyuCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(StShohinKonyuCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShohinKonyuCB cb = new StShohinKonyuCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ST_SHOHIN_KONYU_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(StShohinKonyuCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<StShohinKonyuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShohinKonyuCB cb = new StShohinKonyuCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(StShohinKonyuCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected StShohinKonyuCB newMyCB() {
        return new StShohinKonyuCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return StShohinKonyuCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
