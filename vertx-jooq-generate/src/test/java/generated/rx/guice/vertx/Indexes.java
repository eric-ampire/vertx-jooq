/*
 * This file is generated by jOOQ.
*/
package generated.rx.guice.vertx;


import generated.rx.guice.vertx.tables.Something;
import generated.rx.guice.vertx.tables.Somethingcomposite;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>VERTX</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SYS_IDX_SYS_PK_10345_10346 = Indexes0.SYS_IDX_SYS_PK_10345_10346;
    public static final Index SYS_IDX_SYS_PK_10347_10348 = Indexes0.SYS_IDX_SYS_PK_10347_10348;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index SYS_IDX_SYS_PK_10345_10346 = createIndex("SYS_IDX_SYS_PK_10345_10346", Something.SOMETHING, new OrderField[] { Something.SOMETHING.SOMEID }, true);
        public static Index SYS_IDX_SYS_PK_10347_10348 = createIndex("SYS_IDX_SYS_PK_10347_10348", Somethingcomposite.SOMETHINGCOMPOSITE, new OrderField[] { Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID }, true);
    }
}