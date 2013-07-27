/**
 * This class is generated by jOOQ
 */
package models.generated.h2.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskRecord extends org.jooq.impl.UpdatableRecordImpl<models.generated.h2.tables.records.TaskRecord> implements org.jooq.Record2<java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = 1025693091;

	/**
	 * Setter for <code>PUBLIC.TASK.ID</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.TASK.ID</code>. 
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.TASK.LABEL</code>. 
	 */
	public void setLabel(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.TASK.LABEL</code>. 
	 */
	public java.lang.String getLabel() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return models.generated.h2.tables.Task.TASK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return models.generated.h2.tables.Task.TASK.LABEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getLabel();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TaskRecord
	 */
	public TaskRecord() {
		super(models.generated.h2.tables.Task.TASK);
	}
}
