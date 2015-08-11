package org.doxer.app.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.doxer.app.db.dbflute.allcommon.EntityDefinedCommonColumn;
import org.doxer.app.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The entity of ST_SHOHIN_KONYU as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ST_SHOHIN_KONYU_ID
 * 
 * [column]
 *     ST_SHOHIN_KONYU_ID, KONYU_CM_SHAIN_ID, KONYU_YMD, KONYU_TM, KONYU_PRICE, KONYU_TAX, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ST_SHOHIN_KONYU_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     CM_SHAIN
 * 
 * [referrer table]
 *     ST_SHHN_KNY_MS
 * 
 * [foreign property]
 *     cmShain
 * 
 * [referrer property]
 *     stShhnKnyMsList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stShohinKonyuId = entity.getStShohinKonyuId();
 * Long konyuCmShainId = entity.getKonyuCmShainId();
 * String konyuYmd = entity.getKonyuYmd();
 * String konyuTm = entity.getKonyuTm();
 * Integer konyuPrice = entity.getKonyuPrice();
 * Integer konyuTax = entity.getKonyuTax();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setStShohinKonyuId(stShohinKonyuId);
 * entity.setKonyuCmShainId(konyuCmShainId);
 * entity.setKonyuYmd(konyuYmd);
 * entity.setKonyuTm(konyuTm);
 * entity.setKonyuPrice(konyuPrice);
 * entity.setKonyuTax(konyuTax);
 * entity.setRegUserId(regUserId);
 * entity.setRegTm(regTm);
 * entity.setRegFuncCd(regFuncCd);
 * entity.setUpdUserId(updUserId);
 * entity.setUpdTm(updTm);
 * entity.setUpdFuncCd(updFuncCd);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsStShohinKonyu extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _stShohinKonyuId;

    /** KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain} */
    protected Long _konyuCmShainId;

    /** KONYU_YMD: {CHAR(8)} */
    protected String _konyuYmd;

    /** KONYU_TM: {CHAR(4)} */
    protected String _konyuTm;

    /** KONYU_PRICE: {NotNull, DECIMAL(9)} */
    protected Integer _konyuPrice;

    /** KONYU_TAX: {NotNull, DECIMAL(9)} */
    protected Integer _konyuTax;

    /** REG_USER_ID: {NotNull, VARCHAR(10)} */
    protected String _regUserId;

    /** REG_TM: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _regTm;

    /** REG_FUNC_CD: {NotNull, VARCHAR(9)} */
    protected String _regFuncCd;

    /** UPD_USER_ID: {NotNull, VARCHAR(10)} */
    protected String _updUserId;

    /** UPD_TM: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _updTm;

    /** UPD_FUNC_CD: {NotNull, VARCHAR(9)} */
    protected String _updFuncCd;

    /** VERSION_NO: {NotNull, DECIMAL(9)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ST_SHOHIN_KONYU";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_stShohinKonyuId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** CM_SHAIN by my KONYU_CM_SHAIN_ID, named 'cmShain'. */
    protected OptionalEntity<CmShain> _cmShain;

    /**
     * [get] CM_SHAIN by my KONYU_CM_SHAIN_ID, named 'cmShain'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cmShain'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CmShain> getCmShain() {
        if (_cmShain == null) { _cmShain = OptionalEntity.relationEmpty(this, "cmShain"); }
        return _cmShain;
    }

    /**
     * [set] CM_SHAIN by my KONYU_CM_SHAIN_ID, named 'cmShain'.
     * @param cmShain The entity of foreign property 'cmShain'. (NullAllowed)
     */
    public void setCmShain(OptionalEntity<CmShain> cmShain) {
        _cmShain = cmShain;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsList'. */
    protected List<StShhnKnyMs> _stShhnKnyMsList;

    /**
     * [get] ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsList'.
     * @return The entity list of referrer property 'stShhnKnyMsList'. (NotNull: even if no loading, returns empty list)
     */
    public List<StShhnKnyMs> getStShhnKnyMsList() {
        if (_stShhnKnyMsList == null) { _stShhnKnyMsList = newReferrerList(); }
        return _stShhnKnyMsList;
    }

    /**
     * [set] ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsList'.
     * @param stShhnKnyMsList The entity list of referrer property 'stShhnKnyMsList'. (NullAllowed)
     */
    public void setStShhnKnyMsList(List<StShhnKnyMs> stShhnKnyMsList) {
        _stShhnKnyMsList = stShhnKnyMsList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsStShohinKonyu) {
            BsStShohinKonyu other = (BsStShohinKonyu)obj;
            if (!xSV(_stShohinKonyuId, other._stShohinKonyuId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stShohinKonyuId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_cmShain != null && _cmShain.isPresent())
        { sb.append(li).append(xbRDS(_cmShain, "cmShain")); }
        if (_stShhnKnyMsList != null) { for (StShhnKnyMs et : _stShhnKnyMsList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "stShhnKnyMsList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stShohinKonyuId));
        sb.append(dm).append(xfND(_konyuCmShainId));
        sb.append(dm).append(xfND(_konyuYmd));
        sb.append(dm).append(xfND(_konyuTm));
        sb.append(dm).append(xfND(_konyuPrice));
        sb.append(dm).append(xfND(_konyuTax));
        sb.append(dm).append(xfND(_regUserId));
        sb.append(dm).append(xfND(_regTm));
        sb.append(dm).append(xfND(_regFuncCd));
        sb.append(dm).append(xfND(_updUserId));
        sb.append(dm).append(xfND(_updTm));
        sb.append(dm).append(xfND(_updFuncCd));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_cmShain != null && _cmShain.isPresent())
        { sb.append(dm).append("cmShain"); }
        if (_stShhnKnyMsList != null && !_stShhnKnyMsList.isEmpty())
        { sb.append(dm).append("stShhnKnyMsList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public StShohinKonyu clone() {
        return (StShohinKonyu)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ST_SHOHIN_KONYU_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStShohinKonyuId() {
        checkSpecifiedProperty("stShohinKonyuId");
        return _stShohinKonyuId;
    }

    /**
     * [set] ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param stShohinKonyuId The value of the column 'ST_SHOHIN_KONYU_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStShohinKonyuId(Long stShohinKonyuId) {
        registerModifiedProperty("stShohinKonyuId");
        _stShohinKonyuId = stShohinKonyuId;
    }

    /**
     * [get] KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain} <br>
     * @return The value of the column 'KONYU_CM_SHAIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getKonyuCmShainId() {
        checkSpecifiedProperty("konyuCmShainId");
        return _konyuCmShainId;
    }

    /**
     * [set] KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain} <br>
     * @param konyuCmShainId The value of the column 'KONYU_CM_SHAIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setKonyuCmShainId(Long konyuCmShainId) {
        registerModifiedProperty("konyuCmShainId");
        _konyuCmShainId = konyuCmShainId;
    }

    /**
     * [get] KONYU_YMD: {CHAR(8)} <br>
     * @return The value of the column 'KONYU_YMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getKonyuYmd() {
        checkSpecifiedProperty("konyuYmd");
        return _konyuYmd;
    }

    /**
     * [set] KONYU_YMD: {CHAR(8)} <br>
     * @param konyuYmd The value of the column 'KONYU_YMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKonyuYmd(String konyuYmd) {
        registerModifiedProperty("konyuYmd");
        _konyuYmd = konyuYmd;
    }

    /**
     * [get] KONYU_TM: {CHAR(4)} <br>
     * @return The value of the column 'KONYU_TM'. (NullAllowed even if selected: for no constraint)
     */
    public String getKonyuTm() {
        checkSpecifiedProperty("konyuTm");
        return _konyuTm;
    }

    /**
     * [set] KONYU_TM: {CHAR(4)} <br>
     * @param konyuTm The value of the column 'KONYU_TM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKonyuTm(String konyuTm) {
        registerModifiedProperty("konyuTm");
        _konyuTm = konyuTm;
    }

    /**
     * [get] KONYU_PRICE: {NotNull, DECIMAL(9)} <br>
     * @return The value of the column 'KONYU_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getKonyuPrice() {
        checkSpecifiedProperty("konyuPrice");
        return _konyuPrice;
    }

    /**
     * [set] KONYU_PRICE: {NotNull, DECIMAL(9)} <br>
     * @param konyuPrice The value of the column 'KONYU_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setKonyuPrice(Integer konyuPrice) {
        registerModifiedProperty("konyuPrice");
        _konyuPrice = konyuPrice;
    }

    /**
     * [get] KONYU_TAX: {NotNull, DECIMAL(9)} <br>
     * @return The value of the column 'KONYU_TAX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getKonyuTax() {
        checkSpecifiedProperty("konyuTax");
        return _konyuTax;
    }

    /**
     * [set] KONYU_TAX: {NotNull, DECIMAL(9)} <br>
     * @param konyuTax The value of the column 'KONYU_TAX'. (basically NotNull if update: for the constraint)
     */
    public void setKonyuTax(Integer konyuTax) {
        registerModifiedProperty("konyuTax");
        _konyuTax = konyuTax;
    }

    /**
     * [get] REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'REG_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getRegUserId() {
        checkSpecifiedProperty("regUserId");
        return _regUserId;
    }

    /**
     * [set] REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @param regUserId The value of the column 'REG_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRegUserId(String regUserId) {
        registerModifiedProperty("regUserId");
        _regUserId = regUserId;
    }

    /**
     * [get] REG_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'REG_TM'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegTm() {
        checkSpecifiedProperty("regTm");
        return _regTm;
    }

    /**
     * [set] REG_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param regTm The value of the column 'REG_TM'. (basically NotNull if update: for the constraint)
     */
    public void setRegTm(java.time.LocalDateTime regTm) {
        registerModifiedProperty("regTm");
        _regTm = regTm;
    }

    /**
     * [get] REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @return The value of the column 'REG_FUNC_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getRegFuncCd() {
        checkSpecifiedProperty("regFuncCd");
        return _regFuncCd;
    }

    /**
     * [set] REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @param regFuncCd The value of the column 'REG_FUNC_CD'. (basically NotNull if update: for the constraint)
     */
    public void setRegFuncCd(String regFuncCd) {
        registerModifiedProperty("regFuncCd");
        _regFuncCd = regFuncCd;
    }

    /**
     * [get] UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'UPD_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdUserId() {
        checkSpecifiedProperty("updUserId");
        return _updUserId;
    }

    /**
     * [set] UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * @param updUserId The value of the column 'UPD_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUpdUserId(String updUserId) {
        registerModifiedProperty("updUserId");
        _updUserId = updUserId;
    }

    /**
     * [get] UPD_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'UPD_TM'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdTm() {
        checkSpecifiedProperty("updTm");
        return _updTm;
    }

    /**
     * [set] UPD_TM: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param updTm The value of the column 'UPD_TM'. (basically NotNull if update: for the constraint)
     */
    public void setUpdTm(java.time.LocalDateTime updTm) {
        registerModifiedProperty("updTm");
        _updTm = updTm;
    }

    /**
     * [get] UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @return The value of the column 'UPD_FUNC_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdFuncCd() {
        checkSpecifiedProperty("updFuncCd");
        return _updFuncCd;
    }

    /**
     * [set] UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * @param updFuncCd The value of the column 'UPD_FUNC_CD'. (basically NotNull if update: for the constraint)
     */
    public void setUpdFuncCd(String updFuncCd) {
        registerModifiedProperty("updFuncCd");
        _updFuncCd = updFuncCd;
    }

    /**
     * [get] VERSION_NO: {NotNull, DECIMAL(9)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, DECIMAL(9)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
