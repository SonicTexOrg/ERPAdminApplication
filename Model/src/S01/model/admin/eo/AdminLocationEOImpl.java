package S01.model.admin.eo;

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
// ---    Wed May 24 13:53:23 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AdminLocationEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        LocationId,
        LocationName,
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
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int LOCATIONNAME = AttributesEnum.LocationName.index();
    public static final int ENTEREDBY = AttributesEnum.EnteredBy.index();
    public static final int ENTEREDON = AttributesEnum.EnteredOn.index();
    public static final int LASTEDITEDBY = AttributesEnum.LastEditedBy.index();
    public static final int LASTEDITEDON = AttributesEnum.LastEditedOn.index();
    public static final int ACTIVE = AttributesEnum.Active.index();
    public static final int ADMINUSERINFOEO = AttributesEnum.AdminUserInfoEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AdminLocationEOImpl() {
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
     * Gets the attribute value for LocationName, using the alias name LocationName.
     * @return the value of LocationName
     */
    public String getLocationName() {
        return (String) getAttributeInternal(LOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocationName.
     * @param value value to set the LocationName
     */
    public void setLocationName(String value) {
        setAttributeInternal(LOCATIONNAME, value);
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
     * @param locationId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number locationId) {
        return new Key(new Object[] { locationId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("S01.model.admin.eo.AdminLocationEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        SequenceImpl seq = new SequenceImpl("ADMIN_LOCATION_S", getDBTransaction());
        setLocationId(seq.getSequenceNumber());

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

