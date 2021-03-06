package org.doxer.app.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.doxer.app.db.dbflute.allcommon.EntityDefinedCommonColumn;
import org.doxer.app.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.doxer.app.db.dbflute.allcommon.CDef;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The entity of CM_RENRAKUSAKI_YOTO_KB as TABLE. <br>
 * <pre>
 * [primary-key]
 *     KB_VAL
 * 
 * [column]
 *     KB_VAL, KB_MEI, KB_MEI_EN, KB_REM, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String kbVal = entity.getKbVal();
 * String kbMei = entity.getKbMei();
 * String kbMeiEn = entity.getKbMeiEn();
 * String kbRem = entity.getKbRem();
 * String regUserId = entity.getRegUserId();
 * java.time.LocalDateTime regTm = entity.getRegTm();
 * String regFuncCd = entity.getRegFuncCd();
 * String updUserId = entity.getUpdUserId();
 * java.time.LocalDateTime updTm = entity.getUpdTm();
 * String updFuncCd = entity.getUpdFuncCd();
 * Integer versionNo = entity.getVersionNo();
 * entity.setKbVal(kbVal);
 * entity.setKbMei(kbMei);
 * entity.setKbMeiEn(kbMeiEn);
 * entity.setKbRem(kbRem);
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
public abstract class BsCmRenrakusakiYotoKb extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} */
    protected String _kbVal;

    /** KB_MEI: {NotNull, VARCHAR(50)} */
    protected String _kbMei;

    /** KB_MEI_EN: {VARCHAR(100)} */
    protected String _kbMeiEn;

    /** KB_REM: {NotNull, VARCHAR(15)} */
    protected String _kbRem;

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
        return "CM_RENRAKUSAKI_YOTO_KB";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_kbVal == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of kbVal as the classification of RenrakusakiYotoKb. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.RenrakusakiYotoKb getKbValAsRenrakusakiYotoKb() {
        return CDef.RenrakusakiYotoKb.codeOf(getKbVal());
    }

    /**
     * Set the value of kbVal as the classification of RenrakusakiYotoKb. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setKbValAsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb cdef) {
        setKbVal(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of kbVal as Normal (NRM). <br>
     * Normal
     */
    public void setKbVal_Normal() {
        setKbValAsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Normal);
    }

    /**
     * Set the value of kbVal as Emergency (EMG). <br>
     * Emergency
     */
    public void setKbVal_Emergency() {
        setKbValAsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Emergency);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of kbVal Normal? <br>
     * Normal
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isKbValNormal() {
        CDef.RenrakusakiYotoKb cdef = getKbValAsRenrakusakiYotoKb();
        return cdef != null ? cdef.equals(CDef.RenrakusakiYotoKb.Normal) : false;
    }

    /**
     * Is the value of kbVal Emergency? <br>
     * Emergency
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isKbValEmergency() {
        CDef.RenrakusakiYotoKb cdef = getKbValAsRenrakusakiYotoKb();
        return cdef != null ? cdef.equals(CDef.RenrakusakiYotoKb.Emergency) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsCmRenrakusakiYotoKb) {
            BsCmRenrakusakiYotoKb other = (BsCmRenrakusakiYotoKb)obj;
            if (!xSV(_kbVal, other._kbVal)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _kbVal);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_kbVal));
        sb.append(dm).append(xfND(_kbMei));
        sb.append(dm).append(xfND(_kbMeiEn));
        sb.append(dm).append(xfND(_kbRem));
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
        return "";
    }

    @Override
    public CmRenrakusakiYotoKb clone() {
        return (CmRenrakusakiYotoKb)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * @return The value of the column 'KB_VAL'. (basically NotNull if selected: for the constraint)
     */
    public String getKbVal() {
        checkSpecifiedProperty("kbVal");
        return _kbVal;
    }

    /**
     * [set] KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * @param kbVal The value of the column 'KB_VAL'. (basically NotNull if update: for the constraint)
     */
    protected void setKbVal(String kbVal) {
        checkClassificationCode("KB_VAL", CDef.DefMeta.RenrakusakiYotoKb, kbVal);
        registerModifiedProperty("kbVal");
        _kbVal = kbVal;
    }

    /**
     * [get] KB_MEI: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'KB_MEI'. (basically NotNull if selected: for the constraint)
     */
    public String getKbMei() {
        checkSpecifiedProperty("kbMei");
        return _kbMei;
    }

    /**
     * [set] KB_MEI: {NotNull, VARCHAR(50)} <br>
     * @param kbMei The value of the column 'KB_MEI'. (basically NotNull if update: for the constraint)
     */
    public void setKbMei(String kbMei) {
        registerModifiedProperty("kbMei");
        _kbMei = kbMei;
    }

    /**
     * [get] KB_MEI_EN: {VARCHAR(100)} <br>
     * @return The value of the column 'KB_MEI_EN'. (NullAllowed even if selected: for no constraint)
     */
    public String getKbMeiEn() {
        checkSpecifiedProperty("kbMeiEn");
        return _kbMeiEn;
    }

    /**
     * [set] KB_MEI_EN: {VARCHAR(100)} <br>
     * @param kbMeiEn The value of the column 'KB_MEI_EN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKbMeiEn(String kbMeiEn) {
        registerModifiedProperty("kbMeiEn");
        _kbMeiEn = kbMeiEn;
    }

    /**
     * [get] KB_REM: {NotNull, VARCHAR(15)} <br>
     * @return The value of the column 'KB_REM'. (basically NotNull if selected: for the constraint)
     */
    public String getKbRem() {
        checkSpecifiedProperty("kbRem");
        return _kbRem;
    }

    /**
     * [set] KB_REM: {NotNull, VARCHAR(15)} <br>
     * @param kbRem The value of the column 'KB_REM'. (basically NotNull if update: for the constraint)
     */
    public void setKbRem(String kbRem) {
        registerModifiedProperty("kbRem");
        _kbRem = kbRem;
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

    /**
     * For framework so basically DON'T use this method.
     * @param kbVal The value of the column 'KB_VAL'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingKbVal(String kbVal) {
        setKbVal(kbVal);
    }
}
