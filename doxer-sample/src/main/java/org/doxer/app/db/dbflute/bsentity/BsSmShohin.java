package org.doxer.app.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.doxer.app.db.dbflute.allcommon.EntityDefinedCommonColumn;
import org.doxer.app.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The entity of SM_SHOHIN as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SM_SHOHIN_ID
 * 
 * [column]
 *     SM_SHOHIN_ID, SHOHIN_NO, SHOHIN_MEI, SHOHIN_MEI_EN, SHOHIN_PRICE, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     SM_SHOHIN_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     ST_SHHN_KNY_MS
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     stShhnKnyMsList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long smShohinId = entity.getSmShohinId();
 * String shohinNo = entity.getShohinNo();
 * String shohinMei = entity.getShohinMei();
 * String shohinMeiEn = entity.getShohinMeiEn();
 * Integer shohinPrice = entity.getShohinPrice();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setSmShohinId(smShohinId);
 * entity.setShohinNo(shohinNo);
 * entity.setShohinMei(shohinMei);
 * entity.setShohinMeiEn(shohinMeiEn);
 * entity.setShohinPrice(shohinPrice);
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
public abstract class BsSmShohin extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _smShohinId;

    /** SHOHIN_NO: {UQ, NotNull, VARCHAR(20)} */
    protected String _shohinNo;

    /** SHOHIN_MEI: {NotNull, VARCHAR(50)} */
    protected String _shohinMei;

    /** SHOHIN_MEI_EN: {VARCHAR(100)} */
    protected String _shohinMeiEn;

    /** SHOHIN_PRICE: {NotNull, DECIMAL(9)} */
    protected Integer _shohinPrice;

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
        return "SM_SHOHIN";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_smShohinId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param shohinNo : UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueBy(String shohinNo) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("shohinNo");
        setShohinNo(shohinNo);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsList'. */
    protected List<StShhnKnyMs> _stShhnKnyMsList;

    /**
     * [get] ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsList'.
     * @return The entity list of referrer property 'stShhnKnyMsList'. (NotNull: even if no loading, returns empty list)
     */
    public List<StShhnKnyMs> getStShhnKnyMsList() {
        if (_stShhnKnyMsList == null) { _stShhnKnyMsList = newReferrerList(); }
        return _stShhnKnyMsList;
    }

    /**
     * [set] ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsList'.
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
        if (obj instanceof BsSmShohin) {
            BsSmShohin other = (BsSmShohin)obj;
            if (!xSV(_smShohinId, other._smShohinId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _smShohinId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_stShhnKnyMsList != null) { for (StShhnKnyMs et : _stShhnKnyMsList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "stShhnKnyMsList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_smShohinId));
        sb.append(dm).append(xfND(_shohinNo));
        sb.append(dm).append(xfND(_shohinMei));
        sb.append(dm).append(xfND(_shohinMeiEn));
        sb.append(dm).append(xfND(_shohinPrice));
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
        if (_stShhnKnyMsList != null && !_stShhnKnyMsList.isEmpty())
        { sb.append(dm).append("stShhnKnyMsList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SmShohin clone() {
        return (SmShohin)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'SM_SHOHIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSmShohinId() {
        checkSpecifiedProperty("smShohinId");
        return _smShohinId;
    }

    /**
     * [set] SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param smShohinId The value of the column 'SM_SHOHIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSmShohinId(Long smShohinId) {
        registerModifiedProperty("smShohinId");
        _smShohinId = smShohinId;
    }

    /**
     * [get] SHOHIN_NO: {UQ, NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'SHOHIN_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getShohinNo() {
        checkSpecifiedProperty("shohinNo");
        return _shohinNo;
    }

    /**
     * [set] SHOHIN_NO: {UQ, NotNull, VARCHAR(20)} <br>
     * @param shohinNo The value of the column 'SHOHIN_NO'. (basically NotNull if update: for the constraint)
     */
    public void setShohinNo(String shohinNo) {
        registerModifiedProperty("shohinNo");
        _shohinNo = shohinNo;
    }

    /**
     * [get] SHOHIN_MEI: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'SHOHIN_MEI'. (basically NotNull if selected: for the constraint)
     */
    public String getShohinMei() {
        checkSpecifiedProperty("shohinMei");
        return _shohinMei;
    }

    /**
     * [set] SHOHIN_MEI: {NotNull, VARCHAR(50)} <br>
     * @param shohinMei The value of the column 'SHOHIN_MEI'. (basically NotNull if update: for the constraint)
     */
    public void setShohinMei(String shohinMei) {
        registerModifiedProperty("shohinMei");
        _shohinMei = shohinMei;
    }

    /**
     * [get] SHOHIN_MEI_EN: {VARCHAR(100)} <br>
     * @return The value of the column 'SHOHIN_MEI_EN'. (NullAllowed even if selected: for no constraint)
     */
    public String getShohinMeiEn() {
        checkSpecifiedProperty("shohinMeiEn");
        return _shohinMeiEn;
    }

    /**
     * [set] SHOHIN_MEI_EN: {VARCHAR(100)} <br>
     * @param shohinMeiEn The value of the column 'SHOHIN_MEI_EN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShohinMeiEn(String shohinMeiEn) {
        registerModifiedProperty("shohinMeiEn");
        _shohinMeiEn = shohinMeiEn;
    }

    /**
     * [get] SHOHIN_PRICE: {NotNull, DECIMAL(9)} <br>
     * @return The value of the column 'SHOHIN_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getShohinPrice() {
        checkSpecifiedProperty("shohinPrice");
        return _shohinPrice;
    }

    /**
     * [set] SHOHIN_PRICE: {NotNull, DECIMAL(9)} <br>
     * @param shohinPrice The value of the column 'SHOHIN_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setShohinPrice(Integer shohinPrice) {
        registerModifiedProperty("shohinPrice");
        _shohinPrice = shohinPrice;
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
