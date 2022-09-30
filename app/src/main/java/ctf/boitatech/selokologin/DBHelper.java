package ctf.boitatech.selokologin;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DBHelper extends SQLiteAssetHelper {

    public static final String DBNAME = "database.db";
    public static final int DBVERSION = 1;

    public DBHelper(Context context) {
        super(context,DBNAME,null,DBVERSION);
    }

    public Boolean checkCredentials(String username, String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? and password = ?", new String[]{username, password});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }
    
}