package com.spoonart.scanmecalculator.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.spoonart.scanmecalculator.data.entity.ProblemEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProblemDao_Impl implements ProblemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProblemEntity> __insertionAdapterOfProblemEntity;

  public ProblemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProblemEntity = new EntityInsertionAdapter<ProblemEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `problem` (`id`,`file_name`,`path_from_uri`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProblemEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getFileName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFileName());
        }
        if (value.getPathFromUri() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPathFromUri());
        }
      }
    };
  }

  @Override
  public long save(final ProblemEntity data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfProblemEntity.insertAndReturnId(data);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ProblemEntity> getData() {
    final String _sql = "SELECT * FROM problem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "file_name");
      final int _cursorIndexOfPathFromUri = CursorUtil.getColumnIndexOrThrow(_cursor, "path_from_uri");
      final List<ProblemEntity> _result = new ArrayList<ProblemEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ProblemEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpFileName;
        if (_cursor.isNull(_cursorIndexOfFileName)) {
          _tmpFileName = null;
        } else {
          _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
        }
        final String _tmpPathFromUri;
        if (_cursor.isNull(_cursorIndexOfPathFromUri)) {
          _tmpPathFromUri = null;
        } else {
          _tmpPathFromUri = _cursor.getString(_cursorIndexOfPathFromUri);
        }
        _item = new ProblemEntity(_tmpId,_tmpFileName,_tmpPathFromUri);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
