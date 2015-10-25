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
 * The abstract condition-query of ST_SHHN_KNY_MS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsStShhnKnyMsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsStShhnKnyMsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "ST_SHHN_KNY_MS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsId The value of stShhnKnyMsId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShhnKnyMsId_Equal(Long stShhnKnyMsId) {
        doSetStShhnKnyMsId_Equal(stShhnKnyMsId);
    }

    protected void doSetStShhnKnyMsId_Equal(Long stShhnKnyMsId) {
        regStShhnKnyMsId(CK_EQ, stShhnKnyMsId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsId The value of stShhnKnyMsId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShhnKnyMsId_NotEqual(Long stShhnKnyMsId) {
        doSetStShhnKnyMsId_NotEqual(stShhnKnyMsId);
    }

    protected void doSetStShhnKnyMsId_NotEqual(Long stShhnKnyMsId) {
        regStShhnKnyMsId(CK_NES, stShhnKnyMsId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsId The value of stShhnKnyMsId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShhnKnyMsId_GreaterThan(Long stShhnKnyMsId) {
        regStShhnKnyMsId(CK_GT, stShhnKnyMsId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsId The value of stShhnKnyMsId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShhnKnyMsId_LessThan(Long stShhnKnyMsId) {
        regStShhnKnyMsId(CK_LT, stShhnKnyMsId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsId The value of stShhnKnyMsId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShhnKnyMsId_GreaterEqual(Long stShhnKnyMsId) {
        regStShhnKnyMsId(CK_GE, stShhnKnyMsId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsId The value of stShhnKnyMsId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShhnKnyMsId_LessEqual(Long stShhnKnyMsId) {
        regStShhnKnyMsId(CK_LE, stShhnKnyMsId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of stShhnKnyMsId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stShhnKnyMsId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStShhnKnyMsId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStShhnKnyMsId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of stShhnKnyMsId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stShhnKnyMsId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStShhnKnyMsId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStShhnKnyMsId(), "ST_SHHN_KNY_MS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsIdList The collection of stShhnKnyMsId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStShhnKnyMsId_InScope(Collection<Long> stShhnKnyMsIdList) {
        doSetStShhnKnyMsId_InScope(stShhnKnyMsIdList);
    }

    protected void doSetStShhnKnyMsId_InScope(Collection<Long> stShhnKnyMsIdList) {
        regINS(CK_INS, cTL(stShhnKnyMsIdList), xgetCValueStShhnKnyMsId(), "ST_SHHN_KNY_MS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param stShhnKnyMsIdList The collection of stShhnKnyMsId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStShhnKnyMsId_NotInScope(Collection<Long> stShhnKnyMsIdList) {
        doSetStShhnKnyMsId_NotInScope(stShhnKnyMsIdList);
    }

    protected void doSetStShhnKnyMsId_NotInScope(Collection<Long> stShhnKnyMsIdList) {
        regINS(CK_NINS, cTL(stShhnKnyMsIdList), xgetCValueStShhnKnyMsId(), "ST_SHHN_KNY_MS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStShhnKnyMsId_IsNull() { regStShhnKnyMsId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStShhnKnyMsId_IsNotNull() { regStShhnKnyMsId(CK_ISNN, DOBJ); }

    protected void regStShhnKnyMsId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStShhnKnyMsId(), "ST_SHHN_KNY_MS_ID"); }
    protected abstract ConditionValue xgetCValueStShhnKnyMsId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
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
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
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
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @param stShohinKonyuId The value of stShohinKonyuId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_GreaterThan(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_GT, stShohinKonyuId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @param stShohinKonyuId The value of stShohinKonyuId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_LessThan(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_LT, stShohinKonyuId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @param stShohinKonyuId The value of stShohinKonyuId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_GreaterEqual(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_GE, stShohinKonyuId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @param stShohinKonyuId The value of stShohinKonyuId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStShohinKonyuId_LessEqual(Long stShohinKonyuId) {
        regStShohinKonyuId(CK_LE, stShohinKonyuId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
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
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @param minNumber The min number of stShohinKonyuId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stShohinKonyuId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStShohinKonyuId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStShohinKonyuId(), "ST_SHOHIN_KONYU_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
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
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @param stShohinKonyuIdList The collection of stShohinKonyuId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStShohinKonyuId_NotInScope(Collection<Long> stShohinKonyuIdList) {
        doSetStShohinKonyuId_NotInScope(stShohinKonyuIdList);
    }

    protected void doSetStShohinKonyuId_NotInScope(Collection<Long> stShohinKonyuIdList) {
        regINS(CK_NINS, cTL(stShohinKonyuIdList), xgetCValueStShohinKonyuId(), "ST_SHOHIN_KONYU_ID");
    }

    protected void regStShohinKonyuId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStShohinKonyuId(), "ST_SHOHIN_KONYU_ID"); }
    protected abstract ConditionValue xgetCValueStShohinKonyuId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinId The value of smShohinId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_Equal(Long smShohinId) {
        doSetSmShohinId_Equal(smShohinId);
    }

    protected void doSetSmShohinId_Equal(Long smShohinId) {
        regSmShohinId(CK_EQ, smShohinId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinId The value of smShohinId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_NotEqual(Long smShohinId) {
        doSetSmShohinId_NotEqual(smShohinId);
    }

    protected void doSetSmShohinId_NotEqual(Long smShohinId) {
        regSmShohinId(CK_NES, smShohinId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinId The value of smShohinId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_GreaterThan(Long smShohinId) {
        regSmShohinId(CK_GT, smShohinId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinId The value of smShohinId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_LessThan(Long smShohinId) {
        regSmShohinId(CK_LT, smShohinId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinId The value of smShohinId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_GreaterEqual(Long smShohinId) {
        regSmShohinId(CK_GE, smShohinId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinId The value of smShohinId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_LessEqual(Long smShohinId) {
        regSmShohinId(CK_LE, smShohinId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param minNumber The min number of smShohinId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of smShohinId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSmShohinId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSmShohinId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param minNumber The min number of smShohinId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of smShohinId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSmShohinId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSmShohinId(), "SM_SHOHIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinIdList The collection of smShohinId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSmShohinId_InScope(Collection<Long> smShohinIdList) {
        doSetSmShohinId_InScope(smShohinIdList);
    }

    protected void doSetSmShohinId_InScope(Collection<Long> smShohinIdList) {
        regINS(CK_INS, cTL(smShohinIdList), xgetCValueSmShohinId(), "SM_SHOHIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @param smShohinIdList The collection of smShohinId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSmShohinId_NotInScope(Collection<Long> smShohinIdList) {
        doSetSmShohinId_NotInScope(smShohinIdList);
    }

    protected void doSetSmShohinId_NotInScope(Collection<Long> smShohinIdList) {
        regINS(CK_NINS, cTL(smShohinIdList), xgetCValueSmShohinId(), "SM_SHOHIN_ID");
    }

    protected void regSmShohinId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSmShohinId(), "SM_SHOHIN_ID"); }
    protected abstract ConditionValue xgetCValueSmShohinId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSu The value of konyuSu as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuSu_Equal(Integer konyuSu) {
        doSetKonyuSu_Equal(konyuSu);
    }

    protected void doSetKonyuSu_Equal(Integer konyuSu) {
        regKonyuSu(CK_EQ, konyuSu);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSu The value of konyuSu as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuSu_NotEqual(Integer konyuSu) {
        doSetKonyuSu_NotEqual(konyuSu);
    }

    protected void doSetKonyuSu_NotEqual(Integer konyuSu) {
        regKonyuSu(CK_NES, konyuSu);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSu The value of konyuSu as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuSu_GreaterThan(Integer konyuSu) {
        regKonyuSu(CK_GT, konyuSu);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSu The value of konyuSu as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuSu_LessThan(Integer konyuSu) {
        regKonyuSu(CK_LT, konyuSu);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSu The value of konyuSu as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuSu_GreaterEqual(Integer konyuSu) {
        regKonyuSu(CK_GE, konyuSu);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSu The value of konyuSu as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuSu_LessEqual(Integer konyuSu) {
        regKonyuSu(CK_LE, konyuSu);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param minNumber The min number of konyuSu. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuSu. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setKonyuSu_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setKonyuSu_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param minNumber The min number of konyuSu. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuSu. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setKonyuSu_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKonyuSu(), "KONYU_SU", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSuList The collection of konyuSu as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuSu_InScope(Collection<Integer> konyuSuList) {
        doSetKonyuSu_InScope(konyuSuList);
    }

    protected void doSetKonyuSu_InScope(Collection<Integer> konyuSuList) {
        regINS(CK_INS, cTL(konyuSuList), xgetCValueKonyuSu(), "KONYU_SU");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @param konyuSuList The collection of konyuSu as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuSu_NotInScope(Collection<Integer> konyuSuList) {
        doSetKonyuSu_NotInScope(konyuSuList);
    }

    protected void doSetKonyuSu_NotInScope(Collection<Integer> konyuSuList) {
        regINS(CK_NINS, cTL(konyuSuList), xgetCValueKonyuSu(), "KONYU_SU");
    }

    protected void regKonyuSu(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKonyuSu(), "KONYU_SU"); }
    protected abstract ConditionValue xgetCValueKonyuSu();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPrice The value of konyuUnitPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuUnitPrice_Equal(Integer konyuUnitPrice) {
        doSetKonyuUnitPrice_Equal(konyuUnitPrice);
    }

    protected void doSetKonyuUnitPrice_Equal(Integer konyuUnitPrice) {
        regKonyuUnitPrice(CK_EQ, konyuUnitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPrice The value of konyuUnitPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuUnitPrice_NotEqual(Integer konyuUnitPrice) {
        doSetKonyuUnitPrice_NotEqual(konyuUnitPrice);
    }

    protected void doSetKonyuUnitPrice_NotEqual(Integer konyuUnitPrice) {
        regKonyuUnitPrice(CK_NES, konyuUnitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPrice The value of konyuUnitPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuUnitPrice_GreaterThan(Integer konyuUnitPrice) {
        regKonyuUnitPrice(CK_GT, konyuUnitPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPrice The value of konyuUnitPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuUnitPrice_LessThan(Integer konyuUnitPrice) {
        regKonyuUnitPrice(CK_LT, konyuUnitPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPrice The value of konyuUnitPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuUnitPrice_GreaterEqual(Integer konyuUnitPrice) {
        regKonyuUnitPrice(CK_GE, konyuUnitPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPrice The value of konyuUnitPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKonyuUnitPrice_LessEqual(Integer konyuUnitPrice) {
        regKonyuUnitPrice(CK_LE, konyuUnitPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of konyuUnitPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuUnitPrice. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setKonyuUnitPrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setKonyuUnitPrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of konyuUnitPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of konyuUnitPrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setKonyuUnitPrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKonyuUnitPrice(), "KONYU_UNIT_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPriceList The collection of konyuUnitPrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuUnitPrice_InScope(Collection<Integer> konyuUnitPriceList) {
        doSetKonyuUnitPrice_InScope(konyuUnitPriceList);
    }

    protected void doSetKonyuUnitPrice_InScope(Collection<Integer> konyuUnitPriceList) {
        regINS(CK_INS, cTL(konyuUnitPriceList), xgetCValueKonyuUnitPrice(), "KONYU_UNIT_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @param konyuUnitPriceList The collection of konyuUnitPrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKonyuUnitPrice_NotInScope(Collection<Integer> konyuUnitPriceList) {
        doSetKonyuUnitPrice_NotInScope(konyuUnitPriceList);
    }

    protected void doSetKonyuUnitPrice_NotInScope(Collection<Integer> konyuUnitPriceList) {
        regINS(CK_NINS, cTL(konyuUnitPriceList), xgetCValueKonyuUnitPrice(), "KONYU_UNIT_PRICE");
    }

    protected void regKonyuUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKonyuUnitPrice(), "KONYU_UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueKonyuUnitPrice();

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
    public HpSLCFunction<StShhnKnyMsCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, StShhnKnyMsCB.class);
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
    public HpSLCFunction<StShhnKnyMsCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, StShhnKnyMsCB.class);
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
    public HpSLCFunction<StShhnKnyMsCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, StShhnKnyMsCB.class);
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
    public HpSLCFunction<StShhnKnyMsCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, StShhnKnyMsCB.class);
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
    public HpSLCFunction<StShhnKnyMsCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, StShhnKnyMsCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;StShhnKnyMsCB&gt;() {
     *     public void query(StShhnKnyMsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StShhnKnyMsCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, StShhnKnyMsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        StShhnKnyMsCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(StShhnKnyMsCQ sq);

    protected StShhnKnyMsCB xcreateScalarConditionCB() {
        StShhnKnyMsCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected StShhnKnyMsCB xcreateScalarConditionPartitionByCB() {
        StShhnKnyMsCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<StShhnKnyMsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ST_SHHN_KNY_MS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(StShhnKnyMsCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<StShhnKnyMsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(StShhnKnyMsCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ST_SHHN_KNY_MS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(StShhnKnyMsCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<StShhnKnyMsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(StShhnKnyMsCQ sq);

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
    protected StShhnKnyMsCB newMyCB() {
        return new StShhnKnyMsCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return StShhnKnyMsCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
