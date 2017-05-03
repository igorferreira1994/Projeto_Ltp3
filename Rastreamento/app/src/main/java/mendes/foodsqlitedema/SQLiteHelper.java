package mendes.foodsqlitedema;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

/**
 * Created by igor on 30/04/17.
 */

public class SQLiteHelper extends SQLiteOpenHelper{
    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void queryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    public void insertData(String name, String Data, String Telefone, String Custo, String Ambulatorio, String Doenca, String Sintomas, String Medicacao, String Conclusao){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO pacientes VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();

        statement.bindString(1, name);
        statement.bindString(2, Data);
        statement.bindString(3, Telefone);
        statement.bindString(4, Custo);
        statement.bindString(5, Ambulatorio);
        statement.bindString(6, Doenca);
        statement.bindString(7, Sintomas);
        statement.bindString(8, Medicacao);
        statement.bindString(9, Conclusao);

        statement.executeInsert();
    }

    public Cursor getData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql,null);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
