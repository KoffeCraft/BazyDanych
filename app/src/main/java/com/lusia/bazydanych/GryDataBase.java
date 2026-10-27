package com.lusia.bazydanych;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Gra.class}, version = 1)
public abstract class GryDataBase extends RoomDatabase {
    public abstract GraDAO zwrocGryDAO();
}
