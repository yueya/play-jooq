/**
 * This class is generated by jOOQ
 */
package models.generated.mysql;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>tasks</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<models.generated.mysql.tables.records.TaskRecord, java.lang.Long> IDENTITY_TASK = Identities0.IDENTITY_TASK;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<models.generated.mysql.tables.records.TaskRecord> KEY_TASK_PRIMARY = UniqueKeys0.KEY_TASK_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<models.generated.mysql.tables.records.TaskRecord, java.lang.Long> IDENTITY_TASK = createIdentity(models.generated.mysql.tables.Task.TASK, models.generated.mysql.tables.Task.TASK.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<models.generated.mysql.tables.records.TaskRecord> KEY_TASK_PRIMARY = createUniqueKey(models.generated.mysql.tables.Task.TASK, models.generated.mysql.tables.Task.TASK.ID);
	}
}
