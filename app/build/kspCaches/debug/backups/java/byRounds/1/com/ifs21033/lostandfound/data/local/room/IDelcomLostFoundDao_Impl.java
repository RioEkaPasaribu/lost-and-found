package com.ifs21033.lostandfound.data.local.room;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ifs21033.lostandfound.data.local.entity.DelcomLostFoundEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class IDelcomLostFoundDao_Impl implements IDelcomLostFoundDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DelcomLostFoundEntity> __insertionAdapterOfDelcomLostFoundEntity;

  private final EntityDeletionOrUpdateAdapter<DelcomLostFoundEntity> __deletionAdapterOfDelcomLostFoundEntity;

  public IDelcomLostFoundDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDelcomLostFoundEntity = new EntityInsertionAdapter<DelcomLostFoundEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `delcom_lostfounds` (`id`,`title`,`description`,`is_completed`,`cover`,`created_at`,`updated_at`,`status`,`userId`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DelcomLostFoundEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindString(2, entity.getTitle());
        statement.bindString(3, entity.getDescription());
        statement.bindLong(4, entity.isCompleted());
        if (entity.getCover() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCover());
        }
        statement.bindString(6, entity.getCreatedAt());
        statement.bindString(7, entity.getUpdatedAt());
        statement.bindString(8, entity.getStatus());
        statement.bindLong(9, entity.getUserId());
      }
    };
    this.__deletionAdapterOfDelcomLostFoundEntity = new EntityDeletionOrUpdateAdapter<DelcomLostFoundEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `delcom_lostfounds` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DelcomLostFoundEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public void insert(final DelcomLostFoundEntity delcomTodo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDelcomLostFoundEntity.insert(delcomTodo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final DelcomLostFoundEntity delcomLostFound) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDelcomLostFoundEntity.handle(delcomLostFound);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<DelcomLostFoundEntity> get(final int id) {
    final String _sql = "SELECT * FROM delcom_lostfounds WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[] {"delcom_lostfounds"}, false, new Callable<DelcomLostFoundEntity>() {
      @Override
      @Nullable
      public DelcomLostFoundEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "is_completed");
          final int _cursorIndexOfCover = CursorUtil.getColumnIndexOrThrow(_cursor, "cover");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final DelcomLostFoundEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpIsCompleted;
            _tmpIsCompleted = _cursor.getInt(_cursorIndexOfIsCompleted);
            final String _tmpCover;
            if (_cursor.isNull(_cursorIndexOfCover)) {
              _tmpCover = null;
            } else {
              _tmpCover = _cursor.getString(_cursorIndexOfCover);
            }
            final String _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            _result = new DelcomLostFoundEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpIsCompleted,_tmpCover,_tmpCreatedAt,_tmpUpdatedAt,_tmpStatus,_tmpUserId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<DelcomLostFoundEntity>> getAllLostFounds() {
    final String _sql = "SELECT * FROM delcom_lostfounds ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"delcom_lostfounds"}, false, new Callable<List<DelcomLostFoundEntity>>() {
      @Override
      @Nullable
      public List<DelcomLostFoundEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "is_completed");
          final int _cursorIndexOfCover = CursorUtil.getColumnIndexOrThrow(_cursor, "cover");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<DelcomLostFoundEntity> _result = new ArrayList<DelcomLostFoundEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DelcomLostFoundEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpIsCompleted;
            _tmpIsCompleted = _cursor.getInt(_cursorIndexOfIsCompleted);
            final String _tmpCover;
            if (_cursor.isNull(_cursorIndexOfCover)) {
              _tmpCover = null;
            } else {
              _tmpCover = _cursor.getString(_cursorIndexOfCover);
            }
            final String _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            _item = new DelcomLostFoundEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpIsCompleted,_tmpCover,_tmpCreatedAt,_tmpUpdatedAt,_tmpStatus,_tmpUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
