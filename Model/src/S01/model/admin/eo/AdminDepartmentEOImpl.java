package S01.model.admin.eo;

import oracle.jbo.ApplicationModule;
import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 23 14:33:03 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AdminDepartmentEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DepartId,
        DepartNo,
        LocationId,
        DepartName,
        EnteredBy,
        EnteredOn,
        LastEditedBy,
        LastEditedOn,
        Active,
        AdminUserInfoEO;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int DEPARTID = AttributesEnum.DepartId.index();
    public static final int DEPARTNO = AttributesEnum.DepartNo.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int DEPARTNAME = AttributesEnum.DepartName.index();
    public static final int ENTEREDBY = AttributesEnum.EnteredBy.index();
    public static final int ENTEREDON = AttributesEnum.EnteredOn.index();
    public static final int LASTEDITEDBY = AttributesEnum.LastEditedBy.index();
    public static final int LASTEDITEDON = AttributesEnum.LastEditedOn.index();
    public static final int ACTIVE = AttributesEnum.Active.index();
    public static final int ADMINUSERINFOEO = AttributesEnum.AdminUserInfoEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AdminDepartmentEOImpl() {
    }

    /**
     * Gets the attribute value for DepartId, using the alias name DepartId.
     * @return the value of DepartId
     */
    public Number getDepartId() {
        return (Number) getAttributeInternal(DEPARTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartId.
     * @param value value to set the DepartId
     */
    public void setDepartId(Number value) {
        setAttributeInternal(DEPARTID, value);
    }

    /**
     * Gets the attribute value for DepartNo, using the alias name DepartNo.
     * @return the value of DepartNo
     */
    public String getDepartNo() {
        return (String) getAttributeInternal(DEPARTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartNo.
     * @param value value to set the DepartNo
     */
    public void setDepartNo(String value) {
        setAttributeInternal(DEPARTNO, value);
    }

    /**
     * Gets the attribute value for LocationId, using the alias name LocationId.
     * @return the value of LocationId
     */
    public Number getLocationId() {
        return (Number) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocationId.
     * @param value value to set the LocationId
     */
    public void setLocationId(Number value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for DepartName, using the alias name DepartName.
     * @return the value of DepartName
     */
    public String getDepartName() {
        return (String) getAttributeInternal(DEPARTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartName.
     * @param value value to set the DepartName
     */
    public void setDepartName(String value) {
        setAttributeInternal(DEPARTNAME, value);
    }

    /**
     * Gets the attribute value for EnteredBy, using the alias name EnteredBy.
     * @return the value of EnteredBy
     */
    public Number getEnteredBy() {
        return (Number) getAttributeInternal(ENTEREDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnteredBy.
     * @param value value to set the EnteredBy
     */
    public void setEnteredBy(Number value) {
        setAttributeInternal(ENTEREDBY, value);
    }

    /**
     * Gets the attribute value for EnteredOn, using the alias name EnteredOn.
     * @return the value of EnteredOn
     */
    public Date getEnteredOn() {
        return (Date) getAttributeInternal(ENTEREDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnteredOn.
     * @param value value to set the EnteredOn
     */
    public void setEnteredOn(Date value) {
        setAttributeInternal(ENTEREDON, value);
    }

    /**
     * Gets the attribute value for LastEditedBy, using the alias name LastEditedBy.
     * @return the value of LastEditedBy
     */
    public Number getLastEditedBy() {
        return (Number) getAttributeInternal(LASTEDITEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastEditedBy.
     * @param value value to set the LastEditedBy
     */
    public void setLastEditedBy(Number value) {
        setAttributeInternal(LASTEDITEDBY, value);
    }

    /**
     * Gets the attribute value for LastEditedOn, using the alias name LastEditedOn.
     * @return the value of LastEditedOn
     */
    public Date getLastEditedOn() {
        return (Date) getAttributeInternal(LASTEDITEDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastEditedOn.
     * @param value value to set the LastEditedOn
     */
    public void setLastEditedOn(Date value) {
        setAttributeInternal(LASTEDITEDON, value);
    }

    /**
     * Gets the attribute value for Active, using the alias name Active.
     * @return the value of Active
     */
    public String getActive() {
        return (String) getAttributeInternal(ACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Active.
     * @param value value to set the Active
     */
    public void setActive(String value) {
        setAttributeInternal(ACTIVE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getAdminUserInfoEO() {
        return (RowIterator) getAttributeInternal(ADMINUSERINFOEO);
    }

    /**
     * @param departId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number departId) {
        return new Key(new Object[] { departId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("S01.model.admin.eo.AdminDepartmentEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
//       ApplicationModule am = getDBTransaction().getRootApplicationModule();
//        SequenceImpl s = new SequenceImpl("ADMIN_DEPARTMENT_S", am);
//        Number sVal;
//        sVal = s.getSequenceNumber();
//        setDepartId(sVal);

        
        super.create(attributeList);
        
        //       ApplicationModule am = getDBTransaction().getRootApplicationModule();
                SequenceImpl seq = new SequenceImpl("ADMIN_DEPARTMENT_S", getDBTransaction());
                setDepartId(seq.getSequenceNumber());
                


    }



    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        
        
        super.doDML(operation, e);
    }
}

