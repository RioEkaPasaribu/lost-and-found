package com.ifs21033.lostandfound.data.local.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DelcomLostFoundDatabase_Impl extends DelcomLostFoundDatabase {
  private volatile IDelcomLostFoundDao _iDelcomLostFoundDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `delcom_lostfounds` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `is_completed` INTEGER NOT NULL, `cover` TEXT, `created_at` TEXT NOT NULL, `updated_at` TEXT NOT NULL, `status` TEXT NOT NULL, `userId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac8e2e9b004a3655c11f9d9efa8634db')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `delcom_lostfounds`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsDelcomLostfounds = new HashMap<String, TableInfo.Column>(9);
        _columnsDelcomLostfounds.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("cover", new TableInfo.Column("cover", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("created_at", new TableInfo.Column("created_at", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("updated_at", new TableInfo.Column("updated_at", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDelcomLostfounds.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDelcomLostfounds = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDelcomLostfounds = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDelcomLostfounds = new TableInfo("delcom_lostfounds", _columnsDelcomLostfounds, _foreignKeysDelcomLostfounds, _indicesDelcomLostfounds);
        final TableInfo _existingDelcomLostfounds = TableInfo.read(db, "delcom_lostfounds");
        if (!_infoDelcomLostfounds.equals(_existingDelcomLostfounds)) {
          return new RoomOpenHelper.ValidationResult(false, "delcom_lostfounds(com.ifs21033.lostandfound.data.local.entity.DelcomLostFoundEntity).\n"
                  + " Expected:\n" + _infoDelcomLostfounds + "\n"
                  + " Found:\n" + _existingDelcomLostfounds);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ac8e2e9b004a3655c11f9d9efa8634db", "cd4abed2b185baf4cfb470203fd13015");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "delcom_lostfounds");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `delcom_lostfounds`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(IDelcomLostFoundDao.class, IDelcomLostFoundDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public IDelcomLostFoundDao delcomLostFoundDao() {
    if (_iDelcomLostFoundDao != null) {
      return _iDelcomLostFoundDao;
    } else {
      synchronized(this) {
        if(_iDelcomLostFoundDao == null) {
          _iDelcomLostFoundDao = new IDelcomLostFoundDao_Impl(this);
        }
        return _iDelcomLostFoundDao;
      }
    }
  }
}
