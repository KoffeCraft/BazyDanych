package com.lusia.bazydanych;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface GraDAO {
    @Insert
    public void wstawGreDoBazy(Gra gra);

    @Insert
    public void wstawGryDoBazy(Gra ... gry);

    @Delete
    public void usunZBazy(Gra gra);

    @Update
    public void aktualizujGre(Gra gra);

    @Query("SELECT * FROM gry")
    public List<Gra> zwrocWszystkieGry();

    @Query("SELECT nazwa FROM gry WHERE minimalniaLiczbaOsob = :ile")
    public List<String> zwrocNazwyGierDlaLiczbyOsob(int ile);
}
