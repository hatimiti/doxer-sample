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
 * The entity of ST_SHHN_KNY_MS as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ST_SHHN_KNY_MS_ID
 * 
 * [column]
 *     ST_SHHN_KNY_MS_ID, ST_SHOHIN_KONYU_ID, SM_SHOHIN_ID, KONYU_SU, KONYU_UNIT_PRICE, KONYU_TAX, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ST_SHHN_KNY_MS_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     ST_SHOHIN_KONYU, SM_SHOHIN
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     stShohinKonyu, smShohin
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stShhnKnyMsId = entity.getStShhnKnyMsId();
 * Long stShohinKonyuId = entity.getStShohinKonyuId();
 * Long smShohinId = entity.getSmShohinId();
 * Integer konyuSu = entity.getKonyuSu();
 * Integer konyuUnitPrice = entity.getKonyuUnitPrice();
 * Integer konyuTax = entity.getKonyuTax();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setStShhnKnyMsId(stShhnKnyMsId);
 * entity.setStShohinKonyuId(stShohinKonyuId);
 * entity.setSmShohinId(smShohinId);
 * entity.setKonyuSu(konyuSu);
 * entity.setKonyuUnitPrice(konyuUnitPrice);
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
public abstract class BsStShhnKnyMs extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _stShhnKnyMsId;

    /** ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu} */
    protected Long _stShohinKonyuId;

    /** SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin} */
    protected Long _smShohinId;

    /** KONYU_SU: {NotNull, DECIMAL(4)} */
    protected Integer _konyuSu;

    /** KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)} */
    protected Integer _konyuUnitPrice;

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
        return "ST_SHHN_KNY_MS";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_stShhnKnyMsId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param stShohinKonyuId : UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu. (NotNull)
     * @param smShohinId : +UQ, NotNull, DECIMAL(12), FK to sm_shohin. (NotNull)
     */
    public void uniqueBy(Long stShohinKonyuId, Long smShohinId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("stShohinKonyuId");
        __uniqueDrivenProperties.addPropertyName("smShohinId");
        setStShohinKonyuId(stShohinKonyuId);setSmShohinId(smShohinId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'. */
    protected OptionalEntity<StShohinKonyu> _stShohinKonyu;

    /**
     * [get] ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'stShohinKonyu'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<StShohinKonyu> getStShohinKonyu() {
        if (_stShohinKonyu == null) { _stShohinKonyu = OptionalEntity.relationEmpty(this, "stShohinKonyu"); }
        return _stShohinKonyu;
    }

    /**
     * [set] ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'.
     * @param stShohinKonyu The entity of foreign property 'stShohinKonyu'. (NullAllowed)
     */
    public void setStShohinKonyu(OptionalEntity<StShohinKonyu> stShohinKonyu) {
        _stShohinKonyu = stShohinKonyu;
    }

    /** SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'. */
    protected OptionalEntity<SmShohin> _smShohin;

    /**
     * [get] SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'smShohin'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<SmShohin> getSmShohin() {
        if (_smShohin == null) { _smShohin = OptionalEntity.relationEmpty(this, "smShohin"); }
        return _smShohin;
    }

    /**
     * [set] SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'.
     * @param smShohin The entity of foreign property 'smShohin'. (NullAllowed)
     */
    public void setSmShohin(OptionalEntity<SmShohin> smShohin) {
        _smShohin = smShohin;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsStShhnKnyMs) {
            BsStShhnKnyMs other = (BsStShhnKnyMs)obj;
            if (!xSV(_stShhnKnyMsId, other._stShhnKnyMsId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stShhnKnyMsId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_stShohinKonyu != null && _stShohinKonyu.isPresent())
        { sb.append(li).append(xbRDS(_stShohinKonyu, "stShohinKonyu")); }
        if (_smShohin != null && _smShohin.isPresent())
        { sb.append(li).append(xbRDS(_smShohin, "smShohin")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stShhnKnyMsId));
        sb.append(dm).append(xfND(_stShohinKonyuId));
        sb.append(dm).append(xfND(_smShohinId));
        sb.append(dm).append(xfND(_konyuSu));
        sb.append(dm).append(xfND(_konyuUnitPrice));
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
        if (_stShohinKonyu != null && _stShohinKonyu.isPresent())
        { sb.append(dm).append("stShohinKonyu"); }
        if (_smShohin != null && _smShohin.isPresent())
        { sb.append(dm).append("smShohin"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public StShhnKnyMs clone() {
        return (StShhnKnyMs)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ST_SHHN_KNY_MS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStShhnKnyMsId() {
        checkSpecifiedProperty("stShhnKnyMsId");
        return _stShhnKnyMsId;
    }

    /**
     * [set] ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param stShhnKnyMsId The value of the column 'ST_SHHN_KNY_MS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStShhnKnyMsId(Long stShhnKnyMsId) {
        registerModifiedProperty("stShhnKnyMsId");
        _stShhnKnyMsId = stShhnKnyMsId;
    }

    /**
     * [get] ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu} <br>
     * @return The value of the column 'ST_SHOHIN_KONYU_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStShohinKonyuId() {
        checkSpecifiedProperty("stShohinKonyuId");
        return _stShohinKonyuId;
    }

    /**
     * [set] ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu} <br>
     * @param stShohinKonyuId The value of the column 'ST_SHOHIN_KONYU_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStShohinKonyuId(Long stShohinKonyuId) {
        registerModifiedProperty("stShohinKonyuId");
        _stShohinKonyuId = stShohinKonyuId;
    }

    /**
     * [get] SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin} <br>
     * @return The value of the column 'SM_SHOHIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSmShohinId() {
        checkSpecifiedProperty("smShohinId");
        return _smShohinId;
    }

    /**
     * [set] SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin} <br>
     * @param smShohinId The value of the column 'SM_SHOHIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSmShohinId(Long smShohinId) {
        registerModifiedProperty("smShohinId");
        _smShohinId = smShohinId;
    }

    /**
     * [get] KONYU_SU: {NotNull, DECIMAL(4)} <br>
     * @return The value of the column 'KONYU_SU'. (basically NotNull if selected: for the constraint)
     */
    public Integer getKonyuSu() {
        checkSpecifiedProperty("konyuSu");
        return _konyuSu;
    }

    /**
     * [set] KONYU_SU: {NotNull, DECIMAL(4)} <br>
     * @param konyuSu The value of the column 'KONYU_SU'. (basically NotNull if update: for the constraint)
     */
    public void setKonyuSu(Integer konyuSu) {
        registerModifiedProperty("konyuSu");
        _konyuSu = konyuSu;
    }

    /**
     * [get] KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)} <br>
     * @return The value of the column 'KONYU_UNIT_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getKonyuUnitPrice() {
        checkSpecifiedProperty("konyuUnitPrice");
        return _konyuUnitPrice;
    }

    /**
     * [set] KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)} <br>
     * @param konyuUnitPrice The value of the column 'KONYU_UNIT_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setKonyuUnitPrice(Integer konyuUnitPrice) {
        registerModifiedProperty("konyuUnitPrice");
        _konyuUnitPrice = konyuUnitPrice;
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
