/**
 * This class is generated by jOOQ
 */
package models.generated.h2.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Task extends org.jooq.impl.TableImpl<models.generated.h2.tables.records.TaskRecord> {

	private static final long serialVersionUID = 915945629;

	/**
	 * The singleton instance of <code>PUBLIC.TASK</code>
	 */
	public static final models.generated.h2.tables.Task TASK = new models.generated.h2.tables.Task();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<models.generated.h2.tables.records.TaskRecord> getRecordType() {
		return models.generated.h2.tables.records.TaskRecord.class;
	}

	/**
	 * The column <code>PUBLIC.TASK.ID</code>. 
	 */
	public final org.jooq.TableField<models.generated.h2.tables.records.TaskRecord, java.lang.Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>PUBLIC.TASK.LABEL</code>. 
	 */
	public final org.jooq.TableField<models.generated.h2.tables.records.TaskRecord, java.lang.String> LABEL = createField("LABEL", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>PUBLIC.TASK</code> table reference
	 */
	public Task() {
		super("TASK", models.generated.h2.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.TASK</code> table reference
	 */
	public Task(java.lang.String alias) {
		super(alias, models.generated.h2.Public.PUBLIC, models.generated.h2.tables.Task.TASK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<models.generated.h2.tables.records.TaskRecord, java.lang.Long> getIdentity() {
		return models.generated.h2.Keys.IDENTITY_TASK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<models.generated.h2.tables.records.TaskRecord> getPrimaryKey() {
		return models.generated.h2.Keys.CONSTRAINT_2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<models.generated.h2.tables.records.TaskRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<models.generated.h2.tables.records.TaskRecord>>asList(models.generated.h2.Keys.CONSTRAINT_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public models.generated.h2.tables.Task as(java.lang.String alias) {
		return new models.generated.h2.tables.Task(alias);
	}
}
